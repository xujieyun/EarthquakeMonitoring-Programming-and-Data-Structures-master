	package EarthquakeMonitoring;
	public class earthquake{
	    String earthquakeName1;
	    int Numbermagnitude;
	    String year;
	    String position;
	
	    /**
	     * 
	     * @param earthquakeName1
	     * @param Numbermagnitude
	     * @param year
	     * @param position
	     */
	    public earthquake(String earthquakeName1,int Numbermagnitude,String year,String position){
	        this.earthquakeName1=earthquakeName1;
	        this.Numbermagnitude=Numbermagnitude;
	        this.year=year;
	        this.position=position;}
	
	    public String getearthquakeName1(){
	
	        return earthquakeName1;
	    }
	    public int getNumbermagnitude(){
	        return Numbermagnitude;
	    }
	    public String getyear(){
	        return year;
	    }
	    public String getposition(){
	        return position;
	    }
	    public String setearthquakeName1(){
	        return earthquakeName1;
	    }
	    public int setNumbermagnitude(){
	        return Numbermagnitude;
	    }
	    public String setyear(){
	        return year;
	    }
	    public String setposition(){
	        return position;
	    }
	}
