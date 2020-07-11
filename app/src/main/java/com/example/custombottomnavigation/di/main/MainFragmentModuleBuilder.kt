package com.example.custombottomnavigation.di.main

import com.example.custombottomnavigation.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentModuleBuilder {

    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): FirstFragment
}