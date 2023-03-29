# Fouth Maket - Макет 4

## Реализация

<br>


Приложение реализованно на: Android Studio Electric Eel | 2022.1.1 Patch 2

Главный язык при разработке  **Kotlin**

SDK platform минимальная - 30, поддерживает версии и выше

<br>

---
<br>

**Что реализовано** 
<br> 
+ Интерфейс приложения является адаптивным под темы телефона
+ Основные элементы приложенния
+ Переход по страницам через фрагменты


<br>

___

<br>

**Что лучше доделать**
<br>
+ Исправить ошибку с двойным кликом для перехода на другой фрагмент
+ Возможно реализация перехода выполнена не самым лучшим образом
+ Использовать Navigation для передвижения по Fragmnet
+ Дизайн сделать адаптивным
+ Использовать ScrollingFragment там где они нужны


<br>

---

<br>

## Gradle build file 

<br>
Consits that properties:


```gradle
plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

android {
    namespace 'com.example.myapplication'
    compileSdk 33

    defaultConfig {
        applicationId "com.example.myapplication"
        minSdk 30
        targetSdk 33
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

    implementation 'androidx.fragment:fragment-ktx:1.5.5' //For fragment
    implementation 'com.google.android.material:material:1.8.0'

    def nav_version = "2.5.3"

    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
}
```