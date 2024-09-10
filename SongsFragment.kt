package edu.monmouth.s1321890.finalproject

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SongsFragment : Fragment() {
    private var ffSongs: MutableList<Song> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_songs, container, false)
        println(context)
        ffSongs.add(Song("Everlong", R.raw.everlong))
        ffSongs.add(Song("Learn to Fly", R.raw.learn_to_fly))
        ffSongs.add(Song("The Pretender", R.raw.the_pretender))
        ffSongs.add(Song("All My Life", R.raw.all_my_life))
        ffSongs.add(Song("Monkey Wrench", R.raw.monkey_wrench))
        ffSongs.add(Song("Rescued", R.raw.rescued))
        ffSongs.add(Song("Best of You", R.raw.best_of_you))
        ffSongs.add(Song("Walk", R.raw.walk))
        ffSongs.add(Song("Resolve", R.raw.resolve))
        ffSongs.add(Song("Times Like These", R.raw.times_like_these))
        ffSongs.add(Song("Aurora", R.raw.aurora))
        ffSongs.add(Song("Run", R.raw.run))
        ffSongs.add(Song("Rope", R.raw.rope))
        ffSongs.add(Song("I'll Stick Around", R.raw.ill_stick_around))
        ffSongs.add(Song("Subterranean", R.raw.subterranean))
        ffSongs.add(Song("Waiting on a War", R.raw.waiting_on_a_war))
        ffSongs.add(Song("This is a Call", R.raw.this_is_a_call))
        ffSongs.add(Song("My Hero", R.raw.my_hero))
        ffSongs.add(Song("Long Road To Ruin", R.raw.long_road_to_ruin))
        ffSongs.add(Song("Breakout", R.raw.breakout))

        setActivityTitle("Songs")

        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = SongsFragmentCustomAdapter(ffSongs, context)
            }
        }

        return view
    }

}