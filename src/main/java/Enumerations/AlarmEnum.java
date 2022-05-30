package Enumerations;

public enum AlarmEnum {

    RED(0),
    YELLOW(30),
    GREEN(60);

    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";

    private int maxNumberOfCustomers;

    AlarmEnum(int maxNumberOfCustomers) {
        this.maxNumberOfCustomers = maxNumberOfCustomers;
    }

    public String checkCustomers(int numberOfCustomers) {
        if (numberOfCustomers > maxNumberOfCustomers) {
            return WARNING_MESSAGE;
        }
        return OK_MESSAGE;
    }
}
