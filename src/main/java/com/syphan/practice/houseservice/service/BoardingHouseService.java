package com.syphan.practice.houseservice.service;

import com.syphan.practice.commonservice.exception.BIZException;
import com.syphan.practice.commonservice.service.BaseService;
import com.syphan.practice.dto.house.BoardingHouseCreateDto;
import com.syphan.practice.houseservice.model.BoardingHouse;

public interface BoardingHouseService extends BaseService<BoardingHouse, Integer> {

    BoardingHouse create(BoardingHouseCreateDto data) throws BIZException;
}
