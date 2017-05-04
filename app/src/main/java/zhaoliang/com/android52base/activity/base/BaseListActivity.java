package zhaoliang.com.android52base.activity.base;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import zhaoliang.com.android52base.R;

/**
 * 列表基类
 */
public abstract class BaseListActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_list);

        mListView = (ListView) findViewById(R.id.list);
        mListView.setOnItemClickListener(this);
        mListView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv_content, getListData()));
    }

    /**
     * 填充列表数据
     *
     * @return
     */
    protected abstract String[] getListData();
}
