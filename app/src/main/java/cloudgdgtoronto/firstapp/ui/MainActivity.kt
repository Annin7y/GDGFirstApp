package cloudgdgtoronto.firstapp.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cloudgdgtoronto.firstapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //reference the button from the layout
        val button_start = findViewById(R.id.start_button) as Button

        val button_activity = findViewById(R.id.activity_button) as Button

        //make the button clickable
        button_start.setOnClickListener(){

            //Requesting an action
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kotlinlang.org"))
            startActivity(intent)

        }

        //make the button clickable
        button_activity.setOnClickListener(){

            //Requesting an action
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }




    }
}