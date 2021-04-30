/*
 * Copyright © Marc Auberer 2021. All rights reserved
 */

package com.chillibits.composenumberpicker

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(name="Horizontal number picker")
@Composable
fun HorizontalNumberPicker(
    modifier: Modifier = Modifier,
    height: Dp = 45.dp,
    min: Int = 0,
    max: Int = 10,
    default: Int = min
) {
    val number = remember { mutableStateOf(default) }

    Row {
        PickerButton(
            size = height,
            drawable = R.drawable.ic_arrow_left,
            onClick = {
                if (number.value > min) number.value--
            }
        )
        Text(
            text = number.value.toString(),
            fontSize = (height.value / 2).sp,
            modifier = Modifier.padding(10.dp)
                .height(IntrinsicSize.Max)
                .align(CenterVertically)
        )
        PickerButton(
            size = height,
            drawable = R.drawable.ic_arrow_right,
            onClick = {
                if (number.value < max) number.value++
            }
        )
    }
}