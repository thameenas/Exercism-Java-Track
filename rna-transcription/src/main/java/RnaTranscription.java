class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand=new StringBuilder("");
        if(dnaStrand.isEmpty())
            return dnaStrand;
        
        for(int i=0; i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='C')
                rnaStrand.append("G");
            if(dnaStrand.charAt(i)=='G')
                rnaStrand.append("C");
            if(dnaStrand.charAt(i)=='T')
                rnaStrand.append("A");
            if(dnaStrand.charAt(i)=='A')
                rnaStrand.append("U");
            
        }
        return rnaStrand.toString();

    }

}
