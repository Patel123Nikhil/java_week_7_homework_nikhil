package javahomeworkweek7;
//Number of Days In Month
        /*Write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false.
        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
        otherwise return false.
        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        Example of input/Output:
        ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
        ● isLeapYear(1600); should return true since 1600 is a leap year
        ● isLeapYear(2017); should return false since 2017 is not a leap year
        ● isLeapYear(2000);should return true because 2000 is a leap year
        Write another method getDaysInMonth with two parameter month and year. Both of type
        int.
        If parameter month is < 1 or >12 return -1.
        If parameter year is <1 or >9999 than return -1.
        This method needs to return the number of days in the month. Be careful about leap years
        they have 29 days in month 2 (February).
        You should check if the year is a leap year using the method isLeapYear describe above*/


public class Programme4 {


    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);


    }

    public static int getDaysInMonth(int MonthOfName, int years) {

        int number_of_DayInMonth = 0;

        switch (MonthOfName) {

            case 1:
                number_of_DayInMonth = 31;
                break;

            case 2:
                if ((years % 400 == 0) || ((years % 4 == 0) && (years % 100 != 0))) {
                    number_of_DayInMonth = 29;
                } else {
                    number_of_DayInMonth = 28;
                }
                break;
            case 3:

                number_of_DayInMonth = 31;
                break;
            case 4:

                number_of_DayInMonth = 30;
                break;
            case 5:

                number_of_DayInMonth = 31;
                break;
            case 6:

                number_of_DayInMonth = 30;
                break;
            case 7:

                number_of_DayInMonth = 31;
                break;
            case 8:

                number_of_DayInMonth = 31;
                break;
            case 9:

                number_of_DayInMonth = 30;
                break;
            case 10:

                number_of_DayInMonth = 31;
                break;
            case 11:

                number_of_DayInMonth = 30;
                break;
            case 12:

                number_of_DayInMonth = 31;
                break;
        }
        System.out.print(MonthOfName + " " + years + "has" + number_of_DayInMonth + " days\n");
        return 0;
    }


    public static void isLeapYear(int year) {
        boolean result;
        if (year >= 1 && year <= 9999) {
            System.out.println(result = true);

        } else {
            System.out.println(result = false);
        }
        boolean step;
        if (year == (year % 4)) {
            if (year == (year % 100)) {
                step = result;
            }
            if (year == (year % 100)) {
                if (year == (year) % 400) {
                    step = result;
                }
                if (year == (year % 400)) {
                    step = result;
                } else {
                    step = result;

                }


            }
        }
    }
}

