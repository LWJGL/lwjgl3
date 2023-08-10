/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_ES3_1_compatibility.txt">ARB_ES3_1_compatibility</a> extension.
 * 
 * <p>This extension adds support for features of OpenGL ES 3.1 that are missing from OpenGL 4.4. Enabling these features will ease the process of porting
 * applications from OpenGL ES 3.1 to OpenGL. Enabling these features will ease the process of porting applications from OpenGL ES 3.1 to OpenGL.</p>
 * 
 * <p>In particular this adds the following features:</p>
 * 
 * <ul>
 * <li>a new {@link #glMemoryBarrierByRegion MemoryBarrierByRegion} API which is potentially more efficient for specific localized memory access patterns.</li>
 * <li>increases the minimum required size of SSBOs to 2^27 (128 MB).</li>
 * <li>support for GLSL ES version 310.</li>
 * <li>a new GLSL built-in function, {@code imageAtomicExchange}, which performs atomic exchanges on {@code r32f} floating point images.</li>
 * <li>a new GLSL built-in fragment shader input, {@code gl_HelperInvocation}, that identifies whether the current fragment shader input is a helper
 * invocation. Fragment shader code can use this variable to skip performing operations that are useless or potentially dangerous for helper
 * invocations.</li>
 * <li>a new GLSL built-in constant for the maximum supported samples: {@code gl_MaxSamples}.</li>
 * <li>a number of new GLSL built-in constants mirroring the API limits for image uniforms: {@code gl_Max * ImageUniforms},
 * {@code gl_MaxCombinedShaderOutputResources}.</li>
 * <li>new GLSL built-in functions which extend {@code mix()} to select between int, uint, and bool components.</li>
 * <li>add the "coherent" qualifier to all memory variables taken by the GLSL built-in {@code atomic*} and {@code imageAtomic*} functions.</li>
 * <li></li>
 * <li></li>
 * </ul>
 * 
 * <p>Requires {@link GL44 OpenGL 4.4}, {@link ARBES2Compatibility ARB_ES2_compatibility}, {@link ARBES3Compatibility ARB_ES3_compatibility}. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public class ARBES31Compatibility {

    static { GL.initialize(); }

    protected ARBES31Compatibility() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMemoryBarrierByRegion ] ---

    /**
     * Behaves like {@link GL42C#glMemoryBarrier MemoryBarrier}, with two differences:
     * 
     * <p>First, it narrows the region under consideration so that only reads/writes of prior fragment shaders that are invoked for a smaller region of the
     * framebuffer will be completed/reflected prior to subsequent reads/write of following fragment shaders. The size of the region is implementation
     * dependent and may be as small as one framebuffer pixel.</p>
     * 
     * <p>Second, it only applies to memory transactions that may be read by or written by a fragment shader.</p>
     * 
     * <p>When barriers is {@link GL42#GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}, shader memory accesses will be synchronized relative to all these barrier bits, but not to other
     * barrier bits specific to {@link GL42C#glMemoryBarrier MemoryBarrier}. This implies that reads/writes for scatter/gather-like algorithms may or may not be
     * completed/reflected after a MemoryBarrierByRegion command. However, for uses such as deferred shading, where a linked list of visible
     * surfaces with the head at a framebuffer address may be constructed, and the entirety of the list is only dependent on previous executions at that
     * framebuffer address, MemoryBarrierByRegion may be significantly more efficient than {@link GL42C#glMemoryBarrier MemoryBarrier}.</p>
     *
     * @param barriers the barriers to insert. One or more of:<br><table><tr><td>{@link GL42#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}</td><td>{@link GL42#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}</td><td>{@link GL42#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}</td><td>{@link GL42#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}</td><td>{@link GL42#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}</td></tr></table>
     */
    public static void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers) {
        GL45C.glMemoryBarrierByRegion(barriers);
    }

}