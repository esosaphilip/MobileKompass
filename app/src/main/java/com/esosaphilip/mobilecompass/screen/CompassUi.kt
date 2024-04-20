package com.esosaphilip.mobilecompass.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.esosaphilip.mobilecompass.ui.theme.MobileCompassTheme


@Composable
fun CompassUi(rotateTo: Float) {


        Box(
          modifier = Modifier.fillMaxSize(),
              contentAlignment = Alignment.Center
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                CompassImage(rotateTo)
                Spacer(modifier = Modifier.padding(15.dp))
                DegreeCount(degree = rotateTo)
            }
        }
}



@Preview(showBackground = true)
@Composable
fun CompassPreview(){
    MobileCompassTheme {
        CompassUi(70f)
    }
}