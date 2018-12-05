package my.banancheg.com.weather_hw6

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import android.util.Log
import android.widget.Toast

class MyMainApp : Application() {


    override fun onCreate() {
        super.onCreate()

        val connManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connManager.getActiveNetworkInfo()
        val wifiManager = getSystemService(Context.WIFI_SERVICE) as WifiManager
        return if (wifiManager.connectionInfo.networkId != -1) {
            Log.e("wifiManager()", "Connected")
            val mainActivity=MainActivity()

        }else if (activeNetwork?.getType() == ConnectivityManager.TYPE_MOBILE) {
            // connected to mobile data
                    Toast.makeText(this, "Mobile internet is available", Toast.LENGTH_SHORT).show()
            val mainActivity=MainActivity()
        }

        else {
            Toast.makeText(applicationContext, "No WiFi Connection", Toast.LENGTH_SHORT).show()
            //finish()
        }

    }

}