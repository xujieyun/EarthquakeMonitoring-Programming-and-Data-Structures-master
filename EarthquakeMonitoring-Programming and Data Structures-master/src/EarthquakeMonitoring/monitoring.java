	package EarthquakeMonitoring;
	
	import java.util.List;
	/**
	 * 在这里给出对类 monitoring 的描述。
	 * 
	 * @作者（你的名字）
	 * @版本（一个版本号或者一个日期）
	 */
	public class monitoring
	{
	    int j;
	    
	    public void TheBiggestAverageob(List<obsevatory> obsevatory){//最大平均名字
	    	System.out.println("1,==========print the largest magnitude earthquake recorded by the observatory:");
		    float largestaverage=0;
		    String name = null;
		    for(int j=0;j<obsevatory.size();j++){
		       if(largestaverage<obsevatory.get(j).getaveragevalue()){
		    	   largestaverage=obsevatory.get(j).getaveragevalue();
		    	   name=obsevatory.get(j).getobname();
		        }
		        else{
		        break;
		        }
		        }
		    System.out.println("print1: observatory: "+name+" The biggest average magnitude number is "+largestaverage);  
	    }
	    public void Thebiggestnumber(List<obsevatory> obsevatory){
	    	System.out.println("2,==========print the average earthquake magnitude recorded at the observatory:");
	        int largestnumber=0;
	        String name = null;
	        String earthName= null;
	        for(int j=0;j<obsevatory.size();j++){
	        	for(int i=0;i<obsevatory.get(j).getEarthlist().size();i++){
	        	if(largestnumber<obsevatory.get(j).getEarthlist().get(i).getNumbermagnitude()){
	        	largestnumber=obsevatory.get(j).getEarthlist().get(i).getNumbermagnitude();
	        	name=obsevatory.get(j).getobname();
	        	earthName=obsevatory.get(j).getEarthlist().get(i).getearthquakeName1();
	        	
	        		}
	        	}
	        }
	        System.out.println("observatory: "+name+" Earthquack Name is "+earthName+" The biggest magnitude number is "+largestnumber);
	    }
	
		public void Alllist(List<obsevatory> obsevatory,int limitEarth) {
			System.out.println("3,==========print a list of all earthquakes recorded at the observatory with a magnitude greater than a given number:");
	        String name = null;
	        String earthName= null;
	        int magnitude=0;
	        String year= null;
	        String position= null;
	        for(int j=0;j<obsevatory.size();j++){
	        	for(int i=0;i<obsevatory.get(j).getEarthlist().size();i++){
	        	if(limitEarth<obsevatory.get(j).getEarthlist().get(i).getNumbermagnitude()){
	        	name=obsevatory.get(j).getobname();
	        	earthName=obsevatory.get(j).getEarthlist().get(i).getearthquakeName1();
	        	magnitude=obsevatory.get(j).getEarthlist().get(i).getNumbermagnitude();
	        	year=obsevatory.get(j).getEarthlist().get(i).getyear();
	        	position=obsevatory.get(j).getEarthlist().get(i).getposition();
	        	System.out.println("observatory: "+name+" Earthquack Name is "+earthName+" The magnitude number is "+magnitude+" The year is "+year+" The position  is "+position);
	        		}
	        	}
	        }
	       
			
		}
	    
	    
	    }
