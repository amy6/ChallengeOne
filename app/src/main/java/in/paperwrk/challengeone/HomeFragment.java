package in.paperwrk.challengeone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ButterKnife.bind(this,view);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        // TODO: Call the load data method and populate the RV
        loadData();

        return view;
    }

    private void loadData(){
        ArrayList<NameModel> mArrayList = new ArrayList<>();
        for(int i=0; i< CustomData.name.length; i++){
            mArrayList.add(new NameModel(CustomData.name[i],CustomData.urls[i]));
        }
        NamesAdapter adapter = new NamesAdapter(mArrayList);
        // TODO: Set the adapter to the recycler view
        mRecyclerView.setAdapter(adapter);
    }

}