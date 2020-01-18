package com.adteccorp.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hbb20.CountryCodePicker;

public class CountryCodePickerdata extends AppCompatActivity {
    EditText editText;
    Button getpn;
   private CountryCodePicker ccp;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_country_code_picker );
        init();
    }
    public void init(){
        editText =findViewById( R.id.etphonenumber);
        getpn =findViewById( R.id.gpnbtn );
        tv=findViewById( R.id.tvpn );
        ccp =findViewById( R.id.ccpickerid );
        //onclick the button
        getpn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getphnnumber();
            }

            private void getphnnumber() {
                String phonenumber = ccp.getFullNumber()+editText.getText().toString();
                tv.setText( phonenumber );
            }
        } );

    }
}
