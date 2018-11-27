package com.jandee.lab9_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jandee.lab9_kotlin.R.id.button_send
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val KEY_DATA_STUDENT = "keyDataStudent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            val selectedGender = gendergroup.getCheckedRadioButtonId()
            var gender = ""
            if (selectedGender == R.id.ipMale)
                gender = "Male"
            else if (selectedGender == R.id.ipFemale)
                gender = "Female"

            val dataStudent = Student(
                    edit_text_id_std.text.toString(),
                    pass.text.toString(),
                    birthday.text.toString(),
                    gender,
                    email.text.toString(),
                    phone.text.toString()

            )

            intent.putExtra(KEY_DATA_STUDENT, dataStudent)
            startActivity(intent)
        }
    }
}
