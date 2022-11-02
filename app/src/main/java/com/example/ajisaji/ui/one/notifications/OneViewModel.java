package com.example.ajisaji.ui.one.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OneViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is one fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}