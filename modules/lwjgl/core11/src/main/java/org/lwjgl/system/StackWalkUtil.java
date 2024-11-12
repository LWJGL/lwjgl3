/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import java.util.*;

import static org.lwjgl.system.APIUtil.*;

/** Java 9 version of {@code {@link StackWalkUtil}}. */
final class StackWalkUtil {

    private static final StackWalker STACKWALKER = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

    static {
        apiLog("Java 11 stack walker enabled");
    }

    private StackWalkUtil() {
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return Arrays.stream(((StackWalker.StackFrame[])a))
            .map(StackWalker.StackFrame::toStackTraceElement)
            .toArray(StackTraceElement[]::new);
    }

    static Object stackWalkGetMethod(Class<?> after) {
        return STACKWALKER.walk(s -> {
            Iterator<StackWalker.StackFrame> iter = s.iterator();
            iter.next(); // skip this method
            iter.next(); // skip MemoryStack::pop

            StackWalker.StackFrame frame;
            do {
                frame = iter.next();
            } while (frame.getDeclaringClass() == after && iter.hasNext());

            return frame;
        });
    }

    private static boolean isSameMethod(StackWalker.StackFrame a, StackWalker.StackFrame b) {
        return isSameMethod(a, b, b.getMethodName());
    }

    private static boolean isSameMethod(StackWalker.StackFrame a, StackWalker.StackFrame b, String methodName) {
        return a.getDeclaringClass() == b.getDeclaringClass() &&
               a.getMethodName().equals(methodName);
    }

    private static boolean isAutoCloseable(StackWalker.StackFrame element, StackWalker.StackFrame pushed) {
        // Java 9 try-with-resources: synthetic $closeResource
        if (isSameMethod(element, pushed, "$closeResource")) {
            return true;
        }

        // Kotlin T.use: kotlin.AutoCloseable::closeFinally
        if ("kotlin.jdk7.AutoCloseableKt".equals(element.getClassName()) && "closeFinally".equals(element.getMethodName())) {
            return true;
        }

        return false;
    }

    static @Nullable Object stackWalkCheckPop(Class<?> after, Object pushedObj) {
        StackWalker.StackFrame pushed = (StackWalker.StackFrame)pushedObj;

        return StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE).walk(s -> {
            Iterator<StackWalker.StackFrame> iter = s.iterator();
            iter.next();
            iter.next();

            StackWalker.StackFrame element;
            do {
                element = iter.next();
            } while (element.getDeclaringClass() == after && iter.hasNext());

            if (isSameMethod(element, pushed)) {
                return null;
            }

            if (iter.hasNext() && isAutoCloseable(element, pushed)) {
                // Some runtimes use a separate method to call AutoCloseable::close in try-with-resources blocks.
                // That method suppresses any exceptions thrown by close if necessary.
                // When that happens, the pop is 1 level deeper than expected.
                element = iter.next();
                if (isSameMethod(element, pushed)) {
                    return null;
                }
            }

            return element;
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