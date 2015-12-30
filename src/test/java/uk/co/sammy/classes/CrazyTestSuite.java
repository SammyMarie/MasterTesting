package uk.co.sammy.classes;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import uk.co.sammy.interfaces.CrazyTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(CrazyTests.class)
@Suite.SuiteClasses({SomeTest.class, OtherTests.class})
public class CrazyTestSuite {
}