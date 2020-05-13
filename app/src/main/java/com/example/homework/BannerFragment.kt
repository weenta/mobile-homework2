package com.example.homework

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_banner.*

/**
 * A simple [Fragment] subclass.
 */
class BannerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_banner, container, false)
    }

    override fun onStart() {
        super.onStart()
        investment.setOnClickListener() {
            val intent = Intent(activity, InvestmentActivity::class.java)
            startActivityForResult(intent, 10000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 10000 && resultCode == 20000) {
            val investmentMsg = "Get investment " + data?.getStringExtra("investment")
            Toast.makeText(activity, investmentMsg, Toast.LENGTH_SHORT).show()
        }
    }
}
