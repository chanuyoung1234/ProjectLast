package com.a.project.model;

import lombok.Data;

@Data
public class JoinUser {
		private int bno; //숫자번호 pk
	 	private String id; // 아이디	fk
	    private String password; //비밀번호
	    private String name; // 이름
	    private String email; // 이메일주소
	    private String nickname; // 사이트별명(닉네임)
		
	    
}
