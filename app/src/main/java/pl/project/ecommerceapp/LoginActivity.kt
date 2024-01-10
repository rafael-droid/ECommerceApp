package pl.project.ecommerceapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class LoginActivity : Activity() {
    private lateinit var login_bt: Button
    private lateinit var register_bt: Button
    private lateinit var password: EditText
    private lateinit var email: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_bt = findViewById(R.id.button_login)
        register_bt = findViewById(R.id.button_registration)
        password = findViewById(R.id.password_login)
        email = findViewById(R.id.email)

        register_bt.setOnClickListener{
            var registration: Intent = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(registration)
        }




    }
}