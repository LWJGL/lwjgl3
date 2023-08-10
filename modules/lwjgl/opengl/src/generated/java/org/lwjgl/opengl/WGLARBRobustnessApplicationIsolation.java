/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_robustness_application_isolation.txt">WGL_ARB_robustness_application_isolation</a> extension.
 * 
 * <p>GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
 * WGL_ARB_robustness_application_isolation provides stronger guarantees about the possible side-effects of a graphics reset.</p>
 * 
 * <p>If the graphics driver advertises the WGL_ARB_robustness_application_isolation extension string, then the driver guarantees that if a particular
 * application causes a graphics reset to occur:</p>
 * 
 * <ol>
 * <li>No other application on the system is affected by the graphics reset.</li>
 * <li>No other application on the system receives any notification that the graphics reset occurred.</li>
 * </ol>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and {@link WGLARBCreateContextRobustness WGL_ARB_create_context_robustness}.</p>
 */
public final class WGLARBRobustnessApplicationIsolation {

    /**
     * Accepted as a bit in the attribute value for {@link WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in the {@code attribList} argument to
     * {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB}.
     */
    public static final int WGL_CONTEXT_RESET_ISOLATION_BIT_ARB = 0x8;

    private WGLARBRobustnessApplicationIsolation() {}

}