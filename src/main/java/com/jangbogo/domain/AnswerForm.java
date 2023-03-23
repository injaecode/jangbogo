package com.jangbogo.domain;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AnswerForm {
	
	@NotEmpty(message="내용을 반드시 입력해주세요.")
	private String content;

}
