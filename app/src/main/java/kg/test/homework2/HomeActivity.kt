package kg.test.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homee)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton)

        ImageButton.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }

        val ImageView = findViewById<ImageView>(R.id.imageView10)

        ImageView.setOnClickListener {
            startActivity(Intent(this, BasketActivity::class.java))
            finish()
        }

    }



}