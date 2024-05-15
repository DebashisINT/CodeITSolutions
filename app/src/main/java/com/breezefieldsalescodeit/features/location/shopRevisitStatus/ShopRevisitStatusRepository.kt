package com.breezefieldsalescodeit.features.location.shopRevisitStatus

import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.location.model.ShopDurationRequest
import com.breezefieldsalescodeit.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}