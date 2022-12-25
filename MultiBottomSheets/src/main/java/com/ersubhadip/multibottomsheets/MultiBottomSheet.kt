package com.ersubhadip.multibottomsheets

import android.content.Context
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog


class MultiBottomSheet{
    lateinit var bottomSheetDialog: BottomSheetDialog
    lateinit var sheetView: View

    constructor(context: Context?, view: View?, isCancellable: Boolean = false) {
        sheetView = view!!
        bottomSheetDialog = BottomSheetDialog(context!!)
        bottomSheetDialog.apply {
            setContentView(sheetView)
            setCancelable(isCancellable)
        }
    }

    constructor(context: Context?, view: View?) {
        sheetView = view!!
        bottomSheetDialog = BottomSheetDialog(context!!)
        bottomSheetDialog.apply {
            setContentView(sheetView)
            setCancelable(false)
        }
    }

    fun displayType(isShow: Boolean) {
        if (isShow) {
            bottomSheetDialog.show()
        } else {
            if (bottomSheetDialog.isShowing) {
                bottomSheetDialog.dismiss()
            }
        }
    }

//    open fun sheetOnCancelledListener() {
//        bottomSheetDialog.setOnCancelListener {
//
//        }
//    }

}

