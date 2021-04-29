
package l9_assignment2_runner;

public class CustomStringTokenizer extends  StringTokenizer{
        
    private int countTokens;

    public CustomStringTokenizer(String string) {
        super(string);
        
    }
    
    public int countTokens(){
        int totalTokens = super.countTokens();
        int tokensNoDigits = totalTokens;
        String token;
        for(int i = 0; i<totalTokens; i++){
            token = super.nextToken();
            for(int j = 0; j<token.length(); j++){
                if(Character.isDigit(token.charAt(j))){
                    tokensNoDigits--;
                    break;
                }
            }
        }
    
        return tokensNoDigits;
    
    }
    
}
