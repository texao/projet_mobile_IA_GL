package com.example.tp1devmobile;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CourseListActivity extends AppCompatActivity {

    private ListView listViewCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_activity);

        listViewCourses = findViewById(R.id.listCourses);

        String[] courses = {"Mathématiques", "Physique", "Informatique", "Histoire", "Biologie"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, courses);
        listViewCourses.setAdapter(adapter);
    }
}
