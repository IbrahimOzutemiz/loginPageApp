package com.ibrahimozutemiz.loginpage

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ibrahimozutemiz.loginpage.databinding.ActivityNewAccountBinding


class NewAccountActivity : AppCompatActivity(){
    private lateinit var binding: ActivityNewAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.registerButton.setOnClickListener {
            val username=binding.usernameEditText.text.toString()
            val email=binding.registerEmailEditText.text.toString()
            val password=binding.registerPasswordEditText.text.toString()

            if(username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()){
                val sharedPreferences = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
                val editor = sharedPreferences.edit()

                editor.putString("username", username)
                editor.putString("password", password)
                editor.putString("email", email)
                editor.apply()

                Toast.makeText(this, "Kayıt Başarılı!", Toast.LENGTH_SHORT).show()
                finish()

            }
            else {
                Toast.makeText(this, "Lütfen tüm alanları doldurun", Toast.LENGTH_SHORT).show()
            }
        }
        binding.alreadyHaveAccountTextView.setOnClickListener(){
            onBackPressedDispatcher.onBackPressed()
        }
    }
}