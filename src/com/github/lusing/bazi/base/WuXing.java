
package com.github.lusing.bazi.base;

public class WuXing {
    public static final int MU = 0;
    public static final int HUO = 1;
    public static final int TU = 2;
    public static final int JIN = 3;
    public static final int SHUI = 4;
    
    private int xing;
    
    public int getXing(){
        return xing;
    }
    
    public WuXing(int xing){
        this.xing = (xing+5) % 5;
    }
    
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
    
    //��, ˳λ����
    public static final boolean isSheng(int xing1, int xing2){
        int x1 = (xing1+5) % 5;
        int x2 = (xing2+5) % 5;
        
        if((x2-x1+5)%5 == 1){
            return true;
        }
        return false;
    }
    
    //��,��λ���
    public static final boolean isKe(int xing1, int xing2){
        int x1 = (xing1+5) % 5;
        int x2 = (xing2+5) % 5;
        
        if((x2-x1+5)%5 == 2){
            return true;
        }
        return false;
    }
    
    public boolean isSheng(WuXing xing2){
        return isSheng(this.xing,xing2.getXing());
    }
    
    public boolean isKe(WuXing xing2){
        return isKe(this.xing,xing2.getXing());
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        switch (xing % 5) {
            case MU:
                sb.append("ľ\n");
                sb.append("����\n");
                sb.append("����\n");
                sb.append("��ɫ\n");
                break;
            case HUO:
                sb.append("��\n");
                sb.append("����\n");
                sb.append("����\n");
                sb.append("��ɫ\n");
                break;
            case TU:
                sb.append("��\n");
                sb.append("����\n");
                sb.append("Ƣ��\n");
                sb.append("��ɫ\n");
                break;
            case JIN:
                sb.append("��\n");
                sb.append("����\n");
                sb.append("����\n");
                sb.append("��ɫ\n");
                break;
            case SHUI:
                sb.append("ˮ\n");
                sb.append("����\n");
                sb.append("����\n");
                sb.append("��ɫ\n");
                break;
            default:
        }
        
        return sb.toString();
    }
    
}
