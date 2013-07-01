
package yunos.tech.panaimin.bazi;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.widget.DatePicker.OnDateChangedListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends Activity {
    TextView txtResult;
    Button btnEval;
    DatePicker datePicker;
    TimePicker timePicker;
    //Spinner[] spinners;
    String[] baziInputs;
    
    private int year;
    private int month;
    private int day;
    private int hour; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnEval = (Button) findViewById(R.id.btnEval);

        baziInputs = new String[4];

        datePicker = (DatePicker)findViewById(R.id.datePicker);
        timePicker = (TimePicker)findViewById(R.id.timePicker);

        Calendar cNow = Calendar.getInstance();
        int yearNow = cNow.get(Calendar.YEAR);
        int monthNow = cNow.get(Calendar.MONTH);
        int dayNow = cNow.get(Calendar.DAY_OF_MONTH);
        
        datePicker.init(yearNow, monthNow, dayNow, new OnDateChangedListener(){

            @Override
            public void onDateChanged(DatePicker obj, int year, int month, int day) {
                MainActivity.this.year = year;
                MainActivity.this.month = month+1;
                MainActivity.this.day = day;
            }
        });
        
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                MainActivity.this.hour = hourOfDay;
            }
        });

        btnEval.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal = Calendar.getInstance();
                try {
                        //�趨���˵���Ԫʱ��Ϊ1983-01-10
                        cal.setTime(sdf.parse(year+"-"+month+"-"+day));
                        luozhuanghehun.BaZi lunar = new luozhuanghehun.BaZi(cal);
                        txtResult.setText("");
                        txtResult.setText("��������:"+year+"��"+month+"��"+day+"��\n");
                        txtResult.setText(txtResult.getText()+"����ũ�������ڡ�"+lunar.toString()+"��\n");
                        //�˴���Ϊ�˻�ȡʱ�����й��İ���ѧ˵�ϵ���ʾ����������ʱ����
                        txtResult.setText(txtResult.getText()+"���˰��֡�"+lunar.getYearGanZhi(MainActivity.this.getHour())+"��\n");
                        //��ȡ��Ф
                        txtResult.setText(txtResult.getText()+"���˵�ũ����Ф��"+lunar.animalsYear()+"��\n");
                        
                        final String paraStr = lunar.getYearGanZhi(MainActivity.this.getHour()); 
                        
                        new AsyncTask<String, Integer, String>() {
                            @Override
                            protected void onPreExecute() {

                            }

                            @Override
                            protected String doInBackground(String... paraStrs) {
                                BaZi bz = new BaZi();
                                return bz.evalBazi(paraStrs[0]);
                            }

                            @Override
                            protected void onPostExecute(String result) {
                                if (result == null) {
                                    txtResult.setText(txtResult.getText()+"���㲻�ɹ������������");
                                } else {
                                    txtResult.setText(txtResult.getText()+"�˰��ֵ�����ƽ�����������£�" + result);
                                }
                            }

                            @Override
                            protected void onProgressUpdate(Integer... value) {

                            }
                        }.execute(paraStr);

                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private int getHour(){
        return hour/2+1;
    }
}
