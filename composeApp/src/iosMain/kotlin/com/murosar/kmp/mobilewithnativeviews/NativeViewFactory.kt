package com.murosar.kmp.mobilewithnativeviews

import platform.UIKit.UIViewController

interface NativeViewFactory {
    // Will create a new function for each different view that we want to use natively
    fun createButtonView(
        label: String,
        onClick: () -> Unit
    ): UIViewController
}