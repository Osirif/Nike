package com.example.nike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MenuActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
    }

    fun sing(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this,ProfilActivity::class.java)
            startActivity(intent)

        }
        else{
            val  alert= AlertDialog.Builder(this)
                .setTitle("Oshibka")
                .setMessage("Y Bas esti polya no zapolnen")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
}
