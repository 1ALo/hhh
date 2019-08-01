package com.example.florida.easydeal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopOwnerVetrinaRecyclerViewAdapter extends RecyclerView.Adapter<ShopOwnerVetrinaRecyclerViewAdapter.ProductViewHolder> {
       private ArrayList<AProduct> productsList;

    public ShopOwnerVetrinaRecyclerViewAdapter(ArrayList<AProduct> mProductList) {
        this.productsList=mProductList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext())
                  .inflate(R.layout.item_of_shop_owner_vetrina_recycler_view,parent,false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
       AProduct currentProduct=productsList.get(position);
       holder.mProductImage.setImageResource(currentProduct.getProductImageId());
       holder.mProductName.setText(currentProduct.getProductName());
       holder.mProductPrice.setText(currentProduct.getPrice()+" $");

    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView mProductImage;
        TextView mProductPrice;
        TextView mProductName;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            mProductImage=itemView.findViewById(R.id.recycler_view_product_image);
            mProductName=itemView.findViewById(R.id.recycler_view_product_name);
            mProductPrice=itemView.findViewById(R.id.recycler_view_product_price);
        }
    }
}
