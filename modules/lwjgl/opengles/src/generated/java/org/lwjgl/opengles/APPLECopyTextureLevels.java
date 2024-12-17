/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class APPLECopyTextureLevels {

    static { GLES.initialize(); }

    protected APPLECopyTextureLevels() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyTextureLevelsAPPLE ] ---

    /** {@code void glCopyTextureLevelsAPPLE(GLuint destinationTexture, GLuint sourceTexture, GLint sourceBaseLevel, GLsizei sourceLevelCount)} */
    public static native void glCopyTextureLevelsAPPLE(@NativeType("GLuint") int destinationTexture, @NativeType("GLuint") int sourceTexture, @NativeType("GLint") int sourceBaseLevel, @NativeType("GLsizei") int sourceLevelCount);

}