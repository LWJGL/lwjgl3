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
 * struct VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 partitionedAccelerationStructure;
 * }}</pre>
 */
public class VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV extends Struct<VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PARTITIONEDACCELERATIONSTRUCTURE;

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
        PARTITIONEDACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code partitionedAccelerationStructure} field. */
    @NativeType("VkBool32")
    public boolean partitionedAccelerationStructure() { return npartitionedAccelerationStructure(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code partitionedAccelerationStructure} field. */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV partitionedAccelerationStructure(@NativeType("VkBool32") boolean value) { npartitionedAccelerationStructure(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV set(
        int sType,
        long pNext,
        boolean partitionedAccelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        partitionedAccelerationStructure(partitionedAccelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV set(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV malloc() {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV calloc() {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV create(long address) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #partitionedAccelerationStructure}. */
    public static int npartitionedAccelerationStructure(long struct) { return memGetInt(struct + VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.PARTITIONEDACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #partitionedAccelerationStructure(boolean) partitionedAccelerationStructure}. */
    public static void npartitionedAccelerationStructure(long struct, int value) { memPutInt(struct + VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.PARTITIONEDACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npNext(address()); }
        /** @return the value of the {@code partitionedAccelerationStructure} field. */
        @NativeType("VkBool32")
        public boolean partitionedAccelerationStructure() { return VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npartitionedAccelerationStructure(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code partitionedAccelerationStructure} field. */
        public VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.Buffer partitionedAccelerationStructure(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV.npartitionedAccelerationStructure(address(), value ? 1 : 0); return this; }

    }

}