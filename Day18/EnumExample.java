package Day18;

enum DaysOfWeek {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
  public static void main(String[] args) {
      DaysOfWeek today = DaysOfWeek.WEDNESDAY;
      System.out.println("Today is " + today);
  }
}
