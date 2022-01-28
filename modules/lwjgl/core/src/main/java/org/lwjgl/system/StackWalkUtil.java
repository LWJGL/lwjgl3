/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.util.*;

/**
 * Stack-walking utilities.
 *
 * <p>On Java 9 these methods are implemented using {@code java.lang.StackWalker}, which has much lower overhead.</p>
 */
final class StackWalkUtil {

    private StackWalkUtil() {
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return (StackTraceElement[])a;
    }

    static Object stackWalkGetMethod(Class<?> after) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        for (int i = 3; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().startsWith(after.getName())) {
                return stackTrace[i];
            }
        }

        throw new IllegalStateException();
    }

    private static boolean isSameMethod(StackTraceElement a, StackTraceElement b) {
        return isSameMethod(a, b, b.getMethodName());
    }

    private static boolean isSameMethod(StackTraceElement a, StackTraceElement b, String methodName) {
        return a.getMethodName().equals(methodName) &&
               a.getClassName().equals(b.getClassName()) &&
               Objects.equals(a.getFileName(), b.getFileName());
    }

    private static boolean isAutoCloseable(StackTraceElement element, StackTraceElement pushed) {
        // Java 9 try-with-resources: synthetic $closeResource
        if (isSameMethod(element, pushed, "$closeResource")) {
            return true;
        }

        // Kotlin T.use: kotlin.AutoCloseable::closeFinally
        if ("closeFinally".equals(element.getMethodName()) && "AutoCloseable.kt".equals(element.getFileName())) {
            return true;
        }

        return false;
    }

    @Nullable
    static Object stackWalkCheckPop(Class<?> after, Object pushedObj) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        for (int i = 3; i < stackTrace.length; i++) {
            StackTraceElement element = stackTrace[i];
            if (element.getClassName().startsWith(after.getName())) {
                continue;
            }

            StackTraceElement pushed = (StackTraceElement)pushedObj;
            if (isSameMethod(element, pushed)) {
                return null;
            }

            if (isAutoCloseable(element, pushed) && i + 1 < stackTrace.length) {
                // Some runtimes use a separate method to call AutoCloseable::close in try-with-resources blocks.
                // That method suppresses any exceptions thrown by close if necessary.
                // When that happens, the pop is 1 level deeper than expected.
                element = stackTrace[i + 1];
                if (isSameMethod(pushed, stackTrace[i + 1])) {
                    return null;
                }
            }

            return element;
        }

        throw new IllegalStateException();
    }

    static Object[] stackWalkGetTrace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        int i = 3;
        for (; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().startsWith("org.lwjgl.system.Memory")) {
                break;
            }
        }

        return Arrays.copyOfRange(stackTrace, i, stackTrace.length);
    }

}