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
                System.out.println(letters[i] + " *** " + groupOne[i]);
                if (letters[i] == '1' && groupOne[i] == '1') {
                    isConnected = true;
                    System.out.println("test");
                    for (int k = 0; k < n; k++) {
                        if (letters[k] == '1')
                            groupOne[k] = '1';
                        System.out.println("t2");
                    }
                }

            }
            if (!isConnected)
                groupCount++;


        }
        return groupCount;
    }
}
