
package luozhuanghehun;

/**
 * �����Ժϻ�
 * 
 * @author luozhuang ��ʦ�����f
 * modified by liuziying
 */
public class Luozhuanghehun {

    enum sex {

        man, woman;
    }

    enum basicstring {

        ��, ��, ��, ��, Ǭ, ��, ��, ��;
    }

    public String hehun(String man, String woman) {
        if (man.length() != 4 || woman.length() != 4) {
            return "���벻��ȷ";
        }

        return peihun(getnumber(man, sex.man), getnumber(woman, sex.woman));

    }

    public String peihun(String man, String woman) {
        return peihun(getnumber(man, sex.man), getnumber(woman, sex.woman));
    }

    private String peihun(int man, int woman) {
        basicstring mang = basicsnumber(man, sex.man);
        basicstring womang = basicsnumber(woman, sex.woman);

        // Ǭ����������Ů ����������Ǭ��Ů��
        if (mang == basicstring.Ǭ && womang == basicstring.��) {
            return "�����";
        }

        if (womang == basicstring.Ǭ && mang == basicstring.��) {
            return "�����";
        }

        // �������俲��Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "�����";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "�����";
        }

        // ������������Ů�������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "�����";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "�����";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "�����";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "�����";
        }

        // ������������Ů���������俲��Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // ������������Ů������Ů�������У�
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // Ǭ���������Ů����������Ǭ��Ů��
        if (mang == basicstring.Ǭ && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.Ǭ && mang == basicstring.��) {
            return "������";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // ������������Ů���������俲��Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "��ҽ��";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "��ҽ��";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "��ҽ��";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "��ҽ��";
        }

        // ��������Ǭ��Ů��Ǭ����������Ů��
        if (mang == basicstring.�� && womang == basicstring.Ǭ) {
            return "��ҽ��";
        }
        if (womang == basicstring.�� && mang == basicstring.Ǭ) {
            return "��ҽ��";
        }

        // ������������Ů�������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "��ҽ��";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "��ҽ��";
        }

        // ��������Ǭ��Ů��Ǭ�����俲��Ů��
        if (mang == basicstring.�� && womang == basicstring.Ǭ) {
            return "��ɷ��";
        }
        if (womang == basicstring.�� && mang == basicstring.Ǭ) {
            return "��ɷ��";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "��ɷ��";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "��ɷ��";
        }

        // ������������Ů�������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "��ɷ��";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "��ɷ��";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "��ɷ��";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "��ɷ��";
        }

        // ������������Ů���������俲��Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // Ǭ����������Ů����������Ǭ��Ů��
        if (mang == basicstring.Ǭ && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.Ǭ && mang == basicstring.��) {
            return "������";
        }

        // ������������Ů�������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // �������俲��Ů��Ǭ������Ǭ��Ů��
        //
        // ������������Ů�������������Ů��
        //
        // ������������Ů��������������Ů��
        //
        // ������������Ů��������������Ů��

        if (mang == womang) {
            return "��λ��";
        }

        // �����������Ů���������俲��Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "����";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "����";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "����";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "����";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "����";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "����";
        }

        // Ǭ����������Ů����������Ǭ��Ů����
        if (mang == basicstring.Ǭ && womang == basicstring.��) {
            return "����";
        }
        if (womang == basicstring.Ǭ && mang == basicstring.��) {
            return "����";
        }

        // ������������Ů���������俲��Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // �����������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // ������������Ů��������������Ů��
        if (mang == basicstring.�� && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.�� && mang == basicstring.��) {
            return "������";
        }

        // Ǭ����������Ů����������Ǭ��Ů��
        if (mang == basicstring.Ǭ && womang == basicstring.��) {
            return "������";
        }
        if (womang == basicstring.Ǭ && mang == basicstring.��) {
            return "������";
        }
        return "���벻��ȷ";

    }
    
    private String parseHun(String result){
        StringBuffer sb = new StringBuffer();
        
        if(result=="�����"){
            sb.append("������������и�����Ů��г�����»��죬�����������ϼ�֮�䡣");
        }else if(result=="������"){
            sb.append("�����������Ӷร���������ã���Т���ͣ��и���»���ϼ�֮�䡣");
        }else if(result=="��ҽ��"){
            sb.append("��ҽ���������޲���һ��ƽ������Ů�������޼��޵����ϼ�֮�䡣");
        }else if(result=="��ɷ��"){
            sb.append("��ɷ��������Ϊ�ģ����޺�˳���主���������ʳ��Ѱ��֮�䡣");
        }else if(result=="������"){
            sb.append("�����������ѿɽ⣬���׻�����������µ���ɱ�С����Ѱ��֮�䡣");
        }else if(result=="��λ��"){
            sb.append("��λ����һ��ƽ����������Ů����Բ�������޾����գ�Ѱ��֮�䡣");
        }else if(result=="����"){
            sb.append("�����������Ƿǣ�����������ﲻ�ͣ�ʱ�й�˾������֮�䡣");
        }else if(result=="������"){
            sb.append("��������ƽ�������������������������ߣ������׻�������֮�䡣");
        }
        
        return sb.toString();
    }

    /**
     * ����ѡ����
     * 
     * @param number ����
     * @param isman ����ô
     * @return ���ڹ���
     */
    public Luozhuanghehun.basicstring basicsnumber(int number, sex isman) {
        switch (number) {
            case 1:
                return basicstring.��;

            case 2:
                return basicstring.��;
            case 3:
                return basicstring.��;
            case 4:
                return basicstring.��;
            case 5:
                if (isman == sex.man) {
                    return basicstring.��;
                } else {
                    return basicstring.��;
                }
            case 6:
                return basicstring.Ǭ;
            case 7:
                return basicstring.��;
            case 8:
                return basicstring.��;
            case 9:
                return basicstring.��;

        }
        return null;
    }

    /**
     * ���ԣ�11-�������ӣ�ҲΪ�������շ������й����㹫ʽ�� Ů�ԣ�4+��������
     * 1989����������ԣ�11-��1+9+8+9��=11-��27��=11-��2+7��=2����������Ϊ����
     * 
     * @param year ��������ַ�
     * @return ����getnumber
     */
    public int getnumber(String year, sex isman) throws NumberFormatException {

        int yearnumber = Short.parseShort(year);
        return getnumber(yearnumber, isman);

    }

    /**
     * ���ԣ�11-�������ӣ�ҲΪ�������շ������й����㹫ʽ�� Ů�ԣ�4+��������
     * 1989����������ԣ�11-��1+9+8+9��=11-��27��=11-��2+7��=2����������Ϊ����
     * 
     * @param year �����������
     * @return ���ؽ��
     */
    public int getnumber(int year, sex isman) {

        int m = ((int) (year / 1000) % 10);
        int h = ((int) (year / 100) % 10);
        int s = ((int) (year / 10) % 10);
        int g = year % 10;
        int sum = m + h + g + s;
        int result;
        if (isman == sex.man) {
            result = 11 - ((int) (sum / 10) % 10) - (sum % 10);

        } else {
            result = 4 + ((int) (sum / 10) % 10) + (sum % 10);
        }
        if (result > 10) {
            result = result - 9;// �������10��ԭ��û��д��ô�������Լ��Ƶ�
        }
        return result;

    }

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        Luozhuanghehun my = new Luozhuanghehun();
        String result = my.hehun("1980", "1981");
        System.out.println(my.getnumber("1980", sex.man));
        System.out.println(my.basicsnumber(my.getnumber("1980", sex.man), sex.man));

        System.out.println(my.getnumber("1981", sex.woman));
        System.out.println(my.basicsnumber(my.getnumber("1981", sex.woman), sex.woman));
        System.out.println(result);
        System.out.println(my.parseHun(result));
    }
}
