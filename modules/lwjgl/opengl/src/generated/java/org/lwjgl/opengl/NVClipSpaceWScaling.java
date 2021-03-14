/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Virtual Reality (VR) applications often involve a post-processing step to apply a "barrel" distortion to the rendered image to correct the "pincushion"
 * distortion introduced by the optics in a VR device. The barrel distorted image has lower resolution along the edges compared to the center. Since the
 * original image is rendered at high resolution, which is uniform across the complete image, a lot of pixels towards the edges do not make it to the
 * final post-processed image.
 * 
 * <p>This extension also provides a mechanism to render VR scenes at a non-uniform resolution, in particular a resolution that falls linearly from the
 * center towards the edges. This is achieved by scaling the "w" coordinate of the vertices in the clip space before perspective divide. The clip space
 * "w" coordinate of the vertices may be offset as of a function of "x" and "y" coordinates as follows:</p>
 * 
 * <pre><code>
 * w' = w + Ax + By</code></pre>
 * 
 * <p>In the intended use case for viewport position scaling, an application should use a set of 4 viewports, one for each of the 4 quadrants of a Cartesian
 * coordinate system. Each viewport is set to the dimension of the image, but is scissored to the quadrant it represents. The application should specify A
 * and B coefficients of the w-scaling equation above, that have the same value, but different signs, for each of the viewports. The signs of A and B
 * should match the signs of X and Y for the quadrant that they represent such that the value of "w'" will always be greater than or equal to the original
 * "w" value for the entire image. Since the offset to "w", (Ax + By), is always positive and increases with the absolute values of "x" and "y", the
 * effective resolution will fall off linearly from the center of the image to its edges.</p>
 */
public class NVClipSpaceWScaling {

    static { GL.initialize(); }

    /** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;

    /** Accepted by the {@code pname} parameter of GetBooleani_v, GetDoublei_v, GetIntegeri_v, GetFloati_v, and GetInteger64i_v. */
    public static final int
        GL_VIEWPORT_POSITION_W_SCALE_X_COEFF = 0x937D,
        GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF = 0x937E;

    protected NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportPositionWScaleNV ] ---

    /**
     * If {@link #GL_VIEWPORT_POSITION_W_SCALE_NV VIEWPORT_POSITION_W_SCALE_NV} is enabled, the w coordinates for each primitive sent to a given viewport will be scaled as a function of its x and y
     * coordinates using the following equation:
     * 
     * <pre><code>
     * w' = xcoeff * x + ycoeff * y + w;</code></pre>
     * 
     * <p>The coefficients for "x" and "y" used in the above equation depend on the viewport index, and are controlled by this command.</p>
     * 
     * <p>The viewport specified by {@code index} has its coefficients for "x" and "y" set to the {@code xcoeff} and {@code ycoeff} values. Specifying these
     * coefficients enables rendering images at a non-uniform resolution, in particular a resolution that falls off linearly from the center towards the
     * edges, which is useful for VR applications. VR applications often involve a post-processing step to apply a "barrel" distortion to the rendered image
     * to correct the "pincushion" distortion introduced by the optics in a VR device. The barrel distorted image, has lower resolution along the edges
     * compared to the center. Since the original image is rendered at high resolution, which is uniform across the complete image, a lot of pixels towards
     * the edges do not make it to the final post-processed image. VR applications may use the w-scaling to minimize the processing of unused fragments. To
     * achieve the intended effect, applications should use a set of 4 viewports one for each of the 4 quadrants of a Cartesian coordinate system. Each
     * viewport is set to the dimension of the image, but is scissored to the quadrant it represents. The application should specify the x and y coefficients
     * of the w-scaling equation above, that have the same value, but different signs, for each of the viewports. The signs of {@code xcoeff} and
     * {@code ycoeff} should match the signs of X and Y for the quadrant that they represent such that the value of "w'" will always be greater than or equal
     * to the original "w" value for the entire image. Since the offset to "w", (Ax + By), is always positive and increases with the absolute values of "x"
     * and "y", the effective resolution will fall off linearly from the center of the image to its edges.</p>
     *
     * @param index  the viewport index
     * @param xcoeff the x coefficient
     * @param ycoeff the y coefficient
     */
    public static native void glViewportPositionWScaleNV(@NativeType("GLuint") int index, @NativeType("GLfloat") float xcoeff, @NativeType("GLfloat") float ycoeff);

}