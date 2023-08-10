/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gl_spirv.txt">ARB_gl_spirv</a> extension.
 * 
 * <p>This is version 100 of the GL_ARB_gl_spirv extension.</p>
 * 
 * <p>This extension does two things:</p>
 * 
 * <ol>
 * <li>Allows a SPIR-V module to be specified as containing a programmable shader stage, rather than using GLSL, whatever the source language was used to
 * create the SPIR-V module.</li>
 * <li>Modifies GLSL to be a source language for creating SPIR-V modules for OpenGL consumption. Such GLSL can be used to create such SPIR-V modules,
 * outside of the OpenGL runtime.</li>
 * </ol>
 * 
 * <p>Requires {@link GL33 OpenGL 3.3}.</p>
 */
public class ARBGLSPIRV {

    static { GL.initialize(); }

    /** Accepted by the {@code binaryformat} parameter of {@link GL41C#glShaderBinary ShaderBinary}. */
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;

    /** Accepted by the {@code pname} parameter of {@link GL20C#glGetShaderiv GetShaderiv}. */
    public static final int GL_SPIR_V_BINARY_ARB = 0x9552;

    protected ARBGLSPIRV() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSpecializeShaderARB ] ---

    /**
     * Unsafe version of: {@link #glSpecializeShaderARB SpecializeShaderARB}
     *
     * @param numSpecializationConstants the number of specialization constants whose values to set in this call
     */
    public static native void nglSpecializeShaderARB(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue);

    /**
     * Specializes a shader created from a SPIR-V module.
     * 
     * <p>Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
     * shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
     * SPIR-V module with it, through {@link GL41C#glShaderBinary ShaderBinary}.</p>
     * 
     * <p>Specialization does two things:</p>
     * 
     * <ul>
     * <li>Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.</li>
     * <li>Sets the values of all, or a subset of, the specialization constants in the SPIRV module.</li>
     * </ul>
     * 
     * <p>On successful shader specialization, the compile status for shader is set to {@link GL11#GL_TRUE TRUE}. On failure, the compile status for shader is set to {@link GL11#GL_FALSE FALSE} and
     * additional information about the cause of the failure may be available in the shader compilation log.</p>
     *
     * @param shader         the name of a shader object containing unspecialized SPIR-V as created from a successful call to {@link GL41C#glShaderBinary ShaderBinary} to which a SPIR-V module was
     *                       passed
     * @param pEntryPoint    a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader
     * @param pConstantIndex is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
     *                       module whose value to set.
     *                       
     *                       <p>Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.</p>
     * @param pConstantValue an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
     *                       {@code pConstantIndex}.
     *                       
     *                       <p>Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
     *                       may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.</p>
     */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") IntBuffer pConstantIndex, @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (CHECKS) {
            checkNT1(pEntryPoint);
            check(pConstantValue, pConstantIndex.remaining());
        }
        nglSpecializeShaderARB(shader, memAddress(pEntryPoint), pConstantIndex.remaining(), memAddress(pConstantIndex), memAddress(pConstantValue));
    }

    /**
     * Specializes a shader created from a SPIR-V module.
     * 
     * <p>Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
     * shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
     * SPIR-V module with it, through {@link GL41C#glShaderBinary ShaderBinary}.</p>
     * 
     * <p>Specialization does two things:</p>
     * 
     * <ul>
     * <li>Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.</li>
     * <li>Sets the values of all, or a subset of, the specialization constants in the SPIRV module.</li>
     * </ul>
     * 
     * <p>On successful shader specialization, the compile status for shader is set to {@link GL11#GL_TRUE TRUE}. On failure, the compile status for shader is set to {@link GL11#GL_FALSE FALSE} and
     * additional information about the cause of the failure may be available in the shader compilation log.</p>
     *
     * @param shader         the name of a shader object containing unspecialized SPIR-V as created from a successful call to {@link GL41C#glShaderBinary ShaderBinary} to which a SPIR-V module was
     *                       passed
     * @param pEntryPoint    a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader
     * @param pConstantIndex is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
     *                       module whose value to set.
     *                       
     *                       <p>Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.</p>
     * @param pConstantValue an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
     *                       {@code pConstantIndex}.
     *                       
     *                       <p>Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
     *                       may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.</p>
     */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") IntBuffer pConstantIndex, @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (CHECKS) {
            check(pConstantValue, pConstantIndex.remaining());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            nglSpecializeShaderARB(shader, pEntryPointEncoded, pConstantIndex.remaining(), memAddress(pConstantIndex), memAddress(pConstantValue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glSpecializeShaderARB SpecializeShaderARB} */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") int[] pConstantIndex, @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(pEntryPoint);
            check(pConstantValue, pConstantIndex.length);
        }
        callPPPV(shader, memAddress(pEntryPoint), pConstantIndex.length, pConstantIndex, pConstantValue, __functionAddress);
    }

    /** Array version of: {@link #glSpecializeShaderARB SpecializeShaderARB} */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") int[] pConstantIndex, @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pConstantValue, pConstantIndex.length);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            callPPPV(shader, pEntryPointEncoded, pConstantIndex.length, pConstantIndex, pConstantValue, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}