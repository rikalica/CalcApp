package com.websarva.wings.android.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calc_result.*

class CalcResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_result)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val type = intent.getStringExtra("TYPE")

        if( type == "add" ) {
            textView.text = "${value1 + value2}"
        } else if ( type == "subtraction" ) {
            textView.text = "${value1 - value2}"
        } else if ( type == "multi" ) {
            textView.text = "${value1 * value2}"
        } else if ( type == "div" ) {
            textView.text = "${value1 / value2}"
        }
    }

}
