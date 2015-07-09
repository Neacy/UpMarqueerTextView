package neacy.upmarqueer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import neacy.library.UpMarqueeTextView;

public class MainActivity extends AppCompatActivity {

    private UpMarqueeTextView mMarqueeTextView;

    private String[] names = {"我的地盘.蒲公英的约定.给我一首歌的时间.说好的幸福呢.......", "我的地盘", "蒲公英的约定", "给我一首歌的时间", "说好的幸福呢"};
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMarqueeTextView = (UpMarqueeTextView) findViewById(R.id.marquee);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = names[index];
                index ++;
                if (index > 3) {
                    index = 0;
                }
                mMarqueeTextView.setText(text);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
