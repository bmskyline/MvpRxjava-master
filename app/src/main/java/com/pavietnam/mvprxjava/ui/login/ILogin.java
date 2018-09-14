package com.pavietnam.mvprxjava.ui.login;

public interface ILogin {

    interface IView {
        void loginSuccess(String token);
    }

    interface IPresenter {
        void login(String userName, String password);
    }
}
