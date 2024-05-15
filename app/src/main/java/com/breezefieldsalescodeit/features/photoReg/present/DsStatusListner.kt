package com.breezefieldsalescodeit.features.photoReg.present

import com.breezefieldsalescodeit.app.domain.ProspectEntity
import com.breezefieldsalescodeit.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}