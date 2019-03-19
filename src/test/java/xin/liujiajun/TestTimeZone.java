package xin.liujiajun;

import java.time.ZoneId;
import java.util.TimeZone;

/**
 * @author liujiajun
 * @description
 * @create 2019-03-18 13:58
 **/
public class TestTimeZone  {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String s :
                availableIDs) {
            System.out.println(s);
        }
    }
}
