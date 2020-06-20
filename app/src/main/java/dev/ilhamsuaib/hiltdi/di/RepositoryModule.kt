package dev.ilhamsuaib.hiltdi.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dev.ilhamsuaib.hiltdi.domain.Repository
import dev.ilhamsuaib.hiltdi.domain.RepositoryImpl

/**
 * Created By @ilhamsuaib on 20/06/20
 */

@Module
@InstallIn(ActivityComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(
        repository: RepositoryImpl
    ): Repository
}