package kg.test.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Button = findViewById<Button>(R.id.button3)

        Button.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
            finish()
        }
    }

}