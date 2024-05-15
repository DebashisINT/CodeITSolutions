package com.breezefieldsalescodeit.features.document.api

import com.breezefieldsalescodeit.features.dymanicSection.api.DynamicApi
import com.breezefieldsalescodeit.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}