package com.breezefieldsalescodeit.features.reimbursement.api.editapi

import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.reimbursement.model.ApplyReimbursementInputModel
import io.reactivex.Observable

/**
 * Created by Saikat on 08-02-2019.
 */
class ReimbursementEditRepo(val apiService: ReimbursementEditApi) {
    fun editReimbursement(input: ApplyReimbursementInputModel): Observable<BaseResponse> {
        return apiService.editReimbursement(input)
    }
}