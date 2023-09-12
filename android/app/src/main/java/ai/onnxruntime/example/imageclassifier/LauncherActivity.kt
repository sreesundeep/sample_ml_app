package ai.onnxruntime.example.imageclassifier

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val imageClassificationButton = findViewById<Button>(R.id.imageClassification)

        // Set an OnClickListener for the button
        imageClassificationButton.setOnClickListener {
            // Create an Intent to start the SecondActivity
            val intent = Intent(this, ImageClassificationActivity::class.java)

            // Start the SecondActivity
            startActivity(intent)
        }
    }
}
