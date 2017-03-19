package retailing.impulse.com.foodorder;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import retailing.impulse.com.foodorder.adapters.CoffeeTypeAdapter;

/**
 * Created by krrish on 18/03/2017.
 */

public class MenuList extends AppCompatActivity implements CoffeeTypeAdapter.ListItemClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menulist_container);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CoffeeOrderFragment fragment = new CoffeeOrderFragment();
        fragmentTransaction.add(R.id.menulist_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onItemListClicked(int clickedItemPosition) {
        Toast.makeText(this, "you have clicked " + String.valueOf(clickedItemPosition), Toast.LENGTH_LONG).show();
    }
}
