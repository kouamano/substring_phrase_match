
public class wordsMatchCount {
	public int wordmatchcount(String query[], String base[], int wc[]){
		int len_query = query.length;
		int len_base = base.length;
		//int wc[]=new int[len_query];
		int i;
		int j;
		substringMatch substrmatchM = new substringMatch();

		for(i=0;i<len_query;i++){
			for(j=0;j<len_base;j++){
				if(substrmatchM.substringmatchQ(query[i], base[j])==1){
					wc[i]++;
				}
			}
		}
		return(0);
	}
}
