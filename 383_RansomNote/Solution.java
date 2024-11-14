class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            String cToStr = Character.toString(c);
            Integer value = map.get(cToStr);
            if (value != null) {
                int iValue = value.intValue();
                iValue++;
                map.put(cToStr, iValue);
            } else {
                map.put(cToStr, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            String cToStr = Character.toString(c);
            Integer value = map.get(cToStr);
            if (value != null) {
                int iValue = value.intValue();
                if (iValue == 0) return false;
                iValue--;
                map.put(cToStr, iValue);
            } else {
                return false;
            }
        }
        return true;
    }
}