import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Parser {
    private ArrayList<Token> tokens;
    private int position;
    private Token lastToken;
    private Stack<Integer> loopStack;
    
    private int pointer = 0;
    private ArrayList<Integer> cells;
    
    private void initializeCells() {
        for(int i = 0; i < 50000; i++) {
            cells.add(0);
        }
    }
    
    private boolean isEOF() {
        return this.tokens.get(this.position).match(TokenType.END);
    }
    
    private void advance() {
        if(this.isEOF()) return;
        this.lastToken = this.currentToken();
        this.position++;
    }
    
    private Token currentToken() {
        return this.tokens.get(this.position);
    }
    
    private int getCellValue() {
        return this.cells.get(this.pointer);
    }
    
    private char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char character = input.charAt(0);
        scanner.close();
        return character;
    }
    
    public void execute() {
        while(!this.isEOF()) {
            // System.out.println(this.cells.get(0));
            if(this.currentToken().match(TokenType.INC)) {
                this.cells.set(this.pointer, this.getCellValue() + 1);
                
            } else if(this.currentToken().match(TokenType.DEC)) {
                this.cells.set(this.pointer, this.getCellValue() - 1);
                
            } else if(this.currentToken().match(TokenType.ROV)) {
                if((this.pointer + 1) < 50000) this.pointer++;
                
            } else if(this.currentToken().match(TokenType.LOV)) {
                if((this.pointer - 1) >= 0) this.pointer--;
            
            } else if(this.currentToken().match(TokenType.GET)) {
                int input = (int) this.getUserInput();
                this.cells.set(this.pointer, input);
                
            } else if(this.currentToken().match(TokenType.FET)) {
                char[] character = Character.toChars(this.cells.get(this.pointer));
                System.out.print(new String(character));
                
            } else if(this.currentToken().match(TokenType.LSRT)) {
                this.loopStack.push(this.position);

            } else if(this.currentToken().match(TokenType.LEND) || this.isEOF()) {
                if(!(this.loopStack.size() > 0)) continue;
                
                // Handle loops
                if(this.getCellValue() != 0) {
                    this.position = this.loopStack.peek();
                } else {
                    this.loopStack.pop();
                }
            }
            
            // System.out.println("\n\n{Position = " + this.position + "; Pointer = " + this.pointer + "; Token = " + this.currentToken().getType() + "}");
            // for(int i = 0; i < 20; i++) {
            //     System.out.print("Cell [" + i + "] = " + this.cells.get(i) + "; ");
            // }

            this.advance();
        }
    }
    
    public Parser(ArrayList<Token> tokens) {
        this.tokens = tokens;
        // this.tokens.add(new Token(TokenType.END));
        
        this.position = 0;
        
        this.loopStack = new Stack<Integer>();
        this.cells = new ArrayList<Integer>();
        this.initializeCells();
    }
}