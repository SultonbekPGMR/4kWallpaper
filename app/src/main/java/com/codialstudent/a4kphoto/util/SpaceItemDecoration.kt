package com.codialstudent.a4kphoto.util

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView


open class RecyclerItemDecoration(private val spanCount: Int, private val spacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {

        val spacing = Math.round(spacing * parent.context.resources.displayMetrics.density)
        val position = parent.getChildAdapterPosition(view)
        val column = position % spanCount

        outRect.left = spacing - column * spacing / spanCount
        outRect.right = (column + 1) * spacing / spanCount

        outRect.top = if (position < spanCount) spacing else 0
        outRect.bottom = spacing
    }
}