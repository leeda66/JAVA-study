 # JAVA-study
 
 ## Data Management Program
: 데이터 관리 프로그램 변경 시
요청된 조건에 맞게 데이터를 변경하여 보여주는
데이터 관리 프로그램 개발

 * ver.1
> ReadFile.java
>> csv 파일을 읽어서 token에 저장하기
>> String 2차원 배열을 이용한다.


 * ver.2
> ArrayFile.java
>> csv 파일을 BufferReader로 한 줄씩 읽고
>> ,를 기준으로 split 하여 나눠진 데이터로 String 배열을 만든다.
>> 해당 배열을 ArrayList로 한 줄씩 변환하여
>> 최종 ArrayList에 데이터를 저장한다.


 * ver.2.5
> ArrayFile2.java
>> csv 파일을 BufferReader로 한 줄씩 읽고
>> ,를 기준으로 split 하여 나눠진 데이터로 String 배열을 만든다.
>> 해당 배열을 ArrayList로 한 줄씩 변환하여
>> 최종 ArrayList에 데이터를 저장한다.
>> - header 2행 제거
>> - data 내 쉼표(,)가 있는 경우 특수문자(")처리


 * ver.3
> DateFormat.java
>> [날짜(MMDD) + MM값] 의 형태로 데이터 저장하기
>> 날짜가 저장된 header를 ArrayList로 저장한다.
>> csv 파일의 row에 데이터가 존재하면 해당 column 명 값을 가져온다.
>> - Jan.19 -> 0119 형태로 날짜 데이터 변환
>> - JAVA date 함수를 이용하여 Date 형태로 출력


 * ver.4
> ConnectDB.java
>> MSSQL DB 연결하기
>> csv 파일의 데이터를 DB table에 insert하는 쿼리문 실행한다.
>> - MM값의 단위 제거
>> - SQL 문장 수행 후 insert 한 row의 개수 출력

 * ver.5
> ReadData.java
>> MSSQL DB 연결하여 기능 추가하기
>> csv 파일의 데이터를 DB table에 연결하여
>> select, insert, update하는 쿼리문을 실행한다.
>> ArrayList인 tmpList를 for문을 이용하여 확인한다.
>> 데이터 값이 존재하는 경우 로직에 따라 데이터를 DB에 반영한다.
>> - insert, update, same 한 각각의 경우에 대해 DB에 반영된 row의 개수 출력
>> - DB 연결 후 close 처리
>>> * 로직 {
>>> - [1] DB에 기존 데이터가 있는지/없는지 확인
>>> - [2] DB의 데이터 값과 csv파일의 데이터 값이 같은지/다른지 확인.
>>> - DB에 데이터가 있다면 -> 기존 데이터의 MM값과 동일하다면 -> break; 다르다면 -> UPDATE;
>>> - DB에 데이터가 없다면 -> INSERT
>>> }


 * ver.5.5
> ReadData2.java (MM / 20) float 형태로 저장하기
 >> - 소수점 둘째 자리 수 까지 표현
 >> - JAVA 부동소수점 산술연산 오류 해결
 >> - 컬렴명 위치를 지정하는 변수 추가
 >> 

...

 
 Settings : 
 > Java 8.0
 > MS SQL
 > TOMCAT
 > JSP
 
 
 -------------

## Study Algorithm
: solve Basic 

## Class
: exercise questions for JAVA class

