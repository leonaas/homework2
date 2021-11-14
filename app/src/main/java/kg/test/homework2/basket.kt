package kg.test.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class basket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton4)

        ImageButton.setOnClickListener {
            startActivity(Intent(this, menu::class.java))
            finish()
        }

        val Button = findViewById<Button>(R.id.button12)

        Button.setOnClickListener {
            startActivity(Intent(this, pay::class.java))
            finish()
        }
    }
}