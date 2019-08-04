package com.example.hook;

import java.util.Calendar;

/**
 * File description.
 *
 * @author sufeng
 * @date 2019-08-04
 */
public class CheckDoubleClick {
    public static final int MIN_CLICK_DELAY_TIME = 1000;

    private static long lastClickTime = 0;

    public static boolean check() {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        if (currentTime - lastClickTime > MIN_CLICK_DELAY_TIME) {
            lastClickTime = currentTime;
            return false;
        } else {
            return true;
        }

    }
}
