package my.banancheg.com.weather_hw6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v14.preference.PreferenceFragment
import android.support.v4.app.Fragment
import android.support.v7.preference.PreferenceFragmentCompat
import my.banancheg.com.weather_hw6.entity.List

class ThirdActivity : AppCompatActivity() {

    lateinit var list: List

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        list = intent.getSerializableExtra("list") as List

        supportFragmentManager
            .beginTransaction()
            .add(R.id.prefs_content, SettingsFragment())
            .commit()
    }

    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(p0: Bundle?, p1: String?) {
            addPreferencesFromResource(R.xml.settings)
        }
    }
}
