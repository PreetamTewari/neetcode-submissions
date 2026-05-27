class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            // char[] chars = s.toCharArray();
            // Arrays.sort(chars);
            // String key = new String(chars);

            // map.computeIfAbsent(key, k -> new ArrayList()).add(s);

            int[] count = new int[26];

            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
