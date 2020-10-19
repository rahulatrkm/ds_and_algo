/*

1266. Minimum Time Visiting All Points


On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.

You can move according to the next rules:

In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
You have to visit the points in the same order as they appear in the array.

*/

import java.lang.Math;

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        if(n == 1)
            return 0;
        int dist = 0;
        for(int i = 0; i < n-1; i++) {
            int xDiff = Math.abs(points[i][0]-points[i+1][0]);
            int yDiff = Math.abs(points[i][1]-points[i+1][1]);
            dist += Math.max(xDiff, yDiff);
        }
        return dist;
    }
}
