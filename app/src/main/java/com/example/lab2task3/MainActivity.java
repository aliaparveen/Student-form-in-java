package com.example.lab2task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed_name=findViewById(R.id.editTextText_name);
        EditText ed_father_name=findViewById(R.id.editTextText_fathername);
        EditText ed_dateofbirth=findViewById(R.id.editTextText_dateofbirth);
        RadioGroup rg_gender=findViewById(R.id.rg_gender);


        TextView tv_name=findViewById(R.id.txt_name);
        TextView tv_fathername=findViewById(R.id.txt_fathername);
        TextView tv_dateofbirth=findViewById(R.id.txt_dateofbirth);
        TextView tv_gender=findViewById(R.id.txt_gender);

        Button submitbtn=findViewById(R.id.button_submit);



        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=ed_name.getText().toString();
                String fathername=ed_father_name.getText().toString();
                String dateofbirth=ed_dateofbirth.getText().toString();
                RadioButton rbgender=findViewById(rg_gender.getCheckedRadioButtonId());



                if(name.isEmpty()){
                    ed_name.setError("Name must be filled");
                }else if(fathername.isEmpty()){
                    ed_father_name.setError("Father name must be filled");
                }else if(dateofbirth.isEmpty()){
                    ed_dateofbirth.setError("Must be enter date of birth");
                }else{
                    tv_name.setText("Name: "+name);
                    tv_fathername.setText("Father Name: "+fathername);
                    tv_dateofbirth.setText("Date of birth: "+dateofbirth);
                    tv_gender.setText("Gender: "+rbgender.getText());
                }



            }
        });



    }
}