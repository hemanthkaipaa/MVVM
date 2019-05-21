package com.example.myapplication.repository;

import android.arch.lifecycle.MutableLiveData;

import com.example.myapplication.model.PlacesBean;

import java.util.ArrayList;
import java.util.List;

public class PlacesRepository {
    private static PlacesRepository placesRepository;
    private List<PlacesBean> getRemotePlacesList;
    public static PlacesRepository getInstance(){
        return placesRepository==null? new PlacesRepository() :placesRepository;
    }

    public MutableLiveData<List<PlacesBean>>getPlaces(){
        getRemotePlacesList();
        MutableLiveData<List<PlacesBean>> liveData = new MutableLiveData<>();
        liveData.setValue(getRemotePlacesList);
        return liveData;
    }
    private void getRemotePlacesList(){
        getRemotePlacesList = new ArrayList<>();
        getRemotePlacesList.add(new PlacesBean("Kurnool",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Hyderabad",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Bangalore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Tirupathi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mumbai",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Pune",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Udipi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mysore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("New Delhi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Jammu",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Noida",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Ooty",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Kurnool",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Hyderabad",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Bangalore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Tirupathi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mumbai",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Pune",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Udipi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mysore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("New Delhi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Jammu",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Noida",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Ooty",12.12345,27.8849));getRemotePlacesList.add(new PlacesBean("Kurnool",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Hyderabad",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Bangalore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Tirupathi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mumbai",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Pune",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Udipi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mysore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("New Delhi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Jammu",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Noida",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Ooty",12.12345,27.8849));getRemotePlacesList.add(new PlacesBean("Kurnool",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Hyderabad",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Bangalore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Tirupathi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mumbai",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Pune",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Udipi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mysore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("New Delhi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Jammu",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Noida",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Ooty",12.12345,27.8849));getRemotePlacesList.add(new PlacesBean("Kurnool",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Hyderabad",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Bangalore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Tirupathi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mumbai",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Pune",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Udipi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Mysore",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("New Delhi",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Jammu",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Noida",12.12345,27.8849));
        getRemotePlacesList.add(new PlacesBean("Ooty",12.12345,27.8849));


    }
}
