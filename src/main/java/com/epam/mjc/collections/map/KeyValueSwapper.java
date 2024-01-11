package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> ans = new HashMap<>();
        for (var key : sourceMap.keySet()) {
            if ((ans.containsKey(sourceMap.get(key)) && ans.get(sourceMap.get(key)) > key) || !ans.containsKey(sourceMap.get(key))) {
                ans.put(sourceMap.get(key), key);
            }
        }
        return ans;
    }
}
