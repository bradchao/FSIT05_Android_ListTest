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
    private LinkedList<HashMap<String,String>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        initListView();
    }

    private void initListView(){
        String[] from = {"brad"};
        int[] to = {R.id.item_title};
        data = new LinkedList<>();

        HashMap<String,String> r0 = new HashMap<>();
        r0.put(from[0], "Value1");
        data.add(r0);

        HashMap<String,String> r1 = new HashMap<>();
        r1.put(from[0], "Value2");
        data.add(r1);

        HashMap<String,String> r3 = new HashMap<>();
        r3.put(from[0], "Value1");
        data.add(r3);

        HashMap<String,String> r4 = new HashMap<>();
        r4.put(from[0], "Value2");
        data.add(r4);

        HashMap<String,String> r5 = new HashMap<>();
        r5.put(from[0], "Value1");
        data.add(r5);

        HashMap<String,String> r6 = new HashMap<>();
        r6.put(from[0], "Value2");
        data.add(r6);

        HashMap<String,String> r7 = new HashMap<>();
        r7.put(from[0], "Value1");
        data.add(r7);

        HashMap<String,String> r8 = new HashMap<>();
        r8.put(from[0], "Value2");
        data.add(r8);

        HashMap<String,String> r9 = new HashMap<>();
        r9.put(from[0], "Value1");
        data.add(r9);

        HashMap<String,String> r10 = new HashMap<>();
        r10.put(from[0], "Value2");
        data.add(r10);

        simpleAdapter = new SimpleAdapter(
                this, data, R.layout.item,from, to);

        listView.setAdapter(simpleAdapter);
    }

}
