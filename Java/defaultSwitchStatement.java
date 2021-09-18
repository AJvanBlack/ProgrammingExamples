class defaultSwitchStatement {

    public static void main(String[] args) {
      int weekdays = 3;

          switch(weekdays) {
              case 6:
                  System.out.println("Saturday");
                  break;
              case 7:
                  System.out.println("Sunday");
                  break;
              default:
                  System.out.println("Weekday");
          }
      }
  }
