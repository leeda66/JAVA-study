/**
 * ver.5

MSSQL DB 연결하여 기능 추가하기
csv 파일의 데이터를 DB table에 연결하여
select, insert, update하는 쿼리문을 실행한다.

ArrayList인 tmpList를 for문을 이용하여 확인한다.
데이터 값이 존재하는 경우 로직에 따라 데이터를 DB에 반영한다.

- insert, update, same 한 각각의 경우에 대해 DB에 반영된 row의 개수 출력
- DB 연결 후 close 처리

* 로직 {
- [1] DB에 기존 데이터가 있는지/없는지 확인
- [2] DB의 데이터 값과 csv파일의 데이터 값이 같은지/다른지 확인.

- DB에 데이터가 있다면 -> 기존 데이터의 MM값과 동일하다면 -> break;
                        		     					        다르다면 -> UPDATE
- DB에 데이터가 없다면 -> INSERT
}

 **/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ReadData {
    public static void main(String args[]) throws ClassNotFoundException{
// ---- [변경 가능한 정보]
        //파일 경로
        String filePath = "test.csv";
        //데이터에서 MM 시작하는 column 번호
        int column = 9;
        //DB 데이터베이스 연결 정보
        String url = "";//integratedSecurity=true";//윈도우로 로그인
        String user = "";
        String pw = "";


        //반환용 리스트 data
        List<List<String>> data = new ArrayList<List<String>>();
        //한줄씩 읽는 역할
        BufferedReader br = null;
        //날짜 저장을 위한 header역할
        List<String> header = new ArrayList<String>();

        //DB 연결 변수 선언
        Connection con = null;
        PreparedStatement pstmt = null; PreparedStatement pstmt2 = null;
        Statement stmt = null; Statement stmt2 = null; Statement stmt3 = null;
        ResultSet rs = null; ResultSet rs2 = null; ResultSet rs3 = null;


        //실행 쿼리
        String SqlInsert = "insert into MANMONTH(proj_id, proj_name, proj_type, user_id, user_f_name, user_l_name, proj_task, yyyymm, mm) values(?,?,?,?,?,?,?,?,?)";
        String SqlSelect = "select proj_id from project where proj_name = ";
        String SqlUpdate = "update manmonth set mm = ? where user_id = ? and yyyymm = ?";

        //데이터 값 확인을 위한 쿼리
        //[1] DB에 데이터가 있는지/없는지
        String Select1 = "select user_id, yyyymm from manmonth where ";
        //[2] DB와 MM 데이터 값이 같은지/다른지
        String Select2 = "select mm from manmonth where ";

        //DB에 변경된 row 개수 출력을 위한 변수
        int n_insert = 0; int n_update = 0; int n_same = 0;


        try{
            br = Files.newBufferedReader(Paths.get(filePath));
            String line = ""; int lineNum = 0;

            // (DB1.) sqlServerDriver 로드
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // (DB2.) Connection 객체 생성 .getConnection(연결문자열, DB-ID, DB-PW)
            con = DriverManager.getConnection(url, user, pw);

            // (DB3.) PreParedStatement 객체 생성, 객체 생성시 SQL 문장 저장
            pstmt = con.prepareStatement(SqlInsert);
            pstmt2 = con.prepareStatement(SqlUpdate);

            //statement 생성 후 실행할 쿼리정보 등록.
            stmt = con.createStatement();
            stmt2 = con.createStatement();
            stmt3 = con.createStatement();

            System.out.println("MS-SQL 서버 접속에 성공");

            while((line=br.readLine()) != null){ ///.csv 데이터 한줄 씩 읽기

                //header 따로 저장 후 string 형태 변경
                if(lineNum<1){
                    String array[] = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    header = Arrays.asList(array);

                    for(int i=9; i<header.size(); i++){
                        String month = header.get(i).toString().substring(0,4); String day="";
                        String year = header.get(i).toString().substring(4,6);

                        //날짜 형식 변경
                        switch (month){
                            case "Jan.":
                                //day = header.get(i).toString().replace(month, "01");
                                day = "20"+year+"01";
                                break;

                            case "Feb.":
                                //day = header.get(i).toString().replace(month, "02");
                                day = "20"+year+"02";
                                break;

                            case "Mar.":
                                //day = header.get(i).toString().replace(month, "03");
                                day = "20"+year+"03";
                                break;

                            case "Apr.":
                                //day = header.get(i).toString().replace(month, "04");
                                day = "20"+year+"04";
                                break;

                            case "May.":
                                //day = header.get(i).toString().replace(month, "05");
                                day = "20"+year+"05";
                                break;

                            case "Jun.":
                                //day = header.get(i).toString().replace(month, "06");
                                day = "20"+year+"06";
                                break;

                            case "Jul.":
                                //day = header.get(i).toString().replace(month, "07");
                                day = "20"+year+"07";
                                break;

                            case "Aug.":
                                //day = header.get(i).toString().replace(month, "08");
                                day = "20"+year+"08";
                                break;

                            case "Sep.":
                                //day = header.get(i).toString().replace(month, "09");
                                day = "20"+year+"09";
                                break;

                            case "Oct.":
                                //day = header.get(i).toString().replace(month, "10");
                                day = "20"+year+"10";
                                break;

                            case "Nov.":
                                //day = header.get(i).toString().replace(month, "11");
                                day = "20"+year+"11";
                                break;

                            case "Dec.":
                                //day = header.get(i).toString().replace(month, "12");
                                day = "20"+year+"12";
                                break;
                        }
                        header.set(i, day);
                    }
                    lineNum ++;
                    continue;
                }

                //header역할의 2행 skip
                else if(lineNum < 2){
                    lineNum ++;
                    continue;
                }

                //한 행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();

                //쉼표(,)포함 데이터 split 방지 기능
                String array[] = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                //배열을 리스트로 반환
                tmpList = Arrays.asList(array);
                //System.out.println(tmpList.get(0).toString());
                //System.out.println(tmpList);

                //따옴표 제거 기능
                int idx = 0;
                for (String s : tmpList) {
                    tmpList.set(idx++, s.replaceAll("\"", ""));
                }


                //MM 데이터 값이 존재하면 해당 header 값을 가져온다. tmpList를 확인하는 for문
                for(int i = column; i<tmpList.size(); i++){

                    if(tmpList.get(i).toString().equals("")) //데이터 값이 존재하지 않는 경우 continue
                        continue;

                    else {
                        //wday 단위를 없애기 위해 " " 앞의 내용만을 가져온다.
                        int idx2 = tmpList.get(i).toString().indexOf(" ");

                        rs = stmt.executeQuery(SqlSelect + "'"+tmpList.get(0).toString()+"'");
                        while(rs.next()) { //project_id가 존재한다면
                            int id = rs.getInt(1);

                            //---- [로직 추가]
                            rs2 = stmt2.executeQuery(Select1+"user_id = '"+tmpList.get(5).toString()+"'and yyyymm = '"+header.get(i).toString()+"'");
                            if(rs2.next()) { //[1]DB에 데이터가 있다면

                                rs3 = stmt3.executeQuery(Select2+ "mm = '"+tmpList.get(i).toString().substring(0, idx2)+"'");
                                if(rs3.next()) { //[2]동일하다면
                                    //System.out.println("해당 데이터가 동일합니다.");
                                    n_same ++;
                                    break;

                                }
                                else {//[2]mm값에 update필요
                                    pstmt2.setFloat(1, (Float.parseFloat(tmpList.get(i).toString().substring(0, idx2)))/20 ); //mm
                                    pstmt2.setString(2, tmpList.get(5).toString()); //user_id
                                    pstmt2.setString(3, header.get(i).toString()); //yyyymm
                                    int u = pstmt2.executeUpdate();
                                    //System.out.println("update 되었습니다.");
                                    n_update ++;
                                }

                            }
                            else { //[1]DB에 데이터가 없다면 insert

                                // (DB4.) pstmt.set<데이터타입>(? 순서, 값)
                                pstmt.setInt(1, id);//proj_id
                                pstmt.setString(2, tmpList.get(0).toString());//proj_name
                                pstmt.setString(3, tmpList.get(1).toString());//proj_type
                                pstmt.setString(4, tmpList.get(5).toString());//user_id
                                pstmt.setString(5, tmpList.get(6).toString());//user_f_name
                                pstmt.setString(6, tmpList.get(7).toString());//user_l_name
                                pstmt.setString(7, tmpList.get(8).toString());//proj_task
                                pstmt.setString(8, header.get(i).toString());//yyyymm

                                pstmt.setFloat(9,  (Float.parseFloat(tmpList.get(i).toString().substring(0, idx2)))/20 ); //mm

                                // (DB5.) SQL문 실행하고 결과를 리턴
                                int r = pstmt.executeUpdate();
                                //System.out.println("insert 되었습니다.");
                                n_insert ++;
                                continue;
                            }
                        }
                    }
                }

                //반환용 리스트(data)에 해당 리스트(tmpList) 값 넣기
                data.add(tmpList);
            }

            // ---- [최종 데이터 확인]
            //System.out.println(header);
            //System.out.println(data);
            System.out.printf("\n[결과]\n새롭게 insert된 row의 수 : "+ n_insert+"\n");
            System.out.printf("update된 row의 수 : "+ n_update+"\n");
            System.out.printf("변경되지 않은 row의 수 : "+ n_same+"\n");


        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(SQLException e) {
            System.out.println("[SQL Error : " + e.getMessage() + "]");
        } catch (ClassNotFoundException e1) {
            System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
        }finally{

            //DB 관련 close. (사용순서와 반대로)
            if (stmt3 != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt2 != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt2 != null) {
                try {
                    pstmt2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            try{
                if(br != null){
                    br.close();
                }
            } catch(IOException e){
                e.printStackTrace();
            }

        }
    }
}


