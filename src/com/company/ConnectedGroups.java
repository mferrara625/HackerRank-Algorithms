package com.company;

import java.util.HashMap;
import java.util.Map;

public class ConnectedGroups {

    public int connectedGroups(int n, String[] related) {
        int groupCount = 1;
        boolean isConnected;
        Map<Integer, char[]> map = new HashMap<>();
        char[] groupOne = related[0].toCharArray();
        map.put(1, groupOne);
        for (int j = 1; j < n; j++) {
            isConnected = false;
            char[] letters = related[j].toCharArray();
            for (int i = 0; i < n; i++) {
                for (char[] chars : map.values())
                    if (letters[i] == '1' && chars[i] == '1') {
                        isConnected = true;
                        for (int k = 0; k < n; k++) {
                            if (letters[k] == '1')
                                chars[k] = '1';
                        }
                    }
            }
            if (!isConnected) {
                groupCount++;
                map.put(groupCount, letters);
            }
        }
        return groupCount;
    }
}
