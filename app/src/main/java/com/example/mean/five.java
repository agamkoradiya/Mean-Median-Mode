package com.example.mean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class five extends AppCompatActivity {

    // for question:
    EditText ci1;
    EditText ci2;
    EditText ci3;
    EditText ci4;
    EditText ci5;

    EditText cii1;
    EditText cii2;
    EditText cii3;
    EditText cii4;
    EditText cii5;

    EditText f1;
    EditText f2;
    EditText f3;
    EditText f4;
    EditText f5;
    TextView totalf;

    // Mean:
    TextView x1;
    TextView x2;
    TextView x3;
    TextView x4;
    TextView x5;
    TextView totalx;

    TextView fx1;
    TextView fx2;
    TextView fx3;
    TextView fx4;
    TextView fx5;
    TextView totalfx;

    float common= 2.0f;

    //calculation:

    TextView formulaformean;
    TextView step2;
    TextView answer;


    //Median
    TextView c1;
    TextView c2;
    TextView c3;
    TextView c4;
    TextView c5;

    //calculation:
    TextView formulaformedian;
    TextView step2median;
    TextView step3median;
    TextView answerofmedian;
    float l=0;
    float f=0;
    float cf=0;
    float i;

    //Calculation of Mode:
    TextView formulaformode;
    TextView step2mode;
    TextView step3mode;
    TextView answerofmode;
    float modeoffl=0;
    float modeoff1=0;
    float modeoff0=0;
    float modeoff2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        //call all the editbox:
        // for question
        ci1=(EditText)findViewById(R.id.ci1);
        ci2=(EditText)findViewById(R.id.ci2);
        ci3=(EditText)findViewById(R.id.ci3);
        ci4=(EditText)findViewById(R.id.ci4);
        ci5=(EditText)findViewById(R.id.ci5);

        cii1=(EditText)findViewById(R.id.cii1);
        cii2=(EditText)findViewById(R.id.cii2);
        cii3=(EditText)findViewById(R.id.cii3);
        cii4=(EditText)findViewById(R.id.cii4);
        cii5=(EditText)findViewById(R.id.cii5);

        f1=(EditText)findViewById(R.id.f1);
        f2=(EditText)findViewById(R.id.f2);
        f3=(EditText)findViewById(R.id.f3);
        f4=(EditText)findViewById(R.id.f4);
        f5=(EditText)findViewById(R.id.f5);

        totalf=(TextView)findViewById(R.id.totalf);

        // call all the textview:
        //Mean:
        //-----
        x1=(TextView)findViewById(R.id.x1);
        x2=(TextView)findViewById(R.id.x2);
        x3=(TextView)findViewById(R.id.x3);
        x4=(TextView)findViewById(R.id.x4);
        x5=(TextView)findViewById(R.id.x5);
        totalx=(TextView)findViewById(R.id.totalx);

        fx1=(TextView)findViewById(R.id.fx1);
        fx2=(TextView)findViewById(R.id.fx2);
        fx3=(TextView)findViewById(R.id.fx3);
        fx4=(TextView)findViewById(R.id.fx4);
        fx5=(TextView)findViewById(R.id.fx5);
        totalfx=(TextView)findViewById(R.id.totalfx);
        // other calculation for mean:
        formulaformean=(TextView)findViewById(R.id.formulaformean);
        step2=(TextView)findViewById(R.id.step2);
        answer=(TextView)findViewById(R.id.answer);

        //Median:
        //--------
        c1=(TextView)findViewById(R.id.c1);
        c2=(TextView)findViewById(R.id.c2);
        c3=(TextView)findViewById(R.id.c3);
        c4=(TextView)findViewById(R.id.c4);
        c5=(TextView)findViewById(R.id.c5);

        //other calculation for median:
        formulaformedian=(TextView)findViewById(R.id.formulaformedian);
        step2median=(TextView)findViewById(R.id.step2median);
        step3median=(TextView)findViewById(R.id.step3median);
        answerofmedian=(TextView)findViewById(R.id.answerofmedian);

        //Mode:
        //-----
        formulaformode=(TextView)findViewById(R.id.formulaformode);
        step2mode=(TextView)findViewById(R.id.step2mode);
        step3mode=(TextView)findViewById(R.id.step3mode);
        answerofmode=(TextView)findViewById(R.id.answerofmode);
    }

    public void mean(View view)
    {
        //set total of f:

        float atotalf = Float.parseFloat(f1.getText().toString()) +
                          Float.parseFloat(f2.getText().toString()) +
                          Float.parseFloat(f3.getText().toString()) +
                          Float.parseFloat(f4.getText().toString()) +
                          Float.parseFloat(f5.getText().toString()) ;

        totalf.setText(Float.toString(atotalf));
        // set the value of x:

        float ax1=Float.parseFloat(ci1.getText().toString()) + Float.parseFloat(cii1.getText().toString());
        float fax1=ax1/common;
        x1.setText(Float.toString(fax1));

        float ax2=Float.parseFloat(ci2.getText().toString()) + Float.parseFloat(cii2.getText().toString());
        float fax2=ax2/common;
        x2.setText(Float.toString(fax2));

        float ax3=Float.parseFloat(ci3.getText().toString()) + Float.parseFloat(cii3.getText().toString());
        float fax3=ax3/common;
        x3.setText(Float.toString(fax3));

        float ax4=Float.parseFloat(ci4.getText().toString()) + Float.parseFloat(cii4.getText().toString());
        float fax4=ax4/common;
        x4.setText(Float.toString(fax4));

        float ax5=Float.parseFloat(ci5.getText().toString()) + Float.parseFloat(cii5.getText().toString());
        float fax5=ax5/common;
        x5.setText(Float.toString(fax5));

        float atotalx = fax1 + fax2 + fax3 + fax4 + fax5;
        totalx.setText(Float.toString(atotalx));

        // set the value of fx:

        float afx1 = Float.parseFloat(f1.getText().toString())*fax1;
        fx1.setText(Float.toString(afx1));

        float afx2 = Float.parseFloat(f2.getText().toString())*fax2;
        fx2.setText(Float.toString(afx2));

        float afx3 = Float.parseFloat(f3.getText().toString())*fax3;
        fx3.setText(Float.toString(afx3));

        float afx4 = Float.parseFloat(f4.getText().toString())*fax4;
        fx4.setText(Float.toString(afx4));

        float afx5 = Float.parseFloat(f5.getText().toString())*fax5;
        fx5.setText(Float.toString(afx5));

        float atotalfx = afx1 + afx2 + afx3 + afx4 + afx5;
        totalfx.setText(Float.toString(atotalfx));

        //formula:

        formulaformean.setText("Mean = Σfx" + "\n" + "       ----" + "\n" + "        N");
        step2.setText("=  " + atotalfx + "\n" + "     --------" + "\n" + "      " + atotalf);
        float ans = atotalfx/atotalf;
        answer.setText(Float.toString(ans));
    }

    public void median(View view)
    {
        // calculating of c:
        float ansofc1=Float.parseFloat(f1.getText().toString());
        float ansofc2=Float.parseFloat(f1.getText().toString()) + Float.parseFloat(f2.getText().toString());
        float ansofc3=Float.parseFloat(f1.getText().toString()) + Float.parseFloat(f2.getText().toString()) + Float.parseFloat(f3.getText().toString());
        float ansofc4=Float.parseFloat(f1.getText().toString()) + Float.parseFloat(f2.getText().toString()) + Float.parseFloat(f3.getText().toString()) + Float.parseFloat(f4.getText().toString());
        float ansofc5=Float.parseFloat(f1.getText().toString()) + Float.parseFloat(f2.getText().toString()) + Float.parseFloat(f3.getText().toString()) + Float.parseFloat(f4.getText().toString()) + Float.parseFloat(f5.getText().toString());


        //set the value of c:

        c1.setText(Float.toString(ansofc1));
        c2.setText(Float.toString(ansofc2));
        c3.setText(Float.toString(ansofc3));
        c4.setText(Float.toString(ansofc4));
        c5.setText(Float.toString(ansofc5));

        //search nby2:

        //set total of f:

        float atotalf = Float.parseFloat(f1.getText().toString()) +
                Float.parseFloat(f2.getText().toString()) +
                Float.parseFloat(f3.getText().toString()) +
                Float.parseFloat(f4.getText().toString()) +
                Float.parseFloat(f5.getText().toString()) ;
        totalf.setText(Float.toString(atotalf));
        float nby2 = atotalf/common;


        if(nby2 >= Float.parseFloat(c1.getText().toString()) && nby2 < Float.parseFloat(c2.getText().toString()))
        {
            l = Float.parseFloat(ci2.getText().toString());
            f = Float.parseFloat(f2.getText().toString());
            cf = Float.parseFloat(c1.getText().toString());
        }

        else if(nby2 >= Float.parseFloat(c2.getText().toString()) && nby2 < Float.parseFloat(c3.getText().toString()))
        {
            l = Float.parseFloat(ci3.getText().toString());
            f = Float.parseFloat(f3.getText().toString());
            cf = Float.parseFloat(c2.getText().toString());
        }

        else if(nby2 >= Float.parseFloat(c3.getText().toString()) && nby2 < Float.parseFloat(c4.getText().toString()))
        {
            l = Float.parseFloat(ci4.getText().toString());
            f = Float.parseFloat(f4.getText().toString());
            cf = Float.parseFloat(c3.getText().toString());
        }

        else if(nby2 >= Float.parseFloat(c4.getText().toString()) && nby2 < Float.parseFloat(c5.getText().toString()))
        {
            l = Float.parseFloat(ci5.getText().toString());
            f = Float.parseFloat(f5.getText().toString());
            cf = Float.parseFloat(c4.getText().toString());
        }
        else
        {
            Toast.makeText(this, "enter currect values", Toast.LENGTH_SHORT).show();
        }

        //set i:
        i= Float.parseFloat(ci3.getText().toString()) - Float.parseFloat(ci2.getText().toString());

        //set formula:
        formulaformedian.setText("Median = l + (n/2 - cf) * i \n              -------- \n                  f");

        //set value in step2:
        step2median.setText("= "+l +" + ("+nby2+" - "+cf+") * "+i +"\n                  --------------- \n                      "+f);

        //set value in step3:

        float solvebreaket = (nby2 - cf)/f;

        step3median.setText("= "+ l +" + "+ solvebreaket + " * "+ i);

        //set final answer:

        float ans = (solvebreaket * i)+ l ;
        answerofmedian.setText(Float.toString(ans));
    }

    public void mode(View view)
    {

        if(Float.parseFloat(f1.getText().toString()) >= Float.parseFloat(f2.getText().toString()) &&
                Float.parseFloat(f1.getText().toString()) >= Float.parseFloat(f3.getText().toString()) &&
                Float.parseFloat(f1.getText().toString()) >= Float.parseFloat(f4.getText().toString()) &&
                Float.parseFloat(f1.getText().toString()) >= Float.parseFloat(f5.getText().toString()) )
        {
            modeoffl=Float.parseFloat(ci1.getText().toString());
            modeoff1=Float.parseFloat(f1.getText().toString());
            modeoff0=Float.parseFloat(f5.getText().toString());
            modeoff2=Float.parseFloat(f2.getText().toString());
        }

        else if(Float.parseFloat(f2.getText().toString()) >= Float.parseFloat(f1.getText().toString()) &&
                Float.parseFloat(f2.getText().toString()) >= Float.parseFloat(f3.getText().toString()) &&
                Float.parseFloat(f2.getText().toString()) >= Float.parseFloat(f4.getText().toString()) &&
                Float.parseFloat(f2.getText().toString()) >= Float.parseFloat(f5.getText().toString()) )
        {
            modeoffl=Float.parseFloat(ci2.getText().toString());
            modeoff1=Float.parseFloat(f2.getText().toString());
            modeoff0=Float.parseFloat(f1.getText().toString());
            modeoff2=Float.parseFloat(f3.getText().toString());
        }

        else if(Float.parseFloat(f3.getText().toString()) >= Float.parseFloat(f1.getText().toString()) &&
                Float.parseFloat(f3.getText().toString()) >= Float.parseFloat(f2.getText().toString()) &&
                Float.parseFloat(f3.getText().toString()) >= Float.parseFloat(f4.getText().toString()) &&
                Float.parseFloat(f3.getText().toString()) >= Float.parseFloat(f5.getText().toString()) )
        {
            modeoffl=Float.parseFloat(ci3.getText().toString());
            modeoff1=Float.parseFloat(f3.getText().toString());
            modeoff0=Float.parseFloat(f2.getText().toString());
            modeoff2=Float.parseFloat(f4.getText().toString());
        }

        else if(Float.parseFloat(f4.getText().toString()) >= Float.parseFloat(f1.getText().toString()) &&
                Float.parseFloat(f4.getText().toString()) >= Float.parseFloat(f2.getText().toString()) &&
                Float.parseFloat(f4.getText().toString()) >= Float.parseFloat(f3.getText().toString()) &&
                Float.parseFloat(f4.getText().toString()) >= Float.parseFloat(f5.getText().toString()) )
        {
            modeoffl=Float.parseFloat(ci4.getText().toString());
            modeoff1=Float.parseFloat(f4.getText().toString());
            modeoff0=Float.parseFloat(f3.getText().toString());
            modeoff2=Float.parseFloat(f5.getText().toString());
        }

        else if(Float.parseFloat(f5.getText().toString()) >= Float.parseFloat(f1.getText().toString()) &&
                Float.parseFloat(f5.getText().toString()) >= Float.parseFloat(f2.getText().toString()) &&
                Float.parseFloat(f5.getText().toString()) >= Float.parseFloat(f3.getText().toString()) &&
                Float.parseFloat(f5.getText().toString()) >= Float.parseFloat(f4.getText().toString()) )
        {
            modeoffl=Float.parseFloat(ci5.getText().toString());
            modeoff1=Float.parseFloat(f5.getText().toString());
            modeoff0=Float.parseFloat(f4.getText().toString());
            modeoff2=Float.parseFloat(f1.getText().toString());
        }
        else {
            Toast.makeText(this, "Something wrong", Toast.LENGTH_SHORT).show();
        }

        //set i:
        i= Float.parseFloat(ci3.getText().toString()) - Float.parseFloat(ci2.getText().toString());

        //set formula:
        formulaformode.setText("Mode = l +     f1 - f0     * i \n            ---------------\n             2f1 - f0 - f2");

        //set step2:
        step2mode.setText("= "+modeoffl+" +        "+modeoff1+" - "+modeoff0+"        * "+i+" \n                   ---------------------\n                2("+modeoff1+") - "+modeoff0+" - "+modeoff2);

        //set step3:
        float toppart = modeoff1 - modeoff0;
        float bottompart = (common*modeoff1) - modeoff0 - modeoff2;
        float bothpart = toppart/bottompart;

        step3mode.setText("= " + modeoffl + " + " + bothpart + " * " + i);

        //set final answer:

        float ans=(bothpart * i) + modeoffl;
        answerofmode.setText(Float.toString(ans));
    }

}
