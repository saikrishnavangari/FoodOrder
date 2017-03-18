package retailing.impulse.com.foodorder;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by krrish on 18/03/2017.
 */

public class WelcomeFragment extends Fragment {
    public static final String LOG_TAG=WelcomeFragment.class.getSimpleName();
    @BindView(R.id.order_button)
    Button orderButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.order_button)
    public void orderButtonClicked(){
        Log.d(LOG_TAG,"orderbuttonClicked");
        Activity activity=getActivity();
        OptionsFragment optionsFragment=new OptionsFragment();
        FragmentTransaction transaction = activity.getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
        transaction.replace(R.id.fragment_container, optionsFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
    }



}
