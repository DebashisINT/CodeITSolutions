package com.breezefieldsalescodeit.features.newcollection.model

import com.breezefieldsalescodeit.app.domain.CollectionDetailsEntity
import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}