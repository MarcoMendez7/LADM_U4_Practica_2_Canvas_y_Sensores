package mx.tecnm.tepic.ladm_u4_prctica_2_canvas_y_sensores


import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint

class Constructor (){

    var x = 0f
    var y = 0f
    var ancho = 0f
    var alto = 0f
    var radio = 0f
    constructor(x:Float, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //dando valor a ancho  y alto para tratar circulo como cuadrado
        ancho = this.radio*2
        alto = ancho
    }




    fun pintar(c: Canvas, p: Paint){

                c.drawCircle(x+radio,y+radio,radio,p)



    }}