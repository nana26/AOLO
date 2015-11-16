package com.library.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.library.activity.R;

/**
 * Created by joseph on 15/11/15.
 */
public class RecodeFragment extends Fragment {
    private View parentView;
    private ImageView iv_add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.fragment_recode, container,
                false);
        iv_add = (ImageView) parentView.findViewById(R.id.iv_add);

        // 点击右边显示
        iv_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//


            }

        });

        return parentView;
    }

}
