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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_buffer_load.txt">NV_shader_buffer_load</a> extension.
 * 
 * <p>At a very coarse level, GL has evolved in a way that allows applications to replace many of the original state machine variables with blocks of
 * user-defined data. For example, the current vertex state has been augmented by vertex buffer objects, fixed-function shading state and parameters have
 * been replaced by shaders/programs and constant buffers, etc. Applications switch between coarse sets of state by binding objects to the context or to
 * other container objects (e.g. vertex array objects) instead of manipulating state variables of the context. In terms of the number of GL commands
 * required to draw an object, modern applications are orders of magnitude more efficient than legacy applications, but this explosion of objects bound to
 * other objects has led to a new bottleneck - pointer chasing and CPU L2 cache misses in the driver, and general L2 cache pollution.</p>
 * 
 * <p>This extension provides a mechanism to read from a flat, 64-bit GPU address space from programs/shaders, to query GPU addresses of buffer objects at the
 * API level, and to bind buffer objects to the context in such a way that they can be accessed via their GPU addresses in any shader stage.</p>
 * 
 * <p>The intent is that applications can avoid re-binding buffer objects or updating constants between each Draw call and instead simply use a VertexAttrib
 * (or TexCoord, or InstanceID, or...) to "point" to the new object's state. In this way, one of the cheapest "state" updates (from the CPU's point of
 * view) can be used to effect a significant state change in the shader similarly to how a pointer change may on the CPU. At the same time, this relieves
 * the limits on how many buffer objects can be accessed at once by shaders, and allows these buffer object accesses to be exposed as C-style pointer
 * dereferences in the shading language.</p>
 * 
 * <p>As a very simple example, imagine packing a group of similar objects' constants into a single buffer object and pointing your program at object
 * &lt;i&gt; by setting {@code glVertexAttribI1iEXT(attrLoc, i);} and using a shader as such:</p>
 * 
 * <pre><code>
 * struct MyObjectType {
 *     mat4x4 modelView;
 *     vec4 materialPropertyX;
 *     // etc.
 * };
 * uniform MyObjectType *allObjects;
 * in int objectID; // bound to attrLoc
 * 
 * ...
 * 
 * mat4x4 thisObjectsMatrix = allObjects[objectID].modelView;
 * // do transform, shading, etc.</code></pre>
 * 
 * <p>This is beneficial in much the same way that texture arrays allow choosing between similar, but independent, texture maps with a single coordinate
 * identifying which slice of the texture to use. It also resembles instancing, where a lightweight change (incrementing the instance ID) can be used to
 * generate a different and interesting result, but with additional flexibility over instancing because the values are app-controlled and not a single incrementing counter.</p>
 * 
 * <p>Dependent pointer fetches are allowed, so more complex scene graph structures can be built into buffer objects providing significant new flexibility in
 * the use of shaders. Another simple example, showing something you can't do with existing functionality, is to do dependent fetches into many buffer
 * objects:</p>
 * 
 * <pre><code>
 * GenBuffers(N, dataBuffers);
 * GenBuffers(1, &amp;pointerBuffer);
 * 
 * GLuint64EXT gpuAddrs[N];
 * for (i = 0; i &lt; N; ++i) {
 *     BindBuffer(target, dataBuffers[i]);
 *     BufferData(target, size[i], myData[i], STATIC_DRAW);
 * 
 *     // get the address of this buffer and make it resident.
 *     GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
 *                               gpuaddrs[i]);
 *     MakeBufferResidentNV(target, READ_ONLY);
 * }
 * 
 * GLuint64EXT pointerBufferAddr;
 * BindBuffer(target, pointerBuffer);
 * BufferData(target, sizeof(GLuint64EXT)*N, gpuAddrs, STATIC_DRAW);
 * GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
 *                           &amp;pointerBufferAddr);
 * MakeBufferResidentNV(target, READ_ONLY);
 * 
 * // now in the shader, we can use a double indirection
 * vec4 **ptrToBuffers = pointerBufferAddr;
 * vec4 *ptrToBufferI = ptrToBuffers[i];</code></pre>
 * 
 * <p>This allows simultaneous access to more buffers than {@link EXTBindableUniform EXT_bindable_uniform} ({@link EXTBindableUniform#GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT MAX_VERTEX_BINDABLE_UNIFORMS_EXT}, etc.) and each can be larger than
 * {@link EXTBindableUniform#GL_MAX_BINDABLE_UNIFORM_SIZE_EXT MAX_BINDABLE_UNIFORM_SIZE_EXT}.</p>
 */
public class NVShaderBufferLoad {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBufferParameterui64vNV, GetNamedBufferParameterui64vNV. */
    public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int GL_GPU_ADDRESS_NV = 0x8F34;

    /** Accepted by the {@code value} parameter of GetIntegerui64vNV. */
    public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;

    protected NVShaderBufferLoad() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMakeBufferResidentNV ] ---

    public static native void glMakeBufferResidentNV(@NativeType("GLenum") int target, @NativeType("GLenum") int access);

    // --- [ glMakeBufferNonResidentNV ] ---

    public static native void glMakeBufferNonResidentNV(@NativeType("GLenum") int target);

    // --- [ glIsBufferResidentNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsBufferResidentNV(@NativeType("GLenum") int target);

    // --- [ glMakeNamedBufferResidentNV ] ---

    public static native void glMakeNamedBufferResidentNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access);

    // --- [ glMakeNamedBufferNonResidentNV ] ---

    public static native void glMakeNamedBufferNonResidentNV(@NativeType("GLuint") int buffer);

    // --- [ glIsNamedBufferResidentNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsNamedBufferResidentNV(@NativeType("GLuint") int buffer);

    // --- [ glGetBufferParameterui64vNV ] ---

    public static native void nglGetBufferParameterui64vNV(int target, int pname, long params);

    public static void glGetBufferParameterui64vNV(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameterui64vNV(target, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glGetBufferParameterui64NV(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetBufferParameterui64vNV(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferParameterui64vNV ] ---

    public static native void nglGetNamedBufferParameterui64vNV(int buffer, int pname, long params);

    public static void glGetNamedBufferParameterui64vNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glGetNamedBufferParameterui64NV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegerui64vNV ] ---

    public static native void nglGetIntegerui64vNV(int value, long result);

    public static void glGetIntegerui64vNV(@NativeType("GLenum") int value, @NativeType("GLuint64EXT *") LongBuffer result) {
        if (CHECKS) {
            check(result, 1);
        }
        nglGetIntegerui64vNV(value, memAddress(result));
    }

    @NativeType("void")
    public static long glGetIntegerui64NV(@NativeType("GLenum") int value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer result = stack.callocLong(1);
            nglGetIntegerui64vNV(value, memAddress(result));
            return result.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniformui64NV ] ---

    public static native void glUniformui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long value);

    // --- [ glUniformui64vNV ] ---

    public static native void nglUniformui64vNV(int location, int count, long value);

    public static void glUniformui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglUniformui64vNV(location, value.remaining(), memAddress(value));
    }

    // --- [ glGetUniformui64vNV ] ---

    public static native void nglGetUniformui64vNV(int program, int location, long params);

    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformui64vNV(program, location, memAddress(params));
    }

    @NativeType("void")
    public static long glGetUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformui64vNV(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniformui64NV ] ---

    public static native void glProgramUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long value);

    // --- [ glProgramUniformui64vNV ] ---

    public static native void nglProgramUniformui64vNV(int program, int location, int count, long value);

    public static void glProgramUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglProgramUniformui64vNV(program, location, value.remaining(), memAddress(value));
    }

    /** Array version of: {@link #glGetBufferParameterui64vNV GetBufferParameterui64vNV} */
    public static void glGetBufferParameterui64vNV(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameterui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetNamedBufferParameterui64vNV GetNamedBufferParameterui64vNV} */
    public static void glGetNamedBufferParameterui64vNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetIntegerui64vNV GetIntegerui64vNV} */
    public static void glGetIntegerui64vNV(@NativeType("GLenum") int value, @NativeType("GLuint64EXT *") long[] result) {
        long __functionAddress = GL.getICD().glGetIntegerui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(result, 1);
        }
        callPV(value, result, __functionAddress);
    }

    /** Array version of: {@link #glUniformui64vNV Uniformui64vNV} */
    public static void glUniformui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glGetUniformui64vNV GetUniformui64vNV} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformui64vNV ProgramUniformui64vNV} */
    public static void glProgramUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

}