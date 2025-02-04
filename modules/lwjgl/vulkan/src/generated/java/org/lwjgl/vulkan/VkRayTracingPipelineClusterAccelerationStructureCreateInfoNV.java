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
 * <pre>{@code
 * struct VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 allowClusterAccelerationStructure;
 * }}</pre>
 */
public class VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV extends Struct<VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ALLOWCLUSTERACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOWCLUSTERACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code allowClusterAccelerationStructure} field. */
    @NativeType("VkBool32")
    public boolean allowClusterAccelerationStructure() { return nallowClusterAccelerationStructure(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code allowClusterAccelerationStructure} field. */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV allowClusterAccelerationStructure(@NativeType("VkBool32") boolean value) { nallowClusterAccelerationStructure(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV set(
        int sType,
        long pNext,
        boolean allowClusterAccelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        allowClusterAccelerationStructure(allowClusterAccelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV set(VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV malloc() {
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV calloc() {
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance for the specified memory address. */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV create(long address) {
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV malloc(MemoryStack stack) {
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV calloc(MemoryStack stack) {
        return new VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #allowClusterAccelerationStructure}. */
    public static int nallowClusterAccelerationStructure(long struct) { return memGetInt(struct + VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.ALLOWCLUSTERACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #allowClusterAccelerationStructure(boolean) allowClusterAccelerationStructure}. */
    public static void nallowClusterAccelerationStructure(long struct, int value) { memPutInt(struct + VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.ALLOWCLUSTERACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV, Buffer> implements NativeResource {

        private static final VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV ELEMENT_FACTORY = VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code allowClusterAccelerationStructure} field. */
        @NativeType("VkBool32")
        public boolean allowClusterAccelerationStructure() { return VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.nallowClusterAccelerationStructure(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CLUSTER_ACCELERATION_STRUCTURE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer pNext(@NativeType("void *") long value) { VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code allowClusterAccelerationStructure} field. */
        public VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.Buffer allowClusterAccelerationStructure(@NativeType("VkBool32") boolean value) { VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV.nallowClusterAccelerationStructure(address(), value ? 1 : 0); return this; }

    }

}