/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTX11SyncObject {

    static { GL.initialize(); }

    public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;

    protected EXTX11SyncObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportSyncEXT ] ---

    /** {@code GLsync glImportSyncEXT(GLenum external_sync_type, GLintptr external_sync, GLbitfield flags)} */
    @NativeType("GLsync")
    public static native long glImportSyncEXT(@NativeType("GLenum") int external_sync_type, @NativeType("GLintptr") long external_sync, @NativeType("GLbitfield") int flags);

}