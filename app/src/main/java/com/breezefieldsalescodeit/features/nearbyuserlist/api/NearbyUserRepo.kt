package com.breezefieldsalescodeit.features.nearbyuserlist.api

import com.breezefieldsalescodeit.app.Pref
import com.breezefieldsalescodeit.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalescodeit.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalescodeit.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}