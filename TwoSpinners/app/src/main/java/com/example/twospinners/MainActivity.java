package com.example.twospinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp1,sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> joblist = new ArrayList<String>();


        joblist.add("Programmer");
        joblist.add("Accountant");
        joblist.add("Manager");
        joblist.add("App Developer");
        joblist.add("Data Scientist");
        joblist.add("Engineer");

        sp1=findViewById(R.id.jobspin);

        ArrayAdapter<String> jobAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,joblist);


        jobAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);


        sp1.setAdapter(jobAdapter);
        sp1.setOnItemSelectedListener(this);

        List<String> qualification = new ArrayList<String>();
        qualification.add("PHD");
        qualification.add("Masters");
        qualification.add("Bachelors");
        qualification.add("High School");
        qualification.add("Certificate");
        qualification.add("Diploma");

        sp2=findViewById(R.id.qualspin);

        ArrayAdapter<String> qualAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,qualification);


        qualAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        sp2.setAdapter(qualAdapter);
        sp2.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        //if (v.getId() == R.id.jobspin) {

            List<String> sal = new ArrayList<String>();
            sal.add("60,000");
            sal.add("65,000");
            sal.add("90,000");
            sal.add("80,000");
            sal.add("95,000");
            sal.add("76,000");

            EditText et = findViewById(R.id.salary);
            et.setText(sal.get(position));
        }

        //else if(v.getId()==R.id.qualspin)
//        {
//            List<String> netsal = new ArrayList<String>();
//            netsal.add("15,000");
//            netsal.add("10,000");
//            netsal.add("45,000");
//            netsal.add("40,000");
//            netsal.add("80,000");
//            netsal.add("70,000");
//
//            EditText et = findViewById(R.id.netsalary);
//            et.setText(netsal.get(position));
//        }
  //  }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
