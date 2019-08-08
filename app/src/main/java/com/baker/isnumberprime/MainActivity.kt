package com.baker.isnumberprime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun isPrime(view: View) {
        val num = numTxt.text.toString().toInt()
        var i = 2
        var flag = false
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true
                break
            }
            ++i
        }
        if (!flag) {
            resultTxt.text = "$num is a Prime \uD83D\uDE04"
        } else {
            resultTxt.text = "$num is NOT a Prime \uD83D\uDE1E"
        }
    }

    fun clearResult(view: View) {
        if (resultTxt.text.isNotEmpty()) {
            resultTxt.text = " "
            numTxt.text.clear()
    } else {
        Toast.makeText(this@MainActivity, "there is nothing to clear", Toast.LENGTH_SHORT).show()
    }
}
}
