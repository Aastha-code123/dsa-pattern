public class FruitIntoBasket {
     public int totalFruit(int[] fruits) {

        int[] freq = new int[100001];
        int unique = 0;

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            int fruit = fruits[right];

            if (freq[fruit] == 0) {
                unique++;
            }
            freq[fruit]++;

            while (unique > 2) {
                int leftFruit = fruits[left];
                freq[leftFruit]--;

                if (freq[leftFruit] == 0) {
                    unique--;
                }
                left++;
            }

            int len = right - left + 1;
            if (len > maxFruits) {
                maxFruits = len;
            }
        }

        return maxFruits;
    }


    public static void main(String[] args) {
        FruitIntoBasket obj = new FruitIntoBasket();
        int[] fruits = {1, 2, 1, 2, 3, 2, 2,3 ,3,2,1};
        int result = obj.totalFruit(fruits);
        System.out.println("Maximum number of fruits that can be collected: " + result);
    }   

}