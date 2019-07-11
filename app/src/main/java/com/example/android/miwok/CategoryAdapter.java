package com.example.android.miwok;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {


    public CategoryAdapter(FragmentManager fm) {
        // Required empty public constructor
        super(fm);
    }

    //abstract method of super class i.e Fragment class
    public Fragment getItem(int position){
        if(position == 0){
            return new NumbersFragment();
        } else if(position == 1){
            return new ColorsFragment();
        } else if(position == 2){
            return new FamilyFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    //abstract method of super class i.e Fragment class
    public int getCount(){
        return 4;
    }

    public String getPageTitle(int position){
        if(position == 0){
            return "Numbers";
        } else if(position == 1){
            return "Colors";
        } else if(position == 2){
            return "Family";
        } else {
            return "Phrases";
        }
    }
}
