import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("nhap vao chuoi can kiem tra");
        str = scanner.nextLine();
        System.out.println(str);
        Queue queue = new LinkedList();
        for (int i = str.length()-1; i >=0 ; i--) {
            queue.add(str.charAt(i));
        }
        String str2 = "";
        while (!queue.isEmpty()){
            str2 = str+queue.remove();
        }
        if (str.equals(str2)){
            System.out.println("day la chuoi doi xung");
        }else {
            System.out.println("day khong phai chuoi doi xung");
        }

    }
}