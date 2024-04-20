package com.esosaphilip.mobilecompass.screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import com.esosaphilip.mobilecompass.R

@Composable
fun CompassImage(rotate: Float) {


    val turnTo by animateFloatAsState(targetValue = rotate, label = "")

    painterResource(id = R.drawable.compass).apply {

        Image(
            modifier = Modifier.fillMaxSize()
                .alpha(turnTo),
            painter = this,
            contentDescription = stringResource(id = R.string.image_description)
        )
    }

}


@Composable
fun DegreeCount(degree: Float) {
    Text(text = degree.toString(), fontSize = 30.sp, fontStyle = FontStyle.Normal )
}