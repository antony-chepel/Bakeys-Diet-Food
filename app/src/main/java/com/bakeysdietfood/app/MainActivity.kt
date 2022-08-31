package com.bakeysdietfood.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bakeysdietfood.app.bkutils.DietBkList
import com.bakeysdietfood.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter : BkFirstPageAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ofwfwef()
        bcxsdf()
    }

    private fun ofwfwef() = with(binding){
        adapter = BkFirstPageAdapter(DietBkList.kdsfsdfsf,this@MainActivity)
        rcView.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        rcView.adapter = adapter

    }

    private fun bcxsdf() = with(binding){
        fbNext.setOnClickListener {
            startActivity(Intent(this@MainActivity,DetailBkSecondPage::class.java))
        }
    }
}