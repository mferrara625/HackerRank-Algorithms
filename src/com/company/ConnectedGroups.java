package com.company;

public class ConnectedGroups {

    public int connectedGroups(int n, String[] related){
        char[] groupOne = related[0].toCharArray();
        for(int j = 1; j < n; j++){
            char[] letters = related[j].toCharArray();
            for(int i = 0; i < n; i++){
                if(letters[i] == '1' && i != j){

                }
            }
        }
    }
}
