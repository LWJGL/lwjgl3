/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTWin32KeyedMutex {

    static { GLES.initialize(); }

    protected EXTWin32KeyedMutex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glAcquireKeyedMutexWin32EXT ] ---

    /** {@code GLboolean glAcquireKeyedMutexWin32EXT(GLuint memory, GLuint64 key, GLuint timeout)} */
    @NativeType("GLboolean")
    public static native boolean glAcquireKeyedMutexWin32EXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long key, @NativeType("GLuint") int timeout);

    // --- [ glReleaseKeyedMutexWin32EXT ] ---

    /** {@code GLboolean glReleaseKeyedMutexWin32EXT(GLuint memory, GLuint64 key)} */
    @NativeType("GLboolean")
    public static native boolean glReleaseKeyedMutexWin32EXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long key);

}