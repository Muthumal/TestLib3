package lk.lm.gateway

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lk.lm.gateway.ui.gateway.GatewayFragment

class GatewayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, GatewayFragment.newInstance())
                .commitNow()
        }
    }
}