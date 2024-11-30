package org.example.medium.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * 347. Top K Frequent Elements
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequentElements {

    public static void main(String [] a){

        int [] arr = {1,1,1,2,2,3,3,3,3, 4,4,4,4,4};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int [] res = topKFrequentElements.topKFrequent(arr, 2);
        for (int re : res) {
            System.out.print(re + ", ");
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        int [] arr = new int[k];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq= new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(),a.getValue())
        );
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            pq.offer(entry);
        }
        for(int i=0; i<k; i++){
            arr[i] = Objects.requireNonNull(pq.poll()).getKey();
        }
        return arr;
    }
}
