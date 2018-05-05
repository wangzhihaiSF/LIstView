# ListViewTest

This is a ListViewDemo.
## 知识点
1. ListView
2. Adapter
3. Intent: 携带数据传递给跳转到的 Activity
4. WebView: 展示水果详情

## 工程创建步骤
1. 添加水果图片资源
2. 新建 Fruit 实体类，添加属性fruitName 和 fruitImage，构造方法，get 和 set 方法。
3. 添加水果子项布局文件，fruit_item.xml
4. 创建FruitAdapter，这个适配器继承自 ArrayAdapter，泛型指定为 Fruit。在适配器中重写了一组父类构造函数
```java
 FruitAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;

    }
```
这一组构造函数用于将上下文、ListView 子项布局的 id 和数据都传递进来。另外还需要重写 getView 方法。
```java
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position); //获得当前项的水果实例
        View view;
        ViewHolder viewHolder;

        //convertView 加载缓存的 view
        //LayoutInflater 为子项加载我们传入的布局
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        if (fruit != null) {
            viewHolder.fruitName.setText(fruit.getFruitName());
        }
        if (fruit != null) {
            viewHolder.fruitImage.setImageResource(fruit.getFruitImage());
        }
        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
```
这个方法在每个水果子项滚动到屏幕内后调用。
