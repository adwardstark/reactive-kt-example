package com.adwardstark.reactivekt.react_plugin

import android.widget.Toast
import com.adwardstark.reactivekt.native_lib.NativeClass
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

/**
 * Created by Aditya Awasthi on 19/05/21.
 * @author github.com/adwardstark
 */
class RNReactiveKTModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "RNReactiveKT"
    }

    @ReactMethod
    fun showNativeToastDirectly(message: String, duration: Int) {
        Toast.makeText(reactApplicationContext, message, duration).show()
    }

    @ReactMethod
    fun showNativeToastUsingNativeLib(message: String, duration: Int) {
        NativeClass.showToast(reactApplicationContext, message, duration).show()
    }
}