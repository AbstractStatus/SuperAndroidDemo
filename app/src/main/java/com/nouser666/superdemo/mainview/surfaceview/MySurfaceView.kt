package com.nouser666.superdemo.mainview.surfaceview

import android.content.Context
import android.graphics.Color
import android.graphics.DiscretePathEffect
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.SurfaceView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MySurfaceView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : SurfaceView(context, attrs, defStyleAttr) {

//    private var centerX = 0f
//    private var centerY = 0f
    private val paint = Paint().apply {
        style = Paint.Style.STROKE
        strokeWidth = 5f
        pathEffect = DiscretePathEffect(30f, 20f)
    }
    private val colors = arrayOf(Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW,
    Color.MAGENTA, Color.GRAY)

    private data class Bubble(val x: Float, val y: Float,
                              val color: Int, var radius: Float)

    private val bubbleList = mutableListOf<Bubble>()

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val x = event?.x?:0f
        val y = event?.y?:0f
        val color = colors.random()
        val bubble = Bubble(x, y, color, 1f)
        bubbleList.add(bubble)
        if(bubbleList.size > 30) bubbleList.removeAt(0)
        return super.onTouchEvent(event)
    }

    init {
        CoroutineScope(Dispatchers.Default).launch {
            while (true){
                if (holder.surface.isValid){
                    val canvas = holder.lockCanvas()
                    canvas.drawColor(Color.BLACK)
                    bubbleList.toList().filter { it.radius < 1000 }
                        .forEach {
                        paint.color = it.color
                        canvas.drawCircle(it.x, it.y, it.radius, paint)
                        it.radius += 10f
                    }

                    holder.unlockCanvasAndPost(canvas)
                }
            }
        }
    }
}