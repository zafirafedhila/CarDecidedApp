package com.zafkotlin.learningkotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val carList = arrayListOf("jeep", "landrover", "lamborgini", "ranger", "merci")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btndecide.setOnClickListener{
    println("you clicked the button")
    val random = Random()
    val randomcar =random.nextInt(carList.count())
    tv1.text = carList[randomcar]


}

btnaddcar.setOnClickListener{
    val newcar =edtaddcar.text.toString()
    carList.add(newcar)
    edtaddcar.text.clear()
    println(carList)

}
    }
}

