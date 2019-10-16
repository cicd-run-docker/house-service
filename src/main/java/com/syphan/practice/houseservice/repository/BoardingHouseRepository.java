package com.syphan.practice.houseservice.repository;

import com.syphan.practice.commonservice.dao.JpaQueryRepository;
import com.syphan.practice.houseservice.model.BoardingHouse;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardingHouseRepository extends JpaQueryRepository<BoardingHouse, Integer> {
}
