package com.frost.customcomponent

import android.content.Context
import android.graphics.Bitmap
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout

class CustomImageView@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?= null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
): LinearLayout(context, attrs, defStyle, defStyleRes) {

    private var image: ImageView

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_image_view, this, true)
        image = findViewById(R.id.image)
    }

    fun setImage(src: Int) {
        image.setImageResource(src)
    }

    fun setBitmap(bitmap: Bitmap){
        image.setImageBitmap(bitmap)
    }

}