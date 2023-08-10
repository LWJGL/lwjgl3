/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/SGI/GLX_SGI_video_sync.txt">GLX_SGI_video_sync</a> extension.
 * 
 * <p>This extension provides a means for synchronization with the video frame rate of a monitor.</p>
 */
public class GLXSGIVideoSync {

    protected GLXSGIVideoSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetVideoSyncSGI ] ---

    /** Unsafe version of: {@link #glXGetVideoSyncSGI GetVideoSyncSGI} */
    public static int nglXGetVideoSyncSGI(long count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(count, __functionAddress);
    }

    /**
     * Returns the value of the video sync counter in {@code count}. Zero is returned if the call is successful.
     *
     * @param count the video sync counter value
     */
    @NativeType("GLint")
    public static int glXGetVideoSyncSGI(@NativeType("unsigned int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nglXGetVideoSyncSGI(memAddress(count));
    }

    // --- [ glXWaitVideoSyncSGI ] ---

    /** Unsafe version of: {@link #glXWaitVideoSyncSGI WaitVideoSyncSGI} */
    public static int nglXWaitVideoSyncSGI(int divisor, int remainder, long count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXWaitVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(divisor, remainder, count, __functionAddress);
    }

    /**
     * Puts the calling process to sleep until
     * 
     * <p>{@code (C mod D) = R}</p>
     * 
     * <p>where {@code C} is the video sync counter, {@code D} is specified by the {@code divisor} parameter of {@code glXWaitVideoSyncSGI}, and {@code R} is
     * specified by the {@code remainder} parameter of {@code glXWaitVideoSyncSGI}. {@code glXWaitVideoSyncSGI} returns the current video sync counter value in
     * {@code count}. Zero is returned by {@code glXWaitVideoSyncSGI} if it is successful.</p>
     *
     * @param divisor   the divisor value
     * @param remainder the remainder value
     * @param count     the video sync counter value
     */
    @NativeType("GLint")
    public static int glXWaitVideoSyncSGI(int divisor, int remainder, @NativeType("unsigned int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nglXWaitVideoSyncSGI(divisor, remainder, memAddress(count));
    }

    /** Array version of: {@link #glXGetVideoSyncSGI GetVideoSyncSGI} */
    @NativeType("GLint")
    public static int glXGetVideoSyncSGI(@NativeType("unsigned int *") int[] count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
            check(count, 1);
        }
        return callPI(count, __functionAddress);
    }

    /** Array version of: {@link #glXWaitVideoSyncSGI WaitVideoSyncSGI} */
    @NativeType("GLint")
    public static int glXWaitVideoSyncSGI(int divisor, int remainder, @NativeType("unsigned int *") int[] count) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXWaitVideoSyncSGI;
        if (CHECKS) {
            check(__functionAddress);
            check(count, 1);
        }
        return callPI(divisor, remainder, count, __functionAddress);
    }

}