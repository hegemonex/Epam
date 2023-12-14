import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] my_num = {1, 2, 3, 4, 5};
        Arrays.sort(my_num);
        System.out.println("min-"+my_num[0]+" max-"+my_num[my_num.length-1]);

        String str= "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Epam");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}






