package com.wang.zhihai.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String APPLE = "Apple";
    private static final String BANANA = "Banana";
    private static final String CHERRY = "Cherry";
    private static final String GRAPE = "Grape";
    private static final String MANGO = "Mango";
    private static final String ORANGE = "Orange";
    private static final String PINEAPPLE = "Pineapple";
    private static final String STRAWBERRY = "Strawberry";
    private static final String WATERMELON = "Watermelon";


    private List<Fruit> fruitList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                String url;
                Intent intent;
                switch (fruit.getFruitName()) {
                    case APPLE:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E8%8B%B9%E6%9E%9C/5670";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case BANANA:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E9%A6%99%E8%95%89/150475";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case GRAPE:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E8%91%A1%E8%90%84/1116";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case CHERRY:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E6%A8%B1%E6%A1%83/338";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case MANGO:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E8%8A%92%E6%9E%9C/31490";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case ORANGE:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E6%A9%99%E5%AD%90/237";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case PINEAPPLE:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E8%8F%A0%E8%90%9D";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case STRAWBERRY:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E8%8D%89%E8%8E%93/32702";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                    case WATERMELON:
                        intent = new Intent(MainActivity.this, FruitDetailActivity.class);
                        url = "https://baike.baidu.com/item/%E8%A5%BF%E7%93%9C/333718";
                        intent.putExtra("data", url);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i <= 2; i ++) {
            Fruit apple = new Fruit(APPLE, R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(BANANA, R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit cherry = new Fruit(CHERRY, R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit grape = new Fruit(GRAPE, R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit mango = new Fruit(MANGO, R.drawable.mango_pic);
            fruitList.add(mango);
            Fruit orange = new Fruit(ORANGE, R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit pineapple = new Fruit(PINEAPPLE, R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(STRAWBERRY, R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit watermelon = new Fruit(WATERMELON, R.drawable.watermelon_pic);
            fruitList.add(watermelon);

        }

    }
}

