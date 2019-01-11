package com.idealista.dev.repository;

import org.springframework.data.repository.CrudRepository;

import com.idealista.dev.model.Announcement;

public interface AnnouncementRepository extends CrudRepository<Announcement, Integer>{}
