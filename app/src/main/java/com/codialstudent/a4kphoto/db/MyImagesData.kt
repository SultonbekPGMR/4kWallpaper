package com.codialstudent.a4kphoto.db

import com.codialstudent.a4kphoto.R

object MyImagesData {


    fun loadMapList(): HashMap<String, Array<List<Int>>> {
        val imagesList = arrayListOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
            R.drawable.img14,
            R.drawable.img15,
            R.drawable.img16,
            R.drawable.img17,
            R.drawable.img18,
            R.drawable.img19,
            R.drawable.img20,
            R.drawable.img21,
            R.drawable.img22,
            R.drawable.img23,
            R.drawable.img24,
            R.drawable.img25,
            R.drawable.img26,
            R.drawable.img27,

            )

        val imageMap = HashMap<String, Array<List<Int>>>()
        val titleList = arrayListOf("home", "popular", "random", "liked")
        for (i in titleList) {
            val mapList = arrayOf(
                imagesList.shuffled(),
                imagesList.shuffled(),
                imagesList.shuffled(),
                imagesList.shuffled(),
                imagesList.shuffled()
            )
            imageMap[i] = mapList

        }

        return imageMap
    }


}