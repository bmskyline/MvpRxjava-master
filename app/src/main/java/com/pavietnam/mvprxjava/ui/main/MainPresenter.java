package com.pavietnam.mvprxjava.ui.main;

import android.support.annotation.NonNull;
import android.util.Log;

import com.pavietnam.mvprxjava.data.Repository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements IMain.IPresenter{

    private IMain.IView mView;
    private Repository mRepository;
    @NonNull
    private CompositeDisposable mCompositeDisposable;


    public MainPresenter(IMain.IView mView) {
        this.mView = mView;
        this.mRepository = new Repository();
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void loadUsers() {
        mCompositeDisposable.clear();
        Disposable disposable = mRepository
                .getAllUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        // onNext
                        users -> {
                            mView.getListUserSuccess(users);
                        },
                        // onError
                        throwable -> {
                            mView.getListUserFailed(throwable.getMessage());
                            Log.d("TAG", "loadUsers: "+throwable.getMessage());
                        });

        mCompositeDisposable.add(disposable);
    }
}
