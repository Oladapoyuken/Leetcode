package MyLeetCodes;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MedianTwoSortedArray { //{1,2,3,4} {1,4,7}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {




//        List<Integer> list = new ArrayList(Arrays.asList(Arrays.stream( nums1 ).boxed().toArray( Integer[]::new )));
//        list.addAll(Arrays.asList(Arrays.stream( nums2 ).boxed().toArray( Integer[]::new )));
//        Collections.sort(list);
//        if(list.size() % 2 == 0 ){
//            int mid = list.size()/2;
//            mid = list.get(mid) + list.get(mid-1);
//            return new Double(mid) / 2;
//        }
//        else{
//            int mid = list.size()/2;
//            return new Double(list.get(mid));
//        }

        int i=0;
        int j=0;
        int k=0;
        int[] combArr=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            combArr[k++]=(nums1[i]<nums2[j])? nums1[i++]: nums2[j++];
        }
        //getting the rest of the arrays
        while(i<nums1.length){
            combArr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            combArr[k++]=nums2[j++];
        }
        int half=combArr.length/2;
        double median=(combArr.length%2==0)? (double)(combArr[half]+combArr[half-1])/2:(double)combArr[half];
        return median;



    }

    public static void main(String[] args) {
        System.out.println(new MedianTwoSortedArray().findMedianSortedArrays(new int[]{1,1}, new int[]{1,2}));
//        System.out.println(5/2);


    }

}
