package com.syphan.practice.house.service.api.service;

import com.syphan.practice.commonservice.exception.BIZException;
import com.syphan.practice.commonservice.service.BaseService;
import com.syphan.practice.dto.house.BoardingHouseCreateDto;
import com.syphan.practice.house.service.api.model.BoardingHouse;

public interface BoardingHouseService extends BaseService<BoardingHouse, Integer> {

    BoardingHouse create(int userId, BoardingHouseCreateDto data) throws BIZException;
}
