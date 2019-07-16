package com.fuji.api.online_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuji.api.online_test.model.TransactionHistory;


public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, String>{

}
