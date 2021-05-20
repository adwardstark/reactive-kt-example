Reactive-KT-Example
===================

This is an example project to setup and build react-native app with support for native-code using kotlin. You can use this project as a reference to setup native-library written in Kotlin and consume it in react-native using a react-plugin.

## Prerequisites
-----------------
This project requires you to have latest version of [Android-Studio](https://developer.android.com/studio) & Android-SDK configured on your machine.

## How to
---------
To try this project, clone this repository and follow the steps mentioned below:
 * **Step 1.** Install dependencies
    ```bash
    # Install root-level dependencies
    npm install
    # Install plugin dependencies
    cd react-plugin
    npm install
    cd ..
    ```
* **Step 2.** Start Metro-Bundler ( `In a separate terminal` )
    ```bash
    npx react-native start
    ```
* **Step 3.** Run the app
    ```bash
    npx react-native run-android
    ```

To open this project in Android-Studio go to `Open an Existing Project` > Select `android` folder of this repository > `Open`.

## License
----------
Apache 2.0. See the [LICENSE](https://github.com/adwardstark/reactive-kt-example/blob/master/LICENSE) file for details.