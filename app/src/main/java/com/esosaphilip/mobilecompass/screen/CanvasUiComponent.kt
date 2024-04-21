package com.esosaphilip.mobilecompass.screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.esosaphilip.mobilecompass.R

@Composable
fun CompassImage(rotate: Float) {

    val animatedRotation by animateFloatAsState(
        targetValue = rotate,
        animationSpec = tween(durationMillis = 500), label = "" // Adjust the duration as needed
    )


    painterResource(id = R.drawable.compass).apply {

        Image(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
                .rotate(animatedRotation),
            painter = this,
            contentDescription = stringResource(id = R.string.image_description)
        )
    }

}


@Composable
fun DegreeCount(degree: Float) {
    Text(text = "Degree: ${degree.toInt()}", fontSize = 30.sp, fontStyle = FontStyle.Normal, color = Color.Black )
}