import java.util.*;

public abstract class CheckPalindrome {
    private Queue<String> queue = new LinkedList<>();
    private String str;
    private String[] strAfterSplit;
    private String result="";

    public void inputStringFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        str = input.nextLine();
    }

    public void splitString(){
        strAfterSplit = str.split("");
    }

    public void pushIntoQueue(){
        for (int i = 0; i < strAfterSplit.length; i++) {
            queue.add(strAfterSplit[i]);
        }
    }

    public void pushStringBackToArray(){
        for (int i = 0; i<strAfterSplit.length; i++) {
            strAfterSplit[strAfterSplit.length-1-i] = queue.remove()+"";
        }
    }

    public void builtResultString(){
        for (int i = 0; i < strAfterSplit.length; i++) {
            result += strAfterSplit[i];
        }
    }

    public boolean isPalindrome(){
        boolean conclude = false;
        if (str.equals(result)){
            conclude = true;
        }
        return conclude;
    }

    public void checkPalindromeResult(){
        if (isPalindrome()){
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println("Chuoi Khong doi xung");
        }
    }
}

