package com.breezefieldsalescodeit.features.viewAllOrder.interf

import com.breezefieldsalescodeit.app.domain.NewOrderColorEntity
import com.breezefieldsalescodeit.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}