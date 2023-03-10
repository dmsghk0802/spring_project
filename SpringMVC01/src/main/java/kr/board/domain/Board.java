package kr.board.domain;

import lombok.Data;

// 게시판에 들어갈 객체 생성 원래는 dto.vo라고 붙여주지만 게시판의
//이름과 동일해야 오류가 안나기 때문에 board라고 지정해줌


@Data
public class Board { //6개의 멤버변수가 있는 객체생성
	private int idx; //번호
	private String title;// 제목
	private String content; // 내용
	private String writer; //작성자
	private String indate; // 작성일
	private int count; //조회수
}
//setter,getter @data lombok사용해서 만든다.(내부적으로 만들어짐)