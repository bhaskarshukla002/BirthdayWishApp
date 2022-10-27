package com.example.birthdaywish

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdaywish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun createbirthdaycard(view: View) {
        val name = binding.nameInput.editableText.toString()
        //Toast.makeText( this,"$name", Toast.LENGTH_LONG).show()

        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra("nameextra" ,name)
        startActivity(intent)
    }
}