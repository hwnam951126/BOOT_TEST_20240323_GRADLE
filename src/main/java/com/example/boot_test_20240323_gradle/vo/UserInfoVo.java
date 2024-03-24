package com.example.boot_test_20240323_gradle.vo;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name="userInfo")
@Table(name="USER_INFO", schema = "public" )
@NoArgsConstructor
public class UserInfoVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_key")
    private Long userKey;

    @Column(name="user_id")
    private String userId;

    @Column(name="user_name")
    private String userName;

    @Builder
    public UserInfoVo(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
