package State;

public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {                             
    }
    public static State getInstance() {               
        return singleton;
    }
    public void doClock(Context context, int hour) {   
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }
    public void doUse(Context context) {                
        context.recordLog(" Record (Day)");
    }
    public void doAlarm(Context context) {              
        context.callSecurityCenter(" Alarm (Day)");
    }
    public void doPhone(Context context) {              
        context.callSecurityCenter(" Phone(Day)");
    }
    public String toString() {                       
        return "[Day]";
    }
}

