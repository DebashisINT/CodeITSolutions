package com.breezefieldsalescodeit.features.addshop.api.assignedToDDList

import com.breezefieldsalescodeit.app.Pref
import com.breezefieldsalescodeit.features.addshop.model.assigntoddlist.AssignToDDListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 03-10-2018.
 */
class AssignToDDListRepo(val apiService: AssignToDDListApi) {
    fun assignToDDList(state_id: String): Observable<AssignToDDListResponseModel> {
        return apiService.getAssignedToDDList(Pref.session_token!!, Pref.user_id!!, state_id)
    }
}