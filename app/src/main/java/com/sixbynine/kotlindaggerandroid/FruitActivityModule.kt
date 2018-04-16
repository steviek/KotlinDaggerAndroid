package com.sixbynine.kotlindaggerandroid

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FruitActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector()
    fun contributeFruitActivityInjector(): FruitActivity
}