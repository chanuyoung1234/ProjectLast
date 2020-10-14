package com.a.project.model;

import lombok.Data;

@Data
public class Board {
	private int bno; //숫자번호 pk
    private String password; //비밀번호
    private String content; //게시글 내용
    private String nickname; // 사이트별명(닉네임)

}
