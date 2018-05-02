package com.uriahsolution.homecare.ui.login;

public class LoginPresenter implements LoginContract.Presenter {


    private final LoginContract.View mLoginView;

    LoginPresenter(LoginContract.View mLoginView){

        this.mLoginView=mLoginView;
    }

}
