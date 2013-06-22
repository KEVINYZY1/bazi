
package com.github.lusing.bazi.base;

public class WuXing {
    public static final int MU = 0;
    public static final int HUO = 1;
    public static final int TU = 2;
    public static final int JIN = 3;
    public static final int SHUI = 4;

    public static final String getWuXingName(int xing) {
        switch (xing % 5) {
            case MU:
                return "ľ";
            case HUO:
                return "��";
            case TU:
                return "��";
            case JIN:
                return "��";
            case SHUI:
                return "ˮ";
            default:
                return null;
        }
    }
}
