package com.example.boot_test_20240323_gradle.controller;

import com.example.boot_test_20240323_gradle.service.UserInfoService;
import com.example.boot_test_20240323_gradle.vo.UserInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userInfoTest")
public class UserInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserInfoService userInfoService;

    // 모든 회원 조회
    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<UserInfoVo>> getAllmembers() {
        logger.info("getAllmembers >>>");
        List<UserInfoVo> member = userInfoService.findAll();
        return new ResponseEntity<List<UserInfoVo>>(member, HttpStatus.OK);
    }

}
