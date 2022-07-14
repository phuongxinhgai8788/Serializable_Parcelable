package com.example.serializablesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SerializableActivity2 extends BaseActivity {

    TextView nameTV, ageTV, phoneTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serializable2);
        nameTV = findViewById(R.id.name_tv);
        ageTV = findViewById(R.id.age_tv);
        phoneTV = findViewById(R.id.phone_number_tv);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        Employee employee = (Employee) intent.getSerializableExtra("employee");
        nameTV.setText(employee.getName());
        ageTV.setText(employee.getAge()+"");
        phoneTV.setText(employee.getPhoneNumber());
    }
}