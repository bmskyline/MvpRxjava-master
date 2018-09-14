package com.pavietnam.mvprxjava.ui.main;

import com.pavietnam.mvprxjava.data.remote.model.User;

import java.util.List;

public interface IMain {

    interface IView {
        void getListUserSuccess(List<User> list);
        void getListUserFailed(String message);
    }

    interface IPresenter {
        void loadUsers();
    }
}
