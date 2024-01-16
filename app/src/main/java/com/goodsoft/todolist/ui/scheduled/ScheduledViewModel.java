package com.goodsoft.todolist.ui.scheduled;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScheduledViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ScheduledViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is scheduled fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}