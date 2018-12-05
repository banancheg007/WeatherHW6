package my.banancheg.com.weather_hw6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import android.os.AsyncTask
import android.preference.PreferenceManager
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import my.banancheg.com.weather_hw6.entity.*
import java.lang.StringBuilder












class MainActivity : AppCompatActivity() {
    var url: String = "http://api.openweathermap.org/data/2.5/forecast?q=Cherkasy&mode=json&cnt=40&units=metric&APPID=c68b7ceb6ebeda8d10a140207cc3049a"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        OkHttpHandler(url).execute()
    }

    inner class OkHttpHandler(private var url: String) : AsyncTask<String, Void, Wrapper>() {

        override fun doInBackground(vararg params: String): Wrapper {

            return WebData().getData(url)
        }
        override fun onPostExecute(result: Wrapper) {
            super.onPostExecute(result)
            val adapter = WeatherAdapter(this@MainActivity, result.list)
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.addItemDecoration(ItemDecorator())
            recyclerView.addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
            recyclerView.adapter = adapter
        }


    }
}
