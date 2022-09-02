package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer aInt = Integer.parseInt(a);
        Integer bInt = Integer.parseInt(b);

        Integer formulaA = 5 * aInt * aInt + 3;
        Integer formulaB = 5 * bInt * bInt + 3;

        if (formulaA > formulaB) {
            return 1;
        } else if (formulaA < formulaB) {
            return -1;
        } else {
            if (aInt > bInt) {
                return 1;
            } else if (aInt < bInt) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
