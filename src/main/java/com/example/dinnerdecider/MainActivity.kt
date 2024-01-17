package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("McDonalds", "BurgerKing", "KFC", "Chinês", "Estás gordo, vai comer algo saudável" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addbtn.setOnClickListener {
            val newFood = addFoodTXT.text.toString()
            foodList.add(newFood)
            addFoodTXT.text.clear()
            println(foodList)

        }
        decidebtn.setOnClickListener{
            val random = Random()
            val decideNumber = random.nextInt(foodList.count())
            foodTXT.text = foodList[decideNumber]


        }
    }
}
