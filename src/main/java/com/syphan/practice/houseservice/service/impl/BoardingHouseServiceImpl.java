package com.syphan.practice.houseservice.service.impl;

import com.syphan.practice.commonservice.exception.BIZException;
import com.syphan.practice.commonservice.model.enumclass.ErrType;
import com.syphan.practice.commonservice.service.impl.BaseServiceImpl;
import com.syphan.practice.dto.house.BoardingHouseCreateDto;
import com.syphan.practice.houseservice.model.BoardingHouse;
import com.syphan.practice.houseservice.repository.BoardingHouseRepository;
import com.syphan.practice.houseservice.service.BoardingHouseService;
import com.syphan.practice.registrationservice.model.User;
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

    @Override
    public BoardingHouse create(BoardingHouseCreateDto data) throws BIZException {
        User user = userService.getById(data.getUserId());
        if (user == null) throw BIZException.buildBIZException(ErrType.NOT_FOUND,
                "user.not.found", String.format("%s%s%s", "User with id [ ", data.getUserId(), " ] not fount"));
        BoardingHouse house = new BoardingHouse();
        house.setUserId(data.getUserId());
        house.setUsername(user.getFullName() != null ? user.getFullName() : user.getUsername());
        house.setUserPhone(user.getPhoneNum());
        house.setHouseName(data.getName());
        house.setAddress(data.getAddress());
        house.setRoomNum(data.getRoomNum());
        return repository.save(house);
    }
}
