package com.adwardstark.reactivekt.react_plugin

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

/**
 * Created by Aditya Awasthi on 19/05/21.
 * @author github.com/adwardstark
 */
class RNReactiveKTPackage : ReactPackage {

    // Deprecated from RN 0.47
    fun createJSModules(): List<Class<out JavaScriptModule?>?> {
        return emptyList()
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList()
    }

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        return ArrayList<NativeModule>().apply {
            add(RNReactiveKTModule(reactContext))
        }
    }
}