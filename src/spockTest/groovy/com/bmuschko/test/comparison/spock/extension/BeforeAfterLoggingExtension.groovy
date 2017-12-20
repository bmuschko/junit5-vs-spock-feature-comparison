package com.bmuschko.test.comparison.spock.extension

import org.spockframework.runtime.extension.IGlobalExtension
import org.spockframework.runtime.model.SpecInfo

class BeforeAfterLoggingExtension implements IGlobalExtension {

    @Override
    void start() {
    }

    @Override
    void visitSpec(SpecInfo spec) {
        spec.addListener(new BeforeAfterEventListener())
    }

    @Override
    void stop() {
    }
}
