package com.breezefieldsalescodeit.features.addshop.api.typeList


import com.breezefieldsalescodeit.app.Pref
import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.addshop.model.*
import com.breezefieldsalescodeit.features.addshop.model.assigntopplist.AssignToPPListResponseModel
import com.breezefieldsalescodeit.features.beatCustom.BeatTeamResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-Jun-20.
 */
class TypeListRepo(val apiService: TypeListApi) {
    fun typeList(): Observable<TypeListResponseModel> {
        return apiService.getTypeList(Pref.session_token!!, Pref.user_id!!)
    }

    fun entityList(): Observable<EntityResponseModel> {
        return apiService.getEntityList(Pref.session_token!!, Pref.user_id!!)
    }

    fun partyStatusList(): Observable<PartyStatusResponseModel> {
        return apiService.getPartyStatusList(Pref.session_token!!, Pref.user_id!!)
    }

    fun updatePartyStatus(shopId: String, party_status_id: String, reason: String): Observable<BaseResponse> {
        return apiService.updatePartyStatus(Pref.session_token!!, Pref.user_id!!, shopId, party_status_id, reason)
    }

    fun retailerList(): Observable<RetailerListResponseModel> {
        return apiService.getRetailerList(Pref.session_token!!, Pref.user_id!!)
    }

    fun dealerList(): Observable<DealerListResponseModel> {
        return apiService.getDealerList(Pref.session_token!!, Pref.user_id!!)
    }

    fun beatList(): Observable<BeatListResponseModel> {
        return apiService.getBeatList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getBeatAreaRoute(): Observable<BetAreaRouteResponseModel> {
        return apiService.getBeatAreaRouteApi(Pref.session_token!!, Pref.user_id!!)
    }

    fun beatListForTeam(usrID:String): Observable<BeatListResponseModel> {
        return apiService.getBeatList(Pref.session_token!!, usrID!!)
    }

    fun updateBankDetails(shopId: String, accountHolder: String, accountNo: String, bankName: String, ifsc: String, upi: String): Observable<BaseResponse> {
        return apiService.updateBankDetails(Pref.session_token!!, Pref.user_id!!, shopId, accountHolder, accountNo, bankName, ifsc, upi)
    }

    fun assignToShopList(state_id: String): Observable<AssignedToShopListResponseModel> {
        return apiService.getAssignedToShopList(Pref.session_token!!, Pref.user_id!!, state_id)
    }
}