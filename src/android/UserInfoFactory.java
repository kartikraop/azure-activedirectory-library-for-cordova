package com.microsoft.aad.adal;

public class UserInfoFactory {
    private UserInfoFactory() {
        this.mAuthentcationResult = null;
    }

    private static UserInfoFactory mInstance;

    private AuthenticationResult mAuthentcationResult;

    public static UserInfoFactory getInstance() {
        if (mInstance == null) {
            mInstance = new UserInfoFactory();
        }

        return mInstance;
    }

    public AuthenticationResult getAuthentcationResult() {
        return this.mAuthentcationResult;
    }

    public void setAuthentcationResult(AuthenticationResult authenticationResult) {
        this.mAuthentcationResult = authenticationResult;
    }

    public UserInfo getUserInfo() {
        return this.getAuthentcationResult() != null ? this.getAuthentcationResult().getUserInfo() : null;
    }
}
