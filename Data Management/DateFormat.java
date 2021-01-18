/**
 * 날짜(MMDD) + MM 의 형태로 Date데이터 저장하기
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


public class DateFormat {
    public static void main(String args[]){
        //파일 경로
        String filePath = "project_m_m_test.csv";
        //반환용 리스트 data
        List<List<String>> data = new ArrayList<List<String>>();
        //한줄씩 읽는 역할
        BufferedReader br = null;
        //날짜 저장을 위한 header역할
        List<String> header = new ArrayList<String>();

        try{
            br = Files.newBufferedReader(Paths.get(filePath));
            String line = ""; int lineNum = 0;

            while((line=br.readLine()) != null){

                //header 따로 저장 후 string 형태 변경
                if(lineNum<1){
                    String array[] = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    header = Arrays.asList(array);

                    for(int i=9; i<header.size(); i++){
                        String month = header.get(i).toString().substring(0,4); String day="";

                        switch (month){
                            case "Jan.":
                                day = header.get(i).toString().replace(month, "01");
                                break;

                            case "Feb.":
                                day = header.get(i).toString().replace(month, "02");
                                break;

                            case "Mar.":
                                day = header.get(i).toString().replace(month, "03");
                                break;

                            case "Apr.":
                                day = header.get(i).toString().replace(month, "04");
                                break;

                            case "May.":
                                day = header.get(i).toString().replace(month, "05");
                                break;

                            case "Jun.":
                                day = header.get(i).toString().replace(month, "06");
                                break;

                            case "Jul.":
                                day = header.get(i).toString().replace(month, "07");
                                break;

                            case "Aug.":
                                day = header.get(i).toString().replace(month, "08");
                                break;

                            case "Sep.":
                                day = header.get(i).toString().replace(month, "09");
                                break;

                            case "Oct.":
                                day = header.get(i).toString().replace(month, "10");
                                break;

                            case "Nov.":
                                day = header.get(i).toString().replace(month, "11");
                                break;

                            case "Dec.":
                                day = header.get(i).toString().replace(month, "12");
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

                //1행을 저장하는 리스트
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

                //데이터 있으면 header 값을 가져온다
                for(int i=9; i<tmpList.size(); i++){
                    if(tmpList.get(i).toString().equals(""))
                        continue;
                    else {
                        System.out.println(tmpList.get(7).toString());
                        System.out.println(header.get(i).toString());

                        int idx2 = tmpList.get(i).toString().indexOf(" ");
                        System.out.println(tmpList.get(i).toString().substring(0, idx2));
                    }
                }

                //반환용 리스트(data)에 해당 리스트(tmpList)값 넣기
                data.add(tmpList);
            }
            //최종 데이터 확인
            //System.out.println(header);
            System.out.println(data);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }finally{

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
