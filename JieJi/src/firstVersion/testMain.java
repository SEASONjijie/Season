package firstVersion;

import java.util.ArrayList;
import java.util.Scanner;

public class testMain {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			System.out.println("quantity of Laptop:");
			int numbersOfLaptop= scanner.nextInt();
			System.out.println("quantity of Mouse:");
			int numbersOfMouse= scanner.nextInt();
			System.out.println("quantity of Desktop:");
			int numbersOfDesktop= scanner.nextInt();
			System.out.println("quantity of LCD screens:");
			int numbersOfLcd= scanner.nextInt();
		    
		    ArrayList<String> quantityOfGoods= new ArrayList<String>();
			quantityOfGoods.add("numbersOfLaptop:   "+numbersOfLaptop);
			quantityOfGoods.add("numbersOfMouse:   "+numbersOfMouse);
			quantityOfGoods.add("numbersOfDesktop:   "+numbersOfDesktop);	
			quantityOfGoods.add("numbersOfLcd:   "+numbersOfLcd);
			
			
			for(int index=0;index<quantityOfGoods.size();index++)
			{
				System.out.println(quantityOfGoods.get(index));
			}
			
			double totalVolumeOfShipment=0.6*0.5*0.5*numbersOfLaptop+0.3*0.3*0.2*numbersOfMouse+1.0*1.5*0.5*numbersOfDesktop+1.2*1.4*0.8*numbersOfLcd;
			System.out.println("the total Volume of the Shipment:  "+totalVolumeOfShipment+"(cubic meter)");
			
			double totalWeightOfShipment=6.5*numbersOfLaptop+0.2*numbersOfMouse+20*numbersOfDesktop+2.6*numbersOfLcd;
			System.out.println("the total Weight of the Shipment:  "+totalWeightOfShipment+"(kg)");
			
			double volumeOfSmallContainer=2.59*2.43*6.06;
			System.out.println("the volume of Small Container:  "+volumeOfSmallContainer+"(cubic meter)");
			
			double volumeOfBigContainer=2.59*2.43*12.01;
			System.out.println("the volume of Big Container:  "+volumeOfBigContainer+"(cubic meter)");
			
			
			int numbersOfBigContainer=(int)(totalVolumeOfShipment/volumeOfBigContainer);
			System.out.println("NEED "+numbersOfBigContainer+" BIG CONTAINER");
			
			double volumeRatioLaptopAndMouse=(0.6*0.5*0.5)/(0.3*0.3*0.2);
			double volumeRatioDesktopAndMouse=(1.0*1.5*0.5)/(0.3*0.3*0.2);
			double volumeRatioLcdAndMouse=(1.2*1.4*0.8)/(0.3*0.3*0.2);
			double miceCanBeAccommodated=(numbersOfBigContainer*volumeOfBigContainer)/(0.3*0.3*0.2);
			double scaleFactor=miceCanBeAccommodated/(volumeRatioLaptopAndMouse+volumeRatioDesktopAndMouse+volumeRatioLcdAndMouse);
			
			double WeightRatioLaptopAndMouse=(6.5)/(0.2);
			double WeightRatioDesktopAndMouse=(20)/(0.2);
			double WeightRatioLcdAndMouse=(2.6)/(0.2);
			
			double weightCompareLaptop=scaleFactor*WeightRatioLaptopAndMouse;
			double weightCompareLaptopMouse=scaleFactor*volumeRatioLaptopAndMouse;
			double weightCompareDesktop=scaleFactor*WeightRatioDesktopAndMouse;
			double weightCompareDesktopMouse=scaleFactor*volumeRatioDesktopAndMouse;
			double weightCompareLcd=scaleFactor* WeightRatioLcdAndMouse;
			double weightCompareLcdMouse=scaleFactor*volumeRatioLcdAndMouse;
			
		
			
			int numbersOfMouseInBig = 0;
			int numbersOfLaptopInBig=0;
			int numbersOfDesktopInBig=0;
			int numbersOfLcdInBig=0;
			
			if(weightCompareLaptop>weightCompareLaptopMouse) {
				numbersOfLaptopInBig=(int)scaleFactor;
				}else if( (weightCompareLaptopMouse/volumeRatioDesktopAndMouse)*WeightRatioDesktopAndMouse>weightCompareLaptopMouse) {
					if(weightCompareLaptopMouse/volumeRatioDesktopAndMouse<numbersOfDesktop)
					numbersOfDesktopInBig=(int)(weightCompareLaptopMouse/volumeRatioDesktopAndMouse);
					else
						{numbersOfDesktopInBig=numbersOfDesktop;
					    numbersOfMouseInBig=(int)(weightCompareLaptopMouse-numbersOfDesktop*volumeRatioDesktopAndMouse);}
				} else if ( (weightCompareLaptopMouse/volumeRatioLcdAndMouse)*WeightRatioLcdAndMouse>weightCompareLaptopMouse) {
					if(weightCompareLaptopMouse/volumeRatioLcdAndMouse<numbersOfLcd)
					numbersOfLcdInBig=(int)(weightCompareLaptopMouse/volumeRatioLcdAndMouse);
					else
						{numbersOfLcdInBig=numbersOfLcd;
					    numbersOfMouseInBig=(int)(weightCompareLaptopMouse-numbersOfLcd*volumeRatioLcdAndMouse);}
				}else {numbersOfMouseInBig=(int)weightCompareLaptopMouse;
				}			
			int a=numbersOfMouseInBig;
			int b=numbersOfLaptopInBig;
			int c=numbersOfDesktopInBig;
			int d=numbersOfLcdInBig;
			System.out.println(a);
					System.out.println(b);
							System.out.println(c);
									System.out.println(d);
											
			
			if(weightCompareDesktop>weightCompareDesktopMouse) {
				numbersOfDesktopInBig=(int)scaleFactor+c;
				}else if( (weightCompareDesktopMouse/volumeRatioLaptopAndMouse)*WeightRatioLaptopAndMouse>weightCompareDesktopMouse) {
					if(weightCompareDesktopMouse/volumeRatioLaptopAndMouse<numbersOfLaptop)
						numbersOfLaptopInBig=(int)(weightCompareDesktopMouse/volumeRatioLaptopAndMouse)+b;
					else
						{numbersOfLaptopInBig=numbersOfLaptop+b;
					    numbersOfMouseInBig=(int)(weightCompareDesktopMouse-numbersOfLaptop*volumeRatioLaptopAndMouse)+a;}
				} else if ( (weightCompareDesktopMouse/volumeRatioLcdAndMouse)*WeightRatioLcdAndMouse>weightCompareDesktopMouse) {
					if(weightCompareDesktopMouse/volumeRatioLcdAndMouse<numbersOfLcd)
					numbersOfLcdInBig=(int)(weightCompareDesktopMouse/volumeRatioLcdAndMouse)+d;
					else
						{numbersOfLcdInBig=numbersOfLcd+d;
					    numbersOfMouseInBig=(int)(weightCompareLaptopMouse-numbersOfLcd*volumeRatioLcdAndMouse)+a;}
				}else numbersOfMouseInBig=(int)weightCompareDesktopMouse+a;
			
			 a=numbersOfMouseInBig;
		     b=numbersOfLaptopInBig;
			 c=numbersOfDesktopInBig;
			 d=numbersOfLcdInBig;
			 System.out.println(a);
				System.out.println(b);
						System.out.println(c);
								System.out.println(d);
										
			
			
                                         			
            if(weightCompareLcd>weightCompareLcdMouse) {
				numbersOfLcdInBig=(int)scaleFactor+d;
				}else if( (weightCompareLcdMouse/volumeRatioLaptopAndMouse)*WeightRatioLaptopAndMouse>weightCompareLcdMouse) {
					if(weightCompareLcdMouse/volumeRatioLaptopAndMouse<numbersOfLaptop)
					numbersOfLaptopInBig=(int)(weightCompareLcdMouse/volumeRatioLaptopAndMouse)+b;
					else
					{numbersOfLaptopInBig=numbersOfLaptop;
				    numbersOfMouseInBig=(int)(weightCompareLcdMouse-numbersOfLaptop*volumeRatioLaptopAndMouse)+a;}
				    
				}else if( (weightCompareLcdMouse/volumeRatioDesktopAndMouse)*WeightRatioDesktopAndMouse>weightCompareLcdMouse) {
					if(weightCompareLcdMouse/volumeRatioDesktopAndMouse<numbersOfDesktop)
					numbersOfDesktopInBig=(int)(weightCompareLcdMouse/volumeRatioDesktopAndMouse);
					else
						{numbersOfDesktopInBig=numbersOfDesktop;
					    numbersOfMouseInBig=(int)(weightCompareLcdMouse-numbersOfDesktop*volumeRatioDesktopAndMouse);}
				}else numbersOfMouseInBig=(int)weightCompareLcdMouse+a;
            
             a=numbersOfMouseInBig;
		     b=numbersOfLaptopInBig;
			 c=numbersOfDesktopInBig;
			 d=numbersOfLcdInBig;
			 
			 System.out.println(a);
				System.out.println(b);
						System.out.println(c);
								System.out.println(d);
			 
			 System.out.println("the quantity of Laptop in big container: "+b);
			 System.out.println("the quantity of Desktop in big container: "+c);
			 System.out.println("the quantity of Mouse in big container: "+a);
			 System.out.println("the quantity of Lcd in big container: "+d);
			 
			 
			 int remainderMouse=numbersOfMouse-a;
			 int remainderLaptop=numbersOfLaptop-b;
			 int remainderDesktop=numbersOfDesktop-c;
			 int remainderLcd=numbersOfLcd-d;
			 
			 double remainderWeightOfShipment=6.5*remainderLaptop+0.2* remainderMouse+20*remainderDesktop+2.6*remainderLcd;
				System.out.println("the remainder Weight of the Shipment:  "+remainderWeightOfShipment+"(kg)");
				
				
				if(remainderWeightOfShipment<500) {
					System.out.println("NEED "+numbersOfBigContainer+" BIG CONTAINER AND 1 SMALL CONTAINER");
					System.out.println("COST "+1800*numbersOfBigContainer+1000+"euro");
				}
				else{
				System.out.println("NEED "+numbersOfBigContainer+" BIG CONTAINER AND 1 SMALL CONTAINER");
				System.out.println("COST "+1800*numbersOfBigContainer+1200+"euro");
				
				}
				
				
				
			 
            
            
			
			
			
			
			
			
			
			
			
	}
}
