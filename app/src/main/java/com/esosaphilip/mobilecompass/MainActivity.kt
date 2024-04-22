package com.esosaphilip.mobilecompass

import android.content.ContentValues.TAG
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.esosaphilip.mobilecompass.screen.CompassUi
import com.esosaphilip.mobilecompass.ui.theme.MobileCompassTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity(), SensorEventListener {
      private var sensorManager: SensorManager? = null
      private var rotationSensor: Sensor? = null

    // to keep track of the rotation of the Compass

    private var previousDegree = 0f // Previous degree value
    private var currentDegreeState = mutableFloatStateOf(0f)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
         rotationSensor = sensorManager!!.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)

        setContent {
            MobileCompassTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                  CompassUi(rotateTo = currentDegreeState.floatValue)

                }
            }
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {

        val degree = event?.values?.get(0)?.let { Math.toDegrees(it.toDouble()).toFloat() }

        Log.d(TAG, "onSensorChanged: $degree")

        val roundedDegree = degree?.roundToInt()?.toFloat() // Round off to the nearest integer
        if (roundedDegree != null) {
            currentDegreeState.floatValue = roundedDegree
        } // Update the degree state


        if (roundedDegree != null) {
            previousDegree = roundedDegree
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    // Register a listener for the Sensor
    override fun onResume() {
        super.onResume()

        sensorManager?.registerListener(
            this, rotationSensor,
            SensorManager.SENSOR_DELAY_NORMAL
        )

    }

    // Unregister a listener for the Sensor
    override fun onPause() {
        super.onPause()
        sensorManager?.unregisterListener(this)
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MobileCompassTheme {

    }
}