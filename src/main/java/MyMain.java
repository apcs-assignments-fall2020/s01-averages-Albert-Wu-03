public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double sum = 0;
        double n = 0;
        for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
                n++;
			}
        }
        double mean = sum/n;
        return mean;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int size = mat.length * mat[0]. length;
        if(size % 2 == 1){
            return mat[(mat.length/2)][(mat[0].length/2)];
        }else if(mat.length % 2 == 1){
            return (mat[(mat.length/2)][(mat[0].length/2)] + mat[(mat.length/2)][(mat[0].length/2)-1])/2;
        }else{
            return (mat[(mat.length/2)-1][(mat[0].length)-1] + mat[(mat.length/2)][0])/2;
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        int a = 0; 
        int size = mat.length * mat[0]. length;
        double[] arr = new double [size];
        for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
                double n = mat[row][col];
                arr[a] = n;
                a++;
            }
        }
        double maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < size; ++i) {
            int count = 0;
            for (int j = 0; j < size; ++j) {
                if (arr[j] == arr[i])
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
