package com.example.cardie_vinapp;

import androidx.annotation.Nullable;

public class CardSet {
    private String SetId;
    private String SetName;
    private int SetQuantity;
//    private String SetIntroduction;
    private String UserId;
    private int SetImgUrl; // R.drawable.tiger_china

    public int getSetImgUrl() {
        return SetImgUrl;
    }

    public void setSetImgUrl(int setImgUrl) {
        SetImgUrl = setImgUrl;
    }

    public CardSet(String setId, String setName, int setImgUrl, int setQuantity, @Nullable String userId) {
        SetId = setId;
        SetName = setName;
        SetQuantity = setQuantity;
        UserId = userId;
        SetImgUrl = setImgUrl;
    }

    public String getSetId() {
        return SetId;
    }

    public void setSetId(String setId) {
        SetId = setId;
    }

    public String getSetName() {
        return SetName;
    }

    public void setSetName(String setName) {
        SetName = setName;
    }

    public int getSetQuantity() {
        return SetQuantity;
    }

    public void setSetQuantity(int setQuantity) {
        SetQuantity = setQuantity;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
