package com.breezefieldsalescodeit.features.viewAllOrder.model

import com.breezefieldsalescodeit.app.domain.NewOrderColorEntity
import com.breezefieldsalescodeit.app.domain.NewOrderGenderEntity
import com.breezefieldsalescodeit.app.domain.NewOrderProductEntity
import com.breezefieldsalescodeit.app.domain.NewOrderSizeEntity
import com.breezefieldsalescodeit.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

