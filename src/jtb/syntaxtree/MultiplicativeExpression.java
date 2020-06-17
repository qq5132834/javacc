//
// Generated by JTB 1.3.2
//

package jtb.syntaxtree;

/**
 * Grammar production:
 * f0 -> UnaryExpression()
 * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
 */
@SuppressWarnings("all")
public class MultiplicativeExpression implements Node {
   public UnaryExpression f0;
   public NodeListOptional f1;

   public MultiplicativeExpression(UnaryExpression n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jtb.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jtb.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jtb.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jtb.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

