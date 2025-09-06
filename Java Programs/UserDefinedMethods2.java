class UserDefinedMethods2 {
  // your own methods go
  static boolean isFactor(int a, int b) {
    if (b %  a == 0) return true;
    else return false;
  }
  static void sayHello() {
    System.out.println("Hello");
  }
  static void getOne(int a,int b,int c)
  {
    if(a*c == b)
    {
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
  static boolean isvowel(char a)
  {
    String vowels = "aeiouAEIOU";
    return vowels.contains(""+a);
  }
  static int casedetermination(char ch){
    if(ch >= 65 && ch <= 90) {
        return 2;
    }
    else if(ch >= 97 && ch  <= 122){
      return 1;
    }
    else if ( ch >= 48 && ch <= 57){
      return 3;
    }
    return 0;
  }
  public static void main(String[] args) {
    boolean result = isFactor(12, 24);
    System.out.println(result);
    sayHello();
    sayHello();
    sayHello();
    getOne(2,3,6);
    boolean result2 = isvowel('z');
    System.out.println(result2);
  }

}
