package com.murosar.kmp.mobilewithnativeviews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform