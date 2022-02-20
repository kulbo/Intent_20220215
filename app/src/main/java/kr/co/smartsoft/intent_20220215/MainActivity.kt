package kr.co.smartsoft.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMoveToOtherActivity.setOnClickListener {
//            OtherActivity로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
        btnSendMessage.setOnClickListener {
            val inputMessage = edtMessage.text.toString()

            val myIntent = Intent(this, ViewMessageActivity::class.java)

            myIntent.putExtra("message", inputMessage)
            myIntent.putExtra("id", "mess")

            startActivity(myIntent)
        }
    }
}