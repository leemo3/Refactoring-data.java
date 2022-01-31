import java.util.Scanner;
import static org.junit.Assert.*;
public class Date {

      private String month;
      private int day;
      private int year; //a four digit number.

      public void Date( )
      {
          month = "January";
          day = 1;
          year = 1000;
      }

      public void Date(int monthInt, int day, int year)
      {
          setDate(monthInt, day, year);
      }

      public void Date(String monthString, int day, int year)
      {
          setDate(monthString, day, year);
      }

      public void Date(int year)
      {
          setDate(1, 1, year);
      }

      public void Date(Date aDate)
      {
          if (aDate == null)//Not a real date.
          {
               System.out.println("Fatal Error.");
               System.exit(0);
          }

          month = aDate.month;
          day = aDate.day;
          year = aDate.year;
      }

      public void setDate(int monthInt, int day, int year)
      {
          if (dateOK(monthInt, day, year))
          {
              this.month = monthString(monthInt);
              this.day = day;
              this.year = year;
          }
          else
          {
              System.out.println("Fatal Error");
              System.exit(0);
          }
      }

      public void setDate(String monthString, int day, int year)
      {
          if (dateOK(monthString, day, year))
          {
              this.month = monthString;
              this.day = day;
              this.year = year;
          }
          else
          {
              System.out.println("Fatal Error");
              System.exit(0);
          }
      }

      public void setDate(int year)
      {
          setDate(1, 1, year);
      }

      public void setYear(int year)
      {
          if ( (year < 1000) || (year > 9999) )
          {
              System.out.println("Fatal Error");
              System.exit(0);
          }
          else
              this.year = year;
      }
      public void setMonth(int monthNumber)
      {
          if ((monthNumber <= 0) || (monthNumber > 12))
          {
              System.out.println("Fatal Error");
              System.exit(0);
          }
          else
              month = monthString(monthNumber);
      }

      private String monthString(int monthNumber) {
        // TODO Auto-generated method stub
        return null;
      }

      public void setDay(int day)
      {
          if ((day <= 0) || (day > 31))
          {
              System.out.println("Fatal Error");
              System.exit(0);
          }
          else
              this.day = day;
      }

      public int getMonth( )
      {
          int m = 1;
          String month;
              if(m == 1){
                month = "Janurary";
              }else if(m == 2){
                month = "February";
              }else if(m == 3){
                month = "March";
              }else if(m == 4){
                month = "April";
              }else if(m == 5){
                month = "May";
              }else if(m == 6){
                month = "June";
              }else if(m == 7){
                month = "July";
              }else if(m == 8){
                month = "August";
              }else if(m == 9){
                month = "September";
              }else if(m == 10){
                month = "October";
              }else if(m == 11){
                month = "November";
              }else if(m == 12){
                month = "December";
              }
          {
              System.out.println("Fatal Error");
              System.exit(0);
              return 0; //Needed to keep the compiler happy
          }
      }

      public int getDay( )
      {
          return day;
      }

      public int getYear( )
      {
          return year;
      }

      public String toString( )
      {
          return (month + " " + day + ", " + year);
      }

      public boolean equals(Date otherDate)
      {
          return ( (month.equals(otherDate.month))
                    && (day == otherDate.day) && (year == otherDate.year) );
      }

      public boolean precedes(Date otherDate)
      {
          return ( (year < otherDate.year) ||
             (year == otherDate.year && getMonth( ) < otherDate.getMonth( )) ||
             (year == otherDate.year && month.equals(otherDate.month)
                                           && day < otherDate.day) );
      }

      public void readInput( )
      {
          boolean tryAgain = true;
          Scanner keyboard = new Scanner(System.in);
          while (tryAgain)
          {
              System.out.println("Enter month, day, and year.");
                System.out.println("Do not use a comma.");
              String monthInput = keyboard.next( );
              int dayInput = keyboard.nextInt( );
              int yearInput = keyboard.nextInt( );
              if (dateOK(monthInput, dayInput, yearInput) )
              {
                  setDate(monthInput, dayInput, yearInput);
                  tryAgain = false;
              }
              else
                  System.out.println("Illegal date. Reenter input.");
           }
      }

      private boolean dateOK(int monthInt, int dayInt, int yearInt)
      {
          return ( (monthInt >= 1) && (monthInt <= 12) &&
                   (dayInt >= 1) && (dayInt <= 31) &&
                   (yearInt >= 1000) && (yearInt <= 9999) );
      }

      private boolean dateOK(String monthString, int dayInt, int yearInt)
      {
          return ( monthOK(monthString) &&
                   (dayInt >= 1) && (dayInt <= 31) &&
                   (yearInt >= 1000) && (yearInt <= 9999) );
      }

      private boolean monthOK(String month)
      {
          return (month.equals("January") || month.equals("February") ||
                  month.equals("March") || month.equals("April") ||
                  month.equals("May") || month.equals("June") ||
                  month.equals("July") || month.equals("August") ||
                  month.equals("September") || month.equals("October") ||
                  month.equals("November") || month.equals("December") );
      }

      private void printmonthString(int monthNumber)
      {
          switch (monthNumber)
          {
          case 0:
            System.out.println("Month" + monthNumber + "is not a month");
            break;
          case 2:
            System.out.println("Month" + monthNumber + "is January");
            break;
          case 3:
            System.out.println("Month" + monthNumber + "is February");
            break;
          case 4:
            System.out.println("Month" + monthNumber + "is March");
            break;
          case 5:
            System.out.println("Month" + monthNumber + "is April");
            break;
          case 6:
            System.out.println("Month" + monthNumber + "is May");
            break;
          case 7:
            System.out.println("Month" + monthNumber + "is June");
            break;
          case 8:
            System.out.println("Month" + monthNumber + "is July");
            break;
          case 9:
            System.out.println("Month" + monthNumber + "is August");
            break;
          case 10:
            System.out.println("Month" + monthNumber + "is September");
            break;
          case 11:
            System.out.println("Month" + monthNumber + "is October");
            break;
          case 12:
            System.out.println("Month" + monthNumber + "is November");
            break;
          case 13:
            System.out.println("Month" + monthNumber + "is January");
          break;
          default:
              System.out.println("Fatal Error");
              System.exit(0);
              
          }
      }
  }

