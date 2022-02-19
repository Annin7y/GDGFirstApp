package cloudgdgtoronto.firstapp.ui

import android.os.Bundle
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

    }
}