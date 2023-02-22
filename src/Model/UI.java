package Model;

import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    public void print(String m){
        System.out.println(m);
    }
    public String read(){
        return sc.nextLine();
    }
}
