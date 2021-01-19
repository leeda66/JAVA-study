
/**
 * ver.4

MSSQL DB 연결하기
csv 파일의 데이터를 DB table에 insert하는 쿼리문 실행한다.

- MM값의 단위 제거
- SQL 문장 수행 후 insert 한 row의 개수 출력

 **/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class ConnectDB {
    public static void main(String args[]) throws ClassNotFoundException{
        //파일 경로
        String filePath = "test.csv";
        //반환용 리스트 data
        List<List<String>> data = new ArrayList<List<String>>();
        //한줄씩 읽는 역할
        BufferedReader br = null;
        //날짜 저장을 위한 header역할
        List<String> header = new ArrayList<String>();


        //DB 연결
        Connection con = null;
        PreparedStatement pstmt = null;

        //DB 데이터베이스 연결 정보
        String url = "";//integratedSecurity=true";//윈도우로 로그인
        String user = "";
        String pw = "";

        String SQL = "insert into MANMONTH(proj, proj_type, user_id, user_first_n, user_last_n, proj_task, yyyymm, mm) values(?,?,?,?,?,?,?,?)";
        int row = 0;

        try{
            br = Files.newBufferedReader(Paths.get(filePath));
            String line = ""; int lineNum = 0;

            // DB1. sqlServerDriver 로드
            Class.forName("");

            // DB2. Connection 객체 생성 - .getConnection(연결문자열, DB-ID, DB-PW)
            con = DriverManager.getConnection(url, user, pw);

            // DB3. PreParedStatement 객체 생성, 객체 생성시 SQL 문장 저장
            pstmt = con.prepareStatement(SQL);

            System.out.println("MS-SQL 서버 접속에 성공");

            while((line=br.readLine()) != null){

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

/**
 //Date 형태로 출력
 DateTimeFormatter formatter = new DateTimeFormatterBuilder()
 .appendPattern("MMM.dd")
 .parseDefaulting(ChronoField.YEAR, 2020)
 .toFormatter(Locale.US);

 String date = header.get(10).toString();
 LocalDate localDate = LocalDate.parse(date, formatter);
 System.out.println(localDate);
 **/

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

                //데이터 존재하면면 header 값을 가져온다
                for(int i=9; i<tmpList.size(); i++){
                    if(tmpList.get(i).toString().equals(""))
                        continue;
                    else {

                        // DB4. pstmt.set<데이터타입>(? 순서, 값) ex).setString(), .setInt ...
                        pstmt.setString(1, tmpList.get(0).toString());//proj
                        pstmt.setString(2, tmpList.get(1).toString());//proj_type
                        pstmt.setString(3, tmpList.get(5).toString());//service_responsible
                        pstmt.setString(4, tmpList.get(6).toString());//first_name
                        pstmt.setString(5, tmpList.get(7).toString());//last_name
                        pstmt.setString(6, tmpList.get(8).toString());//proj_task
                        pstmt.setString(7, header.get(i).toString());//yyyymm

                        //wday 단위를 없애기 위해 " " 앞의 내용만을 가져온다.
                        int idx2 = tmpList.get(i).toString().indexOf(" ");
                        pstmt.setString(8,  tmpList.get(i).toString().substring(0, idx2));//MM

                        // DB5. SQL 문장을 실행하고 결과를 리턴 - SQL 문장 실행 후, 변경된 row 수 int type 리턴
                        int r = pstmt.executeUpdate();
                        row++;

                        // pstmt.excuteQuery() : select
                        // pstmt.excuteUpdate() : insert, update, delete ..
                    }
                }

                //반환용 리스트(data)에 해당 리스트(tmpList)값 넣기
                data.add(tmpList);

            }

            //최종 데이터 확인
            //System.out.println(header);
            //System.out.println(data);
            System.out.printf("변경된 row의 수 : "+ row);

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(SQLException e) {
            System.out.println("[SQL Error : " + e.getMessage() + "]");
        } catch (ClassNotFoundException e1) {
            System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
        }finally{

            //DB
            //사용순서와 반대로 close 함
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