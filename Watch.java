public class Watch {
    private int obtainPossitionHourPointer(int hour, int minute) {
        int possition = 0;

        if (minute == 00) {
            possition = 0;
        } else if (minute == 15) {
            possition = 45;
        } else if (minute == 30) {
            possition = 180;
        } else {
            possition = (hour * 60 + minute) * 360 / (12 * 60);
        }

        return possition;
    }

    public int returnAnguleWatch(int hour, int minute) {
        int positionPointerHour = obtainPossitionHourPointer(hour, minute);

        return positionPointerHour;
    }
}
