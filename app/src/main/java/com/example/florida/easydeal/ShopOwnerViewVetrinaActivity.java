package com.example.florida.easydeal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.roacult.backdrop.BackdropLayout;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShopOwnerViewVetrinaActivity extends AppCompatActivity {

    //Declarations
    private BackdropLayout mBackDropLayout;
    private View mFrontLayout,mBackLayout;
    private RecyclerView mRecyclerView;
    private ShopOwnerVetrinaRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<AProduct> mProductList;
    private CircleImageView profileCircleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_owner_view_vetrina);

        //initializations
        profileCircleImageView=findViewById(R.id.profile_circular_image);
        mBackDropLayout=findViewById(R.id.back_drop);
        mFrontLayout=mBackDropLayout.getChildAt(0);
        mBackLayout=mBackDropLayout.getChildAt(1);
        mRecyclerView=findViewById(R.id.recycler_view);
        mProductList=new ArrayList<>();
        mLayoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.geeky));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.lion));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.onlineshopi));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.geeky));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.geeky));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.lion));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.onlineshopi));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.geeky));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.geeky));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.lion));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.onlineshopi));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.geeky));
        mProductList.add(new AProduct(99,"SHIRT",R.drawable.grand));

        mAdapter=new ShopOwnerVetrinaRecyclerViewAdapter(mProductList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        profileCircleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShopOwnerViewVetrinaActivity.this,ShopOwnerProfileActivity.class));
            }
        });

    }
}
