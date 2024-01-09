package pl.project.ecommerceapp

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pl.project.ecommerceapp.ui.theme.ECommerceAppTheme

class MainActivity : Activity() {

    private lateinit var button_list: Button
    private lateinit var button_login: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_list = findViewById(R.id.button_list)
        button_login = findViewById(R.id.button_login)

        button_login.setOnClickListener {
            var loginActivity: Intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(loginActivity)
        }



    }
}