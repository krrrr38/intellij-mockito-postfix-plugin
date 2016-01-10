package com.krrrr38.idea.mockito.postfix;

import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.krrrr38.idea.mockito.postfix.template.DoNothingTemplate;
import com.krrrr38.idea.mockito.postfix.template.DoReturnTemplate;
import com.krrrr38.idea.mockito.postfix.template.DoThrowTemplate;
import com.krrrr38.idea.mockito.postfix.template.MockTemplate;
import com.krrrr38.idea.mockito.postfix.template.SpyTemplate;
import com.krrrr38.idea.mockito.postfix.template.VerifyTemplate;
import com.krrrr38.idea.mockito.postfix.template.WhenTemplate;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class MockitoPostfixTemplateProvider extends JavaPostfixTemplateProvider {
    private final Set<PostfixTemplate> templates;

    public MockitoPostfixTemplateProvider() {
        templates = new HashSet<>();
        templates.add(new DoNothingTemplate());
        templates.add(new DoReturnTemplate());
        templates.add(new DoThrowTemplate());
        templates.add(new MockTemplate());
        templates.add(new SpyTemplate());
        templates.add(new VerifyTemplate());
        templates.add(new WhenTemplate());
    }

    @NotNull
    @Override
    public Set<PostfixTemplate> getTemplates() {
        return templates;
    }
}
