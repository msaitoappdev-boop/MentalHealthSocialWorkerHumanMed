package com.msaitodev.mhsw.humanmed.notifications

import android.content.Context
import com.msaitodev.mhsw.humanmed.R
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizCategoryNameProvider @Inject constructor(
    @ApplicationContext private val context: Context
) : CategoryNameProvider {

    override fun getDisplayName(categoryId: String): String {
        val resId = when (categoryId) {
            "01_mental_disorder" -> R.string.cat_01_mental_disorder
            "02_mental_health" -> R.string.cat_02_mental_health
            "03_consultation_assistance" -> R.string.cat_03_consultation_assistance
            "04_system_support" -> R.string.cat_04_system_support
            "05_comprehensive" -> R.string.cat_05_comprehensive
            else -> R.string.cat_unclassified
        }
        return context.getString(resId)
    }
}
