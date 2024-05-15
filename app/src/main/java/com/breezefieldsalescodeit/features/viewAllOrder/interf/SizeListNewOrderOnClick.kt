package com.breezefieldsalescodeit.features.viewAllOrder.interf

import com.breezefieldsalescodeit.app.domain.NewOrderProductEntity
import com.breezefieldsalescodeit.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}