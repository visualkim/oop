1. SQL

▷ /src/jdbc/news2.sql
----------------------------------------------------------
1) 테이블 구조
DROP TABLE news2;
 
CREATE TABLE news2(         
  news2no  INT NOT NULL AUTO_INCREMENT,
  title        VARCHAR(100),
  rdate      DATETIME,
  PRIMARY KEY(news2no)
);  
 
 
2) INSERT
- news2no 자동으로 값이 등록됨.
 
INSERT INTO news2(title, rdate)
VALUES('JAVA 종강', now());
 
INSERT INTO news2(title, rdate)
VALUES('HTML5 개강', now());
 
INSERT INTO news2(title, rdate)
VALUES('CSS3 개강', now());
 
INSERT INTO news2(title, rdate)
VALUES('JSP 개강', now());
 
 
SELECT * FROM news2;
 news2no title    rdate
 ------- -------- ---------------------
       1 JAVA 종강  2016-03-08 13:10:44.0
       2 HTML5 개강 2016-03-08 13:13:08.0
       3 CSS3 개강  2016-03-08 13:14:24.0
       4 JSP 개강   2016-03-08 13:14:25.0
 
 
3) 목록
SELECT news2no, title, rdate
FROM news2
ORDER BY news2no ASC;
 
 news2no title    rdate
 ------- -------- ---------------------
       1 JAVA 종강  2016-03-08 13:10:44.0
       2 HTML5 개강 2016-03-08 13:13:08.0
       3 CSS3 개강  2016-03-08 13:14:24.0
       4 JSP 개강   2016-03-08 13:14:25.0
 
       
SELECT news2no, title, rdate
FROM news2
ORDER BY news2no DESC;
 
 news2no title    rdate
 ------- -------- ---------------------
       4 JSP 개강   2016-04-16 17:48:54.0
       3 CSS3 개강  2016-04-16 17:48:54.0
       2 HTML5 개강 2016-04-16 17:48:53.0
       1 JAVA 종강  2016-04-16 17:48:52.0
 
       
4) 조회
SELECT news2no, title, rdate
FROM news2
WHERE news2no=1;
 
 news2no title   rdate
 ------- ------- ---------------------
       1 JAVA 종강 2016-03-08 13:10:44.0
 
       
 
5) 수정
UPDATE news2
SET title='옥계 해수욕장'
WHERE news2no=1;
 
SELECT * FROM news2;
 
 news2no title    rdate
 ------- -------- ---------------------
       1 옥계 해수욕장  2016-03-08 13:10:44.0
       2 HTML5 개강 2016-03-08 13:13:08.0
       3 CSS3 개강  2016-03-08 13:14:24.0
       4 JSP 개강   2016-03-08 13:14:25.0
       
 
6) 삭제
DELETE FROM news2
WHERE news2no=1;
 
SELECT * FROM news2; 
 
 news2no title    rdate
 ------- -------- ---------------------
       2 HTML5 개강 2016-03-08 13:13:08.0
       3 CSS3 개강  2016-03-08 13:14:24.0
       4 JSP 개강   2016-03-08 13:14:25.0
       
       
7) 함수
   - now(): 현재 날짜/시간 예) 2016-03-08 13:13:08
     . Oracle: sysdate 
   - substring("컬럼명", 시작값, 가져올 길이), 1부터 시작
     . Oracle: SUBSTR("컬럼명", 시작값, 가져올 길이), 1부터 시작
 
SELECT SUBSTRING("123ABC왕눈이", 1, 5);
 SUBSTRING("123ABC왕눈이", 1, 5)
 ----------------------------
 123AB
 
SELECT SUBSTRING("123ABC왕눈이", 1, 7);
 SUBSTRING("123ABC왕눈이", 1, 7)
 ----------------------------
 123ABC왕
 
 
SELECT news2no, title, rdate
FROM news2
ORDER BY news2no ASC;
 news2no title    rdate
 ------- -------- ---------------------
       2 HTML5 개강 2016-04-16 17:48:53.0
       3 CSS3 개강  2016-04-16 17:48:54.0
       4 JSP 개강   2016-04-16 17:48:54.0
 
SELECT news2no, title, SUBSTRING(rdate, 1, 10)
FROM news2
ORDER BY news2no ASC;
 news2no title    SUBSTRING(rdate, 1, 10)
 ------- -------- -----------------------
       2 HTML5 개강 2016-04-16
       3 CSS3 개강  2016-04-16
       4 JSP 개강   2016-04-16
 
 
 
-- 함수명은 컬럼명으로 불편함으로 컬럼 별명(Alias)을 사용합니다.
SELECT news2no, title, SUBSTRING(rdate, 1, 10) as rdate
FROM news2
ORDER BY news2no ASC;
 
 news2no title    rdate
 ------- -------- ----------
       2 HTML5 개강 2016-04-16
       3 CSS3 개강  2016-04-16
       4 JSP 개강   2016-04-16
     
----------------------------------------------------------