package my.banancheg.com.weather_hw6

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.weather_item.view.*
import my.banancheg.com.weather_hw6.R.id.*
import my.banancheg.com.weather_hw6.entity.List
import java.text.SimpleDateFormat
import java.util.*
import android.support.v4.content.ContextCompat.startActivity



 class WeatherAdapter(private val list: MutableList<List>?): RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, position: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)

        return WeatherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(weatherViewHolder: WeatherViewHolder, position: Int) {
        println("Position" + position)
        print("List - "+ list!![position])
        val currentItemList = list!![position]
        //val icon = currentItemList.weather!![0].icon
        //val iconUrl = "http://openweathermap.org/img/w/$icon.png"
        //Picasso.get().load(iconUrl).into(iconImageView)

        weatherViewHolder.itemView.temperatureTextView.setText(" Temperature: " + currentItemList.main!!.temp)
        weatherViewHolder.itemView.dateTextView.setText(formatDate(currentItemList.dt))
        weatherViewHolder.itemView.timetextView.setText(formatTime(currentItemList.dt))

        val icon = currentItemList.weather!![0].icon
        val iconUrl = "http://openweathermap.org/img/w/$icon.png"
        Picasso.get().load(iconUrl).into(weatherViewHolder.itemView.iconImageView)
        weatherViewHolder.itemView.setOnClickListener {
          // val intent: Intent = Intent(context, SecondActivity::class.java)
            //intent.putExtra("current item", currentItemList)
            //startActivity(context)

        }
    }

    inner class WeatherViewHolder(view: View) : RecyclerView.ViewHolder(view)

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private fun formatDate(date: Long): String {
        val dt = Date(date * 1000)
        val sfd = SimpleDateFormat("LLL dd, yyyy")
        return sfd.format(dt)
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private fun formatTime(date: Long): String {
        val dt = Date(date * 1000)
        val sfd = SimpleDateFormat("h:mm a")
        return sfd.format(dt)
    }


}