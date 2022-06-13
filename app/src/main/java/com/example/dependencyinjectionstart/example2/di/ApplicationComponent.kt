package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun ActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory{

        fun create(
            @BindsInstance
            context: Context,
            @BindsInstance
            timeMills: Long
        ): ApplicationComponent
    }
}