package retailing.impulse.com.foodorder.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retailing.impulse.com.foodorder.R;

/**
 * Created by krrish on 18/03/2017.
 */

public class CoffeeTypeAdapter extends RecyclerView.Adapter<CoffeeTypeAdapter.ViewHolder> {
    public static final String LOG_TAG = CoffeeTypeAdapter.class.getSimpleName();
    private Context mContext;
    private List<String> mCoffeeList;

    public CoffeeTypeAdapter(Context context, List<String> CoffeeTypeList) {
        mContext = context;
        mCoffeeList = CoffeeTypeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_listitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(LOG_TAG, mCoffeeList.get(position));
        holder.coffee_type.setText(mCoffeeList.get(position));
    }

    @Override
    public int getItemCount() {
        return mCoffeeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public
        @BindView(R.id.coffee_type)
        Button coffee_type;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "Youclicked a Button", Toast.LENGTH_LONG).show();
        }
    }
}
