package com.krrrr38.idea.mockito.postfix.bddmockito;

import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoGivenTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoThenTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoWillAnswerTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoWillCallRealMethodTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoWillDoNothingTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoWillReturnTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoWillTemplate;
import com.krrrr38.idea.mockito.postfix.bddmockito.template.BDDMockitoWillThrowTemplate;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BDDMockitoPostfixTemplateProvider extends JavaPostfixTemplateProvider {
    private final Set<PostfixTemplate> templates;

    public BDDMockitoPostfixTemplateProvider() {
        templates = new HashSet<>();
        templates.add(new BDDMockitoGivenTemplate());
        templates.add(new BDDMockitoThenTemplate());
        templates.add(new BDDMockitoWillAnswerTemplate());
        templates.add(new BDDMockitoWillCallRealMethodTemplate());
        templates.add(new BDDMockitoWillDoNothingTemplate());
        templates.add(new BDDMockitoWillReturnTemplate());
        templates.add(new BDDMockitoWillTemplate());
        templates.add(new BDDMockitoWillThrowTemplate());
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }
}
