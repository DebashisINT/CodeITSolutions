package com.breezefieldsalescodeit.features.survey.api

import com.breezefieldsalescodeit.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalescodeit.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}