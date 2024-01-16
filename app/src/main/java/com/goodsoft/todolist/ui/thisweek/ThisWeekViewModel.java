package com.goodsoft.todolist.ui.thisweek;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThisWeekViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ThisWeekViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is this week fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}