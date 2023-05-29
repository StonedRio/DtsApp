package com.example.dts.adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.dts.BasicInfoFragment;
import com.example.dts.BusinessScopeFragment;
import com.example.dts.ContactInfoFragment;
import com.example.dts.FinancialInfoFragment;
import com.example.dts.LegalInfoFragment;
import com.example.dts.PhysicalResourcesFragment;
import com.example.dts.RemarksFragment;
import com.example.dts.UploadFilesFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter( FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new RemarksFragment();
            case 1:
                return new BasicInfoFragment();
            case 2:
                return new ContactInfoFragment();
            case 3:
                return new LegalInfoFragment();
            case 4:
                return new FinancialInfoFragment();
            case 5:
                return new PhysicalResourcesFragment();
            case 6:
                return new BusinessScopeFragment();
            case 7:
                return new UploadFilesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 8;
    }
}
