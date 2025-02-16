package com.onedevapps.quickpay.Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.onedevapps.quickpay.FragmentScreen.MainActivity
import com.onedevapps.quickpay.databinding.ActivityOtpVerifyBinding

class OtpVerifyActivity : AppCompatActivity() {


    private lateinit var binding : ActivityOtpVerifyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOtpVerifyBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }




        var userNumber  = intent.getStringExtra("UserNumber")
        binding.showUserNumber.text = "+91 "+userNumber



        binding.cardViewButtonVerify.setOnClickListener {

            var intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            Animatoo.animateSlideLeft(this)

        }



    }


    override fun onBackPressed() {
        super.onBackPressed()
        Animatoo.animateSlideRight(this)
    }
}