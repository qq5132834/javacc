//
// Generated by JTB 1.3.2
//

package oo.syntaxtree;

/**
 * Grammar production:
 * f0 -> AdditiveExpression()
 */
@SuppressWarnings("all")
public class Expression implements Node {
   public AdditiveExpression f0;

   public Expression(AdditiveExpression n0) {
      f0 = n0;
   }

   public void accept(oo.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(oo.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(oo.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(oo.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

