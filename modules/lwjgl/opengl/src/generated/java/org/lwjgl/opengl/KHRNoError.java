/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_no_error.txt">KHR_no_error</a> extension.
 * 
 * <p>With this extension enabled any behavior that generates a GL error will have undefined behavior. The reason this extension exists is performance can be
 * increased and power usage decreased. When this mode is used, a GL driver can have undefined behavior where it would have generated a GL error without
 * this extension. This could include application termination. In general this extension should be used after you have verified all the GL errors are
 * removed, and an application is not the kind that would check for GL errors and adjust behavior based on those errors.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public final class KHRNoError {

    /** If set in {@link GL30#GL_CONTEXT_FLAGS CONTEXT_FLAGS}, then no error behavior is enabled for this context. */
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR = 0x8;

    private KHRNoError() {}

}