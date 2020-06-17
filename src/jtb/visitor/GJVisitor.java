//
// Generated by JTB 1.3.2
//

package jtb.visitor;
import jtb.syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

@SuppressWarnings("all")
public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> Expression()
    * f1 -> ";"
    */
   public R visit(Start n, A argu);

   /**
    * f0 -> AdditiveExpression()
    */
   public R visit(Expression n, A argu);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
    */
   public R visit(AdditiveExpression n, A argu);

   /**
    * f0 -> UnaryExpression()
    * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
    */
   public R visit(MultiplicativeExpression n, A argu);

   /**
    * f0 -> "(" Expression() ")"
    *       | Identifier()
    *       | MyInteger()
    */
   public R visit(UnaryExpression n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(MyInteger n, A argu);

}
