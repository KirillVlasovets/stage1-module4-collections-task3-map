package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.length() == 0) {
            return new HashMap<>();
        }
        var sentenceArr = sentence.toLowerCase()
                .replace(",", "")
                .replace(".", "")
                .split("\\s");
        Map<String, Integer> ans = new HashMap<>();
        for (var word : sentenceArr) {
            if (ans.containsKey(word)) {
                ans.put(word, ans.get(word) + 1);
            } else {
                ans.put(word, 1);
            }
        }
        return ans;
    }
}
