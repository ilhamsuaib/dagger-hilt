package dev.ilhamsuaib.hiltdi.domain

import javax.inject.Inject

/**
 * Created By @ilhamsuaib on 20/06/20
 */

class RepositoryImpl @Inject constructor() : Repository {

    override fun getHello(): String = "Hello world"
}