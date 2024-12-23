package com.service;

import com.model.Place;
import com.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> getPlacesByCity(String city) {
        return placeRepository.findByCity(city);
    }

    public void savePlace(Place place) {
        placeRepository.save(place);
    }
}
