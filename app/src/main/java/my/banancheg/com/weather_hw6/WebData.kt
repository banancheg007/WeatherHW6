package my.banancheg.com.weather_hw6

import com.google.gson.GsonBuilder
import my.banancheg.com.weather_hw6.entity.Wrapper
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder


class WebData(){
    fun getData(url: String) : Wrapper {

        val clientRequest = Request()
        val stream = BufferedInputStream(clientRequest.get(url))

        val json = readStream(stream)

        val gsonBuilder = GsonBuilder().create()

        return gsonBuilder.fromJson(json, Wrapper::class.java)
    }

    private fun readStream(inputStream: BufferedInputStream) : String {
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        bufferedReader.forEachLine { stringBuilder.append(it) }
        return stringBuilder.toString()
    }
}