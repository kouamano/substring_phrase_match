public class subStrPhraseMatch {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.print(":::"+match(args[0], args[1])+":::\n");
		//substrmatchhelpM.help();
	}

	public static float match(String arg1, String arg2) {
		int qlen;
		int blen;
		int i;
		int j;
		String query[];
		String base[];
		query = arg1.split(" +");
		base = arg2.split(" +");
		qlen = query.length;
		blen = base.length;

		int wc[] = new int[qlen];
		substringMatch substrmatchM = new substringMatch();
		wordsMatchCount wordmatchcountM = new wordsMatchCount();

		wordmatchcountM.wordmatchcount(query,query,wc);
		wordmatchcountM.wordmatchcount(query,base,wc);
		float point = 0;
		for(i=0;i<qlen;i++){
			for(j=0;j<blen;j++){
				if(substrmatchM.substringmatchQ(query[i],base[j]) == 1){
					point = point + (1/(float)wc[i]);
					//System.out.print(wc[i]+"\n");
					//System.out.print(1/(float)wc[i]+"\n");
				}
			}
		}
		point = (point * 2 * qlen)/qlen/qlen;

		return point;
	}

}
