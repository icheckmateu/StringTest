package StringTest;

public class StringTest {
 
    public static void main(String[] args) {
        String s1 = "";
        long startTime1 = System.currentTimeMillis();
        for(int i =0 ; i<100000;i++){
            s1 += "ssdf";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String拼接100000遍耗时：" + (endTime1 - startTime1) + "ms");
 
        StringBuffer s2 = new StringBuffer();
        for(int i =0 ; i<100000;i++){
            s2.append("ssdf");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("StringBuffer拼接100000遍耗时：" + (endTime2 - endTime1) + "ms");
 
        StringBuilder s3 = new StringBuilder();
        for(int i =0 ; i<100000;i++){
            s3.append("ssdf");
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("StringBuilder拼接100000遍耗时：" + (endTime3 - endTime2) + "ms");
    }
}