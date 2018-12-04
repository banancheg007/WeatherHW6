package my.banancheg.com.weather_hw6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import my.banancheg.com.weather_hw6.entity.Wrapper

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val wrapper: Wrapper = intent.getSerializableExtra("wrapper") as Wrapper
        myTextView2.setText(wrapper.toString())
    }
}
