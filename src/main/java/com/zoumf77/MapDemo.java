package com.zoumf77;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<MyKey, String> hashMap = new HashMap<>();

		hashMap.put(new MyKey(1), "1");
		hashMap.put(new MyKey(2), "2");

		int i = 3;
		for (; i < 5; i++) {
			hashMap.put(new MyKey(i), i + "");
		}

		// 上面的table数组发生碰撞，链表产生
		for (; i < 12; i++) {
			hashMap.put(new MyKey(i), i + "");
		}
		// 上面的table数组大小仍为16；然后接下来看看,i=13时，就发生resize()。
		for (; i < 16; i++) {
			hashMap.put(new MyKey(i), i + "");
		}

		for (; i < 40; i++) {
			hashMap.put(new MyKey(i), i + "");
		}

		// i=41时，就发生链表转为树
		for (; i < 50; i++) {
			hashMap.put(new MyKey(i), i + "");
		}

		System.out.println("hi");

		MyKey key = new MyKey(1);

		String value = hashMap.get(key);

		Iterator<Entry<MyKey, String>> it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<MyKey, String> entry = it.next();
			System.out.println(entry.getKey().key + ":" + entry.getValue());
		}

		Map<MyKey, String> treeMap = new TreeMap<>();
	}
}
