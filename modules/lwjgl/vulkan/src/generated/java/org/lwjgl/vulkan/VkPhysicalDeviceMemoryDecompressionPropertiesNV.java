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
 * Structure describing supported memory decompression methods by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryDecompressionPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkMemoryDecompressionMethodFlagsNV {@link #decompressionMethods};
 *     uint64_t {@link #maxDecompressionIndirectCount};
 * }</code></pre>
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkMemoryDecompressionMethodFlagBitsNV} specifying memory decompression methods supported by the implementation. */
    @NativeType("VkMemoryDecompressionMethodFlagsNV")
    public long decompressionMethods() { return ndecompressionMethods(address()); }
    /** specifies the maximum supported count value in the {@code countBuffer} of {@link NVMemoryDecompression#vkCmdDecompressMemoryIndirectCountNV CmdDecompressMemoryIndirectCountNV} */
    @NativeType("uint64_t")
    public long maxDecompressionIndirectCount() { return nmaxDecompressionIndirectCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryDecompressionPropertiesNV sType$Default() { return sType(NVMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
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
    @Nullable
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV createSafe(long address) {
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
    @Nullable
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #decompressionMethods}. */
    public static long ndecompressionMethods(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.DECOMPRESSIONMETHODS); }
    /** Unsafe version of {@link #maxDecompressionIndirectCount}. */
    public static long nmaxDecompressionIndirectCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.MAXDECOMPRESSIONINDIRECTCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMemoryDecompressionPropertiesNV.STYPE, value); }
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
        protected VkPhysicalDeviceMemoryDecompressionPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#decompressionMethods} field. */
        @NativeType("VkMemoryDecompressionMethodFlagsNV")
        public long decompressionMethods() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.ndecompressionMethods(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#maxDecompressionIndirectCount} field. */
        @NativeType("uint64_t")
        public long maxDecompressionIndirectCount() { return VkPhysicalDeviceMemoryDecompressionPropertiesNV.nmaxDecompressionIndirectCount(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#sType} field. */
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV} value to the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#sType} field. */
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer sType$Default() { return sType(NVMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV#pNext} field. */
        public VkPhysicalDeviceMemoryDecompressionPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryDecompressionPropertiesNV.npNext(address(), value); return this; }

    }

}