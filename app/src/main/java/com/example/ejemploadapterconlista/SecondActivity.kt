package com.example.ejemploadapterconlista

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejemploadapterconlista.databinding.ActivityMainBinding
import com.example.ejemploadapterconlista.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val texto = intent.getStringExtra(TAG_EJEMPLO)
        texto?.let {
            binding.textView2.text = texto
        }
    }

    companion object {

        private const val TAG_EJEMPLO = "TAG_EJEMPLO"


        fun createSecondActivity(context: Context, valor : String) {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(TAG_EJEMPLO, valor)
            context.startActivity(intent)
        }
    }
}