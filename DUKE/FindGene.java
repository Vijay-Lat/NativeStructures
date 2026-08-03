public class FindGene {

    public String findGeneString(String dna){
        int startIndex = dna.indexOf("ATG");

        int stopIndex =  dna.indexOf("TAA", startIndex+3);//second argument is the place from where(index) we need to start our search in the string
        return dna.substring(startIndex,stopIndex+3);
    }
    
}
