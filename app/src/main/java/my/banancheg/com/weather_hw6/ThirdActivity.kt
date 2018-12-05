package my.banancheg.com.weather_hw6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import my.banancheg.com.weather_hw6.entity.List

class ThirdActivity : AppCompatActivity() {

    lateinit var list: List

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        list = intent.getSerializableExtra("list") as List
    }
}
