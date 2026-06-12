-- 테이블 만들기 
CREATE TABLE mymemo(
num NUMBER CONSTRAINT mymemo_num_pk PRIMARY key,
memo VARCHAR2(400),
writer VARCHAR2(30),
mdate date
);
CREATE SEQUENCE mymemo_seq 
INCREMENT BY 1 START WITH 1;