package part2.clock;

public class Clock {

    private enum Mode {
        Time, TimeReset, Date, DateReset;
    }

    private Date theDate;
    private Time theTime;
    private Mode mode;
    private String curDisplay;

    public Clock() {
        theDate = new Date();
        theTime = new Time();
        mode = Mode.Time;
        curDisplay = theTime.showTime();
    }

    public String changeMode() {

        if (mode == Mode.Date) {
            mode = Mode.Time;
            curDisplay = theTime.showTime();
        } else if (mode == Mode.Time){
            mode = Mode.Date;
            curDisplay = theDate.showDate();
        }

        return curDisplay;

    }

    public String Reset() {

        if (mode == Mode.Date) {
            mode = Mode.DateReset;
            curDisplay = "Alter Date";
        } else  if (mode == Mode.Time) {
            mode = Mode.TimeReset;
            curDisplay = "Alter Time";
        }

        return curDisplay;
    }

    public String Set(int p1, int p2, int p3) {

        if (mode == Mode.DateReset) {
            curDisplay = theDate.setDate(p1, p2, p3);
        } else if (mode == Mode.TimeReset) {
            curDisplay = theTime.setTime(p1, p2, p3);
        }

        return curDisplay;
    }

}
