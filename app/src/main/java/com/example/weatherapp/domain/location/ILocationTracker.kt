package com.example.weatherapp.domain.location

interface ILocationTracker {

    suspend fun getCurrentLocation(): Location?

}