package com.chillibits.composenumberpickersample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.core.view.WindowCompat
import com.chillibits.composenumberpicker.HorizontalNumberPicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)

        setContent {
            AppTheme {
                ConstraintLayout(
                    constraintSet = ConstraintSet {
                        val layout = createRefFor("picker")
                        constrain(layout) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                    },
                    modifier = Modifier.fillMaxSize()
                ) {
                    HorizontalNumberPicker(min = 10, max = 100, default = 50, modifier = Modifier.layoutId("layout"))
                }
            }
        }
    }
}