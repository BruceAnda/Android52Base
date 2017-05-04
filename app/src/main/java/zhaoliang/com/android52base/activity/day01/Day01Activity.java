package zhaoliang.com.android52base.activity.day01;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import zhaoliang.com.android52base.R;
import zhaoliang.com.android52base.activity.base.BaseListActivity;
import zhaoliang.com.android52base.activity.day01.clickevent.ClickEventActivity;
import zhaoliang.com.android52base.activity.day01.helloworld.HelloWorldActivity;
import zhaoliang.com.android52base.activity.day01.phonedialer.PhoneDialerActivity;
import zhaoliang.com.android52base.activity.day01.smssender.SmsSenderActivity;

/**
 * Day01列表
 */
public class Day01Activity extends BaseListActivity {

    @Override
    protected String[] getListData() {
        return getResources().getStringArray(R.array.Day01);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, HelloWorldActivity.class);
                break;
            case 1:
                intent = new Intent(this, PhoneDialerActivity.class);
                break;
            case 2:
                intent = new Intent(this, SmsSenderActivity.class);
                break;
            case 3:
                intent = new Intent(this, ClickEventActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
