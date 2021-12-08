import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class AirplaneSeatingAlgorithm {

	
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		System.out.println("Please Enter Number of passengers waiting in queue:");
		 BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading data using readLine
		        Integer num = Integer.parseInt(reader.readLine());
		 
		       
		
		
		Map<String,String> oneMap=new HashMap<String,String>();
		Map<String,String> twoMap=new HashMap<String,String>();
		Map<String,String> threeMap=new HashMap<String,String>();
		Map<String,String> fourMap=new HashMap<String,String>();
	
		
		for(int s=1;s<=num+1;s++) {
			
				if(s==num+1) {
					break;
				}
				switch (s) {
				case 1:oneMap.put("02","A01");break;
				case 2:twoMap.put("00","A02");break;
				case 3:twoMap.put("03","A03");break;
				case 4:threeMap.put("00","A04");break;
				case 5:threeMap.put("01","A05");break;
				case 6:fourMap.put("00","A06");break;
				case 7:oneMap.put("12","A07");break;
				case 8:twoMap.put("10","A08");break;
				case 9:twoMap.put("13","A09");break;
				case 10:threeMap.put("10","A10");break;
				case 11:threeMap.put("11","A11");break;
				case 12:fourMap.put("10","A12");break;
				case 13:twoMap.put("20","A13");break;
				case 14:twoMap.put("23","A14");break;
				case 15:threeMap.put("20","A15");break;
				case 16:threeMap.put("21","A16");break;
				case 17:fourMap.put("20","A17");break;
				case 18:fourMap.put("30","A18");break;
				
				case 19:oneMap.put("00","W19");break;
				case 20:fourMap.put("02","W20");break;
				case 21:oneMap.put("10","W21");break;
				case 22:fourMap.put("12","W22");break;
				case 23:fourMap.put("22","W23");break;
				case 24:fourMap.put("32","W24");break;
				
				case 25:oneMap.put("01","M25");break;
				case 26:twoMap.put("01","M26");break;
				case 27:twoMap.put("02","M27");break;
				case 28:fourMap.put("01","M28");break;
				case 29:oneMap.put("11","M29");break;
				case 30:twoMap.put("11","M30");break;				
				case 31:twoMap.put("12","M31");break;
				case 32:fourMap.put("11","M32");break;
				case 33:twoMap.put("21","M33");break;
				case 34:twoMap.put("22","M34");break;
				case 35:fourMap.put("21","M35");break;
				case 36:fourMap.put("31","M36");break;

				
					
					

				default:
					break;
				}
			}
		
		
		
		printSeats(oneMap, twoMap, threeMap, fourMap);
    
		
	}
	
	public static void	printSeats(Map<String,String> oneMap,Map<String,String> twoMap,Map<String,String> threeMap,Map<String,String> fourMap){
		
		 System.out.println("W = Window seat");
		 System.out.println("M = Middle seat");
		 System.out.println("A = Aisle sea");
		 System.out.println();
		
		for (Integer i = 0; i <2; i++) {
			String a=i.toString();
            for (int j = 0; j <3; j++) {
            	if(oneMap.get(a+j)==null) {
            		 System.out.print("X ");
            	}else
                System.out.print(oneMap.get(a+j)+" ");
            }
            System.out.println();
		}
		System.out.println();
		
		for (Integer i = 0; i <3; i++) {
			String a=i.toString();
            for (int j = 0; j <4; j++) {
            	if(twoMap.get(a+j)==null) {
           		 System.out.print("X ");
           	}else
               System.out.print(twoMap.get(a+j)+" ");
            }
            System.out.println();
		}
		System.out.println();
		for (Integer i = 0; i <3; i++) {
			String a=i.toString();
            for (int j = 0; j <2; j++) {
            	if(threeMap.get(a+j)==null) {
              		 System.out.print("X ");
              	}else
                  System.out.print(threeMap.get(a+j)+" ");
            }
            System.out.println();
		}
		System.out.println();
		for (Integer i = 0; i <4; i++) {
			String a=i.toString();
            for (int j = 0; j <3; j++) {
            	if(fourMap.get(a+j)==null) {
             		 System.out.print("X ");
             	}else
                 System.out.print(fourMap.get(a+j)+" ");
            }
            System.out.println();
		}
				
		
	}
}
