package org.example.kyu_7.isthisatriangle;

class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){

        int[] sides = {a, b, c};
        int maxLength = Math.max(Math.max(a,b), c);

        int index = -1;
        for (int i = 0; i < sides.length; i++) {
            if (maxLength == sides[i]) {
                index = i;
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            if (i != index) {
                sum += sides[i];
            }
        }

        return (sum > maxLength) ? true: false;
    }
}