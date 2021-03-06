/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author JuanCamilo
 */
public class Interpreter {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("input.txt")));
        PSGrammarLexer lexer = new PSGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PSGrammarParser parser = new PSGrammarParser(tokens);
        ParseTree tree = parser.init();
        PSIntVisitor<Object> loader = new PSIntVisitor<>();
        System.out.println("output: " + loader.visit(tree));
    }

}
