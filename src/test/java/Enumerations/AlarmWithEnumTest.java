package Enumerations;

import Enumerations.AlarmEnum;
import Enumerations.AlarmWithEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmWithEnumTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten",
                AlarmWithEnum.checkNumberOfCustomers(15, AlarmEnum.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten",
                AlarmWithEnum.checkNumberOfCustomers(30, AlarmEnum.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen",
                AlarmWithEnum.checkNumberOfCustomers(31, AlarmEnum.YELLOW));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten",
                AlarmWithEnum.checkNumberOfCustomers(45, AlarmEnum.GREEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten",
                AlarmWithEnum.checkNumberOfCustomers(60, AlarmEnum.GREEN));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen",
                AlarmWithEnum.checkNumberOfCustomers(61, AlarmEnum.GREEN));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen",
                AlarmWithEnum.checkNumberOfCustomers(1, AlarmEnum.RED));
        assertEquals("Maximale Personenzahl nicht überschritten",
                AlarmWithEnum.checkNumberOfCustomers(0, AlarmEnum.RED));
    }

//    @Test
//    void testUnknownAlarmLevel() {
//        assertEquals("unknown alarm level",
//                Enumerations.AlarmWithEnum.checkNumberOfCustomers(100, "unknown"));
//    }


}