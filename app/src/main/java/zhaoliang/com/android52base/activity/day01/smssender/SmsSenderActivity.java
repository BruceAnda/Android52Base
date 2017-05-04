package zhaoliang.com.android52base.activity.day01.smssender;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

import zhaoliang.com.android52base.R;

/**
 * <pre>
 *     需求：短信发送器
 *     思路：
 *          1. 编写布局界面，在布局界面上布局一个EditText输入电话号码和一个EditText输入短信内容和一个Button发送短信
 *          2. 给按钮添加点击事件
 *          3. 实现按钮点击事件发送短信
 *          4. 添加发送短信的权限
 * </pre>
 */
public class SmsSenderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_sender);
    }

    /**
     * 点击发送按钮调用这个方法
     *
     * @param view
     */
    public void sendSms(View view) {
        // 1. 获取电话号码和短信内容
        String phoneNum = ((EditText) findViewById(R.id.et_phone_num)).getText().toString();
        String smsContent = ((EditText) findViewById(R.id.et_sms_content)).getText().toString();
        // 2. 获取发送短信的api
        SmsManager smsManager = SmsManager.getDefault();
        // 3. 发送短信
        smsManager.sendMultipartTextMessage(phoneNum, null, smsManager.divideMessage(smsContent), null, null);
    }
}
