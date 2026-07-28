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
 * struct VkComputeOccupancyPriorityParametersNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     float occupancyPriority;
 *     float occupancyThrottling;
 * }}</pre>
 */
public class VkComputeOccupancyPriorityParametersNV extends Struct<VkComputeOccupancyPriorityParametersNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OCCUPANCYPRIORITY,
        OCCUPANCYTHROTTLING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OCCUPANCYPRIORITY = layout.offsetof(2);
        OCCUPANCYTHROTTLING = layout.offsetof(3);
    }

    protected VkComputeOccupancyPriorityParametersNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkComputeOccupancyPriorityParametersNV create(long address, @Nullable ByteBuffer container) {
        return new VkComputeOccupancyPriorityParametersNV(address, container);
    }

    /**
     * Creates a {@code VkComputeOccupancyPriorityParametersNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkComputeOccupancyPriorityParametersNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code occupancyPriority} field. */
    public float occupancyPriority() { return noccupancyPriority(address()); }
    /** @return the value of the {@code occupancyThrottling} field. */
    public float occupancyThrottling() { return noccupancyThrottling(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkComputeOccupancyPriorityParametersNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVComputeOccupancyPriority#VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV} value to the {@code sType} field. */
    public VkComputeOccupancyPriorityParametersNV sType$Default() { return sType(NVComputeOccupancyPriority.VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkComputeOccupancyPriorityParametersNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code occupancyPriority} field. */
    public VkComputeOccupancyPriorityParametersNV occupancyPriority(float value) { noccupancyPriority(address(), value); return this; }
    /** Sets the specified value to the {@code occupancyThrottling} field. */
    public VkComputeOccupancyPriorityParametersNV occupancyThrottling(float value) { noccupancyThrottling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkComputeOccupancyPriorityParametersNV set(
        int sType,
        long pNext,
        float occupancyPriority,
        float occupancyThrottling
    ) {
        sType(sType);
        pNext(pNext);
        occupancyPriority(occupancyPriority);
        occupancyThrottling(occupancyThrottling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkComputeOccupancyPriorityParametersNV set(VkComputeOccupancyPriorityParametersNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkComputeOccupancyPriorityParametersNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkComputeOccupancyPriorityParametersNV malloc() {
        return new VkComputeOccupancyPriorityParametersNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkComputeOccupancyPriorityParametersNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkComputeOccupancyPriorityParametersNV calloc() {
        return new VkComputeOccupancyPriorityParametersNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkComputeOccupancyPriorityParametersNV} instance allocated with {@link BufferUtils}. */
    public static VkComputeOccupancyPriorityParametersNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputeOccupancyPriorityParametersNV(memAddress(container), container);
    }

    /** Returns a new {@code VkComputeOccupancyPriorityParametersNV} instance for the specified memory address. */
    public static VkComputeOccupancyPriorityParametersNV create(long address) {
        return new VkComputeOccupancyPriorityParametersNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkComputeOccupancyPriorityParametersNV createSafe(long address) {
        return address == NULL ? null : new VkComputeOccupancyPriorityParametersNV(address, null);
    }

    /**
     * Returns a new {@link VkComputeOccupancyPriorityParametersNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputeOccupancyPriorityParametersNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkComputeOccupancyPriorityParametersNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputeOccupancyPriorityParametersNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputeOccupancyPriorityParametersNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputeOccupancyPriorityParametersNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkComputeOccupancyPriorityParametersNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkComputeOccupancyPriorityParametersNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkComputeOccupancyPriorityParametersNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkComputeOccupancyPriorityParametersNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputeOccupancyPriorityParametersNV malloc(MemoryStack stack) {
        return new VkComputeOccupancyPriorityParametersNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkComputeOccupancyPriorityParametersNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputeOccupancyPriorityParametersNV calloc(MemoryStack stack) {
        return new VkComputeOccupancyPriorityParametersNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkComputeOccupancyPriorityParametersNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputeOccupancyPriorityParametersNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputeOccupancyPriorityParametersNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputeOccupancyPriorityParametersNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkComputeOccupancyPriorityParametersNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkComputeOccupancyPriorityParametersNV.PNEXT); }
    /** Unsafe version of {@link #occupancyPriority}. */
    public static float noccupancyPriority(long struct) { return memGetFloat(struct + VkComputeOccupancyPriorityParametersNV.OCCUPANCYPRIORITY); }
    /** Unsafe version of {@link #occupancyThrottling}. */
    public static float noccupancyThrottling(long struct) { return memGetFloat(struct + VkComputeOccupancyPriorityParametersNV.OCCUPANCYTHROTTLING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkComputeOccupancyPriorityParametersNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkComputeOccupancyPriorityParametersNV.PNEXT, value); }
    /** Unsafe version of {@link #occupancyPriority(float) occupancyPriority}. */
    public static void noccupancyPriority(long struct, float value) { memPutFloat(struct + VkComputeOccupancyPriorityParametersNV.OCCUPANCYPRIORITY, value); }
    /** Unsafe version of {@link #occupancyThrottling(float) occupancyThrottling}. */
    public static void noccupancyThrottling(long struct, float value) { memPutFloat(struct + VkComputeOccupancyPriorityParametersNV.OCCUPANCYTHROTTLING, value); }

    // -----------------------------------

    /** An array of {@link VkComputeOccupancyPriorityParametersNV} structs. */
    public static class Buffer extends StructBuffer<VkComputeOccupancyPriorityParametersNV, Buffer> implements NativeResource {

        private static final VkComputeOccupancyPriorityParametersNV ELEMENT_FACTORY = VkComputeOccupancyPriorityParametersNV.create(-1L);

        /**
         * Creates a new {@code VkComputeOccupancyPriorityParametersNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkComputeOccupancyPriorityParametersNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkComputeOccupancyPriorityParametersNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkComputeOccupancyPriorityParametersNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkComputeOccupancyPriorityParametersNV.npNext(address()); }
        /** @return the value of the {@code occupancyPriority} field. */
        public float occupancyPriority() { return VkComputeOccupancyPriorityParametersNV.noccupancyPriority(address()); }
        /** @return the value of the {@code occupancyThrottling} field. */
        public float occupancyThrottling() { return VkComputeOccupancyPriorityParametersNV.noccupancyThrottling(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkComputeOccupancyPriorityParametersNV.Buffer sType(@NativeType("VkStructureType") int value) { VkComputeOccupancyPriorityParametersNV.nsType(address(), value); return this; }
        /** Sets the {@link NVComputeOccupancyPriority#VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV} value to the {@code sType} field. */
        public VkComputeOccupancyPriorityParametersNV.Buffer sType$Default() { return sType(NVComputeOccupancyPriority.VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkComputeOccupancyPriorityParametersNV.Buffer pNext(@NativeType("void const *") long value) { VkComputeOccupancyPriorityParametersNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code occupancyPriority} field. */
        public VkComputeOccupancyPriorityParametersNV.Buffer occupancyPriority(float value) { VkComputeOccupancyPriorityParametersNV.noccupancyPriority(address(), value); return this; }
        /** Sets the specified value to the {@code occupancyThrottling} field. */
        public VkComputeOccupancyPriorityParametersNV.Buffer occupancyThrottling(float value) { VkComputeOccupancyPriorityParametersNV.noccupancyThrottling(address(), value); return this; }

    }

}