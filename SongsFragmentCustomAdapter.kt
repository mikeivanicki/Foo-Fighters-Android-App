package edu.monmouth.s1321890.finalproject

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.ContextUtils.getActivity
import edu.monmouth.s1321890.finalproject.databinding.SongItemBinding
import java.net.URI
import java.net.URL


class SongsFragmentCustomAdapter (private val songList: List<Song>, private val context: Context):
RecyclerView.Adapter<SongsFragmentCustomAdapter.ViewHolder> () {
    private var mediaPlayer: MediaPlayer? = null
    private lateinit var binding: SongItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            SongItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = songList[position]
        holder.contentView.text = item.name
        if (position.mod(2) == 0) {
            holder.card.setCardBackgroundColor(Color.GRAY)
        } else {
            holder.card.setCardBackgroundColor(Color.RED)
        }

        fun playMusic(songFile: Int){
            try {
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(context, songFile)
                    mediaPlayer!!.isLooping == true
                    mediaPlayer!!.start()
                    mediaPlayer?.setOnCompletionListener(null)
                } else if (mediaPlayer?.isPlaying == true) {
                    mediaPlayer?.stop()
                    mediaPlayer?.reset()
                    mediaPlayer?.release()
                    mediaPlayer = null
                } else {
                    mediaPlayer?.start()
                    mediaPlayer?.setOnCompletionListener(null)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        //videoUri = Uri.parse("android.resource://" + context!!.packageName + "/" + songList[position].url)

        holder.layout.setOnClickListener{
            println("You clicked ${songList[position].name}")
            playMusic(songList[position].songFile)
        }


    }

    override fun getItemCount(): Int = songList.size

    inner class ViewHolder(binding: SongItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val contentView: TextView = binding.content
        val card = binding.card
        val layout = itemView.findViewById<LinearLayout>(R.id.layout)

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }
}


