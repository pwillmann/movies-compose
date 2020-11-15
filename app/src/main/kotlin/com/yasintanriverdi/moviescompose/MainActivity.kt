package com.yasintanriverdi.moviescompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.yasintanriverdi.moviescompose.ui.main.MoviesComposeMain
import com.yasintanriverdi.moviescompose.ui.theme.MoviesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MoviesTheme {
                MoviesComposeMain()
            }
        }
    }
}
