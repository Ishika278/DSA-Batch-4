 public class secondhighest{
   public static void main(String[] args) {
      String s = "dfa12321afd"; 
      int largest = -1;
      int secondlargest = -1;
     for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
      int digit = Character.getNumericValue(c);
       if (digit > largest){
          secondlargest = largest;
          largest = digit;
         } else if(digit > secondlargest && digit < largest){
                 secondlargest = digit;
                 }
     }
    }
      System.out.println("second largest digit in string : " + secondlargest);
  }
}