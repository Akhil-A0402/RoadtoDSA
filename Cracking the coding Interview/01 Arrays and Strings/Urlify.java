import java.util.Scanner;

public class Urlify {

    public static String urlConvert(String url){
        url = url.trim();
        char[] content = url.toCharArray();
        StringBuffer url2=new StringBuffer("");
        for(char c: content){
            if(c==' '){
                url2.append("%20");
            }else{
                url2.append(c);
            }
        }
        return url2.toString();
    }

    public static void urlCovert2(char[] str, int length){
        int spaceCount = 0, index, i=0;
        for(i=0;i<length;i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }

        index = length + spaceCount*2;

        if(length<str.length) str[length] = '\0';

        for(i = length-1;i>=0;i++){
            if(str[i]!=' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index -3;

            }else{
                str[index-1] = str[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(Urlify.urlConvert(sentence));
        char[] content = sentence.toCharArray();
        Urlify.urlCovert2(content, content.length);
        System.out.println(new String(content));
        sc.close();
    }
}
