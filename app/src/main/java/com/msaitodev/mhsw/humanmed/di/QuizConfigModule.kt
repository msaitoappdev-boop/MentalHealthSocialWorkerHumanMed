package com.msaitodev.mhsw.humanmed.di

import com.msaitodev.core.common.config.AppAssetConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object QuizConfigModule {

    @Provides
    @Singleton
    fun provideAppAssetConfig(): AppAssetConfig {
        return AppAssetConfig(
            assetDataDirectory = "quiz_data",
            totalExamQuestions = 80, // 精神保健福祉士国家試験（専門科目）の設問数
            passingScoreThreshold = 0.6f // 概ね60%が合格ライン
        )
    }
}
