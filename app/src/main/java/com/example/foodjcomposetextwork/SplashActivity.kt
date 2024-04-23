package com.example.foodjcomposetextwork

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.request.ImageRequest
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.foodjcomposetextwork.ui.theme.FoodJComposeTextWorkTheme

class SplashActivity : ComponentActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(R.color.orang)
                ) {
                    SplashScreen()
                }

        }
    }
}

@Composable
fun SplashScreen(){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splashscreenanimation))
    LottieAnimation(
        modifier = Modifier.size(with= 111.dp, height= 60.dp),
        composition = composition)

}


