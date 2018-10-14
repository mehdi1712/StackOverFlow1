
package com.example.mehdi.stackoverflow.Adapter;


        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.example.mehdi.stackoverflow.Pojos.Item;
        import com.example.mehdi.stackoverflow.Pojos.Stack;
        import com.example.mehdi.stackoverflow.R;

        import java.util.ArrayList;
        import java.util.List;

public class stackOverFlowAdapter1 extends RecyclerView.Adapter<stackOverFlowAdapter1.StackViewHolder> {

    Stack productList;

    public stackOverFlowAdapter1(Context context,Stack list) {

//        productList = new ArrayList<>();
        productList=list;

    }

    @NonNull
    @Override
    public StackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.row_default, parent, false);
        return new StackViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull StackViewHolder holder,int position) {

//        Stack product = productList.get(position);
        List<Item> items= productList.getItems();
        Item item = items.get(0);
      /*  if (product.getItems().get(position).getIsAnswered()) {

        }*/


//        holder.img.setImageResource(product.getImg());
//        holder.test.setImageResource(product.getTest());
        holder.title.setText(item.getTitle());
//        holder.tag.setText(product.getTags());


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class  StackViewHolder extends  RecyclerView.ViewHolder{

        ImageView img,test;
        TextView title,tag;

        public StackViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.avatar);

            title = itemView.findViewById(R.id.title);
            //tag = itemView.findViewById(R.id.tags);
        }
    }
}
