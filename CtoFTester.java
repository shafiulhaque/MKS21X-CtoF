// The functions should take one parameter each.
// The parameter should either be an integer or double.
// The first function should return the Fahrenheit given the Celsius, and the second function should do the opposite.

public class CtoFTester{
      public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5.0) + 32;
      }
      public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9.0;
      }

      public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(42.0));   // should return 89.6 Fahrenheit
        System.out.println(fahrenheitToCelsius(42.0));   // should return 0.0 Celsius
      }
}
