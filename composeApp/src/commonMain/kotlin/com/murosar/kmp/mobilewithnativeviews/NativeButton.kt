package com.murosar.kmp.mobilewithnativeviews

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun NativeButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
)