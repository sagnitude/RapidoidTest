package org.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sagnitude on 2016/6/4.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({BasicTests.class, TestSerialization.class, TestObjectSerialization.class})
public class FullTestSuite {
}
