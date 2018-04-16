package com.sixbynine.kotlindaggerandroid

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    FruitActivityModule::class,
    FruitApplication.Module::class]
)
internal interface FruitApplicationComponent {
    fun inject(application: FruitApplication)
}