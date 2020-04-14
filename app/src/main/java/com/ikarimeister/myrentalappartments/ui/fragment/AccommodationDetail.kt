package com.ikarimeister.myrentalappartments.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ikarimeister.myrentalappartments.R

/**
 * A simple [Fragment] subclass.
 */
class AccommodationDetail : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accommodation_detail, container, false)
    }
}