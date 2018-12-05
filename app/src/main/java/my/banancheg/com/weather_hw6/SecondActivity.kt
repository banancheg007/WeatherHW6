package my.banancheg.com.weather_hw6

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.weather_item.view.*
import my.banancheg.com.weather_hw6.entity.List
import my.banancheg.com.weather_hw6.entity.Transfer
import my.banancheg.com.weather_hw6.entity.Wrapper

class SecondActivity : AppCompatActivity(){
    lateinit var list: List


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        //val wrapper: Wrapper = intent.getSerializableExtra("wrapper") as Wrapper
       // myTextView2.setText(wrapper.toString())
       list = intent.getSerializableExtra("list") as List

       val icon = list.weather!![0].icon
       val iconUrl = "http://openweathermap.org/img/w/$icon.png"
        Picasso.get().load(iconUrl).resize(50, 50)
            .centerCrop().into(second_activity_icon)

        second_activity_description.setText(list.weather!![0].description)
        second_activity_temp.setText(list.main!!.temp.toString())
        second_activity_temp.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("list",list)
            startActivityForResult(intent, 1)
        }
        second_activity_humidity.setText(list.main!!.humidity.toString())
        second_activity_wind.setText(list.wind!!.speed.toString())
        second_activity_pressure.setText(list.main!!.pressure.toString())
        second_activity_clouds.setText(list.clouds!!.all.toString())
    }
}
