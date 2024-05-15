package com.breezefieldsalescodeit.features.newcollectionreport

import com.breezefieldsalescodeit.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}