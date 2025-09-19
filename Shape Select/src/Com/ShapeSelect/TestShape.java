package Com.ShapeSelect;

import java.util.Scanner;

public class TestShape {
	public static void main(String[]args){
		Scanner rr=new Scanner(System.in);
		char choice;
		do{
			System.out.println("the a shape");
			System.out.println(" 1.Rectangle ");
			System.out.println("2.Circle");
			System.out.println("3.Square");
			System.out.println("4.Triangle");
			System.out.println("select shape:");
			
			int value=rr.nextInt();
			switch(value){
		case 1:
			System.out.println("enter the length");
			double l=rr.nextDouble();
			System.out.println("enter the width");
			double w=rr.nextDouble();
			
			Rectangle p=new Rectangle(l,w);
			System.out.println("what do you like to calculate");
			System.out.println("1.Area?");
			System.out.println("2.perimeter?");
			System.out.println("your choice:");
			int djam=rr.nextInt();
			if (djam==1){
				System.out.println("area of rectangle"+p.calArea());
			}
			else if(djam==2){
			System.out.println("perimeter of rectangle"+p.calperimeter());
			}
			else{
				System.out.println("invalid selection(");
				
			}
			
				break;
			case 2:
				System.out.println("enter rad");
				double hh=rr.nextDouble();
				Circle tt=new Circle(hh);
				System.out.println("what do you like to calculate");
				System.out.println("1.Area?");
				System.out.println("2.perimeter?");
				System.out.println("your choice:");
				int djam2=rr.nextInt();
				if (djam2==1){
					System.out.println("area of Circle"+tt.calArea());
				}
				else if(djam2==2){
				System.out.println("perimeter of Circle"+tt.calcirc());
				}
				else{
					System.out.println("invalid selection(");
					
				}
				
				break;
			case 3:
				System.out.println("enter the side");
				double ww=rr.nextDouble();
				Square niy=new Square(ww);
				System.out.println("what do you like to calculate");
				System.out.println("1.Area?");
				System.out.println("2.perimeter?");
				System.out.println("your choice:");
				int djam3=rr.nextInt();
				if (djam3==1){
					System.out.println("area of Square"+niy.calArea());
				}
				else if(djam3==2){
				System.out.println("perimeter of Square"+niy.calperimeter());
				}
				else{
					System.out.println("invalid selection(");
					
				}
				
				
				break;
			case 4:
				System.out.println("enter the Base");
				double ss=rr.nextDouble();
				System.out.println("enter the height");
				double s=rr.nextDouble();
				Triangle Alf=new Triangle(ss,s);
				
				System.out.println("what do you like to calculate");
				System.out.println("1.Area?");
				System.out.println("2.perimeter?");
				System.out.println("your choice:");
				int djam4=rr.nextInt();
				if (djam4==1){
					System.out.println("area of Triangle"+Alf.calArea());
				}
				else if(djam4==2){
				System.out.println("perimeter of Triangle"+Alf.calperimeter());
				}
				else{
					System.out.println("invalid selection(");
					
				}
			
				break;
			default:
				System.out.println("invalid selection(");
				break;
			}
			System.out.println("would you like to continue?(y/n");
			choice=rr.next().charAt(0);
		}
			
             while(choice=='y');


           
		}

	}

