package com.example.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor(): ExampleRemoteDataSource {
    override fun method() {
        Log.d("TestRemoteData", "test")
    }
}