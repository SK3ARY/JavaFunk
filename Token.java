public class Token {
    private TokenType tokenType;
    public static String tokensList = "+-><,.[]";
    
    public Token(TokenType type) {
        this.tokenType = type;
    }
    
    public TokenType getType() {
        return this.tokenType;
    }
    
    public boolean match(Token token) {
        return this.tokenType == token.getType();
    }
    
    public boolean match(TokenType tokenType) {
        return this.tokenType == tokenType;
    }
}