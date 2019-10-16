package com.syphan.practice.houseservice.service.impl;

import com.syphan.practice.commonservice.service.impl.BaseServiceImpl;
import com.syphan.practice.houseservice.model.BoardingHouse;
import com.syphan.practice.houseservice.repository.BoardingHouseRepository;
import com.syphan.practice.houseservice.service.BoardingHouseService;
import com.syphan.practice.registrationservice.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service
public class BoardingHouseServiceImpl extends BaseServiceImpl<BoardingHouse, Integer> implements BoardingHouseService {

    private BoardingHouseRepository repository;

    @Autowired
    public BoardingHouseServiceImpl(BoardingHouseRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Reference
    private UserService userService;
}
