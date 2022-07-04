package com.techelevator.hotels.services;

import com.techelevator.reservations.model.Review;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ReviewService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_BASE_URL = "http://localhost:8080";

    public Review[] getReviewsForHotel(int hotelId) {
        String url = API_BASE_URL + "/hotels/" + hotelId + "/reviews";
        try {
            restTemplate.getForObject(url, Review[].class);
        } catch (Exception e) {
            return null;
        }
          return null;
    }
}
