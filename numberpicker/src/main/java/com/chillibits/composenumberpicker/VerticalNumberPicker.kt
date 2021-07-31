/*
 * Copyright © Marc Auberer 2021. All rights reserved
 */

package com.chillibits.composenumberpicker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(name = "Vertical number picker")
@Composable
fun VerticalNumberPicker(
    modifier: Modifier = Modifier,
    width: Dp = 45.dp,
    min: Int = 0,
    max: Int = 10,
    default: Int = min,
    onValueChange: (Int) -> Unit = {},
) {
    val number = remember { mutableStateOf(default) }

    Column {
        PickerButton(
            size = width,
            drawable = R.drawable.ic_arrow_up,
            enabled = number.value < max,
            onClick = {
                if (number.value < max) number.value++
                onValueChange(number.value)
            }
        )
        Text(
            text = number.value.toString(),
            fontSize = (width.value / 2).sp,
            modifier = Modifier
                .padding(10.dp)
                .width(IntrinsicSize.Max)
                .align(CenterHorizontally)
        )
        PickerButton(
            size = width,
            drawable = R.drawable.ic_arrow_down,
            enabled = number.value > min,
            onClick = {
                if (number.value > min) number.value--
                onValueChange(number.value)
            }
        )
    }
}