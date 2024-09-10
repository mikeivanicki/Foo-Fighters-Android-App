package edu.monmouth.s1321890.finalproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment

class AlbumsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_albums, container, false)

        val gridView = view.findViewById<GridView>(R.id.albumGrid)

        val albumsNames = arrayOf("Foo Fighters", "The Colour And The Shape", "There Is Nothing Left To Lose", "One By One", "In Your Honor", "Echoes, Silence, Patience & Grace", "Wasting Light", "Sonic Highways", "Concrete and Gold", "Medicine At Midnight", "But Here We Are")

        val albums = intArrayOf(R.drawable.foo_fighters,
                R.drawable.colour_and_shape,
                R.drawable.nothing_left_to_lose,
                R.drawable.one_by_one,
                R.drawable.in_your_honor,
                R.drawable.echoes,
                R.drawable.wasting_light,
                R.drawable.sonic_highways,
                R.drawable.concrete_and_gold,
                R.drawable.medicine_at_midnight,
                R.drawable.but_here_we_are)

        val customAdapter = activity?.let { AlbumAdapter(it, albums, albumsNames) }

        gridView.adapter = customAdapter

        setActivityTitle("Albums")
        return view
    }

}
