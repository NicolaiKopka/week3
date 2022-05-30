package Enumerations;

import Enumerations.AlarmEnum;

public class AlarmWithEnum {



    public static String checkNumberOfCustomers(int numberOfCustomers, AlarmEnum alarmLevel) {

        return alarmLevel.checkCustomers(numberOfCustomers);

    }


}
