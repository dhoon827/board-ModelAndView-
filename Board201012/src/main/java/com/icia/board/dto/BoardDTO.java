package com.icia.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

	private String bnumber;
	private String bpassword;
	private String bwriter;
	private String btitle;
	private String bcontents;
	private String bdate;
	private String bhits;
}
