package com.pavietnam.mvprxjava.ui.login;

import com.pavietnam.mvprxjava.data.Repository;

public class LoginPresenter implements ILogin.IPresenter{

    private ILogin.IView mView;
    private Repository mRepository;

    public LoginPresenter(ILogin.IView mView, Repository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void login(String userName, String password) {

    }
}
