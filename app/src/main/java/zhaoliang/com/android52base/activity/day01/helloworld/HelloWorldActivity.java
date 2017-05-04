package zhaoliang.com.android52base.activity.day01.helloworld;

import android.app.Activity;
import android.os.Bundle;

import zhaoliang.com.android52base.R;

/**
 * <pre>
 *     需求：在屏幕上显示HelloWorld的字样
 *     思路：
 *          1. 编写布局文件，在布局文件中放一个TextView显示HelloWorld的字样
 * </pre>
 */
public class HelloWorldActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }
}
