package com.syphan.practice.house.service.rest.service.impl;

import com.syphan.practice.commonservice.exception.BIZException;
import com.syphan.practice.commonservice.model.enumclass.ErrType;
import com.syphan.practice.commonservice.service.impl.BaseServiceImpl;
import com.syphan.practice.dto.house.BoardingHouseCreateDto;
import com.syphan.practice.house.service.api.model.BoardingHouse;
import com.syphan.practice.house.service.api.repository.BoardingHouseRepository;
import com.syphan.practice.house.service.api.service.BoardingHouseService;
import com.syphan.practice.registration.api.model.User;
import com.syphan.practice.registration.api.service.UserService;
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
    public BoardingHouse create(int userId, BoardingHouseCreateDto data) throws BIZException {
        User user = userService.getById(userId);
        if (user == null) throw BIZException.buildBIZException(ErrType.NOT_FOUND,
                "user.not.found", String.format("%s%s%s", "User with id [ ", userId, " ] not fount"));
        BoardingHouse house = new BoardingHouse();
        house.setUserId(userId);
        house.setUsername(user.getFullName() != null ? user.getFullName() : user.getUsername());
        house.setUserPhone(user.getPhoneNum());
        house.setHouseName(data.getName());
        house.setAddress(data.getAddress());
        house.setRoomNum(data.getRoomNum());
        return repository.save(house);
    }
}
