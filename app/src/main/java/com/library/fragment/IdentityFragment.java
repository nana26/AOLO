package com.library.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.library.activity.R;
import com.library.activity.R.layout;
import com.library.activity.StartActivity;

public class IdentityFragment extends Fragment {

	private ImageView iv_add;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(layout.fragment_identity,
				container, false);
		iv_add = (ImageView) view.findViewById(R.id.iv_add);

		// 点击右边显示
		iv_add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent it =new Intent(getActivity(), StartActivity.class);
				startActivity(it);
			}

		});

		return view;
	}

}
