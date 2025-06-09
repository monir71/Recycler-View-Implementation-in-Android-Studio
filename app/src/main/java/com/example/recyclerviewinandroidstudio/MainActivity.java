package com.example.recyclerviewinandroidstudio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView rView = findViewById(R.id.recyclerView);
        rView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ContactModel> contactList = new ArrayList<>();
        contactList.add(new ContactModel(R.drawable.facephoto, "Mizanur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto1, "Hamidur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto2, "Tajur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto3, "Amanur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto, "Jahidur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto1, "Shabnur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto2, "Siratur Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto3, "Anjala Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto, "Shuvo Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto1, "Fahim Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto2, "Faisal Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto3, "Shohagh Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto, "Masum Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto1, "Firoz Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto2, "Afzal Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto3, "Mirajul Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto, "Hanif Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto1, "Tipu Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto2, "Rabbi Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto3, "Imran Rahman", "01710389323"));
        contactList.add(new ContactModel(R.drawable.facephoto, "Shakib Rahman", "01710389323"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, contactList);
        rView.setAdapter(adapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}