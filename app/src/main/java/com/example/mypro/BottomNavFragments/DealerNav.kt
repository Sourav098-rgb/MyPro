package com.example.mypro.BottomNavFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.example.mypro.DataBase.Data
import com.example.mypro.DataBase.DealerAdapter
import com.example.mypro.DataBase.DealerDetails
import com.example.mypro.R
import com.example.mypro.databinding.FragmentDealernavBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DealerNav.newInstance] factory method to
 * create an instance of this fragment.
 */
class DealerNav : Fragment() {
    lateinit var binding: FragmentDealernavBinding
    var list= arrayListOf(DealerDetails)
    lateinit var data: Data
    lateinit var dealerAdapter: DealerAdapter
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDealernavBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data=Data.getInstance(requireContext())
        dealerAdapter=DealerAdapter(list)

//        val name=view.findViewById<EditText>(R.id.D_name2)
//        val contact=view.findViewById<EditText>(R.id.D_contact2)
//        val milktype=view.findViewById<Spinner>(R.id.D_milk_type)
//        val btn1=view.findViewById<Button>(R.id.BtnD_save)
//        val btn2=view.findViewById<Button>(R.id.BtnD_cancle)
//
//
//
//        btn1.setOnClickListener {
//            Toast.makeText(this, "Saved Sucessful", Toast.LENGTH_SHORT).show()
//
//        }
//        btn2.setOnClickListener {
//            Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
//
//        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Dealernav.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DealerNav().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}