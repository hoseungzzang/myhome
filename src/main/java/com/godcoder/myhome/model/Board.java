package com.godcoder.myhome.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//어노테이션 파트
@Entity//JPA 설정을 위해서 모델클래스임을 알림
@Data
public class Board {
    @Id//PK를 알려줌
    @GeneratedValue(strategy = GenerationType.IDENTITY)//mariaDB상에 pk가 자동증가로 설정되어있어 설정해줌
    private Long id;
    private String title;
    private String content;

}
