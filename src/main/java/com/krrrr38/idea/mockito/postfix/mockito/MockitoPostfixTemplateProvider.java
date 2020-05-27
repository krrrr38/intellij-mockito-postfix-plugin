package com.krrrr38.idea.mockito.postfix.mockito;

import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoDoNothingTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoDoReturnTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoDoThrowTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoMockTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoSpyTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoVerifyTemplate;
import com.krrrr38.idea.mockito.postfix.mockito.template.MockitoWhenTemplate;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class MockitoPostfixTemplateProvider extends JavaPostfixTemplateProvider {
    private final Set<PostfixTemplate> templates;

    public MockitoPostfixTemplateProvider() {
        templates = new HashSet<>();
        templates.add(new MockitoDoNothingTemplate());
        templates.add(new MockitoDoReturnTemplate());
        templates.add(new MockitoDoThrowTemplate());
        templates.add(new MockitoMockTemplate());
        templates.add(new MockitoSpyTemplate());
        templates.add(new MockitoVerifyTemplate());
        templates.add(new MockitoWhenTemplate());
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }
}
