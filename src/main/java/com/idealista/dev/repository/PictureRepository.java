package com.idealista.dev.repository;

import org.springframework.data.repository.CrudRepository;

import com.idealista.dev.model.Picture;

public interface PictureRepository extends CrudRepository<Picture, Integer>{}
