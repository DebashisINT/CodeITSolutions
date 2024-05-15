package com.breezefieldsalescodeit.features.stockAddCurrentStock.api

import com.breezefieldsalescodeit.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalescodeit.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}