package datastructures.arrays.mergeoverlappingintervals;

import java.util.*;

public class MergeOverLappingIntervals {

    public static List<Interval> mergeIntervals(List<Interval> intervals){
        if(intervals.size() < 2){
            return intervals;
        }
        List<Interval> result = new ArrayList<>();
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        Interval temp = intervals.get(0);
        int start = temp.start;
        int end = temp.end;
        for(int i = 1; i < intervals.size(); i++){
            temp = intervals.get(i);
            if(temp.start <= end){
                end = Math.max(end,temp.end);
            }else {
                result.add(new Interval(start,end));
                start = temp.start;
                end = temp.end;
            }
        }
        result.add(new Interval(start,end));
        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(2,5));
        intervals.add(new Interval(6,9));

        List<Interval> mergedIntervals = mergeIntervals(intervals);
        mergedIntervals.forEach(interval -> System.out.println(interval.start + "," +interval.end));

    }
}
