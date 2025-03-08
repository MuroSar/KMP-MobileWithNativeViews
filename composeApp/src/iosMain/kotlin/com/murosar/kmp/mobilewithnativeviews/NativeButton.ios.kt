package com.murosar.kmp.mobilewithnativeviews

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.UIKitViewController

@Composable
actual fun NativeButton(
    modifier: Modifier,
    onClick: () -> Unit
) {
    // Retrieve the factory from composition local:
    val factory = LocalNativeViewFactory.current

    UIKitViewController(
        modifier = modifier
            .width(100.dp)
            .height(50.dp),
        factory = {
            factory.createButtonView(
                label = "IOS Button",
                onClick = onClick,
            )
        }
    )
}