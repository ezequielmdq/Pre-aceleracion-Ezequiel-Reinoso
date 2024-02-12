package com.example.peliculaspopulares.service

import com.example.peliculaspopulares.BuildConfig
import com.example.peliculaspopulares.data.Pagina
import com.example.peliculaspopulares.data.PeliculaID
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

interface MoshiPeliculaInterface {

    @GET(BuildConfig.PATH_PELICULAS + BuildConfig.QUERY_POPULAR + BuildConfig.API_KEY + BuildConfig.QUERY_LENGUAJE)
    suspend fun getPeliculas(): Response<Pagina>

    @GET(BuildConfig.PATH_PELICULAS + BuildConfig.QUERY_PELICULAID + BuildConfig.API_KEY + BuildConfig.QUERY_LENGUAJE)
    suspend fun getPeliculasID (@Path("movieid") id: Int) : PeliculaID

}

