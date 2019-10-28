package com.syphan.practice.house.service.api.repository;

import com.syphan.practice.commonservice.dao.JpaQueryRepository;
import com.syphan.practice.house.service.api.model.BoardingHouse;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardingHouseRepository extends JpaQueryRepository<BoardingHouse, Integer> {
}
