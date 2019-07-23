package com.websarva.wings.android.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add.setOnClickListener(this)
        button_subtraction.setOnClickListener(this)
        button_multi.setOnClickListener(this)
        button_div.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        val intent = Intent(this, CalcResult::class.java)

        try {
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            var type = ""

            if (v.id == R.id.button_add) {
                type = "add"
            } else if (v.id == R.id.button_subtraction) {
                type = "subtraction"
            } else if (v.id == R.id.button_multi) {
                type = "multi"
            } else if (v.id == R.id.button_div) {
                type = "div"
            }

            intent.putExtra("VALUE1", num1)
            intent.putExtra("VALUE2", num2)
            intent.putExtra("TYPE", type)

            startActivity(intent)
        } catch (e: Exception) {

        }
    }
}
