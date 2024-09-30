package com.ibrahimozutemiz.loginpage

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ibrahimozutemiz.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Giriş butonuna tıklandığında
        binding.loginButton.setOnClickListener {
            val emailInput = binding.emailEditText.text.toString()
            val passwordInput = binding.passwordEditText.text.toString()

            // SharedPreferences'ten kayıtlı verileri al
            val sharedPreferences = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
            val savedEmail = sharedPreferences.getString("email", null)
            val savedPassword = sharedPreferences.getString("password", null)

            // Kayıtlı bilgiler ile giriş bilgilerini karşılaştır
            if (emailInput == savedEmail && passwordInput == savedPassword) {
                Toast.makeText(this, "Giriş Başarılı!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomePageActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "E-posta veya şifre yanlış!", Toast.LENGTH_SHORT).show()
            }
        }

        // Şifreyi unuttunuz tıklanınca
        binding.forgotPasswordTextView.setOnClickListener {
            val intent = Intent(this@MainActivity, NewPasswordActivity::class.java)
            startActivity(intent)
        }

        // Kayıt ol ekranına gitmek için
        binding.registerTextView.setOnClickListener {
            val intent = Intent(this@MainActivity, NewAccountActivity::class.java)
            startActivity(intent)
        }

        // Sosyal medya ile giriş ikonlarına tıklama olaylarını da ekleyebiliriz.
        binding.googleLoginImageView.setOnClickListener {
            Toast.makeText(this, "Google ile giriş yapılacak", Toast.LENGTH_SHORT).show()
            // Google ile giriş işlemi burada yapılır
        }

        binding.facebookLoginImageView.setOnClickListener {
            Toast.makeText(this, "Facebook ile giriş yapılacak", Toast.LENGTH_SHORT).show()
            // Facebook ile giriş işlemi burada yapılır
        }

        binding.xLoginImageView.setOnClickListener {
            Toast.makeText(this, "X ile giriş yapılacak", Toast.LENGTH_SHORT).show()
            // X ile giriş işlemi burada yapılır
        }
    }
}
