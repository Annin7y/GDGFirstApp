package cloudgdgtoronto.firstapp.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import cloudgdgtoronto.firstapp.R

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = "Lisa"
        var age = 20

        val image_view = findViewById(R.id.imageView) as ImageView

        //make the button clickable
        image_view.setOnClickListener(){

            //Requesting an action
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kotlinlang.org"))
            startActivity(intent)

        }

    }
}