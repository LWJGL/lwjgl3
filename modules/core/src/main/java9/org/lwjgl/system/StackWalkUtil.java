/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.util.*;

// Multi-release version: Java 9

/** Stack-walking utilities. */
final class StackWalkUtil {

    private StackWalkUtil() {
    }

    static boolean stackWalkIsSameMethod(Object a, Object b) {
        StackWalker.StackFrame f1 = (StackWalker.StackFrame)a;
        StackWalker.StackFrame f2 = (StackWalker.StackFrame)b;

        return f1.getClassName().equals(f2.getClassName()) && f1.getMethodName().equals(f2.getMethodName());
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return Arrays.stream(((StackWalker.StackFrame[])a))
            .map(StackWalker.StackFrame::toStackTraceElement)
            .toArray(StackTraceElement[]::new);
    }

    static Object stackWalkGetMethod(int offset, Class<?> after) {
        return StackWalker.getInstance()
            .walk(s -> s
                .skip(offset)
                .filter(f -> !f.getClassName().startsWith(after.getName()))
                .findFirst()
            )
            .orElseThrow(IllegalStateException::new);
    }

    static Object[] stackWalkGetTrace(int offset, Class<?> after) {
        return StackWalker.getInstance()
            .walk(s -> s
                .skip(offset)
                .filter(f -> !f.getClassName().startsWith(after.getName()))
                .toArray(StackWalker.StackFrame[]::new)
            );
    }

}