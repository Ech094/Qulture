package fr.project.qulture.ui.mesfiches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import fr.project.qulture.databinding.FragmentMesfichesBinding

class MesfichesFragment : Fragment() {

    private lateinit var mesfichesViewModel: MesfichesViewModel
    private var _binding: FragmentMesfichesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mesfichesViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MesfichesViewModel::class.java)

        _binding = FragmentMesfichesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        mesfichesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}