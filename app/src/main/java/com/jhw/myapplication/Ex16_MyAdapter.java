package com.jhw.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Ex16_MyAdapter extends FragmentStateAdapter {

    public int mCount;

    public Ex16_MyAdapter(FragmentActivity fa, int count) {
        super(fa);
        mCount = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        if(index==0) return new Ex16_Fragment_0();
        else if(index==1) return new Ex16_Fragment_1();
        else if(index==2) return new Ex16_Fragment_2();
        else if(index==3) return new Ex16_Fragment_3();
        else return new Ex16_Fragment_4();
    }

    @Override
    public int getItemCount() {
        return 2000;
    }

    public int getRealPosition(int position) { return position % mCount; }

}