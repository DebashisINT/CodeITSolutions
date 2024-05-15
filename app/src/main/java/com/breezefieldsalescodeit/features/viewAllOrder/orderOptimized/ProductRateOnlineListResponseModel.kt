package com.breezefieldsalescodeit.features.viewAllOrder.orderOptimized

import com.breezefieldsalescodeit.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}