package com.javagic.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment

class BookListFragment : Fragment() {
    companion object {

        private const val ARG_TYPE = "type"

        fun newInstance(): BookListFragment {
            val fragment = BookListFragment()
            val args = Bundle()
//            args.putSerializable(ARG_TYPE, type)
            fragment.arguments = args
            return fragment
        }
    }

}