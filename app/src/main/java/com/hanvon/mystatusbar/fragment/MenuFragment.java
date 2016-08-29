package com.hanvon.mystatusbar.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hanvon.mystatusbar.MainActivity;
import com.hanvon.mystatusbar.R;
import com.hanvon.mystatusbar.utils.CircleImageView;
import com.hanvon.mystatusbar.utils.LogUtil;


/**
 * Created by baiheng222 on 16-3-15.
 */
public class MenuFragment extends BaseFragment implements View.OnClickListener {
    private final String TAG = "MenuFragment";

    private CircleImageView mIvLogin;
    private TextView TVusername;
    private TextView TVnickname;
    private RelativeLayout mRlOcr;
    private RelativeLayout mRlFile;
    private RelativeLayout mRlOrders;
    private RelativeLayout mRlSettings;
    private TextView mVersion;


    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);

        mIvLogin = (CircleImageView) view.findViewById(R.id.iv_login_icon);
        mIvLogin.setOnClickListener(this);

        TVusername = (TextView) view.findViewById(R.id.ivUserName);
        TVnickname = (TextView) view.findViewById(R.id.ivhvnUserName);

        mRlOcr = (RelativeLayout) view.findViewById(R.id.rl_ocr);
        mRlFile = (RelativeLayout) view.findViewById(R.id.rl_file);
        mRlOrders = (RelativeLayout) view.findViewById(R.id.rl_orders);
        mRlSettings = (RelativeLayout) view.findViewById(R.id.rl_settings);

        mVersion = (TextView) view.findViewById(R.id.tv_version);
        try
        {
            mVersion.setText("Version" + getCurVersion());
            LogUtil.i("********Version:"+getCurVersion());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        mRlOcr.setOnClickListener(this);
        mRlFile.setOnClickListener(this);
        mRlOrders.setOnClickListener(this);
        mRlSettings.setOnClickListener(this);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.iv_login_icon:

                break;
            case R.id.rl_orders:

                break;

            case R.id.rl_file:

            case R.id.rl_settings:

            break;

            case R.id.rl_ocr:

            break;
        }
    }





    private String getCurVersion() throws Exception
    {
        PackageManager packageManager = getActivity().getPackageManager();
        PackageInfo packInfo = packageManager.getPackageInfo(getActivity().getPackageName(), 0);
        return packInfo.versionName;
    }
}
