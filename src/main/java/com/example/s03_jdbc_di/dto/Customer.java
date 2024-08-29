package com.example.s03_jdbc_di.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter //lombok이 컴파일할 때 get, set을 자동으로 정의
@ToString
public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

}
