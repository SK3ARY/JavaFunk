import java.util.ArrayList;

public class JavaFunk {
    public JavaFunk(String code) {
        Lexer lexer = new Lexer(code);
        ArrayList<Token> tokens = lexer.createTokens();
        
        // for(int i = 0; i < tokens.size(); i++) {
        //     System.out.println(tokens.get(i).getType());
        // }
        
        Parser parser = new Parser(tokens);
        parser.execute();
    }
}