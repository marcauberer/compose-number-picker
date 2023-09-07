/*
 * Copyright © Marc Auberer 2021-2023. All rights reserved
 */

package com.chillibits.composenumberpickersample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
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
                            default = 50,
                            onValueChange = { value ->
                                Toast.makeText(this@MainActivity, value.toString(), Toast.LENGTH_SHORT).show()
                            }
                        )
                        Text(
                            text = getString(R.string.vertical_picker),
                            modifier = Modifier.width(IntrinsicSize.Max).align(CenterHorizontally))
                        VerticalNumberPicker(
                            min = 20,
                            max=30,
                            default = 20,
                            onValueChange = { value ->
                                Toast.makeText(this@MainActivity, value.toString(), Toast.LENGTH_SHORT).show()
                            }
                        )
                    }
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_activity_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_github -> openGitHubPage()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun openGitHubPage() {
        startActivity(Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(getString(R.string.github_link))
        })
    }
}