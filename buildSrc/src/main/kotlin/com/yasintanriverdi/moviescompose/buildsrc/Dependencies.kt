object Dependencies {

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    }

    object Google {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object Dagger {
        const val hiltCore = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    }

    object OkHttp {
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    }
}