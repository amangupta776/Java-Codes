public class abc {
    public static int calculateTurns(int N, int[] positions) {
        int[] initialPositions = new int[N];
        for (int i = 0; i < N; i++) {
            initialPositions[i] = i + 1;
        }
        
        int turns = 0;
        while (!isSameArray(positions, initialPositions)) {
            positions = applyPattern(positions);
            turns++;
        }
        
        return turns;
    }
    
    public static boolean isSameArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static int[] applyPattern(int[] positions) {
        int[] newPositions = new int[positions.length];
        for (int i = 0; i < positions.length; i++) {
            newPositions[i] = positions[positions[i] - 1];
        }
        
        return newPositions;
    }
    
    public static void main(String[] args) {
        int[] positions = {3, 1, 2, 5, 4};
        int turns = calculateTurns(5, positions);
        System.out.println("Number of turns required: " + turns);
    }
}
