Model

```
package com.example.recyclerviewinandroidstudio;

public class ContactModel {
    int img;
    String name, number;
    public ContactModel(int img, String name, String number){
        this.img = img;
        this.name = name;
        this.number = number;
    }
}
```

Adapter

```
package com.example.recyclerviewinandroidstudio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModel> contactList;
    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> contactList)
    {
        this.context = context;
        this.contactList = contactList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgView.setImageResource(contactList.get(position).img);
        holder.txtViewName.setText(contactList.get(position).name);
        holder.txtViewNumber.setText(contactList.get(position).number);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtViewName, txtViewNumber;
        ImageView imgView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtViewName = itemView.findViewById(R.id.txtViewName);
            txtViewNumber = itemView.findViewById(R.id.txtViewNumber);
            imgView = itemView.findViewById(R.id.imgView);

        }

    }
}
```

MainActivity.java File:

```
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
```
