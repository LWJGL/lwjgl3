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
 * struct VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxPartitionCount;
 * }}</pre>
 */
public class VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV extends Struct<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXPARTITIONCOUNT;

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
        MAXPARTITIONCOUNT = layout.offsetof(2);
    }

    protected VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxPartitionCount} field. */
    @NativeType("uint32_t")
    public int maxPartitionCount() { return nmaxPartitionCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV set(VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV malloc() {
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV calloc() {
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV create(long address) {
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxPartitionCount}. */
    public static int nmaxPartitionCount(long struct) { return memGetInt(struct + VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.MAXPARTITIONCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV ELEMENT_FACTORY = VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.npNext(address()); }
        /** @return the value of the {@code maxPartitionCount} field. */
        @NativeType("uint32_t")
        public int maxPartitionCount() { return VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.nmaxPartitionCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PARTITIONED_ACCELERATION_STRUCTURE_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV.npNext(address(), value); return this; }

    }

}