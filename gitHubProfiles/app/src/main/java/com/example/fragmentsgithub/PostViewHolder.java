package com.example.fragmentsgithub;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgAvatar;
    private TextView mTvName;
    private TextView mTvLogin;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        imgAvatar=itemView.findViewById(R.id.avatarImage);
        mTvName=itemView.findViewById(R.id.tvName);
        mTvLogin=itemView.findViewById(R.id.tvLogin);
    }
    public void setData(ResponseModel responseModel){
        Glide.with(imgAvatar).load(responseModel.getOwner().getAvatarUrl()).into(imgAvatar);
        mTvName.setText(responseModel.getName());
        mTvLogin.setText(responseModel.getOwner().getLogin());
    }
}
