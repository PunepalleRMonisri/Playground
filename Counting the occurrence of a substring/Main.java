import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int len1 = str1.length();
    int len2 = str2.length();
    int cnt = 0;
    for(int i=0;i<len1-len2+1;i++)
    {
      boolean match=true;
      for(int j=0;j<len2;j++)
      {
      if(str1.charAt(i+j)!=str2.charAt(j))
        match=false;
      }
      if(match==true)
        cnt++;
    }
    System.out.println(cnt);
  }
}