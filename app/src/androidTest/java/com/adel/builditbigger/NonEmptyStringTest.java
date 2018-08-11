package com.adel.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NonEmptyStringTest extends AndroidTestCase {

    private Context appContext = InstrumentationRegistry.getTargetContext();
    private static final String LOG_TAG = "NonEmptyStringTest";

    @Test
    public void test() {
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");

        boolean gettingAnEx = false;
        String result;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(appContext, null);
        endpointsAsyncTask.execute();

        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            gettingAnEx = true;
            result = e.getMessage();
        }
        Assert.assertNotNull(result);
        Assert.assertTrue(result, !gettingAnEx);
    }
}
