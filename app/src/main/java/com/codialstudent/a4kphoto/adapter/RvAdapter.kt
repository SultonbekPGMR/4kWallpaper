package com.codialstudent.a4kphoto.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.codialstudent.a4kphoto.R
import com.codialstudent.a4kphoto.RvClick
import com.codialstudent.a4kphoto.databinding.ItemRvBinding
import java.util.ArrayList

class RvAdapter(val context: Context,private val list: ArrayList<Int>, val rvClick: RvClick) :
    RecyclerView.Adapter<RvAdapter.Vh>() {

    private var lastPosition =  -1
    inner class Vh(private val itemRvBinding: ItemRvBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(imageId: Int,position: Int) {
            itemRvBinding.imageContainer.setImageResource(imageId)

            val rvAnim = if (position>lastPosition){
                AnimationUtils.loadAnimation(context, R.anim.up_from_bottom)
            }else{
                AnimationUtils.loadAnimation(context,R.anim.down_from_top)
            }
            lastPosition = position

            itemRvBinding.root.startAnimation(rvAnim)

            itemRvBinding.root.setOnClickListener {
                rvClick.rvItemClicked(imageId)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) = holder.onBind(list[position],position)


    override fun getItemCount(): Int = list.size


}