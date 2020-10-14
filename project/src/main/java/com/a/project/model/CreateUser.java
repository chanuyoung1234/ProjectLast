package com.a.project.model;

import lombok.Data;

@Data
public class CreateUser {
	private String cardnum; //카드번호
 	private String cardpwd; // 카드비밀번호
    private String bank; // 은행명

}
