package com.example.serializablesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ParcelableActivity extends BaseActivity {

    private EditText accountET, nameET, yearET;
    private Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        accountET = findViewById(R.id.account);
        nameET = findViewById(R.id.name);
        yearET = findViewById(R.id.year_of_birth);
        submitBtn = findViewById(R.id.submit_btn);
    }

    @Override
    protected void onStart() {
        super.onStart();

        submitBtn.setOnClickListener(v -> {
            String account = accountET.getText().toString();
            String name = nameET.getText().toString();
            int yearOfBirth = Integer.parseInt(yearET.getText().toString());
            Trainee trainee = new Trainee(account, name, yearOfBirth);
            Intent intent = new Intent(ParcelableActivity.this, ParcelableActivity2.class);
            intent.putExtra("trainee", trainee);
            startActivity(intent);
        });
    }
}