package cn.trinea.android.demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import cn.trinea.android.demo.utils.AppUtils;

/**
 * BaseActivity
 * 
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2013-6-1
 */
public class BaseActivity extends Activity {

    protected Context context;

    protected void onCreate(Bundle savedInstanceState, int layoutResID) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResID);

        context = getApplicationContext();
        AppUtils.init(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                onBackPressed();
                return true;
            }
            case R.id.github: {
                AppUtils.urlOpen(context, getString(R.string.github_trinea));
                return true;
            }
        }
        return false;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
