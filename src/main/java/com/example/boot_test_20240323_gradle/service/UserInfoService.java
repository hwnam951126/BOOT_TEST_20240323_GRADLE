package com.example.boot_test_20240323_gradle.service;

import com.example.boot_test_20240323_gradle.repository.UserInfoRepository;
import com.example.boot_test_20240323_gradle.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public List<UserInfoVo> findAll() {
        List<UserInfoVo> userInfos = new ArrayList<>();
        userInfoRepository.findAll().forEach(e -> userInfos.add(e));
        return userInfos;
    }

    public List<UserInfoVo> findByUserId(String userId) {
        List<UserInfoVo> userInfo = userInfoRepository.findByUserId(userId);
        return userInfo;
    }
}
