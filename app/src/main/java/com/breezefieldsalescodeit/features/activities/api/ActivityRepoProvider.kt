package com.breezefieldsalescodeit.features.activities.api

import com.breezefieldsalescodeit.features.member.api.TeamApi
import com.breezefieldsalescodeit.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}