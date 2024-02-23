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

    private var adapter: SeasonsAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bidding = FragmentFirstBinding.inflate(inflater, container, false)
        return bidding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        InitSeasonAddpter()

    }

    private fun InitSeasonAddpter() {
        adapter = SeasonsAdapter()
        adapter?.newList = listOf(
            Seasons(
                header = "Winter",
                image = "https://w.forfun.com/fetch/9c/9cd5510ed58226f15fcc7a0348193c89.jpeg"
            ),
            Seasons(
                header = "Spring",
                image = "https://image.winudf.com/v2/image1/Y29tLmhkd2Nhci5uZXdzcHJpbmdfc2NyZWVuXzRfMTU2Njk5ODg0NV8wNjk/screen-4.jpg?fakeurl=1&type=.jpg"
            ),
            Seasons(
                header = "Summer",
                image = "https://all-aforizmy.ru/wp-content/uploads/2022/02/scale_1200-3.jpg"
            ),
            Seasons(
                header = "Autumn",
                image = "https://img2.akspic.ru/attachments/originals/8/2/0/3/0/103028-video-osennyaya_okraska_listev-zheltyj-list-dikaya_mestnost-2880x1800.jpg"
            )


        )
        bidding?.rvSeason?.adapter = adapter
        bidding?.rvSeason?.layoutManager = LinearLayoutManager(requireContext())
    }
}