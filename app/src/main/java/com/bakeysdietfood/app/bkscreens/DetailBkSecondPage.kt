package com.bakeysdietfood.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bakeysdietfood.app.bkutils.DietBkList
import com.bakeysdietfood.app.databinding.ActivitySecondPageBinding

class DetailBkSecondPage : AppCompatActivity() {
    private lateinit var binding: ActivitySecondPageBinding
    private var adapter : BkSecondPageAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRcView()
        button()
    }

    private fun initRcView() = with(binding){
        adapter = BkSecondPageAdapter(DietBkList.pwqeqweqwe,this@DetailBkSecondPage)
        rcView.layoutManager = LinearLayoutManager(this@DetailBkSecondPage,
            LinearLayoutManager.VERTICAL,false)
        rcView.adapter = adapter

    }

    private fun button(){
        binding.floatingActionButton.setOnClickListener {
            finish()
        }
    }

}