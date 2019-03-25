package com.javagic.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment

class CharacterListFragment : Fragment() {
    companion object {

        private const val ARG_TYPE = "type"

        fun newInstance(): CharacterListFragment {
            val fragment = CharacterListFragment()
            val args = Bundle()
//            args.putSerializable(ARG_TYPE, type)
            fragment.arguments = args
            return fragment
        }
    }

}