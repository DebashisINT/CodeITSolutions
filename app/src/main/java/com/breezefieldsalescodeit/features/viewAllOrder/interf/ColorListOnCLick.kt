package com.breezefieldsalescodeit.features.viewAllOrder.interf

import com.breezefieldsalescodeit.app.domain.NewOrderGenderEntity
import com.breezefieldsalescodeit.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}