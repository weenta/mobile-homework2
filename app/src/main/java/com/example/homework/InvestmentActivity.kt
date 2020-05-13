package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_investment.*

class InvestmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_investment)

        btn_invest.setOnClickListener(){
            val intent = Intent()
            intent.putExtra("investment","1 million")
            setResult(20000,intent)
            finish()
        }
    }


}
