package com.example.mehdi.stackoverflow.Adapter;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mehdi.stackoverflow.Pojos.Item;

import com.example.mehdi.stackoverflow.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
public class StackOverFlowAdapter extends RecyclerView.Adapter<StackOverFlowAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;
//    private PostItemListener mItemListener;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTv,name,tags;
        public ImageView avatar;
        public LinearLayout Rl;


//        PostItemListener mItemListener;

        public ViewHolder(View itemView) {

            super(itemView);
            titleTv =  itemView.findViewById(R.id.title);
            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.name);
            //tags=itemView.findViewById(R.id.tags);
            Rl = itemView.findViewById(R.id.layout);



//            this.mItemListener = postItemListener;
//            itemView.setOnClickListener(this);
        }

//        @Override
//        public void onClick(View view) {
//            Item item = getItem(getAdapterPosition());
////            this.mItemListener.onPostClick(item.getQuestionId());
//
//            notifyDataSetChanged();
//        }
    }

    public StackOverFlowAdapter(Context context, List<Item> posts) {
        mItems = posts;
        mContext = context;
//        mItemListener = itemListener;
    }

    @Override
    public StackOverFlowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View postView = inflater.inflate(R.layout.row_default, parent, false);



        ViewHolder viewHolder = new ViewHolder(postView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StackOverFlowAdapter.ViewHolder holder, int position) {




        Item item = mItems.get(position);
//        TextView textView = holder.titleTv;
//        textView.setText(item.getOwner().getDisplayName());
        holder.titleTv.setText(item.getTitle());




        Picasso.with(mContext)
                .load(item.getOwner().getProfileImage())
                .into(holder.avatar);

        holder.name.setText(item.getOwner().getDisplayName());






        for (String s:item.getTags()
             ){


            LinearLayout.LayoutParams lprams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            TextView textView = new TextView(mContext);
            textView.setLayoutParams(lprams);
            textView.setText("#"+s);
            holder.Rl.addView(textView);


        }



    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public void updateAnswers(List<Item> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    private Item getItem(int adapterPosition) {
        return mItems.get(adapterPosition);
    }

//    public interface PostItemListener {
//        void onPostClick(long id);
//    }
}