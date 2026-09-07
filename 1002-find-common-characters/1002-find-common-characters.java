class Solution {
    public List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {

            HashMap<Character, Integer> temp = new HashMap<>();

            for (char c : words[i].toCharArray()) {
                temp.put(c, temp.getOrDefault(c, 0) + 1);
            }

            for (char c : map.keySet()) {

                if (temp.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), temp.get(c)));
                } else {
                    map.put(c, 0);
                }
            }
        }

        for (char c : map.keySet()) {
            int count = map.get(c);

            while (count > 0) {
                result.add(String.valueOf(c));
                count--;
            }
        }

        return result;
    

    }
}