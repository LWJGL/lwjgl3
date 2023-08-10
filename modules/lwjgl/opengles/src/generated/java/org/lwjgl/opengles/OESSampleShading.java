/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_sample_shading.txt">OES_sample_shading</a> extension.
 * 
 * <p>In standard multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample. This can cause
 * aliasing where the fragment shader input values are used to generate a result that doesn't antialias itself, for example with alpha-tested
 * transparency.</p>
 * 
 * <p>This extension adds the ability to explicitly request that an implementation use a minimum number of unique set of fragment computation inputs when
 * multisampling a pixel. Specifying such a requirement can reduce aliasing that results from evaluating the fragment computations too few times per
 * pixel.</p>
 * 
 * <p>This extension adds new global state that controls the minimum number of samples for which attribute data is independently interpolated. When enabled,
 * all fragment-shading operations are executed independently on each sample.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class OESSampleShading {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetInteger64v.
     */
    public static final int GL_SAMPLE_SHADING_OES = 0x8C36;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv. */
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_OES = 0x8C37;

    protected OESSampleShading() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMinSampleShadingOES ] ---

    public static native void glMinSampleShadingOES(@NativeType("GLfloat") float value);

}