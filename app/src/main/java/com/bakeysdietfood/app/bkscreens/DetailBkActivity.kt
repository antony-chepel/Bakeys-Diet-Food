package com.bakeysdietfood.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bakeysdietfood.app.databinding.ActivityDetailBinding


class DetailBkActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        nvbbsdfs()
        owerwer()
    }

    private fun nvbbsdfs() = with(binding){
        val title = intent.getStringExtra(BkFirstPageAdapter.NAME_DIET)
        val desc = intent.getStringExtra(BkFirstPageAdapter.DESC_DIET)

        tvTitle.text = title.toString()
        tvDesc.text = desc.toString()
    }

    private fun owerwer(){
        binding.floatingActionButton2.setOnClickListener {
            finish()
        }
    }
}