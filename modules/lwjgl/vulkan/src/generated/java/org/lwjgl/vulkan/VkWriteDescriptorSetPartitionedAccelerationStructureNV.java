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
 * struct VkWriteDescriptorSetPartitionedAccelerationStructureNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t accelerationStructureCount;
 *     VkDeviceAddress const * pAccelerationStructures;
 * }}</pre>
 */
public class VkWriteDescriptorSetPartitionedAccelerationStructureNV extends Struct<VkWriteDescriptorSetPartitionedAccelerationStructureNV> implements NativeResource {

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

    protected VkWriteDescriptorSetPartitionedAccelerationStructureNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWriteDescriptorSetPartitionedAccelerationStructureNV create(long address, @Nullable ByteBuffer container) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(address, container);
    }

    /**
     * Creates a {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV(ByteBuffer container) {
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
    /** @return the value of the {@code accelerationStructureCount} field. */
    @NativeType("uint32_t")
    public int accelerationStructureCount() { return naccelerationStructureCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
    @NativeType("VkDeviceAddress const *")
    public @Nullable LongBuffer pAccelerationStructures() { return npAccelerationStructures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV} value to the {@code sType} field. */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructureCount} field. */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV accelerationStructureCount(@NativeType("uint32_t") int value) { naccelerationStructureCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pAccelerationStructures(@Nullable @NativeType("VkDeviceAddress const *") LongBuffer value) { npAccelerationStructures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV set(
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
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV set(VkWriteDescriptorSetPartitionedAccelerationStructureNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV malloc() {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV calloc() {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance for the specified memory address. */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV create(long address) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWriteDescriptorSetPartitionedAccelerationStructureNV createSafe(long address) {
        return address == NULL ? null : new VkWriteDescriptorSetPartitionedAccelerationStructureNV(address, null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetPartitionedAccelerationStructureNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.PNEXT); }
    /** Unsafe version of {@link #accelerationStructureCount}. */
    public static int naccelerationStructureCount(long struct) { return memGetInt(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.ACCELERATIONSTRUCTURECOUNT); }
    /** Unsafe version of {@link #pAccelerationStructures() pAccelerationStructures}. */
    public static @Nullable LongBuffer npAccelerationStructures(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.PACCELERATIONSTRUCTURES), naccelerationStructureCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.PNEXT, value); }
    /** Sets the specified value to the {@code accelerationStructureCount} field of the specified {@code struct}. */
    public static void naccelerationStructureCount(long struct, int value) { memPutInt(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.ACCELERATIONSTRUCTURECOUNT, value); }
    /** Unsafe version of {@link #pAccelerationStructures(LongBuffer) pAccelerationStructures}. */
    public static void npAccelerationStructures(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSetPartitionedAccelerationStructureNV.PACCELERATIONSTRUCTURES, memAddressSafe(value)); if (value != null) { naccelerationStructureCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetPartitionedAccelerationStructureNV, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSetPartitionedAccelerationStructureNV ELEMENT_FACTORY = VkWriteDescriptorSetPartitionedAccelerationStructureNV.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetPartitionedAccelerationStructureNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWriteDescriptorSetPartitionedAccelerationStructureNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSetPartitionedAccelerationStructureNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkWriteDescriptorSetPartitionedAccelerationStructureNV.npNext(address()); }
        /** @return the value of the {@code accelerationStructureCount} field. */
        @NativeType("uint32_t")
        public int accelerationStructureCount() { return VkWriteDescriptorSetPartitionedAccelerationStructureNV.naccelerationStructureCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
        @NativeType("VkDeviceAddress const *")
        public @Nullable LongBuffer pAccelerationStructures() { return VkWriteDescriptorSetPartitionedAccelerationStructureNV.npAccelerationStructures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetPartitionedAccelerationStructureNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV} value to the {@code sType} field. */
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_PARTITIONED_ACCELERATION_STRUCTURE_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer pNext(@NativeType("void *") long value) { VkWriteDescriptorSetPartitionedAccelerationStructureNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructureCount} field. */
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer accelerationStructureCount(@NativeType("uint32_t") int value) { VkWriteDescriptorSetPartitionedAccelerationStructureNV.naccelerationStructureCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
        public VkWriteDescriptorSetPartitionedAccelerationStructureNV.Buffer pAccelerationStructures(@Nullable @NativeType("VkDeviceAddress const *") LongBuffer value) { VkWriteDescriptorSetPartitionedAccelerationStructureNV.npAccelerationStructures(address(), value); return this; }

    }

}