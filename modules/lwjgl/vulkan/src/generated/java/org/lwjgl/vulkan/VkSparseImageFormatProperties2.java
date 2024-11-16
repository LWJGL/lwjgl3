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
 * Structure specifying sparse image format properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseImageFormatProperties}, {@link VK11#vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceSparseImageFormatProperties2KHR GetPhysicalDeviceSparseImageFormatProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageFormatProperties2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkSparseImageFormatProperties VkSparseImageFormatProperties} {@link #properties};
 * }</code></pre>
 */
public class VkSparseImageFormatProperties2 extends Struct<VkSparseImageFormatProperties2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkSparseImageFormatProperties.SIZEOF, VkSparseImageFormatProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROPERTIES = layout.offsetof(2);
    }

    protected VkSparseImageFormatProperties2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseImageFormatProperties2 create(long address, @Nullable ByteBuffer container) {
        return new VkSparseImageFormatProperties2(address, container);
    }

    /**
     * Creates a {@code VkSparseImageFormatProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageFormatProperties2(ByteBuffer container) {
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
    /** a {@link VkSparseImageFormatProperties} structure which is populated with the same values as in {@link VK10#vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}. */
    public VkSparseImageFormatProperties properties() { return nproperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSparseImageFormatProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2} value to the {@link #sType} field. */
    public VkSparseImageFormatProperties2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSparseImageFormatProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseImageFormatProperties2 set(
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
    public VkSparseImageFormatProperties2 set(VkSparseImageFormatProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageFormatProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageFormatProperties2 malloc() {
        return new VkSparseImageFormatProperties2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageFormatProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageFormatProperties2 calloc() {
        return new VkSparseImageFormatProperties2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageFormatProperties2} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageFormatProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageFormatProperties2(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageFormatProperties2} instance for the specified memory address. */
    public static VkSparseImageFormatProperties2 create(long address) {
        return new VkSparseImageFormatProperties2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseImageFormatProperties2 createSafe(long address) {
        return address == NULL ? null : new VkSparseImageFormatProperties2(address, null);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseImageFormatProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseImageFormatProperties2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageFormatProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageFormatProperties2 malloc(MemoryStack stack) {
        return new VkSparseImageFormatProperties2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseImageFormatProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageFormatProperties2 calloc(MemoryStack stack) {
        return new VkSparseImageFormatProperties2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSparseImageFormatProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSparseImageFormatProperties2.PNEXT); }
    /** Unsafe version of {@link #properties}. */
    public static VkSparseImageFormatProperties nproperties(long struct) { return VkSparseImageFormatProperties.create(struct + VkSparseImageFormatProperties2.PROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSparseImageFormatProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSparseImageFormatProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSparseImageFormatProperties2} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageFormatProperties2, Buffer> implements NativeResource {

        private static final VkSparseImageFormatProperties2 ELEMENT_FACTORY = VkSparseImageFormatProperties2.create(-1L);

        /**
         * Creates a new {@code VkSparseImageFormatProperties2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageFormatProperties2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSparseImageFormatProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSparseImageFormatProperties2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSparseImageFormatProperties2.nsType(address()); }
        /** @return the value of the {@link VkSparseImageFormatProperties2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSparseImageFormatProperties2.npNext(address()); }
        /** @return a {@link VkSparseImageFormatProperties} view of the {@link VkSparseImageFormatProperties2#properties} field. */
        public VkSparseImageFormatProperties properties() { return VkSparseImageFormatProperties2.nproperties(address()); }

        /** Sets the specified value to the {@link VkSparseImageFormatProperties2#sType} field. */
        public VkSparseImageFormatProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkSparseImageFormatProperties2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2} value to the {@link VkSparseImageFormatProperties2#sType} field. */
        public VkSparseImageFormatProperties2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2); }
        /** Sets the specified value to the {@link VkSparseImageFormatProperties2#pNext} field. */
        public VkSparseImageFormatProperties2.Buffer pNext(@NativeType("void *") long value) { VkSparseImageFormatProperties2.npNext(address(), value); return this; }

    }

}