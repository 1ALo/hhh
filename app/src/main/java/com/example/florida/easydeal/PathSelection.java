package com.example.florida.easydeal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PathSelection extends AppCompatActivity {
      //Views Declerations
    Button mShopperButton;
    Button mShopOwnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_selection);

        //Initializations
        mShopOwnerButton=findViewById(R.id.shop_owner_button);
        mShopperButton=findViewById(R.id.shopper_button);


        //onClick Events
        mShopOwnerButton.setOnClickListener
                (View -> startActivity(new Intent(PathSelection.this,ShopOwnerSignUp.class)));

        mShopperButton.setOnClickListener
                (View -> startActivity(new Intent(PathSelection.this,ShopOwnerViewVetrinaActivity.class)));

    }
}
