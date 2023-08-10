/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/GLX_ARB_robustness_application_isolation.txt">GLX_ARB_robustness_application_isolation</a> extension.
 * 
 * <p>GL_ARB_robustness and GLX_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
 * GLX_ARB_robustness_application_isolation provides stronger guarantees about the possible side-effects of a graphics reset.</p>
 * 
 * <p>If the graphics driver advertises the GLX_ARB_robustness_application_isolation extension string, then the driver guarantees that if a particular
 * application causes a graphics reset to occur:</p>
 * 
 * <ol>
 * <li>No other application on the system is affected by the graphics reset.</li>
 * <li>No other application on the system receives any notification that the graphics reset occurred.</li>
 * </ol>
 * 
 * <p>Requires {@link GLX14 GLX 1.4} and {@link GLXARBCreateContextRobustness GLX_ARB_create_context_robustness}.</p>
 */
public final class GLXARBRobustnessApplicationIsolation {

    /**
     * Accepted as a bit in the attribute value for {@link GLXARBCreateContext#GLX_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in the {@code attrib_list} argument to
     * {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}.
     */
    public static final int GLX_CONTEXT_RESET_ISOLATION_BIT_ARB = 0x8;

    private GLXARBRobustnessApplicationIsolation() {}

}