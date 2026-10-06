package com.zabanyar.ai.data

import android.content.Context
import androidx.media3.common.util.UnstableApi
import androidx.media3.database.StandaloneDatabaseProvider
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.datasource.cache.CacheDataSource
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor
import androidx.media3.datasource.cache.SimpleCache
import androidx.media3.datasource.okhttp.OkHttpDataSource
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import okhttp3.OkHttpClient
import java.io.File

@UnstableApi
object PodcastCache {

    private var simpleCache: SimpleCache? = null

    private fun getCache(context: Context): SimpleCache {
        return simpleCache ?: synchronized(this) {
            simpleCache ?: run {
                val cacheDir = File(context.cacheDir, "podcast_cache")
                val evictor = LeastRecentlyUsedCacheEvictor(200L * 1024 * 1024) // 200 MB
                val db = StandaloneDatabaseProvider(context)
                SimpleCache(cacheDir, evictor, db).also { simpleCache = it }
            }
        }
    }

    fun mediaSourceFactory(context: Context): DefaultMediaSourceFactory {
        val httpClient = OkHttpClient.Builder().build()
        val httpDataSource = OkHttpDataSource.Factory(httpClient)

        val cacheDataSourceFactory = CacheDataSource.Factory()
            .setCache(getCache(context))
            .setUpstreamDataSourceFactory(httpDataSource)
            .setFlags(CacheDataSource.FLAG_IGNORE_CACHE_ON_ERROR)

        val defaultFactory = DefaultDataSource.Factory(context, cacheDataSourceFactory)

        return DefaultMediaSourceFactory(defaultFactory)
    }
}