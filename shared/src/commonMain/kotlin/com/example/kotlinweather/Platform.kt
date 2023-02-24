package com.example.kotlinweather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform