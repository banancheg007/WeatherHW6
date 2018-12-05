package my.banancheg.com.weather_hw6

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_second.*
import my.banancheg.com.weather_hw6.entity.List


class SecondActivity : AppCompatActivity(){
    lateinit var list: List
    var temperatureFormat:String = "in celsius"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        list = intent.getSerializableExtra("list") as List

        val icon = list.weather!![0].icon
        val iconUrl = "http://openweathermap.org/img/w/$icon.png"
        Picasso.get().load(iconUrl).resize(50, 50)
            .centerCrop().into(second_activity_icon)

        second_activity_description.setText(list.weather!![0].description)
        second_activity_temp.setText("Temp: "+list.main!!.temp.toString()+ " °C")
        second_activity_temp.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("list",list)
            startActivityForResult(intent, 1)
        }
        second_activity_humidity.setText("Hum: "+list.main!!.humidity.toString()+" %")
        second_activity_wind.setText("Wind: "+list.wind!!.speed.toString()+" meter/sec")
        second_activity_pressure.setText("Pres: "+list.main!!.pressure.toString()+ " hPa")
        second_activity_clouds.setText("Clouds: "+list.clouds!!.all.toString()+ " %")


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (data == null) {
            return
        }
        val name = data.getStringExtra("in kelvins")
        if(name.equals("in kelvins")) {
            list.main!!.temp
            var double = (list.main!!.temp.toFloat()+273.15).toString()
            second_activity_temp.setText("Temp: " + (String.format(double,"%.1f")) + " °K")
        }
    }
}
