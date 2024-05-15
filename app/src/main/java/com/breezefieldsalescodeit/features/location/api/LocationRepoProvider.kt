package com.breezefieldsalescodeit.features.location.api

import com.breezefieldsalescodeit.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalescodeit.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}