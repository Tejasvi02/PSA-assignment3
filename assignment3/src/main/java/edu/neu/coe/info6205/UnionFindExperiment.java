package edu.neu.coe.info6205;

import edu.neu.coe.info6205.union_find.UF;
import edu.neu.coe.info6205.union_find.UF_HWQUPC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UnionFindExperiment {

    public static int getConnections(int sites){
        //int sites = 50;
        UF h = new UF_HWQUPC(sites);
        Random rand = new Random();
        int counter = 0;
        while(h.components() > 1){
            int n1 = rand.nextInt(sites);
            int n2 = n1;
            while(n1==n2)
                n2 = rand.nextInt(sites);
            ++counter;
            if(!h.isConnected(n1, n2)){
                h.union(n1, n2);

            }
        }
        //System.out.println(counter);
        return counter;
    }

    public static void main(String[] args){
        List<Integer> sitesArr = new ArrayList<Integer>();
        sitesArr.add(10);
        sitesArr.add(50);
        sitesArr.add(100);
        sitesArr.add(500);
        sitesArr.add(1000);
        sitesArr.add(1500);
        sitesArr.add(3000);
        sitesArr.add(5000);
        sitesArr.add(5000);
        for (Integer numSites : sitesArr) {
            System.out.println(getConnections(numSites));
        }
    }

}
