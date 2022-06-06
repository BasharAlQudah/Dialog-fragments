package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var count :Int =0;
val array= arrayListOf<String>("","","","","","")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV : TextView = findViewById(R.id.TVRating)
        val res: TextView= findViewById(R.id.result)
        val order : Button = findViewById(R.id.menu)
        val close : Button = findViewById(R.id.close)
        order.setOnClickListener{
            var dialog_var=CustomDialogClass()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }
        close.setOnClickListener{
            res.text="";
            count=0
            for (i in 0..array.size-1)
            {
                array[i]=""
            }
        }

    }
    fun receiveFeedback(feedback : String){
        val ratingTV: TextView=findViewById(R.id.result)
        if(feedback < "a" ){
            array[count]=feedback
        ratingTV.text=array.toString();
            count++
        }

    }
}