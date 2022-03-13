package com.ysk423.fivescoreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvScore:TextView= findViewById(R.id.tvScore)
        val btnMinus:Button= findViewById(R.id.btnMinus)
        val btnPlus:Button= findViewById(R.id.btnPlus)
        var num = 0

        //+ボタンを押したらスコアが1増える
        btnPlus.setOnClickListener {
            num++

            //スコアが5になったら分岐
            if(num==5){
                val intent = Intent(this,GameClear::class.java)
                startActivity(intent)
                finish()
            }else{
                tvScore.text = num.toString()
            }

        }

        //-ボタン押したらスコアが1減る
        btnMinus.setOnClickListener {
            num--

            //スコアが−５になったら分岐
            if(num==-5){
                val intent = Intent(this,GameOver::class.java)
                startActivity(intent)
                finish()
            }else{
                tvScore.text = num.toString()
            }
        }

    }
}