package edu.cnm.deepdive.wakeup.controller.ui.activities;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * View model class for fragment
 */
public class ActivitiesViewModel extends ViewModel {

  private MutableLiveData<String> mText;

  public ActivitiesViewModel() {
    mText = new MutableLiveData<>();
    mText.setValue("This is activities fragment");
  }

  public LiveData<String> getText() {
    return mText;
  }
}