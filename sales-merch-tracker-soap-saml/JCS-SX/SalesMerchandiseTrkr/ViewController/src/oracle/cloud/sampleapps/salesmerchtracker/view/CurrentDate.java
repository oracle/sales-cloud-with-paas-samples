package oracle.cloud.sampleapps.salesmerchtracker.view;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDate {
    public CurrentDate() {
    }

    public Date getMaxDate() {
        Calendar cl = Calendar.getInstance();
        cl.setTime(new Date());
        cl.add(Calendar.DATE, 1);
        Date toDate = cl.getTime();
        return toDate;
    }

}
