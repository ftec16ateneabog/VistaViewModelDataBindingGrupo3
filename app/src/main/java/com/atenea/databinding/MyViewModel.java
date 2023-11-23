package com.atenea.databinding;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public ObservableField<String> message = new ObservableField<>("Hello");

    public void updateMessage()
    {
        message.set("Hello, Data biding");
    }

}
