/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_compute_shader.txt">ARB_compute_shader</a> extension.
 * 
 * <p>Recent graphics hardware has become extremely powerful and a strong desire to harness this power for work (both graphics and non-graphics) that does not
 * fit the traditional graphics pipeline well has emerged. To address this, this extension adds a new single-stage program type known as a compute program.
 * This program may contain one or more compute shaders which may be launched in a manner that is essentially stateless. This allows arbitrary workloads to
 * be sent to the graphics hardware with minimal disturbance to the GL state machine.</p>
 * 
 * <p>In most respects, a compute program is identical to a traditional OpenGL program object, with similar status, uniforms, and other such properties. It
 * has access to many of the same resources as fragment and other shader types, such as textures, image variables, atomic counters, and so on. However, it
 * has no predefined inputs nor any fixed-function outputs. It cannot be part of a pipeline and its visible side effects are through its actions on images
 * and atomic counters.</p>
 * 
 * <p>OpenCL is another solution for using graphics processors as generalized compute devices. This extension addresses a different need. For example, OpenCL
 * is designed to be usable on a wide range of devices ranging from CPUs, GPUs, and DSPs through to FPGAs. While one could implement GL on these types of
 * devices, the target here is clearly GPUs. Another difference is that OpenCL is more full featured and includes features such as multiple devices,
 * asynchronous queues and strict IEEE semantics for floating point operations. This extension follows the semantics of OpenGL - implicitly synchronous,
 * in-order operation with single-device, single queue logical architecture and somewhat more relaxed numerical precision requirements. Although not as
 * feature rich, this extension offers several advantages for applications that can tolerate the omission of these features. Compute shaders are written in
 * GLSL, for example and so code may be shared between compute and other shader types. Objects are created and owned by the same context as the rest of the
 * GL, and therefore no interoperability API is required and objects may be freely used by both compute and graphics simultaneously without acquire-release
 * semantics or object type translation.</p>
 * 
 * <p>Requires {@link GL42 OpenGL 4.2}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBComputeShader {

    static { GL.initialize(); }

    /** Accepted by the {@code type} parameter of CreateShader and returned in the {@code params} parameter by GetShaderiv. */
    public static final int GL_COMPUTE_SHADER = 0x91B9;

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v. */
    public static final int
        GL_MAX_COMPUTE_UNIFORM_BLOCKS              = 0x91BB,
        GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS         = 0x91BC,
        GL_MAX_COMPUTE_IMAGE_UNIFORMS              = 0x91BD,
        GL_MAX_COMPUTE_SHARED_MEMORY_SIZE          = 0x8262,
        GL_MAX_COMPUTE_UNIFORM_COMPONENTS          = 0x8263,
        GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS      = 0x8264,
        GL_MAX_COMPUTE_ATOMIC_COUNTERS             = 0x8265,
        GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266,
        GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS      = 0x90EB;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v. */
    public static final int
        GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE,
        GL_MAX_COMPUTE_WORK_GROUP_SIZE  = 0x91BF;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;

    /** Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv. */
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
    public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;

    /** Accepted by the {@code stages} parameter of UseProgramStages. */
    public static final int GL_COMPUTE_SHADER_BIT = 0x20;

    protected ARBComputeShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDispatchCompute ] ---

    /**
     * Launches one or more compute work groups.
     *
     * @param num_groups_x the number of work groups to be launched in the X dimension
     * @param num_groups_y the number of work groups to be launched in the Y dimension
     * @param num_groups_z the number of work groups to be launched in the Z dimension
     */
    public static void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z) {
        GL43C.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    // --- [ glDispatchComputeIndirect ] ---

    /**
     * Launches one or more compute work groups using parameters stored in a buffer.
     * 
     * <p>The parameters addressed by indirect are packed a structure, which takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint num_groups_x;
     *     uint num_groups_y;
     *     uint num_groups_z;
     * } DispatchIndirectCommand;</code></pre>
     * 
     * <p>A call to {@code glDispatchComputeIndirect} is equivalent, assuming no errors are generated, to:</p>
     * 
     * <pre><code>
     * cmd = (const DispatchIndirectCommand *)indirect;
     * glDispatchCompute(cmd-&gt;num_groups_x, cmd-&gt;num_groups_y, cmd-&gt;num_groups_z);</code></pre>
     *
     * @param indirect the offset into the buffer object currently bound to the {@link GL43C#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER} buffer target at which the dispatch parameters are
     *                 stored.
     */
    public static void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect) {
        GL43C.glDispatchComputeIndirect(indirect);
    }

}