package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(day);
        //xuat theo dinh dang
        SimpleDateFormat tanLuc = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s = tanLuc.format(d);
        System.out.println(s);
        

    }

}
