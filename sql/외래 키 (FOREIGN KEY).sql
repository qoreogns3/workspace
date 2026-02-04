DESC BASIC_BOARD;

SELECT * FROM BASIC_BOARD ;
#댓글 테이블 생성 및 외래키
#외래키 (FOREIGN KEY / FK) 제약조건
# - 한 테이블이 다른 테이블의 데이터를 참조할 때 사용하는 제약조건
# - FK 제약조건이 있어도 NULL데이터는 들어올 수 있음

#FK제약조건은 테이블 생성 시 추가 문법
# 컬럼명 자료형 REFERENCES 참조테이블명 (참조컬럼명)
# -> 부모테이블의 데이터를 삭제하려면 자식 테이블의 데이터를 먼저 삭제
# 컬럼명 자료형 REFETENCES 참조테이블명 (참조컬럼명) ON DELETE CASCADE
# -> 부모테이블의 데이터를 삭제하면 자동으로 자식 테이블의 데이터가 삭제 됨

CREATE TABLE BOARD_REPLY(
	REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT
	, CONTENT VARCHAR(30) NOT NULL
	, WRITER VARCHAR(20) NOT NULL
	, REG_DATE DATETIME DEFAULT SYSDATE()
	, BOARD_NUM INT NOT NULL REFERENCES BASIC_BOARD (BOARD_NUM)
		##ON DELETE CASCADE 게시글 삭제시 댓글도 함께 삭제
		##ON UPDATE CASCADE 게시글 번호 변경 시 댓글도 함께 변경
)

DESC BOARD_REPLY;

SELECT * FROM BOARD_REPLY;