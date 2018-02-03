package com.microsoft.aad.adal;

public class UserInfoFactory {
    private UserInfoFactory() {
        this.mUserInfo = null;
    }

    private static UserInfoFactory mInstance;

    private UserInfo mUserInfo;

    public static UserInfoFactory getInstance() {
        if (mInstance == null) {
            mInstance = new UserInfoFactory();
        }

        return mInstance;
    }

    public UserInfo getUserInfo() {
        return this.mUserInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.mUserInfo = userInfo;
    }
}
