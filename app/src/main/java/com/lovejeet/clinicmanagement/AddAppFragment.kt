package com.lovejeet.clinicmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lovejeet.clinicmanagement.databinding.FragmentAddAppBinding
import com.lovejeet.clinicmanagement.databinding.FragmentAddClientBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddAppFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddAppFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding : FragmentAddAppBinding
    lateinit var mainActivity: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddAppBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAppSave.setOnClickListener {
            if(binding.etPtName.text.toString().isEmpty())
            {
                binding.etPtName.error = "Enter Details"
            }
            else if(binding.etPtAge.text.toString().isEmpty())
            {
                binding.etPtAge.error = "Enter Details"
            }
            else if(binding.etAppNo.text.toString().isEmpty())
            {
                binding.etAppNo.error = "Enter Details"
            }
            else if(binding.etAppPhoneNo.text.toString().isEmpty())
            {
                binding.etAppPhoneNo.error = "Enter Details"
            }
            else
            {
                var app = AppInfo(binding.etPtName.text.toString())
                mainActivity.appList.add(app)
                mainActivity.navController.popBackStack()

            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AddAppFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AddAppFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}