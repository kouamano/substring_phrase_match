
public class substringMatch {
	public int substringmatchQ(String query, String base){
		int r = 0;
			if(base.matches("(?i)"+query+".*")){
				r = 1;
			}else{
				r = 0;
			}
		return(r);
	}
}
