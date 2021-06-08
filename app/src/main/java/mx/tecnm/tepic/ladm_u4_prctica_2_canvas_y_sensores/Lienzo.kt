package mx.tecnm.tepic.ladm_u4_prctica_2_canvas_y_sensores

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {

    var sensorAcelerometro_X = 200f
    var sensorAcelerometro_Y = 400F
    var sensorAproximidad = true
    var sol = Constructor(650f,30,150)

    var luna = Constructor(650f,30,150)
    var luna2 = Constructor(725f,30,150)

    override fun onDraw(canvas : Canvas) {
        var p = Paint()

        if(sensorAproximidad==false) {
            canvas.drawColor(Color.BLACK)
            p.style = Paint.Style.FILL
            p.color = Color.DKGRAY
            luna.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.BLACK
            p.strokeWidth = 10f
            luna.pintar(canvas,p)

            p.style = Paint.Style.FILL
            p.color = Color.BLACK
            luna2.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.BLACK
            luna2.pintar(canvas,p)






        } else if(sensorAproximidad == true) {
            canvas.drawRGB(151, 199, 228)
            p.color = Color.YELLOW
            sol.pintar(canvas,p)
            p.style = Paint.Style.STROKE
            p.color = Color.WHITE
            p.strokeWidth = 10f
            sol.pintar(canvas,p)
        }
        p.color = Color.BLUE
        p.style = Paint.Style.FILL
        canvas.drawCircle(sensorAcelerometro_X,700f,200f,p)
    }
}