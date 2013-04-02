package test;

public class PiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pi="3.14159265358979323846264338327950288419716" +
				"93993751058209749445923078164062862089986280348253421170679821480865132823";
		String pi100 = pi.substring(pi.indexOf(".")+1,pi.indexOf(".")+101);
		int[][] result = new  int[10][2];
		for(int i=0;i<10;i++){
			result[i][0]=i;
		}
		for(int i=0;i<100;i++ ){
			int num = Integer.parseInt(String.valueOf(pi100.charAt(i)));
			for(int j=0;j<10;j++){
				if(num==j){
					result[j][1]++;
				}
			}
		}
        int temp;
		for(int i=0;i<10;i++){
		  for(int j=i+1;j<10;j++){
			  if(result[i][1]<result[j][1]){
				  temp = result[i][0];
				  result[i][0] = result[j][0];
				  result[j][0] = temp;
				  temp= result[i][1];
				  result[i][1] = result[j][1];
				  result[j][1] = temp ;
			  }
		  }
		}
		for(int i=0;i<10;i++){
			System.out.println("("+result[i][0]+","+result[i][1]+"),");
		}
	}
}
