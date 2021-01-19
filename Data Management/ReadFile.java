/**
 * ver.1
csv 파일을 읽어서 token에 저장하기
String 2차원 배열을 이용한다.
 **/


import java.io.*;

public class ReadFile {

    public static void main(String args[]){
        int x=100, y = 3; //열의 개수 y
        String [][] text = new String [x][y]; //저장할 배열

        try {
            File csv = new File("test.csv"); //파일 명 입력
            BufferedReader br = new BufferedReader(new FileReader(csv));
            String line = "";
            int i, row=0;

            while((line=br.readLine())!=null){
                String[] token = line.split(",", -1); //마지막 , 뒤 공백도 읽기 위한 옵션 -1
                for(i=0; i<y; i++) {
                    text[row][i] = token[i];
                }

                for(i=0; i<y; i++) {
                    System.out.print(text[row][i] + ","); //확인하기 위한 출력
                }

                System.out.println("");
                row++;
            }
            br.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
