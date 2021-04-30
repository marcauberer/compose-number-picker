/*
 * Copyright © Marc Auberer 2021. All rights reserved
 */

package com.chillibits.composenumberpickersample

import android.os.Bundle
import android.view.Gravity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.core.view.WindowCompat
import com.chillibits.composenumberpicker.HorizontalNumberPicker
import com.chillibits.composenumberpicker.VerticalNumberPicker

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
                    Column(
                        modifier = Modifier.layoutId("picker"),
                        horizontalAlignment = CenterHorizontally
                    ) {
                        Text(
                            text = getString(R.string.horizontal_picker),
                            modifier = Modifier.width(IntrinsicSize.Max).align(CenterHorizontally))
                        HorizontalNumberPicker(
                            min = 10,
                            max = 100,
                            default = 50
                        )
                        Text(
                            text = getString(R.string.vertical_picker),
                            modifier = Modifier.width(IntrinsicSize.Max).align(CenterHorizontally))
                        VerticalNumberPicker(
                            min = 20,
                            max=30,
                            default = 20
                        )
                    }
                }
            }
        }
    }
}