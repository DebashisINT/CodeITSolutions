package com.breezefieldsalescodeit.features.login.model.productlistmodel

import com.breezefieldsalescodeit.app.domain.ModelEntity
import com.breezefieldsalescodeit.app.domain.ProductListEntity
import com.breezefieldsalescodeit.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}