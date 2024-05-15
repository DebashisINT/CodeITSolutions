package com.breezefieldsalescodeit.features.notification.model

import com.breezefieldsalescodeit.base.BaseResponse

/**
 * Created by Saikat on 06-03-2019.
 */
class NotificationListResponseModel : BaseResponse() {
    var notification_list: ArrayList<NotificationListDataModel>? = null
}