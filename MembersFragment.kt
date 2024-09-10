package edu.monmouth.s1321890.finalproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MembersFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_members, container, false)

        var Dave = view.findViewById<ImageView>(R.id.Dave)
        var Taylor = view.findViewById<ImageView>(R.id.Taylor)
        var Nate = view.findViewById<ImageView>(R.id.Nate)
        var Chris = view.findViewById<ImageView>(R.id.Chris)
        var Pat = view.findViewById<ImageView>(R.id.Pat)
        var Rami = view.findViewById<ImageView>(R.id.Rami)

        Dave.setImageResource(R.drawable.dave_grohl)
        Taylor.setImageResource(R.drawable.taylor_hawkins)
        Nate.setImageResource(R.drawable.nate_mendel)
        Chris.setImageResource(R.drawable.chris_shiflett)
        Pat.setImageResource(R.drawable.pat_smear)
        Rami.setImageResource(R.drawable.rami_jaffee)

        setActivityTitle("Band Members")

        return view
    }
}