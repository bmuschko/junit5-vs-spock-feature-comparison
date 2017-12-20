package com.bmuschko.test.comparison.spock.extension

import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.model.FeatureInfo

class BeforeAfterEventListener extends AbstractRunListener {

    @Override
    void beforeFeature(FeatureInfo feature) {
        println "Starting test method ${feature.description.className}.${feature.description.methodName}"
    }

    @Override
    void afterFeature(FeatureInfo feature) {
        println "Finishing test method ${feature.description.className}.${feature.description.methodName}"
    }
}
