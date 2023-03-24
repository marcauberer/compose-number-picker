/*
 * Copyright © Marc Auberer 2021-2023. All rights reserved
 */

package com.chillibits.composenumberpicker

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview(name="Picker button")
@Composable
fun PickerButton(
    size: Dp = 45.dp,
    @DrawableRes drawable: Int = R.drawable.ic_arrow_left,
    enabled: Boolean = true,
    onClick: () -> Unit = {}
) {
    val contentDescription = LocalContext.current.resources.getResourceName(drawable)
    val backgroundColor = if (enabled) MaterialTheme.colors.secondary else Color.LightGray

    Image(
        painter = painterResource(id = drawable),
        contentDescription = contentDescription,
        modifier = Modifier.padding(8.dp).background(backgroundColor, CircleShape)
            .clip(CircleShape)
            .width(size).height(size)
            .clickable (
                enabled = enabled,
                onClick = { onClick() }
            )
    )
}