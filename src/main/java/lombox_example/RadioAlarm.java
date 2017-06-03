package lombox_example;

import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 03/06/2017.
 */
public class RadioAlarm implements Radio, Alarm {
    @Delegate(excludes = AlarmExclusion.class)
    private Alarm alarm = new AlarmImpl();
    @Delegate
    private Radio radio = new RadioImpl();

    public void y() {

    }
}
