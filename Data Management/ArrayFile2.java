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

public class ArrayFile2 {
    public static void main(String args[]){
        //파일 경로
        String filePath = "test.csv";
        //반환용 리스트 data
        List<List<String>> data = new ArrayList<List<String>>();
        //한줄씩 읽는 역할
        BufferedReader br = null;

        try{
            br = Files.newBufferedReader(Paths.get(filePath));
            String line = ""; int lineNum = 0;

            while((line=br.readLine()) != null){
                //header역할의 2행 skip
                if(lineNum < 2){
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
                //System.out.println(tmpList.get(1).toString());

                //따옴표 제거 기능
                int idx = 0;
                for (String s : tmpList) {
                    tmpList.set(idx++, s.replaceAll("\"", ""));
                }

                //반환용 리스트(data)에 해당 리스트(tmpList)값 넣기
                data.add(tmpList);
            }
            //최종 데이터 확인 
            System.out.println(data);
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
