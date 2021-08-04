package com.example.viewpagerwithtabs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FragmentAdapter  extends RecyclerView.Adapter<ViewHAolderClass> {


    private List<Model> modelList;

    public FragmentAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }




    @NonNull
    @Override
    public ViewHAolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new ViewHAolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHAolderClass holder, int position) {
        Model model = modelList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
