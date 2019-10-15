package com.chriscodes.christopherfortune.unittestingpractice;

import android.content.Context;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.chriscodes.christopherfortune.unittestingpractice", appContext.getPackageName());
    }

    @Test
    public void testAddition(){

        onView(withId(R.id.num_5_btn)).perform(click());

        onView(withId(R.id.plus_btn)).perform(click());

        onView(withId(R.id.num_5_btn)).perform(click());

        onView(withId(R.id.equal_btn)).perform(click());

        String additionToCheck = "10.0";
        onView(withId(R.id.math_txtVw)).check(matches(withText(additionToCheck)));

        onView(withId(R.id.clear_btn)).perform(click());
    }

    @Test
    public void testSubtraction(){

        onView(withId(R.id.num_2_btn)).perform(click());

        onView(withId(R.id.num_4_btn)).perform(click());

        onView(withId(R.id.minus_btn)).perform(click());

        onView(withId(R.id.num_1_btn)).perform(click());

        onView(withId(R.id.num_2_btn)).perform(click());

        onView(withId(R.id.equal_btn)).perform(click());

        String additionToCheck = "12.0";
        onView(withId(R.id.math_txtVw)).check(matches(withText(additionToCheck)));

        onView(withId(R.id.clear_btn)).perform(click());
    }

    @Test
    public void testMultiplication(){

        onView(withId(R.id.num_9_btn)).perform(click());

        onView(withId(R.id.multi_btn)).perform(click());

        onView(withId(R.id.num_9_btn)).perform(click());

        onView(withId(R.id.equal_btn)).perform(click());

        String additionToCheck = "81.0";
        onView(withId(R.id.math_txtVw)).check(matches(withText(additionToCheck)));

        onView(withId(R.id.clear_btn)).perform(click());
    }

    @Test
    public void testDivision(){

        onView(withId(R.id.num_8_btn)).perform(click());

        onView(withId(R.id.div_btn)).perform(click());

        onView(withId(R.id.num_2_btn)).perform(click());

        onView(withId(R.id.equal_btn)).perform(click());

        String additionToCheck = "4.0";
        onView(withId(R.id.math_txtVw)).check(matches(withText(additionToCheck)));

        onView(withId(R.id.clear_btn)).perform(click());
    }

    @Test
    public void testClear(){

        onView(withId(R.id.num_2_btn)).perform(click());

        onView(withId(R.id.clear_btn)).perform(click());

        onView(withId(R.id.math_txtVw)).check(matches(withText("")));
    }
}
