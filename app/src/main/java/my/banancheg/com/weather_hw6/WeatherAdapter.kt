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
import my.banancheg.com.weather_hw6.SecondActivity
import java.util.*
import android.support.v4.content.ContextCompat.startActivity
import my.banancheg.com.weather_hw6.entity.Transfer


class WeatherAdapter(val context: Context,private val list: MutableList<List>?): RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {


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

        //weatherViewHolder.itemView.setOnClickListener {
          // val intent: Intent = Intent(context, SecondActivity::class.java)
            //intent.putExtra("current item", currentItemList)
            //startActivity(context)

        //}

    }

    inner class WeatherViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
       var transfer: Transfer = Transfer()

        init {
            view.setOnClickListener(this)

        }

        override fun onClick(view: View) {
            val intent = Intent(context, SecondActivity::class.java)
           intent.putExtra("list", list!![adapterPosition])
            //transfer!!.icon =list!![adapterPosition].weather!![0].icon
            //transfer!!.description = list!![adapterPosition].weather!![0].description
            //transfer!!.temp = list!![adapterPosition].main!!.temp
            //transfer!!.humidity = list!![adapterPosition].main!!.humidity
            //transfer!!.speedWind = list!![adapterPosition].wind!!.speed
            //transfer!!.pressure = list!![adapterPosition].main!!.pressure
            //transfer!!.clouds = list!![adapterPosition].clouds!!.all
           // intent.putExtra("transfer", transfer)
            context.startActivity(intent)
        }

        fun onBind(list: List){
            println("СТАРТУЕМ"+list.weather!![0].icon)
            transfer.icon = list.weather!![0].icon
            transfer.description = list.weather!![0].description
            transfer.temp = list.main!!.temp
            transfer.humidity = list.main!!.humidity
            transfer.speedWind = list.wind!!.speed
            transfer.pressure = list.main!!.pressure
            transfer.clouds = list.clouds!!.all
        }
    }
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

   /* fun onBind(list: List , transfer:Transfer?){
        transfer!!.icon =list.weather!![0].icon
        transfer!!.description = list.weather!![0].description
        transfer!!.temp = list.main!!.temp
        transfer!!.humidity = list.main!!.humidity
        transfer!!.speedWind = list.wind!!.speed
        transfer!!.pressure = list.main!!.pressure
        transfer!!.clouds = list.clouds!!.all
    }*/



}