package com.example.cloudnovamobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        Button addTaskBtn = findViewById(R.id.btn_add_task);
        Button viewTasksBtn = findViewById(R.id.btn_view_tasks);
        Button settingsBtn = findViewById(R.id.btn_settings);

        addTaskBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddTaskActivity.class));
        });

        viewTasksBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, TaskDetailActivity.class));
        });

        settingsBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        });

    }
}