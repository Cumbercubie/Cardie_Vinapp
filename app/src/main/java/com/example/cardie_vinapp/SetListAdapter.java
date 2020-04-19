package com.example.cardie_vinapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//Adapter sẽ có object thuộc class MyViewHolder
public class SetListAdapter extends RecyclerView.Adapter<SetListAdapter.MyViewHolder> {
    // Lấy ngữ cảnh hiện tại
    private Context mContext;
    //List chứa các CardSet để truyền vào RecyclerView - Customized Folder
    private List<CardSet> mData;


    public SetListAdapter(Context mContext, List<CardSet> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    // Tạo giấy tờ cho hồ sơ
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        // Tạo thiết kế cho giấy tờ
        view = mInflater.inflate(R.layout.activity_card_template,parent,false);
        //phương thức inflate tiến hành chuyển đổi từ xml -> View với các tham số
        //R.layout.activity_card_template: nội dung xml cần chuyển đổi
        // ViewGroup: parent - nơi Inflater thêm View vào
        // attachToRoot: false - không thêm ngay vào ViewGroup
        // Bỏ giấy tờ vào hồ sơ
        return new MyViewHolder(view);
    }

    // Truyền dữ liệu vào view ~ Điền thông tin vào hồ sơ
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int mDrawableName = mData.get(position).getSetImgUrl(); //R.drawable.bunny_Sweden
        Drawable d = ResourcesCompat.getDrawable(mContext.getResources(),mDrawableName,null);
        holder.set_card.setBackground(d);
        holder.set_title.setText(mData.get(position).getSetName());
    }
    //self-explanatory
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // Đây là các hồ sơ
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView set_title;
        TextView set_intro;
        CardView set_card;
        String set_img_url;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            set_title =  itemView.findViewById(R.id.SetTitle);
            set_card =  itemView.findViewById(R.id.SetView);
        }
    }
}
