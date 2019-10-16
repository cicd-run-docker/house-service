//package com.syphan.practice.houseservice.controller;
//
//import com.syphan.practice.commonservice.util.response.OpenApiWithDataResponse;
//import com.syphan.practice.houseservice.service.BoardingHouseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/boarding-house")
//public class BoardingHouseController {
//
//    @Autowired
//    private BoardingHouseService service;
//
//    @GetMapping
//    public ResponseEntity<OpenApiWithDataResponse<String>> test() {
//        return ResponseEntity.ok(new OpenApiWithDataResponse<String>(service.test()));
//    }
//
//}
