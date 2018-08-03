package in.paperwrk.challengeone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;

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
    }

    /*
       TODO: Return the size of your dataset (arrayList)
    */
    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        Context mContext;

        //TODO: Init the Text View

        /*@BindView(R.id.title)
        TextView textName;*/

        ViewHolder(View itemView){
            super(itemView);
            mContext = itemView.getContext();
            // TODO:  Butterknife.bind() https://teamtreehouse.com/community/binding-widgets-in-viewholder-with-butterknife;

        }
    }

}