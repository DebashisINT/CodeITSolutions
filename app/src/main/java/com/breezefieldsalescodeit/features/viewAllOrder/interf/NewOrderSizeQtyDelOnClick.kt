package com.breezefieldsalescodeit.features.viewAllOrder.interf

import com.breezefieldsalescodeit.app.domain.NewOrderGenderEntity
import com.breezefieldsalescodeit.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}