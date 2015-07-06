package intel.bigdata.com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by root on 6/4/15.
 */
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals == null || newInterval == null) return intervals;
        int i = 0;
        List<Interval> res = new LinkedList<Interval>();
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {res.add(intervals.get(i++));}
        while (i < intervals.size() && newInterval.end >= intervals.get(i).start){
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        res.add(newInterval);
        while (i < intervals.size()){res.add(intervals.get(i++));};
        return res;
    }
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) return intervals;
        List<Interval> res = new LinkedList<Interval>();
        for (Interval i : intervals){
            res = insert(res, i);
        }
        return res;
        /*Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });

        List<Interval> ret = new ArrayList<>();
        Interval prev = null;
        for (Interval inter : intervals) {
            if (  prev==null || inter.start>prev.end ) {
                ret.add(inter);
                prev = inter;
            } else if (inter.end>prev.end) {
                // Modify the element already in list
                prev.end = inter.end;
            }
        }
        return ret;*/
    }
}
