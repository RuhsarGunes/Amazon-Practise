/*Given a binary matrix A, we want to flip the image horizontally, then invert it, 
and return the resulting image. To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. 
For example, inverting [0, 1, 1] results in [1, 0, 0].

Example 1:
Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/

package flippinganimage;

public class FlippinganImage {

    public static int[][] flipAndInvertImage(int[][] img){
         /*For each row, use two pointers. One is going forward and the other is going backward.
        (1). If the two elements are the same, then make a slight change like this 0 -> 1 or 1 -> 0.
        (2). If the two elements are different, DON'T do anything. Just let it go.*/
        for(int i = 0; i < img.length; i++){
            int start = 0;
            int end = img[i].length - 1;
            
            while(start <= end){
                if(img[i][start] == img[i][end]){
                    img[i][start] = 1 - img[i][end];
                    img[i][end] = img[i][start];
                }
                start++;
                end--;
            }
        }
        
        return img;
    }
    
    public static void main(String[] args) {
        int[][] input = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] output = flipAndInvertImage(input);
        
        for(int i = 0; i < output.length; i++){
            for(int j = 0; j <  output[i].length; j++){
                System.out.println(output[i][j]);
            }
        }
    }
    
}
