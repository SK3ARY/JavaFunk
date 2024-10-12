import java.util.ArrayList;

public class Lexer {
    private String code;
    private int position;
    private String lastChar;
    private ArrayList<Token> tokens;
    
    private boolean isEOF() {
        return this.position + 1 == this.code.length();
    }
    
    private void advance() {
        this.lastChar = this.currentChar();
        this.position++;
    }
    
    private String currentChar() {
        return this.code.substring(this.position, this.position + 1);
    }
    
    private boolean isValid() {
        return Token.tokensList.contains(this.currentChar());
    }
    
    public ArrayList<Token> createTokens() {
        while(!this.isEOF()) {
            if(this.isValid()) {
                // System.out.println(this.currentChar());
                if(this.currentChar().equals("+")) {
                    this.tokens.add(new Token(TokenType.INC));
                    
                } else if(this.currentChar().equals("-")) {
                    this.tokens.add(new Token(TokenType.DEC));
                
                } else if(this.currentChar().equals(">")) {
                    this.tokens.add(new Token(TokenType.ROV));
                
                } else if(this.currentChar().equals("<")) {
                    this.tokens.add(new Token(TokenType.LOV));
                
                } else if(this.currentChar().equals(",")) {
                    this.tokens.add(new Token(TokenType.GET));
                
                } else if(this.currentChar().equals(".")) {
                    this.tokens.add(new Token(TokenType.FET));
                
                } else if(this.currentChar().equals("[")) {
                    this.tokens.add(new Token(TokenType.LSRT));
                    
                } else if(this.currentChar().equals("]")) {
                    this.tokens.add(new Token(TokenType.LEND));
                    
                }
            }
            
            this.advance();
        }
        
        this.tokens.add(new Token(TokenType.END));
        return this.tokens;
    }
    
    public Lexer(String code) {
        this.code = code + "\0";
        this.position = 0;
        this.tokens = new ArrayList<Token>();
    }
}
