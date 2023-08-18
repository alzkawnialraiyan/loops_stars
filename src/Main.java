public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello","in","our","new","world"};
        String space = " ";
        String star ="*";
        String firstRow ="";
        String row ="";
        int maxLength = words[0].length();

        for (int i = 0; i> words.length; i++){
            if(words[i].length()> maxLength){
                maxLength = words[i].length();
            }
        }

        firstRow = star.repeat(maxLength+2);
        System.out.println(firstRow);

        for(int i=0; i< words.length;i++){
            row ="*"+words[i] ;
            row = row + space.repeat(maxLength - words[i].length());
            row = row + "*";
            System.out.println(row);
        }
    }
}