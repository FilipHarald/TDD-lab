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

        switch (mode) {
            case Date:
                mode = Mode.Time;
                curDisplay = theTime.showTime();
                break;
            case Time:
                mode = Mode.Date;
                curDisplay = theDate.showDate();
                break;
            case DateReset:
                // ChangeMode does nothing in DateReset
                break;
            case TimeReset:
                // ChangeMode does nothign in TimeReset
                break;
        }

        return curDisplay;

    }

    public String Reset() {

        switch (mode) {
            case Date:
                mode = Mode.DateReset;
                curDisplay = "Alter Date";
                break;
            case Time:
                mode = Mode.TimeReset;
                curDisplay = "Alter Time";
                break;
            case DateReset:
                // Reset does nothing if already in DateReset
                break;
            case TimeReset:
                // Reset does nothing if already in TimeReset
                break;
        }

        return curDisplay;
    }

    public String Set(int p1, int p2, int p3) {

        switch (mode) {
            case Date:
                // Set does not work outside of Reset
                break;
            case Time:
                // Set does not work outside of Reset
                break;
            case DateReset:
                curDisplay = theDate.dateSet(p1, p2, p3);
                break;
            case TimeReset:
                curDisplay = theTime.timeSet(p1, p2, p3);
                break;
        }

        return curDisplay;
    }

}
