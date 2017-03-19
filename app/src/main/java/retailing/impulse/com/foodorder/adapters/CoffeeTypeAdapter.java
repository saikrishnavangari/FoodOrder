package retailing.impulse.com.foodorder.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retailing.impulse.com.foodorder.MenuList;
import retailing.impulse.com.foodorder.R;

/**
 * Created by krrish on 18/03/2017.
 */

public class CoffeeTypeAdapter extends RecyclerView.Adapter<CoffeeTypeAdapter.ViewHolder> {
    public static final String LOG_TAG = CoffeeTypeAdapter.class.getSimpleName();
    ListItemClickListener mListItemClickListener;
    private List<String> mCoffeeList;

    public CoffeeTypeAdapter(MenuList listener, List<String> CoffeeTypeList) {
        mListItemClickListener = listener;
        mCoffeeList = CoffeeTypeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(LOG_TAG, mCoffeeList.get(position));
        holder.coffee_type.setText(mCoffeeList.get(position));
        holder.coffee_type.setOnClickListener(holder);
    }

    @Override
    public int getItemCount() {
        return mCoffeeList.size();
    }

    public interface ListItemClickListener {
        void onItemListClicked(int clickedItemPosition);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.coffee_type)
        Button coffee_type;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onClick(View v) {
            Log.d(LOG_TAG, "inside on clicked method");
            mListItemClickListener.onItemListClicked(getAdapterPosition());
        }
    }
}
