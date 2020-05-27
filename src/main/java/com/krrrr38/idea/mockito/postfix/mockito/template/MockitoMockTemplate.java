package com.krrrr38.idea.mockito.postfix.mockito.template;

import com.intellij.codeInsight.template.Template;
import com.intellij.codeInsight.template.TemplateManager;
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils;
import com.intellij.psi.PsiClassObjectAccessExpression;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLocalVariable;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MockitoMockTemplate extends StringBasedPostfixTemplate {

    public MockitoMockTemplate() {
        super("mock", "mock(expr)",
                JavaPostfixTemplatesUtils.selectorAllExpressionsWithCurrentOffset(JavaPostfixTemplatesUtils.IS_NOT_PRIMITIVE),
                null);
    }

    @Override
    public Template createTemplate(TemplateManager templateManager, String s) {
        Template template = super.createTemplate(templateManager, s);
        template.setValue(Template.Property.USE_STATIC_IMPORT_IF_POSSIBLE, true);
        return template;
    }

    @Nullable
    @Override
    public String getTemplateString(@NotNull PsiElement psiElement) {
        String clazz;
        if (psiElement instanceof PsiReference) {
            // foo.mock
            PsiReference psiReference = (PsiReference) psiElement;
            PsiLocalVariable psiLocalVariable = (PsiLocalVariable) psiReference.resolve();
            if (psiLocalVariable == null) {
                return psiElement.getText();
            }
            PsiType psiType = psiLocalVariable.getType();
            clazz = psiType.getPresentableText() + ".class";
        } else if (psiElement instanceof PsiClassObjectAccessExpression) {
            // String.class.mock
            PsiClassObjectAccessExpression psiClassObjectAccessExpression = (PsiClassObjectAccessExpression) psiElement;
            String classText = psiClassObjectAccessExpression.getText();
            if (classText == null) {
                return psiElement.getText();
            }
            clazz = classText;
        } else {
            return psiElement.getText();
        }

        return "org.mockito.Mockito.mock(" + clazz + ")$END$";
    }
}
