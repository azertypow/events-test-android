package example.azertypow.event_experiments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    private var drawView: Main2Activity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        drawView = Main2Activity(this)
        setContentView(drawView)
    }
}
