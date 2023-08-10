/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_framebuffer_foveated.txt">QCOM_framebuffer_foveated</a> extension.
 * 
 * <p>Foveated rendering is a technique that aims to reduce fragment processing workload and bandwidth by reducing the average resolution of a framebuffer.
 * Perceived image quality is kept high by leaving the focal point of rendering at full resolution.</p>
 * 
 * <p>It exists in two major forms:</p>
 * 
 * <ul>
 * <li>Static foveated(lens matched) rendering: where the gaze point is fixed with a large fovea region and designed to match up with the lens
 * characteristics.</li>
 * <li>Eye-tracked foveated rendering: where the gaze point is continuously tracked by a sensor to allow a smaller fovea region (further reducing average
 * resolution)</li>
 * </ul>
 * 
 * <p>Traditionally foveated rendering involves breaking a framebuffer's area into smaller regions such as bins, tiles, viewports, or layers which are
 * rendered to individually. Each of these regions has the geometry projected or scaled differently so that the net resolution of these layers is less
 * than the original framebuffer's resolution. When these regions are mapped back to the original framebuffer, they create a rendered result with
 * decreased quality as pixels get further from the focal point.</p>
 * 
 * <p>Foveated rendering is currently achieved by large modifications to an applications render pipelines to manually implement the required geometry
 * amplifications, blits, and projection changes. This presents a large implementation cost to an application developer and is generally inefficient as it
 * can not make use of a platforms unique hardware features or optimized software paths. This extension aims to address these problems by exposing
 * foveated rendering in an explicit and vendor neutral way, and by providing an interface with minimal changes to how an application specifies its
 * framebuffer.</p>
 */
public class QCOMFramebufferFoveated {

    static { GLES.initialize(); }

    /** Allowed in the config input in FramebufferFoveationConfigQCOM. */
    public static final int
        GL_FOVEATION_ENABLE_BIT_QCOM            = 0x1,
        GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM = 0x2;

    protected QCOMFramebufferFoveated() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferFoveationConfigQCOM ] ---

    public static native void nglFramebufferFoveationConfigQCOM(int fbo, int numLayers, int focalPointsPerLayer, int requestedFeatures, long providedFeatures);

    public static void glFramebufferFoveationConfigQCOM(@NativeType("GLuint") int fbo, @NativeType("GLuint") int numLayers, @NativeType("GLuint") int focalPointsPerLayer, @NativeType("GLuint") int requestedFeatures, @NativeType("GLuint *") IntBuffer providedFeatures) {
        if (CHECKS) {
            check(providedFeatures, 1);
        }
        nglFramebufferFoveationConfigQCOM(fbo, numLayers, focalPointsPerLayer, requestedFeatures, memAddress(providedFeatures));
    }

    // --- [ glFramebufferFoveationParametersQCOM ] ---

    public static native void glFramebufferFoveationParametersQCOM(@NativeType("GLuint") int fbo, @NativeType("GLuint") int layer, @NativeType("GLuint") int focalPoint, @NativeType("GLfloat") float focalX, @NativeType("GLfloat") float focalY, @NativeType("GLfloat") float gainX, @NativeType("GLfloat") float gainY, @NativeType("GLfloat") float foveaArea);

    /** Array version of: {@link #glFramebufferFoveationConfigQCOM FramebufferFoveationConfigQCOM} */
    public static void glFramebufferFoveationConfigQCOM(@NativeType("GLuint") int fbo, @NativeType("GLuint") int numLayers, @NativeType("GLuint") int focalPointsPerLayer, @NativeType("GLuint") int requestedFeatures, @NativeType("GLuint *") int[] providedFeatures) {
        long __functionAddress = GLES.getICD().glFramebufferFoveationConfigQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(providedFeatures, 1);
        }
        callPV(fbo, numLayers, focalPointsPerLayer, requestedFeatures, providedFeatures, __functionAddress);
    }

}