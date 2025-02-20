package com.example.doggame.model

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Rect
import com.example.doggame.R

class GiftBone(context: Context, screenX: Int, screenY: Int)
    : BaseObject(screenX, screenY, 25) {

        private val score = 25

        override var bitmap: Bitmap = Bitmap.createScaledBitmap(
            BitmapFactory.decodeResource(context.resources, R.drawable.gift_bone),
            getScreenX() / 7,
            getScreenY() / 13,
            true
        )

        override var collisionDetection: Rect = Rect(
            getX(),
            getY(),
            getX() + bitmap.width,
            getY() + bitmap.height
        )

        init {
            setX((1..screenX - 200).random())
            setY(70)
        }

        fun getScore(): Int {return this.score}
}
