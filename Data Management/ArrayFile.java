/**
 * ver.2
csv 파일을 BufferReader로 한 줄씩 읽고
,를 기준으로 split 하여 나눠진 데이터로 String 배열을 만든다.
해당 배열을 ArrayList로 한 줄씩 변환하여
최종 ArrayList에 데이터를 저장한다.
 **/


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayFile {
    public static void main(String args[]){
        //파일 경로
        String filePath = "test.csv";
        //반환용 리스트 data
        List<List<String>> data = new ArrayList<List<String>>();
        //한줄씩 읽는 역할
        BufferedReader br = null;

        try{
            br = Files.newBufferedReader(Paths.get(filePath));
            String line = "";

            while((line=br.readLine()) != null){
                //1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");

                //배열을 리스트로 반환
                tmpList = Arrays.asList(array);
                System.out.println(tmpList);

                //반환용 리스트(data)에 해당 리스트(tmpList)값 넣기
                data.add(tmpList);
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } finally{

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
