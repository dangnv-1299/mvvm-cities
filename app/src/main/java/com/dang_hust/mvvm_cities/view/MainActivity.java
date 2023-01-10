package com.dang_hust.mvvm_cities.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.activity.viewModels;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Observer;
import com.dang_hust.mvvm_cities.R;
import com.dang_hust.mvvm_cities.databinding.ActivityMainBinding;
import com.dang_hust.mvvm_cities.viewmodel.CityViewModel;

public final class CityViewModel extends AppCompatActivity {
    private final CityViewModel model = new viewModels();
    private final ActivityMainBinding binding = new viewModels();
    private final void onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
    };
    private final void onResume() {
        super.onResume();

        model.getCityData().observe(this, Observer { city ->
            binding.cityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, city.img, applicationContext.theme);
            );
            binding.cityNameTV.text = city.name;
            binding.cityPopulationTV.text = city.population.toString();
        })
    }
}