package com.breezefieldsalescodeit.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalescodeit.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalescodeit.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}