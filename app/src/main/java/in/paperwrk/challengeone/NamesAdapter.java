package in.paperwrk.challengeone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.ViewHolder>{

    private ArrayList<NameModel> arrayList;

    NamesAdapter(ArrayList<NameModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public NamesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NameModel names = arrayList.get(position);
        holder.textName.setText(names.getNames());
        Picasso.get().load(names.getImageUrls()).resize(150,150).centerCrop().into(holder.imageView);
    }

    /*
       TODO: Return the size of your dataset (arrayList)
    */
    @Override
    public int getItemCount() {
        if(arrayList!=null)
            return arrayList.size();
        else
            return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        Context mContext;

        //TODO: Init the Text View

        @BindView(R.id.title)
        TextView textName;

        @BindView(R.id.imageView)
        ImageView imageView;

        ViewHolder(View itemView){
            super(itemView);
            mContext = itemView.getContext();
            // TODO:  Butterknife.bind() https://teamtreehouse.com/community/binding-widgets-in-viewholder-with-butterknife;
            ButterKnife.bind(this,itemView);
        }
    }

}