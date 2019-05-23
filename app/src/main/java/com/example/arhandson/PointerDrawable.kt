package com.example.arhandson

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.drawable.Drawable

class PointerDrawable : Drawable() {

    private val paint = Paint()
    private var enabled: Boolean = false

    override fun draw(canvas: Canvas) {
        val cx = (canvas.width / 2).toFloat()
        val cy = (canvas.height / 2).toFloat()
        if (enabled) {
            paint.color = Color.GREEN
            canvas.drawCircle(cx, cy, 10.toFloat(), paint)
        } else {
            paint.color = Color.GRAY
            canvas.drawText("X", cx, cy, paint)
        }
    }

    override fun setAlpha(alpha: Int) {
        TODO("not implemented")
    }

    override fun getOpacity(): Int {
        TODO("not implemented")
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        TODO("not implemented")
    }

    fun isEnabled(): Boolean {
        return enabled
    }

    fun setEnabled(enabled: Boolean) {
        this.enabled = enabled
    }
}