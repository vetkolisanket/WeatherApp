package com.example.weatherapp.di

import com.example.weatherapp.data.location.LocationTracker
import com.example.weatherapp.domain.location.ILocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(locationTracker: LocationTracker): ILocationTracker

}