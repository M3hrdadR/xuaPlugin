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

public class XuaNumericConstantImpl extends ASTWrapperPsiElement implements XuaNumericConstant {

  public XuaNumericConstantImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XuaVisitor visitor) {
    visitor.visitNumericConstant(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XuaVisitor) accept((XuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBinConstant() {
    return findChildByType(BINCONSTANT);
  }

  @Override
  @Nullable
  public PsiElement getDecConstant() {
    return findChildByType(DECCONSTANT);
  }

  @Override
  @Nullable
  public PsiElement getHexConstant() {
    return findChildByType(HEXCONSTANT);
  }

  @Override
  @Nullable
  public PsiElement getOctConstant() {
    return findChildByType(OCTCONSTANT);
  }

}