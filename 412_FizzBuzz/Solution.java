class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) strList.add("FizzBuzz");
            else if (i % 3 == 0) strList.add("Fizz");
            else if (i % 5 == 0) strList.add("Buzz");
            else strList.add(String.valueOf(i));
        }
        return strList;
    }
}