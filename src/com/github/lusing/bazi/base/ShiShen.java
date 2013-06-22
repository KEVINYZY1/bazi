
package com.github.lusing.bazi.base;

public class ShiShen extends LiuQin {
    protected int shishen;

    /**
     * ������Ϊ��ĸ / ӡ�� ����Ϊ��ӡ ͬ��Ϊƫӡ
     */
    public static final int YINXING = 0x1;
    public static final int ZHENGYIN = 0x10;
    public static final int PIANYIN = 0x11;
    /**
     * ������Ϊ��Ů / ʳ�� ����Ϊ�˹� ͬ��Ϊʳ��
     */
    public static final int SHISHANG = 0x2;
    public static final int SHANGGUAN = 0x20;
    public static final int SHISHEN = 0x21;
    /**
     * ������Ϊ��ɱ ����Ϊ���� ͬ��Ϊ��ɱ
     */
    public static final int ZHENGGUAN = 0x30;
    public static final int QISHA = 0x31;
    /**
     * �ҿ���Ϊ�޲� / ���� ����Ϊ���� ͬ��Ϊƫ��
     */
    public static final int CAIXING = 0x4;
    public static final int ZHENGCAI = 0x40;
    public static final int PIANCAI = 0x41;

    /**
     * ͬ����Ϊ�ֵ� / �Ƚ� ����Ϊ�ٲ� ͬ��Ϊ�ȼ�
     */
    public static final int BIJIE = 0x05;
    public static final int JIECAI = 0x50;
    public static final int BIJIAN = 0x51;

    public String toString() {
        StringBuffer sb = new StringBuffer();
        switch (shishen) {
            case ZHENGYIN:
                sb.append("��ӡ");
                break;
            case PIANYIN:
                sb.append("ƫӡ");
                break;
            case SHANGGUAN:
                sb.append("�˹�");
                break;
            case SHISHEN:
                sb.append("ʳ��");
                break;
            case ZHENGGUAN:
                sb.append("����");
                break;
            case QISHA:
                sb.append("��ɱ");
                break;
            case ZHENGCAI:
                sb.append("����");
                break;
            case PIANCAI:
                sb.append("ƫ��");
                break;
            case BIJIAN:
                sb.append("�ȼ�");
                break;
            case JIECAI:
                sb.append("�ٲ�");
                break;
            default:
                break;
        }
        return sb.toString();
    }

    public int getShiShen() {
        return shishen;
    }

    public static ShiShen getShiShen(TianGan me, TianGan other) {
        ShiShen ss1 = new ShiShen();
        int sum = me.getTianGan() + other.getTianGan();
        boolean isSame = sum % 2 == 0;
        if (other.isSheng(me)) {
            ss1.liuqin = LiuQin.FUMU;
            if (isSame) {
                ss1.shishen = ShiShen.ZHENGYIN;
            } else {
                ss1.shishen = ShiShen.PIANYIN;
            }
        } else if (me.isSheng(other)) {
            ss1.liuqin = LiuQin.ERNV;
            if (isSame) {
                ss1.shishen = ShiShen.SHISHEN;
            } else {
                ss1.shishen = ShiShen.SHANGGUAN;
            }
        } else if (other.isKe(me)) {
            ss1.liuqin = LiuQin.GUANSHA;
            if (isSame) {
                ss1.shishen = ShiShen.QISHA;
            } else {
                ss1.shishen = ShiShen.ZHENGGUAN;
            }
        } else if (me.isKe(other)) {
            ss1.liuqin = LiuQin.QICAI;
            if (isSame) {
                ss1.shishen = ShiShen.PIANCAI;
            } else {
                ss1.shishen = ShiShen.ZHENGCAI;
            }
        } else {
            ss1.liuqin = LiuQin.XIONGDI;
            if (isSame) {
                ss1.shishen = ShiShen.BIJIAN;
            } else {
                ss1.shishen = ShiShen.JIECAI;
            }
        }
        return ss1;
    }
}
