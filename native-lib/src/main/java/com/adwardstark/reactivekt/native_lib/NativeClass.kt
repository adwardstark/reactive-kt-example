package com.adwardstark.reactivekt.native_lib

import android.content.Context
import android.widget.Toast

/**
 * Created by Aditya Awasthi on 19/05/21.
 * @author github.com/adwardstark
 */
object NativeClass {

    fun showToast(context: Context,message: String, duration: Int): Toast {
        return Toast.makeText(context, message, duration)
    }
}