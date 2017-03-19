package retailing.impulse.com.foodorder;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retailing.impulse.com.foodorder.adapters.CoffeeTypeAdapter;

/**
 * Created by krrish on 18/03/2017.
 */

public class CoffeeOrderFragment extends Fragment {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private List<String> mCoffeeList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCoffeeList = new ArrayList<String>();
        mCoffeeList.add("Latte");
        mCoffeeList.add("Capuccino");
        mCoffeeList.add("Flatwhite");
        mCoffeeList.add("LongBlack");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.coffee_menulist, container, false);
        ButterKnife.bind(this, view);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new CoffeeTypeAdapter(getActivity(), mCoffeeList));
        return view;
    }
}
