/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.util.*;

import static org.lwjgl.system.APIUtil.*;

/** Java 9 version of {@code {@link StackWalkUtil}}. */
final class StackWalkUtil {

    static {
        apiLog("Java 9 stack walker enabled");
    }

    private StackWalkUtil() {
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return Arrays.stream(((StackWalker.StackFrame[])a))
            .map(StackWalker.StackFrame::toStackTraceElement)
            .toArray(StackTraceElement[]::new);
    }

    static Object stackWalkGetMethod(Class<?> after) {
        return StackWalker.getInstance()
            .walk(s -> s
                .skip(2)
                .filter(f -> !f.getClassName().startsWith(after.getName()))
                .findFirst()
            )
            .orElseThrow(IllegalStateException::new);
    }

    private static boolean isSameMethod(StackWalker.StackFrame a, StackWalker.StackFrame b) {
        return isSameMethod(a, b, b.getMethodName());
    }

    private static boolean isSameMethod(StackWalker.StackFrame a, StackWalker.StackFrame b, String methodName) {
        return a.getMethodName().equals(methodName) &&
               a.getClassName().equals(b.getClassName()) &&
               Objects.equals(a.getFileName(), b.getFileName());
    }

    private static boolean isAutoCloseable(StackWalker.StackFrame element, StackWalker.StackFrame pushed) {
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

    static Object stackWalkCheckPop(Class<?> after, Object pushedObj) {
        return StackWalker.getInstance().walk(s -> {
            Iterator<StackWalker.StackFrame> iter = s
                .skip(2)
                .dropWhile(f -> f.getClassName().startsWith(after.getName()))
                .iterator();

            if (iter.hasNext()) {
                StackWalker.StackFrame element = iter.next();

                StackWalker.StackFrame pushed = (StackWalker.StackFrame)pushedObj;
                if (isSameMethod(element, pushed)) {
                    return null;
                }

                if (isAutoCloseable(element, pushed) && iter.hasNext()) {
                    // Some runtimes use a separate method to call AutoCloseable::close in try-with-resources blocks.
                    // That method suppresses any exceptions thrown by close if necessary.
                    // When that happens, the pop is 1 level deeper than expected.
                    element = iter.next();
                    if (isSameMethod(pushed, element)) {
                        return null;
                    }
                }

                return element;
            }

            throw new IllegalStateException();
        });
    }

    static Object[] stackWalkGetTrace() {
        return StackWalker.getInstance()
            .walk(s -> s
                .skip(2)
                .dropWhile(f -> f.getClassName().startsWith("org.lwjgl.system.Memory"))
                .toArray(StackWalker.StackFrame[]::new)
            );
    }

}