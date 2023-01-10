package com.dang_hust.mvvm_cities.viewmodel;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.dang_hust.mvvm_cities.model.CityDataProvider;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public final class CityViewModel extends ViewModel {
    private final MutableLiveData cityData = new MutableLiveData();
    private final ArrayList cities = (new CityDataProvider()).getCities();
    private int currentIndex;
    private final long delay = 2000L;

    @NotNull
    public final LiveData getCityData() {
        return (LiveData)this.cityData;
    }

    private final void loop() {
        (new Handler(Looper.getMainLooper())).postDelayed((Runnable)(new Runnable() {
            public final void run() {
                CityViewModel.this.updateCity();
            }
        }), this.delay);
    }

    private final void updateCity() {
        int var10001 = this.currentIndex++;
        this.currentIndex %= this.cities.size();
        this.cityData.setValue(this.cities.get(this.currentIndex));
        this.loop();
    }

    public CityViewModel() {
        this.loop();
    }
}

