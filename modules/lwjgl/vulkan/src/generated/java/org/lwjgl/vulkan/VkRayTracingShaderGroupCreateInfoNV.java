/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying shaders in a shader group.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code type} is {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV} then {@code generalShader} <b>must</b> be a valid index into {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} referring to a shader of {@link NVRayTracing#VK_SHADER_STAGE_RAYGEN_BIT_NV SHADER_STAGE_RAYGEN_BIT_NV}, {@link NVRayTracing#VK_SHADER_STAGE_MISS_BIT_NV SHADER_STAGE_MISS_BIT_NV}, or {@link NVRayTracing#VK_SHADER_STAGE_CALLABLE_BIT_NV SHADER_STAGE_CALLABLE_BIT_NV}</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV} then {@code closestHitShader}, {@code anyHitShader}, and {@code intersectionShader} <b>must</b> be {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV}</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV} then {@code intersectionShader} <b>must</b> be a valid index into {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} referring to a shader of {@link NVRayTracing#VK_SHADER_STAGE_INTERSECTION_BIT_NV SHADER_STAGE_INTERSECTION_BIT_NV}</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV} then {@code intersectionShader} <b>must</b> be {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV}</li>
 * <li>{@code closestHitShader} <b>must</b> be either {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV} or a valid index into {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} referring to a shader of {@link NVRayTracing#VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV SHADER_STAGE_CLOSEST_HIT_BIT_NV}</li>
 * <li>{@code anyHitShader} <b>must</b> be either {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV} or a valid index into {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} referring to a shader of {@link NVRayTracing#VK_SHADER_STAGE_ANY_HIT_BIT_NV SHADER_STAGE_ANY_HIT_BIT_NV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkRayTracingShaderGroupTypeKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRayTracingPipelineCreateInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRayTracingShaderGroupCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRayTracingShaderGroupTypeKHR {@link #type};
 *     uint32_t {@link #generalShader};
 *     uint32_t {@link #closestHitShader};
 *     uint32_t {@link #anyHitShader};
 *     uint32_t {@link #intersectionShader};
 * }</code></pre>
 */
public class VkRayTracingShaderGroupCreateInfoNV extends Struct implements NativeResource {

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
        INTERSECTIONSHADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
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
    }

    /**
     * Creates a {@code VkRayTracingShaderGroupCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingShaderGroupCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the type of hit group specified in this structure. */
    @NativeType("VkRayTracingShaderGroupTypeKHR")
    public int type() { return ntype(address()); }
    /** the index of the ray generation, miss, or callable shader from {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} in the group if the shader group has {@code type} of {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV}, and {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV} otherwise. */
    @NativeType("uint32_t")
    public int generalShader() { return ngeneralShader(address()); }
    /** the optional index of the closest hit shader from {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} in the group if the shader group has {@code type} of {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV} or {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV}, and {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV} otherwise. */
    @NativeType("uint32_t")
    public int closestHitShader() { return nclosestHitShader(address()); }
    /** the optional index of the any-hit shader from {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} in the group if the shader group has {@code type} of {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV} or {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV}, and {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV} otherwise. */
    @NativeType("uint32_t")
    public int anyHitShader() { return nanyHitShader(address()); }
    /** the index of the intersection shader from {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} in the group if the shader group has {@code type} of {@link NVRayTracing#VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV}, and {@link NVRayTracing#VK_SHADER_UNUSED_NV SHADER_UNUSED_NV} otherwise. */
    @NativeType("uint32_t")
    public int intersectionShader() { return nintersectionShader(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRayTracingShaderGroupCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkRayTracingShaderGroupCreateInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRayTracingShaderGroupCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkRayTracingShaderGroupCreateInfoNV type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #generalShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV generalShader(@NativeType("uint32_t") int value) { ngeneralShader(address(), value); return this; }
    /** Sets the specified value to the {@link #closestHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV closestHitShader(@NativeType("uint32_t") int value) { nclosestHitShader(address(), value); return this; }
    /** Sets the specified value to the {@link #anyHitShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV anyHitShader(@NativeType("uint32_t") int value) { nanyHitShader(address(), value); return this; }
    /** Sets the specified value to the {@link #intersectionShader} field. */
    public VkRayTracingShaderGroupCreateInfoNV intersectionShader(@NativeType("uint32_t") int value) { nintersectionShader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingShaderGroupCreateInfoNV set(
        int sType,
        long pNext,
        int type,
        int generalShader,
        int closestHitShader,
        int anyHitShader,
        int intersectionShader
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        generalShader(generalShader);
        closestHitShader(closestHitShader);
        anyHitShader(anyHitShader);
        intersectionShader(intersectionShader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingShaderGroupCreateInfoNV set(VkRayTracingShaderGroupCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoNV malloc() {
        return wrap(VkRayTracingShaderGroupCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingShaderGroupCreateInfoNV calloc() {
        return wrap(VkRayTracingShaderGroupCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingShaderGroupCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRayTracingShaderGroupCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance for the specified memory address. */
    public static VkRayTracingShaderGroupCreateInfoNV create(long address) {
        return wrap(VkRayTracingShaderGroupCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRayTracingShaderGroupCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkRayTracingShaderGroupCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingShaderGroupCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkRayTracingShaderGroupCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRayTracingShaderGroupCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingShaderGroupCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkRayTracingShaderGroupCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingShaderGroupCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.TYPE); }
    /** Unsafe version of {@link #generalShader}. */
    public static int ngeneralShader(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.GENERALSHADER); }
    /** Unsafe version of {@link #closestHitShader}. */
    public static int nclosestHitShader(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.CLOSESTHITSHADER); }
    /** Unsafe version of {@link #anyHitShader}. */
    public static int nanyHitShader(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.ANYHITSHADER); }
    /** Unsafe version of {@link #intersectionShader}. */
    public static int nintersectionShader(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.INTERSECTIONSHADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingShaderGroupCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.TYPE, value); }
    /** Unsafe version of {@link #generalShader(int) generalShader}. */
    public static void ngeneralShader(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.GENERALSHADER, value); }
    /** Unsafe version of {@link #closestHitShader(int) closestHitShader}. */
    public static void nclosestHitShader(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.CLOSESTHITSHADER, value); }
    /** Unsafe version of {@link #anyHitShader(int) anyHitShader}. */
    public static void nanyHitShader(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.ANYHITSHADER, value); }
    /** Unsafe version of {@link #intersectionShader(int) intersectionShader}. */
    public static void nintersectionShader(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingShaderGroupCreateInfoNV.INTERSECTIONSHADER, value); }

    // -----------------------------------

    /** An array of {@link VkRayTracingShaderGroupCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingShaderGroupCreateInfoNV, Buffer> implements NativeResource {

        private static final VkRayTracingShaderGroupCreateInfoNV ELEMENT_FACTORY = VkRayTracingShaderGroupCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkRayTracingShaderGroupCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingShaderGroupCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkRayTracingShaderGroupCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingShaderGroupCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingShaderGroupCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#type} field. */
        @NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() { return VkRayTracingShaderGroupCreateInfoNV.ntype(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#generalShader} field. */
        @NativeType("uint32_t")
        public int generalShader() { return VkRayTracingShaderGroupCreateInfoNV.ngeneralShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#closestHitShader} field. */
        @NativeType("uint32_t")
        public int closestHitShader() { return VkRayTracingShaderGroupCreateInfoNV.nclosestHitShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#anyHitShader} field. */
        @NativeType("uint32_t")
        public int anyHitShader() { return VkRayTracingShaderGroupCreateInfoNV.nanyHitShader(address()); }
        /** @return the value of the {@link VkRayTracingShaderGroupCreateInfoNV#intersectionShader} field. */
        @NativeType("uint32_t")
        public int intersectionShader() { return VkRayTracingShaderGroupCreateInfoNV.nintersectionShader(address()); }

        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#sType} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV} value to the {@link VkRayTracingShaderGroupCreateInfoNV#sType} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#pNext} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingShaderGroupCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#type} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#generalShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer generalShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.ngeneralShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#closestHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer closestHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.nclosestHitShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#anyHitShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer anyHitShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.nanyHitShader(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingShaderGroupCreateInfoNV#intersectionShader} field. */
        public VkRayTracingShaderGroupCreateInfoNV.Buffer intersectionShader(@NativeType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.nintersectionShader(address(), value); return this; }

    }

}