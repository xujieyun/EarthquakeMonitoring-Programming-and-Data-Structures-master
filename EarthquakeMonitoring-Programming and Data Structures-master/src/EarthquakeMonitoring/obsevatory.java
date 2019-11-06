	package EarthquakeMonitoring;
	
	import java.util.List;
	public class obsevatory{
	
	    private String obname = "";
	    private String startYear="";
	    private String covered="";
	    private String nation="";
	    List<earthquake> earthlist;
	    int i;
	    private float averagevalue=0;
	    int sum=0;
	    float average=0;
	    /**
	     * 
	     * @param obname
	     * @param startYear
	     * @param covered
	     * @param nation
	     * @param earthlist
	     * @param averagevalue
	     */
	    public obsevatory(String obname,String startYear,String covered,String nation,List<earthquake> earthlist,float averagevalue){
	        this.obname=obname;
	        this.startYear=startYear;
	        this.covered=covered;
	        this.nation=nation;
	        this.earthlist=earthlist;
	        this.averagevalue=averagevalue;
	    }
	    /**
	     * 
	     */
	    public obsevatory() {
			// TODO Auto-generated constructor stub
		}
	
		public void addearthquake(String earthquakeName1,int Numbermagnitude,String year,String position){ earthquake earthquakebg=new earthquake(earthquakeName1,Numbermagnitude,year,position);//need strengthen!!!
	        earthlist.add(earthquakebg);
	
	    }
	
	    public int biggestnumber(){
	        int biggest=0;
	        for(int i=0;i<earthlist.size();i++){
	
	            if(biggest<earthlist.get(i).getNumbermagnitude()) {
	                biggest=earthlist.get(i).getNumbermagnitude();
	            }
	            else{
	                break;
	            }
	        }
	        return biggest;
	    }
	    /**
	     * 
	     * @param earthlist
	     * @return
	     */
	    public float average(List<earthquake> earthlist){
	        int sum=0;
	        int average=0;
	        earthlist.get(i);
	        for(i=0;i<earthlist.size();i++){
	            sum+=earthlist.get(i).getNumbermagnitude();//p 是每个地震的震级
	
	        }
	        average=sum/earthlist.size();
	        return average;
	    }
	    public String dangerearth(){
	        earthlist.get(i);
	        for(i=0;i<earthlist.size();i++){
	            if(earthlist.get(i).getNumbermagnitude()>3){
	                System.out.println(earthlist.get(i).getearthquakeName1());
	
	
	            }
	        }
	        return null;
	    }
	
	    public String getobname(){
	
	        return obname;
	    }
	    public float getaveragevalue(){
	
	        return averagevalue;
	    }
	    public String getstartYear(){
	        return startYear;
	    }
	    public String getnation(){
	        return nation;
	    }
	    public String getcovered(){
	        return covered;
	    }
	    public String setobname(){
	        return obname;
	    }
	    public String setstartYear(){
	        return startYear;
	    }
	    public String setnation(){
	        return nation;
	    }
	    public String setcovered(){
	        return covered;
	    }
		public List<earthquake> getEarthlist() {
			return earthlist;
		}
		/**
		 * 
		 * @param earthlist
		 */
		public void setEarthlist(List<earthquake> earthlist) {
			this.earthlist = earthlist;
		}
	
	}
