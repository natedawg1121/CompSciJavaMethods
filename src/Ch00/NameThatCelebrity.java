package Ch00;

//Author = Nathan Stewart
//Date Created = 08/20/2018
//School = Loveland High School
public class NameThatCelebrity {
     public static void main(String[] args) {
          String s1 = "Allan Alda";
          String s2 = "John Wayne";
          String s3 = "Gregory Peck";
          System.out.println(s1 + ">>>" + s1.substring(s1.length() - 8, s1.length() - 3));
          System.out.println(s2 + ">>>" + s2.substring(s2.length() - 8, s2.length() - 3));
          System.out.println(s3 + ">>>" + s3.substring(s3.length() - 10, s3.length() - 3));
     }
}