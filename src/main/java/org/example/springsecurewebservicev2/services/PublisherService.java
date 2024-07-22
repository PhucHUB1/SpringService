package org.example.springsecurewebservicev2.services;

import org.example.springsecurewebservicev2.dto.publisher.CreatePublisherDto;
import org.example.springsecurewebservicev2.dto.publisher.PublisherAndMoreDto;
import org.example.springsecurewebservicev2.dto.publisher.UpdatePublisherDto;

import java.util.List;

public interface PublisherService {
    List<PublisherAndMoreDto> getAllPublishers();

    PublisherAndMoreDto getPublisherById(int id);

    void createPublisher(CreatePublisherDto createPublisherDto);

    void updatePublisher(int id, UpdatePublisherDto updatePublisherDto);

    void deletePublisher(int id);
}
