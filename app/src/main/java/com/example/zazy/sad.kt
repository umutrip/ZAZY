
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.zazy.MainActivity
import com.example.zazy.R

@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000 // 3 секунды

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sad)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}