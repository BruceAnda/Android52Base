package zhaoliang.com.android52base.activity.day01.clickevent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import zhaoliang.com.android52base.R;
import zhaoliang.com.android52base.activity.base.BaseActivity;

/**
 * <pre>
 *     需求：点击事件的写法
 *     思路：
 *          1. 编写布局界面，在布局界面上布局四个按钮，分别用来实现不同点击事件的写法
 *          2. 给每一个按钮添加点击事件并实现点击事件
 * </pre>
 */
public class ClickEventActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtnClickTwo, mBtnClickThree, mBtnClickFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_event);

        mBtnClickTwo = (Button) findViewById(R.id.btn_click_two);
        mBtnClickThree = (Button) findViewById(R.id.btn_click_three);
        mBtnClickFour = (Button) findViewById(R.id.btn_click_four);

        mBtnClickTwo.setOnClickListener(this);
        mBtnClickThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClickEventActivity.this, "第三种点击事件的写法", Toast.LENGTH_SHORT).show();
            }
        });
        mBtnClickFour.setOnClickListener(new MyClickListener());
    }

    public void click(View view) {
        Toast.makeText(this, "第一种点击事件的写法", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "第二种点击事件的写法", Toast.LENGTH_SHORT).show();
    }

    class MyClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(ClickEventActivity.this, "第四种点击事件的写法", Toast.LENGTH_SHORT).show();
        }
    }
}
