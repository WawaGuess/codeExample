package com.example.time;

import java.time.LocalDate;

/**
 * @author WawaGuess
 * @project codeExample
 * @Date 2022/7/3
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */
public class DayWeekMonthYear {
    private static final String[] DAY_OF_WEEK = {null, "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {

        int year = 2022;
        int month = 12;
        int day = 3;
        System.out.println(getDayOfWeek(year, month, day));
    }

    public static String getDayOfWeek(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return DAY_OF_WEEK[localDate.getDayOfWeek().getValue()];
    }


}
