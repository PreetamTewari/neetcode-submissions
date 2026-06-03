class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Sorting approach

        // Map<Integer, Integer> count = new HashMap<>();

        // for(int n: nums) {
        //     count.put(n, count.getOrDefault(n, 0) + 1);
        // }

        // List<int[]> arr = new ArrayList<>();
        // for(Map.Entry<Integer, Integer> entry: count.entrySet()) {
        //     arr.add(new int[] {entry.getValue(), entry.getKey()});
        // }
        // arr.sort((a, b) -> b[0] - a[0]);

        // int[] res = new int[k];
        // for(int i= 0; i < k; i++) {
        //     res[i] = arr.get(i)[1];
        // }
        // return res;

        // Bucket Sort

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i> 0 && index < k; i--) {
            for(int n: freq[i]) {
                res[index++] = n;
                if (index ==k) return res;
            }
        }
        return res;
    }
}
