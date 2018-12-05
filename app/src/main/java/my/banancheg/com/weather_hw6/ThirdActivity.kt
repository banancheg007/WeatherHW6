package my.banancheg.com.weather_hw6

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_third.*
import my.banancheg.com.weather_hw6.entity.List

class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_in_kelvins ->{
                val intent = Intent()
                intent.putExtra("in kelvins", "in kelvins")
                setResult(Activity.RESULT_OK, intent)
                finish()
            }

        }
    }

    lateinit var list: List

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        //list = intent.getSerializableExtra("list") as List

        button_in_kelvins.setOnClickListener(this)

    }
}
