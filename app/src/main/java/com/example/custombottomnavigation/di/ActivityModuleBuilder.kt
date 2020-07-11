package com.example.custombottomnavigation.di

import com.example.custombottomnavigation.MainActivity
import com.example.custombottomnavigation.di.main.MainFragmentModuleBuilder
import com.example.custombottomnavigation.di.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModuleBuilder {

    @ContributesAndroidInjector(modules = [MainModule::class, MainFragmentModuleBuilder::class])
    abstract fun contributeMainActivity(): MainActivity
}