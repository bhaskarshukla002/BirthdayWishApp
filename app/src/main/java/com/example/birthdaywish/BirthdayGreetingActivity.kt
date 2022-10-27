package com.example.birthdaywish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdaywish.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBirthdayGreetingBinding

    companion object {
        const val NAME_EXTRA = "nameextra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var name=intent.getStringExtra(NAME_EXTRA)
        binding.BirthdayGreeting.text=("Happy Birthday\n$name")
        //Toast.makeText( this,"$name", Toast.LENGTH_LONG).show()

    }

}