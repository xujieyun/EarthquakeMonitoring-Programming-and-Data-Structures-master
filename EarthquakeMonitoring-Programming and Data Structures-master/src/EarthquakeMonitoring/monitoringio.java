	package EarthquakeMonitoring;
	
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Scanner;
	/**
	 * 在这里给出对�? monitoringio 的描述�??
	 *
	 * @作�?�（你的名字�?
	 * @版本（一个版本号或�?�一个日期）
	 */
	public class monitoringio
	{
	   private static  List<obsevatory>obsevatorylist2= new ArrayList<>();
	    public static void Menu(){
	        System.out.println("##########################");
	        System.out.println("MENU");
	        System.out.println("1.enter the imformation of obsevatory and earthquake:");
	        System.out.println("2.provide the biggest....  :");
	        System.out.println("0.exit");
	
	
	    }
	    public static void main(String args[]){
	        
	        String obname="";
	        String startYear="";
	        String covered="";
	        String nation="";
	        int a;
	        int b=0;
	        Menu();
	        Scanner scan=new Scanner(System.in);
	
	
	        for(;b<4;Menu()){
	
	            a=scan.nextInt();
	            if(a==1) b=1;
	            else if (a==2) b=2;
	            else if (a==3) b=3;
	            else if (a==0) b=4;
	
	            switch(b){
	                case 1:
	                	List<earthquake>earthlist2= new ArrayList<>();
	                	System.out.println("enter the obsevatory name:");
	                    obname=scan.next();//String covered,String nation,List<earthquake> earthlist,float averagevalue
	                    System.out.println("enter the begain of year:");
	                    startYear=scan.next();
	                    System.out.println("enter the covered:");
	                    covered=scan.next();
	                    System.out.println("enter the nation name:");
	                    nation=scan.next();
	                    System.out.println("enter�������:");
	                    int CountEarthquack=scan.nextInt();
	                	for(int i1=0;i1<CountEarthquack;i1++){
	                		System.out.println("enter the name of the earth:");
	                        String earthquakeName1=scan.next();
	                        System.out.println("enter the number of magnitude:");
	                        int Numbermagnitude=scan.nextInt();
	                        System.out.println("enter the year:");
	                        String year=scan.next();
	                        System.out.println("enter the position:");
	                        String position=scan.next();
	                        System.out.println("return");
	                        earthquake earthquakebgg=new earthquake(earthquakeName1,Numbermagnitude,year,position);
	                        earthlist2.add(earthquakebgg);
	                	}
	                    float average=0;
	                    obsevatory obsevatory1=new obsevatory();
	                    average=obsevatory1.average(earthlist2);
	                    obsevatory obsevatory=new obsevatory(obname, startYear, covered, nation, earthlist2, average);
	                    obsevatorylist2.add(obsevatory);
	                    break;
	                    
	                case 2: monitoring test1=new monitoring(); 
	                	test1.TheBiggestAverageob(obsevatorylist2);
	                    test1.Thebiggestnumber(obsevatorylist2);
	                    System.out.println("scan limit earth");
	                    int limitEarth=scan.nextInt();
	                    test1.Alllist(obsevatorylist2,limitEarth);
	                    break;
	                case 3:System.out.println("EXIT");System.exit(0);
	                default:System.out.println("please typing correct month");break;
	            }
	        }
	    }
	}
