package com.example.weatherapp.di

import com.example.weatherapp.data.location.LocationTracker
import com.example.weatherapp.data.repository.WeatherRepository
import com.example.weatherapp.domain.location.ILocationTracker
import com.example.weatherapp.domain.repository.IWeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepository: WeatherRepository): IWeatherRepository

}