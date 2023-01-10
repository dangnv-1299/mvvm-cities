package com.dang_hust.mvvm_cities;

import android.app.Instrumentation;
import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.Assert.*;

import kotlin.jvm.internal.Intrinsics;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4.class)
public final class ExampleInstrumentedTest {
    @Test
    public final void useAppContext() {
        Instrumentation var10000 = InstrumentationRegistry.getInstrumentation();
        Intrinsics.checkNotNullExpressionValue(var10000, "InstrumentationRegistry.getInstrumentation()");
        Context appContext = var10000.getTargetContext();
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        Assert.assertEquals("com.dang_hust.mvvm_cities", appContext.getPackageName());
    }
}