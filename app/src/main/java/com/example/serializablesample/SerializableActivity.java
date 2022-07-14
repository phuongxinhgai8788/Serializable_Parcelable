package com.example.serializablesample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class SerializableActivity extends BaseActivity {

    EditText nameEditText, ageEditText, phoneEditText;
    Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serializable);
        nameEditText = findViewById(R.id.name);
        ageEditText = findViewById(R.id.age);
        phoneEditText = findViewById(R.id.phone_number);
        submitBtn = findViewById(R.id.submit_btn);
    }

    @Override
    protected void onStart() {
        super.onStart();
        submitBtn.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            int age = Integer.parseInt(ageEditText.getText().toString());
            String phoneNumber = phoneEditText.getText().toString();
            Employee employee = new Employee(name, age, phoneNumber);
            Intent intent = new Intent(SerializableActivity.this, SerializableActivity2.class);
            intent.putExtra("employee", employee);
            startActivity(intent);
        });
            }
}