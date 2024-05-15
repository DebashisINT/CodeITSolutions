package com.breezefieldsalescodeit.features.location.shopRevisitStatus

import com.breezefieldsalescodeit.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalescodeit.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}