/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_conservative_rasterization.txt">INTEL_conservative_rasterization</a> extension.
 * 
 * <p>Regular rasterization includes fragments with at least one sample covered by a polygon. Conservative rasterization includes all fragments that are at
 * least partially covered by the polygon.</p>
 * 
 * <p>In some use cases, it is also important to know if a fragment is fully covered by a polygon, i.e. if all parts of the fragment are within the polygon.
 * An application may, for example, want to process fully covered fragments different from the "edge" pixels. This extension adds an option for the
 * fragment shader to receive this information via {@code gl_SampleMaskIn[]}.</p>
 */
public final class INTELConservativeRasterization {

    /** Accepted by the {@code target} parameter of {@link GLES20#glEnable Enable}, {@link GLES20#glDisable Disable}, {@link GLES20#glIsEnabled IsEnabled}. */
    public static final int GL_CONSERVATIVE_RASTERIZATION_INTEL = 0x83FE;

    private INTELConservativeRasterization() {}

}