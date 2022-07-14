package com.example.serializablesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ParcelableActivity2 extends BaseActivity {

    private TextView accountTV, nameTV, yearOfBirthTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable2);

        accountTV = findViewById(R.id.account_tv);
        nameTV = findViewById(R.id.name_tv);
        yearOfBirthTV = findViewById(R.id.year_of_birth_tv);


        Intent intent = getIntent();
        Trainee trainee = intent.getParcelableExtra("trainee");
        String account = trainee.getAccount();
        String name = trainee.getName();
        int yearOfBirth = trainee.getYearOfBirth();
        accountTV.setText(account);
        nameTV.setText(name);
        yearOfBirthTV.setText(yearOfBirth+"");
    }
}