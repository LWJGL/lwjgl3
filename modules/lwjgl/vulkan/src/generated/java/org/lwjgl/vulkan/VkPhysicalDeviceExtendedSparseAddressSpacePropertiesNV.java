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
 * Structure describing sparse address space limits of an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExtendedSparseAddressSpace#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #extendedSparseAddressSpaceSize};
 *     VkImageUsageFlags {@link #extendedSparseImageUsageFlags};
 *     VkBufferUsageFlags {@link #extendedSparseBufferUsageFlags};
 * }</code></pre>
 */
public class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extends Struct<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDSPARSEADDRESSSPACESIZE,
        EXTENDEDSPARSEIMAGEUSAGEFLAGS,
        EXTENDEDSPARSEBUFFERUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDSPARSEADDRESSSPACESIZE = layout.offsetof(2);
        EXTENDEDSPARSEIMAGEUSAGEFLAGS = layout.offsetof(3);
        EXTENDEDSPARSEBUFFERUSAGEFLAGS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(ByteBuffer container) {
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
    /** the total amount of address space available, in bytes, for sparse memory resources of all usages if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-extendedSparseAddressSpace">{@code extendedSparseAddressSpace}</a> feature is enabled. This <b>must</b> be greater than or equal to {@link VkPhysicalDeviceLimits}{@code ::sparseAddressSpaceSize}, and the difference in space <b>must</b> only be used with usages allowed below. This is an upper bound on the sum of the sizes of all sparse resources, regardless of whether any memory is bound to them. */
    @NativeType("VkDeviceSize")
    public long extendedSparseAddressSpaceSize() { return nextendedSparseAddressSpaceSize(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} of usages which <b>may</b> allow an implementation to use the full {@code extendedSparseAddressSpaceSize} space. */
    @NativeType("VkImageUsageFlags")
    public int extendedSparseImageUsageFlags() { return nextendedSparseImageUsageFlags(address()); }
    /** a bitmask of {@code VkBufferUsageFlagBits} of usages which <b>may</b> allow an implementation to use the full {@code extendedSparseAddressSpaceSize} space. */
    @NativeType("VkBufferUsageFlags")
    public int extendedSparseBufferUsageFlags() { return nextendedSparseBufferUsageFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExtendedSparseAddressSpace#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType$Default() { return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV set(
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
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV set(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV malloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV calloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create(long address) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.PNEXT); }
    /** Unsafe version of {@link #extendedSparseAddressSpaceSize}. */
    public static long nextendedSparseAddressSpaceSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.EXTENDEDSPARSEADDRESSSPACESIZE); }
    /** Unsafe version of {@link #extendedSparseImageUsageFlags}. */
    public static int nextendedSparseImageUsageFlags(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.EXTENDEDSPARSEIMAGEUSAGEFLAGS); }
    /** Unsafe version of {@link #extendedSparseBufferUsageFlags}. */
    public static int nextendedSparseBufferUsageFlags(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.EXTENDEDSPARSEBUFFERUSAGEFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#extendedSparseAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long extendedSparseAddressSpaceSize() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nextendedSparseAddressSpaceSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#extendedSparseImageUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int extendedSparseImageUsageFlags() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nextendedSparseImageUsageFlags(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#extendedSparseBufferUsageFlags} field. */
        @NativeType("VkBufferUsageFlags")
        public int extendedSparseBufferUsageFlags() { return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nextendedSparseBufferUsageFlags(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#sType} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExtendedSparseAddressSpace#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV} value to the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#sType} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer sType$Default() { return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV#pNext} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.npNext(address(), value); return this; }

    }

}