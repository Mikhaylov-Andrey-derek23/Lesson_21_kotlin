package com.example.lesson_21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson_21.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var bidding: FragmentFirstBinding? = null

    private var addapter: NewsAddapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bidding = FragmentFirstBinding.inflate(inflater, container, false)
        return bidding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        InitNewsAddpter()

    }

    private fun InitNewsAddpter() {
        addapter = NewsAddapter()
        addapter?.newList = listOf(
            News(
                header = "Header 1",
                text = "textt text text",
                Image = "https://directus.localazy.com/uploads/_/originals/29d67d0c-3123-4feb-87d3-cec4d700191e.jpeg"
            ),
            News(
                header = "Header 2",
                text = "textt text text",
                Image = "https://directus.localazy.com/uploads/_/originals/29d67d0c-3123-4feb-87d3-cec4d700191e.jpeg"
            ),
            News(
                header = "Header 3",
                text = "textt text text",
                Image = "https://directus.localazy.com/uploads/_/originals/29d67d0c-3123-4feb-87d3-cec4d700191e.jpeg"
            ),
            News(
                header = "Header 4",
                text = "textt text text",
                Image = "https://directus.localazy.com/uploads/_/originals/29d67d0c-3123-4feb-87d3-cec4d700191e.jpeg"
            )

        )
        bidding?.rvNews?.adapter = addapter
        bidding?.rvNews?.layoutManager = LinearLayoutManager(requireContext())
    }
}