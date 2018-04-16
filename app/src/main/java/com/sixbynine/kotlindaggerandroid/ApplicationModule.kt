package com.sixbynine.kotlindaggerandroid

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class ApplicationModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        @Named("helloWorld")
        fun provideHelloWorldString(context: Context): String {
            return context.getString(R.string.hello_world)
        }
    }

    @Binds
    abstract fun bindContext(application: FruitApplication): Context
}