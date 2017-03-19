package retailing.impulse.com.foodorder;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class OptionsFragment extends Fragment{
    @BindView(R.id.coffee_button)
    Button coffee_button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_options,container,false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.coffee_button)
    public void coffeeButtonClicked() {
        Intent intent = new Intent(getActivity(), MenuList.class);
        startActivity(intent);
    }
}
