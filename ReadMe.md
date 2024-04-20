# Mobile Compass App

![App Logo or Screenshot](path/to/app_image.png)

A simple mobile compass application built using Kotlin and Jetpack Compose.

## Overview

This project is a mobile compass application designed to display real-time orientation information using the device's rotation vector sensor. The application provides a visually appealing compass UI that dynamically updates as the device orientation changes.

## Features

- Display of real-time compass needle rotation.
- Numerical display of the current orientation degree.
- Responsive UI using Jetpack Compose.
- Efficient sensor management for minimal battery usage.

## About the Sensor

In Android development, sensors play a crucial role in capturing various environmental data to enhance user experience and enable innovative applications. One such sensor is the Rotation Vector Sensor, which provides orientation data based on the rotation of the device.

### Adding the Rotation Vector Sensor to Your Project

To utilize the Rotation Vector Sensor in your Android application, you need to follow these steps:

1. **Declare Sensor Permission**: Ensure that your app's manifest file (`AndroidManifest.xml`) includes the necessary permissions to access sensors. Add the following line if it's not already present:

   ```xml
   <uses-permission android:name="android.permission.BODY_SENSORS" />


## Screenshots

![App Screenshot](path/to/app_screenshot.png)

## Demo Video

[Link to Demo Video](https://example.com)

## Getting Started

### Prerequisites

- Android Studio (version X.X.X)
- Android SDK (version XX)
- Kotlin (version X.X.X)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/mobile-compass-app.git
## Usage

1. Launch the application on your Android device.
2. Ensure that the device's rotation sensor is functional.
3. Rotate the device to observe the compass needle movement.
4. The numerical display indicates the current orientation degree.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
