package my.banancheg.com.weather_hw6

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.InputStream

class Request {

    fun get(url: String): InputStream {
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient().newCall(request).execute()
        val body = client.body()
        return body!!.byteStream()
    }

}