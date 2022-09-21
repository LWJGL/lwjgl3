/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;
import org.lwjgl.system.macosx.*;

import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.macosx.LibC.*;
import static org.lwjgl.system.macosx.ObjCRuntime.*;

/**
 * Contains checks for the event loop issues on OS X.
 *
 * <p>GLFW can only be used on the main thread and only if that thread is the first thread in the process. This requires running the JVM with
 * {@code -XstartOnFirstThread}, which means that other window toolkits (AWT/Swing, JavaFX, etc.) cannot be used at the same time.</p>
 *
 * <p>Another window toolkit <em>can</em> be used if GLFW windows are never shown (created with {@link GLFW#GLFW_VISIBLE GLFW_VISIBLE} equal to
 * {@link GLFW#GLFW_FALSE GLFW_FALSE}) and only used as contexts for offscreen rendering. This is possible if the window toolkit has initialized and created
 * the shared application (NSApp) before GLFW is initialized.</p>
 */
final class EventLoop {

    private EventLoop() {
    }

    static void check() {
        if (Platform.get() == Platform.MACOSX && !isMainThread()) {
            // The only way to avoid a crash is if the shared application (NSApp) has been created by something else
            throw new IllegalStateException(
                isJavaStartedOnFirstThread()
                    ? "GLFW may only be used on the main thread. This check may be disabled with Configuration.GLFW_CHECK_THREAD0."
                    : "GLFW may only be used on the main thread and that thread must be the first thread in the process. Please run " +
                      "the JVM with -XstartOnFirstThread. This check may be disabled with Configuration.GLFW_CHECK_THREAD0."
            );
        }
    }

    private static boolean isMainThread() {
        if (!Configuration.GLFW_CHECK_THREAD0.get(true) || Configuration.GLFW_LIBRARY_NAME.get("").contains("glfw_async")) {
            return true;
        }

        long objc_msgSend = ObjCRuntime.getLibrary().getFunctionAddress("objc_msgSend");

        long NSThread      = objc_getClass("NSThread");
        long currentThread = invokePPP(NSThread, sel_getUid("currentThread"), objc_msgSend);

        return invokePPZ(currentThread, sel_getUid("isMainThread"), objc_msgSend);
    }

    private static boolean isJavaStartedOnFirstThread() {
        return "1".equals(System.getenv().get("JAVA_STARTED_ON_FIRST_THREAD_" + getpid()));
    }

}