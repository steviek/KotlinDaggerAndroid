package com.sixbynine.kotlindaggerandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_fruit.*
import javax.inject.Inject
import javax.inject.Named

class FruitActivity : AppCompatActivity() {

    @Inject
    @field:Named("helloWorld")
    internal lateinit var helloWorldString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)
        textView.text = helloWorldString
    }
}
