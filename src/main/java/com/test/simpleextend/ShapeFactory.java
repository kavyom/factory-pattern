package com.test.simpleextend;

import com.test.simplefactory.Circle;
import com.test.simplefactory.Rectangle;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by pzh on 2022/9/6.
 */
public class ShapeFactory {

    private static Map<String, Shape> map = new HashMap();
    // 加载配置文件
    static {
        Properties p = new Properties();
        InputStream is = ShapeFactory.class.getClassLoader().getResourceAsStream("shape.properties");
        try {
            p.load(is);
            // 遍历Properties集合对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                // 根据键获取值（全类名）
                String className = p.getProperty((String) key);
                // 获取Class对象
                Class clazz = Class.forName(className);
                // 实例化对象
                Shape obj = (Shape) clazz.newInstance();
                // 将对象以键值对的形式存入map
                map.put((String)key,obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取对象时直接根据配置文件中的key获取对应的对象
     **/
    public static Shape getShape(String name) {
        return map.get(name);
    }
}
