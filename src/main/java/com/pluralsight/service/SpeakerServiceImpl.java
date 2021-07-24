package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private HibernateSpeakerRepository speakerRepository;

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(HibernateSpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
