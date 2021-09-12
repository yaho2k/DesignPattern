package State;

public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState() {                            
    }
    public static State getInstance() {               
        return singleton;
    }
    public void doClock(Context context, int hour) {  
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {              
        context.callSecurityCenter("Use : Night!");
    }
    public void doAlarm(Context context) {            
        context.callSecurityCenter("Alarm(Night)");
    }
    public void doPhone(Context context) {            
        context.recordLog("Phone Night");
    }
    public String toString() {                        
        return "[Night]";
    }
}
