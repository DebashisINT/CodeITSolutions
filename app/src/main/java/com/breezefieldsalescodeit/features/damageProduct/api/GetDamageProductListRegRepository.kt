package com.breezefieldsalescodeit.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalescodeit.app.FileUtils
import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.NewQuotation.model.*
import com.breezefieldsalescodeit.features.addshop.model.AddShopRequestData
import com.breezefieldsalescodeit.features.addshop.model.AddShopResponse
import com.breezefieldsalescodeit.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalescodeit.features.damageProduct.model.delBreakageReq
import com.breezefieldsalescodeit.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalescodeit.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalescodeit.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalescodeit.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}