package kg.test.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class homee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homee)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton)

        ImageButton.setOnClickListener {
            startActivity(Intent(this, menu::class.java))
            finish()
        }

        val ImageView = findViewById<ImageView>(R.id.imageView10)

        ImageView.setOnClickListener {
            startActivity(Intent(this, basket::class.java))
            finish()
        }

    }



}