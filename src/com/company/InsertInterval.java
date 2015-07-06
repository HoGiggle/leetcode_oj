//package intel.bigdata.com;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Created by root on 6/3/15.
// */
//class Interval {
//    int start;
//    int end;
//    Interval() { start = 0; end = 0; }
//    Interval(int s, int e) { start = s; end = e; }
//}
//
//public class InsertInterval {
//    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
//        /*if (intervals == null || newInterval == null) return intervals;
//
//        long check;                 //(a2 - b1)*(a1 - b2)<0 说明【a1,b1】 [a2,b2]没有交集，神马定理忘了
//        int j = 1;                      //记录有交集的最后一个范围
//        List<Interval> result = new ArrayList<Interval>();
//        for (int i = 0; i < intervals.size(); i++){
//            check = (intervals.get(i).start - newInterval.end) * (newInterval.start - intervals.get(i).end);
//            if (check < 0){         //没有交集，直接添加
//                result.add(intervals.get(i));
//            }else {                 //有交集，找到交集的最后一个范围j
//                newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
//                newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
//                for (j = i + 1; j < intervals.size(); j++){
//                    if (newInterval.end < intervals.get(j).start){
//                        break;
//                    }else if (newInterval.end <= intervals.get(j).end){
//                        newInterval.end = intervals.get(j).end;
//                    }
//                }
//                break;
//            }
//        }
//        //添加融合的范围，以及原list没融合部分
//        result.add(newInterval);
//        while (j < intervals.size()){
//            result.add(intervals.get(j++ ));
//        }
//        return result;*/
//
//        if (intervals == null || newInterval == null) return intervals;
//        int i = 0;
//        List<Interval> res = new LinkedList<Interval>();
//        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {res.add(intervals.get(i++));}
//        while (i < intervals.size() && newInterval.end >= intervals.get(i).start){
//            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
//            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
//            i++;
//        }
//        res.add(newInterval);
//        while (i < intervals.size()){res.add(intervals.get(i++));};
//        return res;
//    }
//
//    public static void main(String[] args) {
//        //[1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9]
//        List<Interval> list = new ArrayList<Interval>();
//        Interval i1 = new Interval(1,5);
//      /*  Interval i2 = new Interval(3,5);
//        Interval i3 = new Interval(6,7);
//        Interval i4 = new Interval(8,10);
//        Interval i5 = new Interval(12,16);*/
//        Interval i6 = new Interval(6,8);
//        list.add(i1);
//      /*  list.add(i2);
//        list.add(i3);
//        list.add(i4);
//        list.add(i5);*/
//        list = insert(list, i6);
//        for (Interval i : list){
//            System.out.println(i.start + "...." + i.end);
//        }
//    }
//}
