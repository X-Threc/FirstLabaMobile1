package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View




class MainActivity : AppCompatActivity() {

    private var tvText:TextView? = null
    private val text:String = "Олень - северное животное. В летнее время оленям в тайге жарко, а в горах даже в июле холодно. Олень как бы создан для северных просторов, жёсткого ветра, длинных морозных ночей. Олень легко бежит вперёд по тайге, подминает под себя кусты, переплывает быстрые реки. Олень не тонет, потому что каждая его шерстинка - это длинная трубочка, которую внутри наполняет воздух. Нос у оленя покрыт серебристой шёрсткой. Если бы шерсти на носу не было, олень бы его отморозил."
    private var button:Button? =null
    private var tvText2:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.textView1)
        tvText2 = findViewById(R.id.textView2)
        button = findViewById(R.id.button1)
        tvText?.setText(text)
        tvText2?.setText("Чтобы найти кол-во повторений слов в этом тексте нажмите кнопку \"Start Program\":\n")
    }

    fun onMyButtonClick(view: View?) {
        val str:String = tvText?.text.toString()
        val fcw = findCountWord()
        val map =fcw.countWord(str)

        tvText2?.setText("Кол-во повторений слов в этом тексте:\n"+map.toString())

    }


}