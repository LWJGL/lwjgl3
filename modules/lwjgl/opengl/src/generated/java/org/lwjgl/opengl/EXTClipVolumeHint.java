/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_clip_volume_hint.txt">EXT_clip_volume_hint</a> extension.
 * 
 * <p>EXT_clip_volume_hint provides a mechanism for applications to indicate that they do not require clip volume clipping for primitives. It allows
 * applications to maximize performance in situations where they know that clipping is unnecessary. EXT_clip_volume_hint is only an indication, though,
 * and implementations are free to ignore it.</p>
 */
public final class EXTClipVolumeHint {

    /** Accepted by the target parameter of Hint and the pname parameter of GetBooleanv, GetDoublev, GetFloatv and GetIntegerv. */
    public static final int GL_CLIP_VOLUME_CLIPPING_HINT_EXT = 0x80F0;

    private EXTClipVolumeHint() {}

}