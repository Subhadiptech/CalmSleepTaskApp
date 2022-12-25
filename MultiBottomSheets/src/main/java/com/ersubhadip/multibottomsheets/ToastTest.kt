package com.ersubhadip.multibottomsheets

import android.content.Context
import android.widget.Toast




class ToastTest {
    fun showToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}