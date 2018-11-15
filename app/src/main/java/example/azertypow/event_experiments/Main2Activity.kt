package example.azertypow.event_experiments

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.util.Log
import android.view.MotionEvent
import android.view.View

class Main2Activity(context: Context) : View(context) {
    var xPos = 10f
    var yPos = 10f
    val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        paint.color = Color.BLUE
        paint.style = Paint.Style.FILL_AND_STROKE

        canvas.drawRect(xPos, yPos, 100f, 100f, paint)
    }

    override fun performClick(): Boolean {
        return super.performClick()
    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        performClick()

        return when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                println(event.x)
                println(event.y)

                xPos = event.x
                yPos = event.y

                invalidate() // add it here
                true
            }

            MotionEvent.ACTION_MOVE -> {
                println(event.x)
                println(event.y)

                xPos = event.x
                yPos = event.y

                invalidate() // add it here
                false
            }
            else -> false
        }

//        return super.onTouchEvent(event)
    }
}
