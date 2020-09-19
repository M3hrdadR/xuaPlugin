// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.XuaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class XuaEntityBlockImpl extends ASTWrapperPsiElement implements XuaEntityBlock {

  public XuaEntityBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XuaVisitor visitor) {
    visitor.visitEntityBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XuaVisitor) accept((XuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XuaExpression getExpression() {
    return findNotNullChildByClass(XuaExpression.class);
  }

}
