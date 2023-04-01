package com.satish.tipstrickkotlin.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.satish.tipstrickkotlin.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this)[DashboardViewModel::class.java]

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.breakFastList.observe(viewLifecycleOwner) {
            textView.text = it.toString()
        }

        /**
         * List of Veg and Non-Veg Break Fast List
         * By Calling getBreakFastList function will get list of string with filter of Ven only.
         * Here have used High Order Function as second parameter and pass as lambda expression
         */
        val breakFastList = listOf("Veg-Rava Dosa","Veg-Poha","Veg-Steamed Dhokla","NonVeg-Chicken Sandwich","NonVeg-Garlic Omelette")
        dashboardViewModel.getBreakFastList(breakFastList) { it.startsWith("Veg") }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}