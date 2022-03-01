package com.yourbrowser.buildsrc

import org.gradle.api.JavaVersion

object BuildConfiguration {

  const val  compileSdk = 31

  object DefaultConfig {
    const val minSdk = 29
    const val targetSdk = 31
  }

  object Java {
     val source = JavaVersion.VERSION_1_8
    val target = JavaVersion.VERSION_1_8
  }

  object Kotlin {
    const val jvmTarget = "1.8"
  }
}
