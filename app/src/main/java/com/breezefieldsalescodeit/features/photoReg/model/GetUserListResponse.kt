package com.breezefieldsalescodeit.features.photoReg.model

import com.breezefieldsalescodeit.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}