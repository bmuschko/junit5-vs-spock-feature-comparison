package com.bmuschko.test.comparison.spock.extension

import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension
import org.spockframework.runtime.model.SpecInfo

class BeforeAfterLoggingExtension extends AbstractAnnotationDrivenExtension<BeforeAfterLogging> {

    @Override
    void visitSpecAnnotation(BeforeAfterLogging annotation, SpecInfo spec) {
        spec.addListener(new BeforeAfterEventListener())
    }
}
