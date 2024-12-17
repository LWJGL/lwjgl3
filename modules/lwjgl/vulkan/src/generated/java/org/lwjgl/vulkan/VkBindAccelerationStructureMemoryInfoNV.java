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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkBindAccelerationStructureMemoryInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureNV accelerationStructure;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 * }}</pre>
 */
public class VkBindAccelerationStructureMemoryInfoNV extends Struct<VkBindAccelerationStructureMemoryInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE,
        MEMORY,
        MEMORYOFFSET,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        DEVICEINDEXCOUNT = layout.offsetof(5);
        PDEVICEINDICES = layout.offsetof(6);
    }

    protected VkBindAccelerationStructureMemoryInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindAccelerationStructureMemoryInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkBindAccelerationStructureMemoryInfoNV(address, container);
    }

    /**
     * Creates a {@code VkBindAccelerationStructureMemoryInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindAccelerationStructureMemoryInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code accelerationStructure} field. */
    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructure() { return naccelerationStructure(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** @return the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindAccelerationStructureMemoryInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV} value to the {@code sType} field. */
    public VkBindAccelerationStructureMemoryInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindAccelerationStructureMemoryInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) { naccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindAccelerationStructureMemoryInfoNV memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindAccelerationStructureMemoryInfoNV set(
        int sType,
        long pNext,
        long accelerationStructure,
        long memory,
        long memoryOffset,
        @Nullable IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        memory(memory);
        memoryOffset(memoryOffset);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindAccelerationStructureMemoryInfoNV set(VkBindAccelerationStructureMemoryInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindAccelerationStructureMemoryInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindAccelerationStructureMemoryInfoNV malloc() {
        return new VkBindAccelerationStructureMemoryInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindAccelerationStructureMemoryInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindAccelerationStructureMemoryInfoNV calloc() {
        return new VkBindAccelerationStructureMemoryInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindAccelerationStructureMemoryInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkBindAccelerationStructureMemoryInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindAccelerationStructureMemoryInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkBindAccelerationStructureMemoryInfoNV} instance for the specified memory address. */
    public static VkBindAccelerationStructureMemoryInfoNV create(long address) {
        return new VkBindAccelerationStructureMemoryInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindAccelerationStructureMemoryInfoNV createSafe(long address) {
        return address == NULL ? null : new VkBindAccelerationStructureMemoryInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindAccelerationStructureMemoryInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindAccelerationStructureMemoryInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindAccelerationStructureMemoryInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindAccelerationStructureMemoryInfoNV malloc(MemoryStack stack) {
        return new VkBindAccelerationStructureMemoryInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindAccelerationStructureMemoryInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindAccelerationStructureMemoryInfoNV calloc(MemoryStack stack) {
        return new VkBindAccelerationStructureMemoryInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindAccelerationStructureMemoryInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkBindAccelerationStructureMemoryInfoNV.ACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindAccelerationStructureMemoryInfoNV.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindAccelerationStructureMemoryInfoNV.MEMORYOFFSET); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindAccelerationStructureMemoryInfoNV.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    public static @Nullable IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PDEVICEINDICES), ndeviceIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindAccelerationStructureMemoryInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkBindAccelerationStructureMemoryInfoNV.ACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindAccelerationStructureMemoryInfoNV.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindAccelerationStructureMemoryInfoNV.MEMORYOFFSET, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindAccelerationStructureMemoryInfoNV.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PDEVICEINDICES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindAccelerationStructureMemoryInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkBindAccelerationStructureMemoryInfoNV, Buffer> implements NativeResource {

        private static final VkBindAccelerationStructureMemoryInfoNV ELEMENT_FACTORY = VkBindAccelerationStructureMemoryInfoNV.create(-1L);

        /**
         * Creates a new {@code VkBindAccelerationStructureMemoryInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindAccelerationStructureMemoryInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindAccelerationStructureMemoryInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindAccelerationStructureMemoryInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindAccelerationStructureMemoryInfoNV.npNext(address()); }
        /** @return the value of the {@code accelerationStructure} field. */
        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructure() { return VkBindAccelerationStructureMemoryInfoNV.naccelerationStructure(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindAccelerationStructureMemoryInfoNV.nmemory(address()); }
        /** @return the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindAccelerationStructureMemoryInfoNV.nmemoryOffset(address()); }
        /** @return the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindAccelerationStructureMemoryInfoNV.ndeviceIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDeviceIndices() { return VkBindAccelerationStructureMemoryInfoNV.npDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkBindAccelerationStructureMemoryInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV} value to the {@code sType} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkBindAccelerationStructureMemoryInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) { VkBindAccelerationStructureMemoryInfoNV.naccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindAccelerationStructureMemoryInfoNV.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindAccelerationStructureMemoryInfoNV.nmemoryOffset(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindAccelerationStructureMemoryInfoNV.npDeviceIndices(address(), value); return this; }

    }

}