package com.jandee.lab9_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receiveData = intent.extras.getParcelable(MainActivity.KEY_DATA_STUDENT) as Student

        text_view_result_id_std.text = "Username :  ${receiveData.Username}"
        text_view_result_first_name.text = "Password: ${receiveData.Password}"
        text_view_result_last_name.text = "Birthday : ${receiveData.Birthday}"
        textView4.text = "Birthday : ${receiveData.Gender}"
        textView5.text = "Birthday : ${receiveData.Email}"
        textView6.text = "Birthday : ${receiveData.Phone}"

    }

    fun onClickback(view:View){
        finish()
    }



}
