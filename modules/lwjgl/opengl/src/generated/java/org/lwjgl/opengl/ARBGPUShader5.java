/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gpu_shader5.txt">ARB_gpu_shader5</a> extension.
 * 
 * <p>This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new GPUs, extending the
 * capabilities of version 1.50 of the OpenGL Shading Language. Shaders using the new functionality provided by this extension should enable this
 * functionality via the construct:</p>
 * 
 * <pre><code>
 * #extension GL_ARB_gpu_shader5 : require     (or enable)</code></pre>
 * 
 * <p>This extension provides a variety of new features for all shader types, including:</p>
 * 
 * <ul>
 * <li>support for indexing into arrays of samplers using non-constant indices, as long as the index doesn't diverge if multiple shader invocations are run
 * in lockstep;</li>
 * <li>extending the uniform block capability of OpenGL 3.1 and 3.2 to allow shaders to index into an array of uniform blocks;</li>
 * <li>support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and function overloading
 * infrastructure to support new data types introduced by other extensions;</li>
 * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
 * issues (which might cause cracking in tessellation);</li>
 * <li>new built-in functions supporting:
 * 
 * <ul>
 * <li>fused floating-point multiply-add operations;</li>
 * <li>splitting a floating-point number into a significand and exponent (frexp), or building a floating-point number from a significand and exponent
 * (ldexp);</li>
 * <li>integer bitfield manipulation, including functions to find the position of the most or least significant set bit, count the number of one bits,
 * and bitfield insertion, extraction, and reversal;</li>
 * <li>packing and unpacking vectors of small fixed-point data types into a larger scalar; and</li>
 * <li>convert floating-point values to or from their integer bit encodings;</li>
 * </ul></li>
 * <li>extending the textureGather() built-in functions provided by {@link ARBTextureGather ARB_texture_gather}:
 * 
 * <ul>
 * <li>allowing shaders to select any single component of a multi-component texture to produce the gathered 2x2 footprint;</li>
 * <li>allowing shaders to perform a per-sample depth comparison when gathering the 2x2 footprint using for shadow sampler types;</li>
 * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
 * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
 * </ul></li>
 * </ul>
 * 
 * <p>This extension also provides some new capabilities for individual shader types, including:</p>
 * 
 * <ul>
 * <li>support for instanced geometry shaders, where a geometry shader may be run multiple times for each primitive, including a built-in
 * {@code gl_InvocationID} to identify the invocation number;</li>
 * <li>support for emitting vertices in a geometry program where each vertex emitted may be directed independently at a specified vertex stream (as
 * provided by <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback3.txt">ARB_transform_feedback3</a>), and where each shader output is associated with a stream;</li>
 * <li>support for reading a mask of covered samples in a fragment shader; and</li>
 * <li>support for interpolating a fragment shader input at a programmable offset relative to the pixel center, a programmable sample number, or at the
 * centroid.</li>
 * </ul>
 * 
 * <p>Requires {@link GL32 GL32} and GLSL 1.50. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public final class ARBGPUShader5 {

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
    public static final int
        GL_MAX_GEOMETRY_SHADER_INVOCATIONS    = 0x8E5A,
        GL_MIN_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5B,
        GL_MAX_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5C,
        GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D,
        GL_MAX_VERTEX_STREAMS                 = 0x8E71;

    private ARBGPUShader5() {}

}