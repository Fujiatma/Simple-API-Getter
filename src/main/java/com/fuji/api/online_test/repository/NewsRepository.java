package com.fuji.api.online_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuji.api.online_test.model.News;


public interface NewsRepository extends JpaRepository<News, String>{

}
