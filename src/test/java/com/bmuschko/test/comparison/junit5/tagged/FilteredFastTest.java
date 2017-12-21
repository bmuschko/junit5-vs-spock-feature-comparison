package com.bmuschko.test.comparison.junit5.tagged;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.bmuschko.test.comparison.junit5.tagged")
@IncludeTags("fast")
public class FilteredFastTest {
}
