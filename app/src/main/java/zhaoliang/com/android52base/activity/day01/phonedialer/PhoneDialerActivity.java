package zhaoliang.com.android52base.activity.day01.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import zhaoliang.com.android52base.R;

/**
 * <pre>
 *     需求：电话拨号器
 *     思路：
 *          1. 编写布局文件，在布局文件中布局一个EditText用来填充电话号码和一个按钮用来拨打电话
 *          2. 给按钮添加点击事件
 *          3. 实现点击事件拨打电话
 *          4. 在AndroidManifest文件中添加拨打电话的权限
 * </pre>
 */
public class PhoneDialerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
    }

    /**
     * 拨打按钮点击调用这个方法
     *
     * @param view
     */
    public void callPhone(View view) {
        // 1. 获取电话号码
        String phoneNum = ((EditText) findViewById(R.id.et_phone_num)).getText().toString();
        // 2. 创建拨打电话的意图
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNum));
        // 3. 拨打电话
        startActivity(intent);
    }
}
