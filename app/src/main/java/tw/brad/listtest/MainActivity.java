package tw.brad.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SimpleAdapter simpleAdapter;
    private LinkedList<HashMap<String,Object>> data;

    private int[] imgs = {R.drawable.img0,R.drawable.img1,
            R.drawable.img2,R.drawable.img3,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        initListView();
    }

    private void initListView(){
        String[] from = {"title", "cont", "img"};
        int[] to = {R.id.item_title, R.id.item_content, R.id.item_img};
        data = new LinkedList<>();

        for (int i=0; i<100; i++){
            HashMap<String,Object> row = new HashMap<>();
            row.put(from[0], "title " + i);
            row.put(from[1], "content " + i);
            row.put(from[2], imgs[i%4]);
            data.add(row);
        }

        simpleAdapter = new SimpleAdapter(
                this, data, R.layout.item,from, to);

        listView.setAdapter(simpleAdapter);
    }

}
