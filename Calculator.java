import java.util.*;
public class Calculator {
  public double evaluate(String expr) {
    if (expr.isEmpty())
      return 0;
    String[] arr  = expr.split(" ");
    if (arr.length == 1){
      return Double.parseDouble(arr[0]);
    }
    else {
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        int i = 2;
        while (arrList.size() > 2)
        {   
          if (arrList.get(i).equals("/") || arrList.get(i).equals("*") 
              || arrList.get(i).equals("+") || arrList.get(i).equals("-")){
                double sum = eq(Double.parseDouble(arrList.get(i-2)),Double.parseDouble(arrList.get(i-1)), arrList.get(i));
                arrList.remove(i);
                arrList.remove(i-1);
                arrList.remove(i-2);
                arrList.add(i-2, Double.toString(sum));
                i = 1;
              }
          i++;
        }
        return Double.parseDouble(arrList.get(0));
    }
  }
  
  double eq(double num1, double num2, String symbol)
  {
      if (symbol.equals("/"))
        return num1 / num2;
      else if (symbol.equals("*"))
        return num1 * num2;
      else if (symbol.equals("+"))
        return num1 + num2;
      else
        return num1 - num2;
  }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalcGui window = new CalcGui();
        window.setVisible(true);
        System.out.println(calc.evaluate("5 1 2 + 4 * + 3 -"));
    }

}