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

public class QCOMFramebufferFoveated {

    static { GLES.initialize(); }

    public static final int
        GL_FOVEATION_ENABLE_BIT_QCOM            = 0x1,
        GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM = 0x2;

    protected QCOMFramebufferFoveated() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferFoveationConfigQCOM ] ---

    /** {@code void glFramebufferFoveationConfigQCOM(GLuint fbo, GLuint numLayers, GLuint focalPointsPerLayer, GLuint requestedFeatures, GLuint * providedFeatures)} */
    public static native void nglFramebufferFoveationConfigQCOM(int fbo, int numLayers, int focalPointsPerLayer, int requestedFeatures, long providedFeatures);

    /** {@code void glFramebufferFoveationConfigQCOM(GLuint fbo, GLuint numLayers, GLuint focalPointsPerLayer, GLuint requestedFeatures, GLuint * providedFeatures)} */
    public static void glFramebufferFoveationConfigQCOM(@NativeType("GLuint") int fbo, @NativeType("GLuint") int numLayers, @NativeType("GLuint") int focalPointsPerLayer, @NativeType("GLuint") int requestedFeatures, @NativeType("GLuint *") IntBuffer providedFeatures) {
        if (CHECKS) {
            check(providedFeatures, 1);
        }
        nglFramebufferFoveationConfigQCOM(fbo, numLayers, focalPointsPerLayer, requestedFeatures, memAddress(providedFeatures));
    }

    // --- [ glFramebufferFoveationParametersQCOM ] ---

    /** {@code void glFramebufferFoveationParametersQCOM(GLuint fbo, GLuint layer, GLuint focalPoint, GLfloat focalX, GLfloat focalY, GLfloat gainX, GLfloat gainY, GLfloat foveaArea)} */
    public static native void glFramebufferFoveationParametersQCOM(@NativeType("GLuint") int fbo, @NativeType("GLuint") int layer, @NativeType("GLuint") int focalPoint, @NativeType("GLfloat") float focalX, @NativeType("GLfloat") float focalY, @NativeType("GLfloat") float gainX, @NativeType("GLfloat") float gainY, @NativeType("GLfloat") float foveaArea);

    /** {@code void glFramebufferFoveationConfigQCOM(GLuint fbo, GLuint numLayers, GLuint focalPointsPerLayer, GLuint requestedFeatures, GLuint * providedFeatures)} */
    public static void glFramebufferFoveationConfigQCOM(@NativeType("GLuint") int fbo, @NativeType("GLuint") int numLayers, @NativeType("GLuint") int focalPointsPerLayer, @NativeType("GLuint") int requestedFeatures, @NativeType("GLuint *") int[] providedFeatures) {
        long __functionAddress = GLES.getICD().glFramebufferFoveationConfigQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(providedFeatures, 1);
        }
        callPV(fbo, numLayers, focalPointsPerLayer, requestedFeatures, providedFeatures, __functionAddress);
    }

}