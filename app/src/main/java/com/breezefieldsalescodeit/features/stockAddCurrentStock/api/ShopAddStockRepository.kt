package com.breezefieldsalescodeit.features.stockAddCurrentStock.api

import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalescodeit.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalescodeit.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalescodeit.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalescodeit.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}