/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_copy_texture_levels.txt">APPLE_copy_texture_levels</a> extension.
 * 
 * <p>This extension provides an efficient path for copying a contiguous subset of mipmap levels from one texture to the matching subset of mipmap levels of
 * another texture, where matches are determined by the equality of a level's dimensions.</p>
 * 
 * <p>This extension is dependent on the existence of the extension EXT_texture_storage. Immutable textures are used to guarantee that storage is allocated
 * up front for the source and destination textures and that the internal formats of those textures are sized the same.</p>
 * 
 * <p>An efficient copy can be achieved by implementations because the internal storage requirements are the same between textures and will remain unchanged
 * when moving data. It is expected that in all cases, moving levels from one texture to another is a simple copy operation without any necessary
 * conversion. This extension can be used as an alternative to TEXTURE_BASE_LEVEL. In some implementations, changing the value of TEXTURE_BASE_LEVEL can
 * incur a costly re-allocation at runtime.</p>
 * 
 * <p>Texture streaming is an expected use case for this extension. For example, a developer may want to stream in a larger base level for a given texture
 * from a storage device. To achieve this, a copy of the current mipmap levels are made into a destination whose storage was specified to accommodate the
 * source levels and the larger base level. The efficiency of the copy without conversion allows for the smaller mipmap levels to be in place while the
 * larger base level is being read from the storage device and uploaded.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link EXTTextureStorage EXT_texture_storage}.</p>
 */
public class APPLECopyTextureLevels {

    static { GLES.initialize(); }

    protected APPLECopyTextureLevels() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyTextureLevelsAPPLE ] ---

    public static native void glCopyTextureLevelsAPPLE(@NativeType("GLuint") int destinationTexture, @NativeType("GLuint") int sourceTexture, @NativeType("GLint") int sourceBaseLevel, @NativeType("GLsizei") int sourceLevelCount);

}