package com.aditya.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var exampleList = listOf<infomembers>(
            infomembers("Aditya Kumar", 8955163181),
            infomembers("Rounak Vats", 8655143210),
            infomembers("Rohit Raj", 8655143210),
            infomembers("Rakesh Gautam", 8655143210),
        )
        val homeAdapter1 = memberadapter(exampleList)




    }
    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}