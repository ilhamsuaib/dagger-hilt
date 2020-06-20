package dev.ilhamsuaib.hiltdi.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.ilhamsuaib.hiltdi.domain.Repository

/**
 * Created By @ilhamsuaib on 20/06/20
 */

class MainViewModel @ViewModelInject constructor(
    private val repo: Repository
) : ViewModel() {

    fun getHello(): String {
        return repo.getHello()
    }
}