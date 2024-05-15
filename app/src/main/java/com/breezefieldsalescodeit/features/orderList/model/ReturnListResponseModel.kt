package com.breezefieldsalescodeit.features.orderList.model

import com.breezefieldsalescodeit.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}