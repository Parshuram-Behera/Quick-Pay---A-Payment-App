package com.onedevapps.quickpay.Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.onedevapps.quickpay.databinding.ActivityOtpGenerateBinding

class OtpGenerateActivity : AppCompatActivity() {


    private lateinit var binding: ActivityOtpGenerateBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOtpGenerateBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }



        binding.cardViewButton.setOnClickListener {


            if (binding.numberField.text.isNullOrEmpty()){

                binding.numberField.error = "Empty Number"
            }else if (!(binding.numberField.text.length.equals(10))){

                binding.numberField.error = "Incorrect Length"

            }else{

                var number = binding.numberField.text.trim().toString()

                var intent = Intent(this, OtpVerifyActivity::class.java)
                intent.putExtra("UserNumber",number)
                startActivity(intent)
                Animatoo.animateSlideLeft(this)

            }


        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        Animatoo.animateSlideRight(this)

    }
}