package info.emon.myscrolltab;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends FragmentActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =(ViewPager) findViewById(R.id.pagerID);

        FragmentManager fragmentManager = getSupportFragmentManager();
        customAdapter adapter = new customAdapter(fragmentManager);
        viewPager.setAdapter(adapter);


    }
}
class customAdapter extends FragmentStatePagerAdapter {

    public customAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if(position==0)
        {
            fragment = new FragmentOne();
        }
        else if(position==1)
        {
            fragment = new FragmentTwo();
        }
        else if(position==2)
        {
            fragment = new FragmentThree();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Tab 1";
        }
       else if(position==1)
        {
            return "Tab 2";
        }
       if(position==2)
       {
           return "Tab 3";
       }

    }
}