package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.List;

public interface HibernateSpeakerRepository {
    List<Speaker> findAll();
}
