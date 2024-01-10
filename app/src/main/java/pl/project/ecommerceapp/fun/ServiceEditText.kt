package pl.project.ecommerceapp.`fun`

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

fun ServiceEditText(password: EditText, warn_password: EditText){
    password.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if(password.length() < 6){
                warn_password.setText("Hasło za krótkie")
                warn_password.visibility = TextView.VISIBLE
            }
            else{
                warn_password.visibility = TextView.VISIBLE
                warn_password.setText("Prawie Enigma")
            }
        }

        override fun afterTextChanged(s: Editable?) {
            if(password.length() == 0)
                warn_password.visibility = TextView.INVISIBLE
        }

    })
}