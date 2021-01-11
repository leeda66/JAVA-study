import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// bufferedReader로 한줄씩 읽고
// 읽은 문자열에서 ,로 split을 통해 나뉜 요소로 배열을 만든다.
// 그 배열을 리스트화해서 넣는다. 이를 줄마다 반복한다.

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
