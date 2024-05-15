package com.breezefieldsalescodeit.features.lead.api

import com.breezefieldsalescodeit.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalescodeit.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}