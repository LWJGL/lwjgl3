/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying shaders in a shader group.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the pipeline is created with {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR} and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineLibraryGroupHandles">pipelineLibraryGroupHandles</a> feature is enabled, {@code pShaderGroupCaptureReplayHandle} is inherited by all pipelines which link against this pipeline and remains bitwise identical for any pipeline which references this pipeline library.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code type} is {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR} then {@code generalShader} <b>must</b> be a valid index into {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} referring to a shader of {@link KHRRayTracingPipeline#VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}, {@link KHRRayTracingPipeline#VK_SHADER_STAGE_MISS_BIT_KHR SHADER_STAGE_MISS_BIT_KHR}, or {@link KHRRayTracingPipeline#VK_SHADER_STAGE_CALLABLE_BIT_KHR SHADER_STAGE_CALLABLE_BIT_KHR}</li>
 * <li>If {@code type} is {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR} then {@code closestHitShader}, {@code anyHitShader}, and {@code intersectionShader} <b>must</b> be {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}</li>
 * <li>If {@code type} is {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR} then {@code intersectionShader} <b>must</b> be a valid index into {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} referring to a shader of {@link KHRRayTracingPipeline#VK_SHADER_STAGE_INTERSECTION_BIT_KHR SHADER_STAGE_INTERSECTION_BIT_KHR}</li>
 * <li>If {@code type} is {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR} then {@code intersectionShader} <b>must</b> be {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}</li>
 * <li>{@code closestHitShader} <b>must</b> be either {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR} or a valid index into {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} referring to a shader of {@link KHRRayTracingPipeline#VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR SHADER_STAGE_CLOSEST_HIT_BIT_KHR}</li>
 * <li>{@code anyHitShader} <b>must</b> be either {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR} or a valid index into {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} referring to a shader of {@link KHRRayTracingPipeline#VK_SHADER_STAGE_ANY_HIT_BIT_KHR SHADER_STAGE_ANY_HIT_BIT_KHR}</li>
 * <li>If {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}{@code ::rayTracingPipelineShaderGroupHandleCaptureReplayMixed} is {@link VK10#VK_FALSE FALSE} then {@code pShaderGroupCaptureReplayHandle} <b>must</b> not be provided if it has not been provided on a previous call to ray tracing pipeline creation</li>
 * <li>If {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}{@code ::rayTracingPipelineShaderGroupHandleCaptureReplayMixed} is {@link VK10#VK_FALSE FALSE} then the caller <b>must</b> guarantee that no ray tracing pipeline creation commands with {@code pShaderGroupCaptureReplayHandle} provided execute simultaneously with ray tracing pipeline creation commands without {@code pShaderGroupCaptureReplayHandle} provided</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkRayTracingShaderGroupTypeKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRayTracingPipelineCreateInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRayTracingShaderGroupCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRayTracingShaderGroupTypeKHR {@link #type};
 *     uint32_t {@link #generalShader};
 *     uint32_t {@link #closestHitShader};
 *     uint32_t {@link #anyHitShader};
 *     uint32_t {@link #intersectionShader};
 *     void const * {@link #pShaderGroupCaptureReplayHandle};
 * }</code></pre>
 */
public class VkRayTracingShaderGroupCreateInfoKHR extends Struct<VkRayTracingShaderGroupCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        GENERALSHADER,
        CLOSESTHITSHADER,
        ANYHITSHADER,
        INTERSECTIONSHADER,
        PSHADERGROUPCAPTUREREPLAYHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        GENERALSHADER = layout.offsetof(3);
        CLOSESTHITSHADER = layout.offsetof(4);
        ANYHITSHADER = layout.offsetof(5);
        INTERSECTIONSHADER = layout.offsetof(6);
        PSHADERGROUPCAPTUREREPLAYHANDLE = layout.offsetof(7);
    }

    protected VkRayTracingShaderGroupCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingShaderGroupCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingShaderGroupCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRayTracingShaderGroupCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingShaderGroupCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the type of hit group specified in this structure. */
    @NativeType("VkRayTracingShaderGroupTypeKHR")
    public int type() { return ntype(address()); }
    /** the index of the ray generation, miss, or callable shader from {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} in the group if the shader group has {@code type} of {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR}, and {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR} otherwise. */
    @NativeType("uint32_t")
    public int generalShader() { return ngeneralShader(address()); }
    /** the optional index of the closest hit shader from {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} in the group if the shader group has {@code type} of {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR} or {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}, and {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR} otherwise. */
    @NativeType("uint32_t")
    public int closestHitShader() { return nclosestHitShader(address()); }
    /** the optional index of the any-hit shader from {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} in the group if the shader group has {@code type} of {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR} or {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}, and {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR} otherwise. */
    @NativeType("uint32_t")
    public int anyHitShader() { return nanyHitShader(address()); }
    /** the index of the intersection shader from {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages} in the group if the shader group has {@code type} of {@link KHRRayTracingPipeline#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR}, and {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR} otherwise. */
    @NativeType("uint32_t")
    public int intersectionShader() { return nintersectionShader(address()); }
    /** {@code NULL} or a pointer to replay information for this shader group queried from {@link KHRRayTracingPipeline#vkGetRayTracingCaptureReplayShaderGroupHandlesKHR GetRayTracingCaptureReplayShaderGroupHandlesKHR}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-capture-replay">Ray Tracing Capture Replay</a>. Ignored if {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR}{@code ::rayTracingPipelineShaderGroupHandleCaptureReplay} is {@link VK10#VK_FALSE FALSE}. */
    @NativeType("void const *")
    public long pShaderGroupCaptureReplayHandle() { return npShaderGroupCaptureReplayHandle(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRayTracingShaderGroupCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkRayTracingShaderGroupCreateInfoKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRayTracingShaderGroupCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkRayTracingShaderGroupCreateInfoKHR type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #generalShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR generalShader(@NativeType("uint32_t") int value) { ngeneralShader(address(), value); return this; }
    /** Sets the specified value to the {@link #closestHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShader(@NativeType("uint32_t") int value) { nclosestHitShader(address(), value); return this; }
    /** Sets the specified value to the {@link #anyHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShader(@NativeType("uint32_t") int value) { nanyHitShader(address(), value); return this; }
    /** Sets the specified value to the {@link #intersectionShader} field. */
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShader(@NativeType("uint32_t") int value) { nintersectionShader(address(), value); return this; }
    /** Sets the specified value to the {@link #pShaderGroupCaptureReplayHandle} field. */
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(@NativeType("void const *") long value) { npShaderGroupCaptureReplayHandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingShaderGroupCreateInfoKHR set(
        int sType,
        long pNext,
        int type,
        int generalShader,
        int closestHitShader,
        int anyHitShader,
        int intersectionShader,
        long pShaderGroupCaptureReplayHandle
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        generalShader(generalShader);
        closestHitShader(closestHitShader);
        anyHitShader(anyHitShader);
        intersectionShader(intersectionShader);
        pShaderGroupCaptureReplayHandle(pShaderGroupCaptureReplayHandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingShaderGroupCreateInfoKHR set(VkRayTracingShaderGroupCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoKHR malloc() {
        return new VkRayTracingShaderGroupCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoKHR calloc() {
        return new VkRayTracingShaderGroupCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingShaderGroupCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingShaderGroupCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance for the specified memory address. */
    public static VkRayTracingShaderGroupCreateInfoKHR create(long address) {
        return new VkRayTracingShaderGroupCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingShaderGroupCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRayTracingShaderGroupCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #generalShader}. */
    public static int ngeneralShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER); }
    /** Unsafe version of {@link #closestHitShader}. */
    public static int nclosestHitShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER); }
    /** Unsafe version of {@link #anyHitShader}. */
    public static int nanyHitShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER); }
    /** Unsafe version of {@link #intersectionShader}. */
    public static int nintersectionShader(long struct) { return memGetInt(struct + VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER); }
    /** Unsafe version of {@link #pShaderGroupCaptureReplayHandle}. */
    public static long npShaderGroupCaptureReplayHandle(long struct) { return memGetAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #generalShader(int) generalShader}. */
    public static void ngeneralShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER, value); }
    /** Unsafe version of {@link #closestHitShader(int) closestHitShader}. */
    public static void nclosestHitShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER, value); }
    /** Unsafe version of {@link #anyHitShader(int) anyHitShader}. */
    public static void nanyHitShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER, value); }
    /** Unsafe version of {@link #intersectionShader(int) intersectionShader}. */
    public static void nintersectionShader(long struct, int value) { memPutInt(struct + VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER, value); }
    /** Unsafe version of {@link #pShaderGroupCaptureReplayHandle(long) pShaderGroupCaptureReplayHandle}. */
    public static void npShaderGroupCaptureReplayHandle(long struct, long value) { memPutAddress(struct + VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE, value); }

    // -----------------------------------

    /** An array of {@link VkRayTracingShaderGroupCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingShaderGroupCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkRayTracingShaderGroupCreateInfoKHR ELEMENT_FACTORY = VkRayTracingShaderGroupCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRayTracingShaderGroupCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingShaderGroupCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkRayTracingShaderGroupCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingShaderGroupCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingShaderGroupCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#type} field. */
        @NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() { return VkRayTracingShaderGroupCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#generalShader} field. */
        @NativeType("uint32_t")
        public int generalShader() { return VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#closestHitShader} field. */
        @NativeType("uint32_t")
        public int closestHitShader() { return VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#anyHitShader} field. */
        @NativeType("uint32_t")
        public int anyHitShader() { return VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#intersectionShader} field. */
        @NativeType("uint32_t")
        public int intersectionShader() { return VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoKHR#pShaderGroupCaptureReplayHandle} field. */
        @NativeType("void const *")
        public long pShaderGroupCaptureReplayHandle() { return VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(address()); }

        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#sType} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR} value to the {@link VkRayTracingShaderGroupCreateInfoKHR#sType} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#pNext} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingShaderGroupCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#type} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#generalShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer generalShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#closestHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer closestHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#anyHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer anyHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#intersectionShader} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer intersectionShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoKHR#pShaderGroupCaptureReplayHandle} field. */
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer pShaderGroupCaptureReplayHandle(@NativeType("void const *") long value) { VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(address(), value); return this; }

    }

}