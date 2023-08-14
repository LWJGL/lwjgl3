/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.system.jni.*;
import org.openjdk.jmh.annotations.*;

public class JNIOverheadTest {

    @Benchmark
    public void jni_noop() {
        JNINativeInterface.noop();
    }

}