package my.banancheg.com.weather_hw6

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    private var textView: TextView? = null
    private var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        textView = findViewById(R.id.textView) as TextView
        imageView = findViewById(R.id.imageView) as ImageView
        val myanim = AnimationUtils.loadAnimation(this, R.anim.my_scale)
        textView!!.startAnimation(myanim)
        imageView!!.startAnimation(myanim)
        val intent = Intent(this, MainActivity::class.java)
        val timer = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(intent)
                    finish()

                }

                }
            }
        timer.start()

        val connManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connManager.getActiveNetworkInfo()
        val wifiManager = getApplicationContext().getSystemService(Context.WIFI_SERVICE) as WifiManager
        return if (wifiManager.connectionInfo.networkId != -1) {
            //Log.e("wifiManager()", "Connected")
            //startActivity(intent)

        }else if (activeNetwork?.getType() == ConnectivityManager.TYPE_MOBILE) {
            // connected to mobile data
            Toast.makeText(this, "Mobile internet is available", Toast.LENGTH_SHORT).show()
            //startActivity(intent)
        }

        else {
            Toast.makeText(applicationContext, "No WiFi Connection", Toast.LENGTH_SHORT).show()
            //finish()
        }

    }
}
