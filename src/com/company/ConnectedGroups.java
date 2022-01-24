package com.company;

public class ConnectedGroups {


    public int connectedGroups(int n, String[] related) {
        int groupCount = 1;
        boolean isConnected;
        char[] groupOne = related[0].toCharArray();
        for (int j = 1; j < n; j++) {
            isConnected = false;
            char[] letters = related[j].toCharArray();
            for (int i = 0; i < n; i++) {
                if (letters[i] == '1' && groupOne[i] == '1') {
                    isConnected = true;
                    for (int k = 0; k < n; n++)
                        if (letters[k] == '1')
                            groupOne[k] = '1';
                }

            }
            if (!isConnected)
                groupCount++;
        }
        return groupCount;
    }
}
