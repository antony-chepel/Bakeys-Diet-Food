package com.bakeysdietfood.app

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bakeysdietfood.app.bkdata.DietBkData
import com.bakeysdietfood.app.databinding.MainDietItemBinding
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class BkFirstPageAdapter(val ldsfsfd : List<DietBkData>, val activity : AppCompatActivity) : RecyclerView.Adapter<BkFirstPageAdapter.DietHolder>() {

    class DietHolder(val binding : MainDietItemBinding, val activity : AppCompatActivity) : RecyclerView.ViewHolder(binding.root) {

        fun setData(dietItem : DietBkData) = with(binding){

       Picasso.get().load(dietItem.image).centerCrop().resize(1280,720)
           .into(mainImage,object : Callback{
               override fun onSuccess() {

                   pbBar.visibility = View.GONE
               }

               override fun onError(e: Exception?) {

               }

           })

            orffwefw.text = activity.getString(dietItem.title)
            nvvidsdsf.text = activity.getString(dietItem.desc)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DietHolder {
        val binding = MainDietItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DietHolder(binding,activity)

    }

    override fun onBindViewHolder(holder: DietHolder, position: Int) {
        holder.setData(ldsfsfd[position])
        holder.itemView.setOnClickListener {
            val i = Intent(activity,DetailBkActivity::class.java).apply {
                putExtra(NAME_DIET,activity.getString(ldsfsfd[position].title))
                putExtra(DESC_DIET,activity.getString(ldsfsfd[position].desc))
            }
            activity.startActivity(i)
        }

    }

    override fun getItemCount(): Int = ldsfsfd.size

  companion object{
      const val NAME_DIET = "name_diet"
      const val DESC_DIET = "dec_diet"
  }

}