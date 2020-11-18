package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        populateContacts(contacts);

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            contactsRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        }
        else
        {
            contactsRecView.setLayoutManager(new LinearLayoutManager(this));
        }

        //contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void populateContacts(ArrayList<Contact> contacts) {
        contacts.add(new Contact("Darrin Barton", "test@test.com", "https://images.pexels.com/photos/62307/air-bubbles-diving-underwater-blow-62307.jpeg"));
        contacts.add(new Contact("John Rossel", "test@dsd.com", "https://images.pexels.com/photos/38238/maldives-ile-beach-sun-38238.jpeg"));
        contacts.add(new Contact("Mary Collins", "lokd14@ed343.com", "https://images.pexels.com/photos/158827/field-corn-air-frisch-158827.jpeg"));
        contacts.add(new Contact("Josh Brolly", "deet@gmail.com", "https://images.pexels.com/photos/302804/pexels-photo-302804.jpeg"));
        contacts.add(new Contact("David Hanssen", "fidk@hotmail.com", "https://images.pexels.com/photos/1038914/pexels-photo-1038914.jpeg"));
        contacts.add(new Contact("Michael Moore", "dmoore@google.com", "https://images.pexels.com/photos/414645/pexels-photo-414645.jpeg"));
        contacts.add(new Contact("Jack London", "ql.der@honey.com", "https://images.pexels.com/photos/1038002/pexels-photo-1038002.jpeg"));
    }
}