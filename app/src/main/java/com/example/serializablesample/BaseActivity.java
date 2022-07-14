package com.example.serializablesample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.serializable:
                Intent intent01 = new Intent(BaseActivity.this, SerializableActivity.class);
                startActivity(intent01);
                return true;
            case R.id.parcelable:
                Intent intent02 = new Intent(BaseActivity.this, ParcelableActivity.class);
                startActivity(intent02);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}