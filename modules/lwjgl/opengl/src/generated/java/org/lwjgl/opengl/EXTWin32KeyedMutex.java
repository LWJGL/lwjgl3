/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_win32_keyed_mutex.txt">EXT_win32_keyed_mutex</a> extension.
 * 
 * <p>Direct3D image objects may have a built-in synchronization primitive associated with them that can be used to synchronize access to their contents
 * across process and API boundaries. This extension provides access to that synchronization primitive via two new commands that operate on GL memory
 * objects.</p>
 * 
 * <p>Requires {@link EXTMemoryObject EXT_memory_object}.</p>
 */
public class EXTWin32KeyedMutex {

    static { GL.initialize(); }

    protected EXTWin32KeyedMutex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAcquireKeyedMutexWin32EXT ] ---

    /**
     * Blocks GL command processing until a keyed mutex is acquired.
     *
     * @param memory  identifies which keyed mutex to acquire
     * @param key     is the mutex value to wait for
     * @param timeout the time, in milliseconds, to wait before failing the acquire operation
     */
    @NativeType("GLboolean")
    public static native boolean glAcquireKeyedMutexWin32EXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long key, @NativeType("GLuint") int timeout);

    // --- [ glReleaseKeyedMutexWin32EXT ] ---

    /**
     * Releases a keyed mutex after all prior GL command processing has completed.
     *
     * @param memory identifies the keyed mutex to release
     * @param key    the mutex value set by the release operation
     */
    @NativeType("GLboolean")
    public static native boolean glReleaseKeyedMutexWin32EXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long key);

}