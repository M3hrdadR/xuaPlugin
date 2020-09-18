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

public class XuaTypeBlockImpl extends ASTWrapperPsiElement implements XuaTypeBlock {

  public XuaTypeBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XuaVisitor visitor) {
    visitor.visitTypeBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XuaVisitor) accept((XuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XuaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XuaExpression.class);
  }

  @Override
  @NotNull
  public XuaPhpBlock getPhpBlock() {
    return findNotNullChildByClass(XuaPhpBlock.class);
  }

}
