package com.example.myapplication.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.myapplication.model.PlacesBean;
import com.example.myapplication.repository.PlacesRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

   private MutableLiveData<List<PlacesBean>>getPlacesObject;

    public void initializeRemote() {
        PlacesRepository placesRepository = PlacesRepository.getInstance();
        getPlacesObject = placesRepository.getPlaces();
    }

    public LiveData<List<PlacesBean>> getPlacesList() {
        return getPlacesObject;
    }

}
