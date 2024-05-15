package com.breezefieldsalescodeit.features.viewAllOrder.interf

import com.breezefieldsalescodeit.app.domain.NewOrderGenderEntity
import com.breezefieldsalescodeit.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}