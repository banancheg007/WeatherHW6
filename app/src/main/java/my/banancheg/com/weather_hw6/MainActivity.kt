package my.banancheg.com.weather_hw6

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.content.Context.CONNECTIVITY_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import android.widget.Toast
import okhttp3.*
import java.io.IOException
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import okhttp3.OkHttpClient
import android.os.AsyncTask
import android.support.v7.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import my.banancheg.com.weather_hw6.entity.*
import java.text.SimpleDateFormat
import java.util.*

//import org.junit.experimental.results.ResultMatchers.isSuccessful










class MainActivity : AppCompatActivity() {
    var url: String = "http://api.openweathermap.org/data/2.5/forecast?q=Cherkasy&mode=json&cnt=9&units=metric&APPID=c68b7ceb6ebeda8d10a140207cc3049a"

    private val client = OkHttpHandler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        client.execute(url).get()
        /*val connManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connManager.getActiveNetworkInfo()
        if (activeNetwork != null) {
            // connected to the internet
            if (activeNetwork!!.getType() == ConnectivityManager.TYPE_WIFI) {
                // connected to wifi
                Toast.makeText(this, "Wifi connect is available", Toast.LENGTH_SHORT).show()
                val okHttpHandler = OkHttpHandler()
                okHttpHandler.execute(url).get()
                // var wrapper: Wrapper = Wrapper()
                //var gson: Gson = Gson()
                //run("http://api.openweathermap.org/data/2.5/forecast?q=Cherkasy&cnt=7&mode=json&APPID=c68b7ceb6ebeda8d10a140207cc3049a")
            } else if (activeNetwork!!.getType() == ConnectivityManager.TYPE_MOBILE) {
                // connected to mobile data
                Toast.makeText(this, "Mobile internet is available", Toast.LENGTH_SHORT).show()
                val okHttpHandler: OkHttpHandler = OkHttpHandler()
                okHttpHandler.execute(url).get()
                //var wrapper: Wrapper = Wrapper()
                //var gson: Gson = Gson()

                // wrapper = gson.fromJson(okHttpHandler.responseBody?.charStream(), Wrapper::class.java)
                //                //val string = gson.fromJson("\"world\"", String::class.java)

                //println("Май сити: " + wrapper.city.getName().toString())

                //run("http://api.openweathermap.org/data/2.5/forecast?q=Cherkasy&cnt=7&mode=json&APPID=c68b7ceb6ebeda8d10a140207cc3049a")
            }
        } else {
            finish()
        }
    }*/

        /*fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) = println(response.body()?.string())
        })
    }*/
    }
    inner class OkHttpHandler() : AsyncTask<String, Void, ByteArray>() {
        lateinit var wrapper: Wrapper
        internal var client = OkHttpClient()
        private val gson = Gson()
        var jsnString: String? = null
        var responseBody: ResponseBody? = null

        override fun doInBackground(vararg params: String): ByteArray? {

            val builder = Request.Builder()
            builder.url(params[0])
            val request = builder.build()
            try {
                val response = client.newCall(request).execute()
                if (!response.isSuccessful)
                    Toast.makeText(applicationContext, "false", Toast.LENGTH_LONG).show()

                 wrapper = gson.fromJson(response.body()!!.charStream(),Wrapper::class.java)
                //println("Май сити: " + wrapper.city.getName().toString())
                // println("Date: " + wrapper.list.get(0).dt)

                //val dt = Date(wrapper.list.get(0).dt * 1000)

                // val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
                //println("Date2: " + sfd.format(dt))

                /*for( i  in wrapper.list){
                    val dt = Date(i.dt * 1000)
                    val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
                    println("Date: " + sfd.format(dt))
                }*/
                println("Wrapper - " + wrapper.toString())
               // myTextView.setText(wrapper.toString())


                client.newCall(request).enqueue(object : Callback {
                    override fun onFailure(call: Call, e: IOException) {}
                    override fun onResponse(call: Call, response: Response){
                        responseBody = response.body()
                        jsnString = response.body()?.string()
                        println(jsnString)}
                })

                return response.body()!!.bytes()
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return null
        }
        override fun onPostExecute(result: ByteArray?) {
            super.onPostExecute(result)
            val adapter = WeatherAdapter(this@MainActivity, wrapper.list)
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.adapter = adapter
        }


    }
}
