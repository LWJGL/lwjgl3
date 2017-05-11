/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.util.*;

// Multi-release version: Java 8

/** Stack-walking utilities. */
final class StackWalkUtil {

    private StackWalkUtil() {
    }

    static boolean stackWalkIsSameMethod(Object a, Object b) {
        StackTraceElement f1 = (StackTraceElement)a;
        StackTraceElement f2 = (StackTraceElement)b;

        return f1.getClassName().equals(f2.getClassName()) && f1.getMethodName() == f2.getMethodName();
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return (StackTraceElement[])a;
    }

    static Object stackWalkGetMethod(int offset, Class<?> after) {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();

        for (int i = offset; i < stacktrace.length; i++) {
            if (!stacktrace[i].getClassName().startsWith(after.getName())) {
                return stacktrace[i];
            }
        }

        throw new IllegalStateException();
    }

    static Object[] stackWalkGetTrace(int offset, Class<?> after) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        int i = Math.min(stackTrace.length, offset + 1);
        for (; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().startsWith(after.getName())) {
                break;
            }
        }

        return Arrays.copyOfRange(stackTrace, i, stackTrace.length);
    }

}