package com.breezefieldsalescodeit.app.domain;

import static com.breezefieldsalescodeit.app.AppConstant.SHOP_TABLE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.breezefieldsalescodeit.app.AppConstant;

@Dao
public interface TeamAllShopDBModelDao {
    @Insert
    void insert(TeamAllShopDBModelEntity shops);

    @Query("DELETE FROM " + AppConstant.SHOP_TABLE_ALL_TEAM)
    void deleteAll();

    @Query("Select * from shop_detail_all_team where shop_id=:shopId")
    TeamAllShopDBModelEntity getShopByIdN(String shopId);





}
