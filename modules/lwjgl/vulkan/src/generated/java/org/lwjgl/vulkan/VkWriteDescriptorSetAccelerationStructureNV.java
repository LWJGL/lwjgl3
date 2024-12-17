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
 * struct VkWriteDescriptorSetAccelerationStructureNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t accelerationStructureCount;
 *     VkAccelerationStructureNV const * pAccelerationStructures;
 * }}</pre>
 */
public class VkWriteDescriptorSetAccelerationStructureNV extends Struct<VkWriteDescriptorSetAccelerationStructureNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURECOUNT,
        PACCELERATIONSTRUCTURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURECOUNT = layout.offsetof(2);
        PACCELERATIONSTRUCTURES = layout.offsetof(3);
    }

    protected VkWriteDescriptorSetAccelerationStructureNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWriteDescriptorSetAccelerationStructureNV create(long address, @Nullable ByteBuffer container) {
        return new VkWriteDescriptorSetAccelerationStructureNV(address, container);
    }

    /**
     * Creates a {@code VkWriteDescriptorSetAccelerationStructureNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetAccelerationStructureNV(ByteBuffer container) {
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
    /** @return the value of the {@code accelerationStructureCount} field. */
    @NativeType("uint32_t")
    public int accelerationStructureCount() { return naccelerationStructureCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
    @NativeType("VkAccelerationStructureNV const *")
    public @Nullable LongBuffer pAccelerationStructures() { return npAccelerationStructures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteDescriptorSetAccelerationStructureNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV} value to the {@code sType} field. */
    public VkWriteDescriptorSetAccelerationStructureNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteDescriptorSetAccelerationStructureNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructureCount} field. */
    public VkWriteDescriptorSetAccelerationStructureNV accelerationStructureCount(@NativeType("uint32_t") int value) { naccelerationStructureCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
    public VkWriteDescriptorSetAccelerationStructureNV pAccelerationStructures(@Nullable @NativeType("VkAccelerationStructureNV const *") LongBuffer value) { npAccelerationStructures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSetAccelerationStructureNV set(
        int sType,
        long pNext,
        int accelerationStructureCount,
        @Nullable LongBuffer pAccelerationStructures
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructureCount(accelerationStructureCount);
        pAccelerationStructures(pAccelerationStructures);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSetAccelerationStructureNV set(VkWriteDescriptorSetAccelerationStructureNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetAccelerationStructureNV malloc() {
        return new VkWriteDescriptorSetAccelerationStructureNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetAccelerationStructureNV calloc() {
        return new VkWriteDescriptorSetAccelerationStructureNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetAccelerationStructureNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetAccelerationStructureNV(memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance for the specified memory address. */
    public static VkWriteDescriptorSetAccelerationStructureNV create(long address) {
        return new VkWriteDescriptorSetAccelerationStructureNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWriteDescriptorSetAccelerationStructureNV createSafe(long address) {
        return address == NULL ? null : new VkWriteDescriptorSetAccelerationStructureNV(address, null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWriteDescriptorSetAccelerationStructureNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWriteDescriptorSetAccelerationStructureNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetAccelerationStructureNV malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetAccelerationStructureNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetAccelerationStructureNV calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetAccelerationStructureNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWriteDescriptorSetAccelerationStructureNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PNEXT); }
    /** Unsafe version of {@link #accelerationStructureCount}. */
    public static int naccelerationStructureCount(long struct) { return memGetInt(struct + VkWriteDescriptorSetAccelerationStructureNV.ACCELERATIONSTRUCTURECOUNT); }
    /** Unsafe version of {@link #pAccelerationStructures() pAccelerationStructures}. */
    public static @Nullable LongBuffer npAccelerationStructures(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PACCELERATIONSTRUCTURES), naccelerationStructureCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSetAccelerationStructureNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PNEXT, value); }
    /** Sets the specified value to the {@code accelerationStructureCount} field of the specified {@code struct}. */
    public static void naccelerationStructureCount(long struct, int value) { memPutInt(struct + VkWriteDescriptorSetAccelerationStructureNV.ACCELERATIONSTRUCTURECOUNT, value); }
    /** Unsafe version of {@link #pAccelerationStructures(LongBuffer) pAccelerationStructures}. */
    public static void npAccelerationStructures(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PACCELERATIONSTRUCTURES, memAddressSafe(value)); if (value != null) { naccelerationStructureCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSetAccelerationStructureNV} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetAccelerationStructureNV, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSetAccelerationStructureNV ELEMENT_FACTORY = VkWriteDescriptorSetAccelerationStructureNV.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetAccelerationStructureNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWriteDescriptorSetAccelerationStructureNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSetAccelerationStructureNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSetAccelerationStructureNV.npNext(address()); }
        /** @return the value of the {@code accelerationStructureCount} field. */
        @NativeType("uint32_t")
        public int accelerationStructureCount() { return VkWriteDescriptorSetAccelerationStructureNV.naccelerationStructureCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
        @NativeType("VkAccelerationStructureNV const *")
        public @Nullable LongBuffer pAccelerationStructures() { return VkWriteDescriptorSetAccelerationStructureNV.npAccelerationStructures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV} value to the {@code sType} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSetAccelerationStructureNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructureCount} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer accelerationStructureCount(@NativeType("uint32_t") int value) { VkWriteDescriptorSetAccelerationStructureNV.naccelerationStructureCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer pAccelerationStructures(@Nullable @NativeType("VkAccelerationStructureNV const *") LongBuffer value) { VkWriteDescriptorSetAccelerationStructureNV.npAccelerationStructures(address(), value); return this; }

    }

}