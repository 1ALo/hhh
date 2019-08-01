package com.example.florida.easydeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ShopOwnerSignUp extends AppCompatActivity {
    //Declarations
    TextView goToSignInActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_owner_sign_up);

        //initializations
        goToSignInActivity=findViewById(R.id.sign_in_text_view);
        goToSignInActivity.setOnClickListener(v -> {
            startActivity(new Intent(ShopOwnerSignUp.this,ShopOwnerSignIn.class));
        });
    }
}
