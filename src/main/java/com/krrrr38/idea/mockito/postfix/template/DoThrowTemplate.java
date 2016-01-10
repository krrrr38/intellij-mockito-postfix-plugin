package com.krrrr38.idea.mockito.postfix.template;

import com.intellij.codeInsight.template.Template;
import com.intellij.codeInsight.template.TemplateManager;
import com.intellij.codeInsight.template.impl.MacroCallNode;
import com.intellij.codeInsight.template.macro.SuggestVariableNameMacro;
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate;
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public class DoThrowTemplate extends StringBasedPostfixTemplate {

    public DoThrowTemplate() {
        super("doThrow", "doThrow(ex).when(expr)",
                JavaPostfixTemplatesUtils.selectorAllExpressionsWithCurrentOffset(JavaPostfixTemplatesUtils.IS_NOT_PRIMITIVE));
    }

    @Override
    public Template createTemplate(TemplateManager templateManager, String s) {
        Template template = super.createTemplate(templateManager, s);
        template.setValue(Template.Property.USE_STATIC_IMPORT_IF_POSSIBLE, true);
        return template;
    }

    @Nullable
    @Override
    public String getTemplateString(PsiElement psiElement) {
        return "org.mockito.Mockito.doThrow($ex$).when($expr$)$END$";
    }

    @Override
    public void setVariables(Template template, PsiElement element) {
        super.setVariables(template, element);
        template.addVariable("ex", new MacroCallNode(new SuggestVariableNameMacro()), false);
    }
}
