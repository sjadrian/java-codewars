package org.example.kyu_8.findthefirstnon_consecutivenumber;

class FirstNonConsecutive {
    static Integer find(final int[] array) {

        int first = array[0];

        for (int i = 1; i < array.length; i++) {
            first++;
            if (first != array[i]) {
                return array[i];
            }
        }

        return null;
    }
}
