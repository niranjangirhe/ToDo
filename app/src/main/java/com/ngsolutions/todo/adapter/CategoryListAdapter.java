package com.ngsolutions.todo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.ngsolutions.todo.R;
import com.ngsolutions.todo.model.Category;
import com.squareup.picasso.Picasso;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder>{
    private Category[] categories;


    public CategoryListAdapter(Category[] categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View categoryItem = layoutInflater.inflate(R.layout.list_category_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(categoryItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Category category = categories[position];
        holder.categoryTitle.setText(categories[position].getCategoryTitle());
        Picasso
                .get()
                .load(category.getImageUrl())
                .into(holder.categoryIcon);
    }

    @Override
    public int getItemCount() {
        return categories.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView categoryIcon;
        public TextView categoryTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            this.categoryIcon = (ImageView) itemView.findViewById(R.id.imageview_category_icon_mainpage);
            this.categoryTitle = (TextView) itemView.findViewById(R.id.textview_category_tile_mainpage);
        }
    }
}
