package com.sixbynine.kotlindaggerandroid

import android.app.Activity
import android.app.Application
import dagger.Provides
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class FruitApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @dagger.Module
    class Module(private val application: FruitApplication) {
        @Provides
        fun provideApplication() = application
    }

    override fun onCreate() {
        super.onCreate()
        DaggerFruitApplicationComponent.builder().module(Module(this)).build().inject(this)
    }

    override fun activityInjector() = dispatchingActivityInjector
}