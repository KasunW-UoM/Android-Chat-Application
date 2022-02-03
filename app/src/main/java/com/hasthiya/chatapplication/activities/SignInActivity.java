package com.hasthiya.chatapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Toast;
//
//import com.google.firebase.firestore.FirebaseFirestore;
import com.hasthiya.chatapplication.databinding.ActivitySigninBinding;

//import java.util.HashMap;

public class SignInActivity extends AppCompatActivity {
    
    private ActivitySigninBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.textCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class)));

//        binding.buttonSignIn.setOnClickListener(v -> addDataToFirebase());
    }

//    Users Collection to firestore

//    private void addDataToFirebase(){
//        FirebaseFirestore database = FirebaseFirestore.getInstance();
//        HashMap<String,Object> data =new HashMap<>();
//
//        data.put("first_name","Kasun");
//        data.put("last_name","Weerasekara");
//
//        database.collection("users")
//                .add(data)
//                .addOnSuccessListener(documentReference -> {
//
//                    Toast.makeText(getApplicationContext(),"Data Inserted", Toast.LENGTH_SHORT).show();
//                })
//                .addOnFailureListener(exception ->{
//
//                    Toast.makeText(getApplicationContext(),exception.getMessage(),Toast.LENGTH_SHORT).show();
//
//               });
//
//    }
}