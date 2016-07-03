1. SQL

�� /src/jdbc/news2.sql
----------------------------------------------------------
1) ���̺� ����
DROP TABLE news2;
 
CREATE TABLE news2(         
  news2no  INT NOT NULL AUTO_INCREMENT,
  title        VARCHAR(100),
  rdate      DATETIME,
  PRIMARY KEY(news2no)
);  
 
 
2) INSERT
- news2no �ڵ����� ���� ��ϵ�.
 
INSERT INTO news2(title, rdate)
VALUES('JAVA ����', now());
 
INSERT INTO news2(title, rdate)
VALUES('HTML5 ����', now());
 
INSERT INTO news2(title, rdate)
VALUES('CSS3 ����', now());
 
INSERT INTO news2(title, rdate)
VALUES('JSP ����', now());
 
 
SELECT * FROM news2;
 news2no title    rdate
 ------- -------- ---------------------
       1 JAVA ����  2016-03-08 13:10:44.0
       2 HTML5 ���� 2016-03-08 13:13:08.0
       3 CSS3 ����  2016-03-08 13:14:24.0
       4 JSP ����   2016-03-08 13:14:25.0
 
 
3) ���
SELECT news2no, title, rdate
FROM news2
ORDER BY news2no ASC;
 
 news2no title    rdate
 ------- -------- ---------------------
       1 JAVA ����  2016-03-08 13:10:44.0
       2 HTML5 ���� 2016-03-08 13:13:08.0
       3 CSS3 ����  2016-03-08 13:14:24.0
       4 JSP ����   2016-03-08 13:14:25.0
 
       
SELECT news2no, title, rdate
FROM news2
ORDER BY news2no DESC;
 
 news2no title    rdate
 ------- -------- ---------------------
       4 JSP ����   2016-04-16 17:48:54.0
       3 CSS3 ����  2016-04-16 17:48:54.0
       2 HTML5 ���� 2016-04-16 17:48:53.0
       1 JAVA ����  2016-04-16 17:48:52.0
 
       
4) ��ȸ
SELECT news2no, title, rdate
FROM news2
WHERE news2no=1;
 
 news2no title   rdate
 ------- ------- ---------------------
       1 JAVA ���� 2016-03-08 13:10:44.0
 
       
 
5) ����
UPDATE news2
SET title='���� �ؼ�����'
WHERE news2no=1;
 
SELECT * FROM news2;
 
 news2no title    rdate
 ------- -------- ---------------------
       1 ���� �ؼ�����  2016-03-08 13:10:44.0
       2 HTML5 ���� 2016-03-08 13:13:08.0
       3 CSS3 ����  2016-03-08 13:14:24.0
       4 JSP ����   2016-03-08 13:14:25.0
       
 
6) ����
DELETE FROM news2
WHERE news2no=1;
 
SELECT * FROM news2; 
 
 news2no title    rdate
 ------- -------- ---------------------
       2 HTML5 ���� 2016-03-08 13:13:08.0
       3 CSS3 ����  2016-03-08 13:14:24.0
       4 JSP ����   2016-03-08 13:14:25.0
       
       
7) �Լ�
   - now(): ���� ��¥/�ð� ��) 2016-03-08 13:13:08
     . Oracle: sysdate 
   - substring("�÷���", ���۰�, ������ ����), 1���� ����
     . Oracle: SUBSTR("�÷���", ���۰�, ������ ����), 1���� ����
 
SELECT SUBSTRING("123ABC�մ���", 1, 5);
 SUBSTRING("123ABC�մ���", 1, 5)
 ----------------------------
 123AB
 
SELECT SUBSTRING("123ABC�մ���", 1, 7);
 SUBSTRING("123ABC�մ���", 1, 7)
 ----------------------------
 123ABC��
 
 
SELECT news2no, title, rdate
FROM news2
ORDER BY news2no ASC;
 news2no title    rdate
 ------- -------- ---------------------
       2 HTML5 ���� 2016-04-16 17:48:53.0
       3 CSS3 ����  2016-04-16 17:48:54.0
       4 JSP ����   2016-04-16 17:48:54.0
 
SELECT news2no, title, SUBSTRING(rdate, 1, 10)
FROM news2
ORDER BY news2no ASC;
 news2no title    SUBSTRING(rdate, 1, 10)
 ------- -------- -----------------------
       2 HTML5 ���� 2016-04-16
       3 CSS3 ����  2016-04-16
       4 JSP ����   2016-04-16
 
 
 
-- �Լ����� �÷������� ���������� �÷� ����(Alias)�� ����մϴ�.
SELECT news2no, title, SUBSTRING(rdate, 1, 10) as rdate
FROM news2
ORDER BY news2no ASC;
 
 news2no title    rdate
 ------- -------- ----------
       2 HTML5 ���� 2016-04-16
       3 CSS3 ����  2016-04-16
       4 JSP ����   2016-04-16
     
----------------------------------------------------------