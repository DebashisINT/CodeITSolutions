package com.breezefieldsalescodeit.features.photoReg.adapter

import com.breezefieldsalescodeit.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}