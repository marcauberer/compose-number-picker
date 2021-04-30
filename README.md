# Compose Number Picker Library for Android
![GitHub release](https://img.shields.io/github/v/release/marcauberer/compose-number-picker?include_prereleases)
![Android CI](https://github.com/marcauberer/compose-number-picker/workflows/Android%20CI/badge.svg)
[![API](https://img.shields.io/badge/API-21%2B-red.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Article on Medium](https://aleen42.github.io/badges/src/medium.svg)](https://medium.com/swlh/simple-settings-library-build-a-settings-screen-in-seconds-5b6394fbd2fc)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)

Compose Number Picker is a library, which provides a simple to use, lightweight number picker component for Jetpack Compose. It has support for horizontal and vertical orientation.

## Try it
If you want to test the library, please visit the sample app on [Google Play](https://play.google.com/store/apps/details?id=com.chillibits.composenumberpickersample)!

## Screenshots (Android 11)
<img src="https://github.com/marcauberer/compose-number-picker/raw/main/media/screenshots/screen1.png" width="205" title="Screenshot 1">

## Usage
If you haven't Jetpack Compose ready to go in your project, please refer to [this guide](https://developer.android.com/jetpack/compose/setup) to include Jetpack Compose into your project.

As Compose Number Picker supports horizontal and vertical orientation, it provides two components for use:
-   HorizontalNumberPicker [view component](./numberpicker/src/main/java/com/chillibits/composenumberpicker/HorizontalNumberPicker.kt)
-   VerticalNumberPicker [view component](./numberpicker/src/main/java/com/chillibits/composenumberpicker/VerticalNumberPicker.kt)

This is like a `HorizontalNumberPicker` would look like in your Compose layout:
```kotlin
HorizontalNumberPicker(
    min = 10,
    max = 100,
    default = 50,
    modifier = Modifier.padding(10.dp)
)
```
If you need an example, please look into the [code](./app/src/main/java/com/chillibits/composenumberpickersample/MainActivity.kt) of the demo app.

## Supported languages
Here are the currently supported languages for the demo app. The library itself is language independent.

-   English
-   German
-   French

New translations are highly appreciated. If you want to translate the lib, please open a pr.

## Contribute to the project
If you want to contribute to this project, please feel free to send us a pull request.

## Credits
Thanks to all contributors and translators!

© Marc Auberer 2021
