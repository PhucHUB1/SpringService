package org.example.springsecurewebservicev2.services;

import org.example.springsecurewebservicev2.dto.publication.CreatePublicationDto;
import org.example.springsecurewebservicev2.dto.publication.PublicationDto;
import org.example.springsecurewebservicev2.dto.publication.UpdatePublicationDto;
import org.example.springsecurewebservicev2.entity.BookPublisher;

import java.util.List;

public interface PublicationService {
    List<PublicationDto> getAllPublications();

    PublicationDto getPublicationById(int id);

    void createPublication(CreatePublicationDto createPublicationDto);

    void updatePublication(int id, UpdatePublicationDto updatePublicationDto);

    void deletePublication(int id);

}
