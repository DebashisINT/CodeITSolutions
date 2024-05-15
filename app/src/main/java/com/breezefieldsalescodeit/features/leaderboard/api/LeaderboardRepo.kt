package com.breezefieldsalescodeit.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalescodeit.app.FileUtils
import com.breezefieldsalescodeit.app.Pref
import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.addshop.model.AddLogReqData
import com.breezefieldsalescodeit.features.addshop.model.AddShopRequestData
import com.breezefieldsalescodeit.features.addshop.model.AddShopResponse
import com.breezefieldsalescodeit.features.addshop.model.LogFileResponse
import com.breezefieldsalescodeit.features.addshop.model.UpdateAddrReq
import com.breezefieldsalescodeit.features.contacts.CallHisDtls
import com.breezefieldsalescodeit.features.contacts.CompanyReqData
import com.breezefieldsalescodeit.features.contacts.ContactMasterRes
import com.breezefieldsalescodeit.features.contacts.SourceMasterRes
import com.breezefieldsalescodeit.features.contacts.StageMasterRes
import com.breezefieldsalescodeit.features.contacts.StatusMasterRes
import com.breezefieldsalescodeit.features.contacts.TypeMasterRes
import com.breezefieldsalescodeit.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalescodeit.features.login.model.WhatsappApiData
import com.breezefieldsalescodeit.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}