package com.example.usefragmentfordinamiccreation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    public Button dynamicButton;
    public LinearLayout llcustomadd;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        dynamicButton = findViewById(R.id.btn);
        llcustomadd = findViewById(R.id.llcustomadd);
        dynamicButton.setOnClickListener(v -> AddComponents());
    }

    @SuppressLint("ResourceType")
    public  void AddComponents(){
        transaction = manager.beginTransaction();
        CustomFragment fragment = new CustomFragment();
        transaction.add(R.id.container, fragment);
        transaction.commit();
    }
}