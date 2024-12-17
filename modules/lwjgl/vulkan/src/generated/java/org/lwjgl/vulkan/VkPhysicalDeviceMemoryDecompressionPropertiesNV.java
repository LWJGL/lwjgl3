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
 * struct VkPhysicalDeviceMemoryDecompressionPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkMemoryDecompressionMethodFlagsNV decompressionMethods;
 *     uint64_t maxDecompressionIndirectCount;
 * }}</pre>
 */
public class VkPhysicalDeviceMemoryDecompressionPropertiesNV extends Struct<VkPhysicalDeviceMemoryDecompressionPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DECOMPRESSIONMETHODS,
        MAXDECOMPRESSIONINDIRECTCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DECOMPRESSIONMETHODS = layout.offsetof(2);
        MAXDECOMPRESSIONINDIRECTCOUNT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMemoryDecompressionPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryDecompressionPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code decompressionMethods} field. */
    @NativeType("VkMemoryDecompressionMethodFlagsNV")
    public long decompressionMethods() { return ndecompressionMethods(address()); }
    /** @return the value of the {@code maxDecompressionIndirectCount} field. */
    @NativeType("uint64_t")
    public long maxDecompressionIndirectCount() { return nmaxDecompressionIndirectCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType$Default() { return sType(NVMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV set(
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
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV set(VkPhysicalDeviceMemoryDecompressionPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV malloc() {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV calloc() {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMemoryDecompressionPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryDecompressionPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #decompressionMethods}. */
    public static long ndecompressionMethods(long struct) { return memGetLong(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.DECOMPRESSIONMETHODS); }
    /** Unsafe version of {@link #maxDecompressionIndirectCount}. */
    public static long nmaxDecompressionIndirectCount(long struct) { return memGetLong(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.MAXDECOMPRESSIONINDIRECTCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryDecompressionPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryDecompressionPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMemoryDecompressionPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.npNext(address()); }
        /** @return the value of the {@code decompressionMethods} field. */
        @NativeType("VkMemoryDecompressionMethodFlagsNV")
        public long decompressionMethods() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.ndecompressionMethods(address()); }
        /** @return the value of the {@code maxDecompressionIndirectCount} field. */
        @NativeType("uint64_t")
        public long maxDecompressionIndirectCount() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.nmaxDecompressionIndirectCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer sType$Default() { return sType(NVMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.npNext(address(), value); return this; }

    }

}