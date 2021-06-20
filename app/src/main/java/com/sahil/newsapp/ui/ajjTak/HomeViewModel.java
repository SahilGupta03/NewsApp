package com.sahil.newsapp.ui.ajjTak;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" AajTak News");
    }

    public LiveData<String> getText() {
        return mText;
    }
}