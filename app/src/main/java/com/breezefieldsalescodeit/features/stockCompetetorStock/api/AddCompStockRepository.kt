package com.breezefieldsalescodeit.features.stockCompetetorStock.api

import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalescodeit.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalescodeit.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}