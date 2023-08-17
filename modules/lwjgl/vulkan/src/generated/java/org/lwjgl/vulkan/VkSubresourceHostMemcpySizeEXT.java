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
 * Memory size needed to copy to or from an image on the host with VK_HOST_IMAGE_COPY_MEMCPY_EXT.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubresourceHostMemcpySizeEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkSubresourceHostMemcpySizeEXT extends Struct<VkSubresourceHostMemcpySizeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkSubresourceHostMemcpySizeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceHostMemcpySizeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceHostMemcpySizeEXT(address, container);
    }

    /**
     * Creates a {@code VkSubresourceHostMemcpySizeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceHostMemcpySizeEXT(ByteBuffer container) {
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
    /** the size in bytes of the image subresource. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubresourceHostMemcpySizeEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT} value to the {@link #sType} field. */
    public VkSubresourceHostMemcpySizeEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubresourceHostMemcpySizeEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubresourceHostMemcpySizeEXT set(
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
    public VkSubresourceHostMemcpySizeEXT set(VkSubresourceHostMemcpySizeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceHostMemcpySizeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceHostMemcpySizeEXT malloc() {
        return new VkSubresourceHostMemcpySizeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceHostMemcpySizeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceHostMemcpySizeEXT calloc() {
        return new VkSubresourceHostMemcpySizeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceHostMemcpySizeEXT} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceHostMemcpySizeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceHostMemcpySizeEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceHostMemcpySizeEXT} instance for the specified memory address. */
    public static VkSubresourceHostMemcpySizeEXT create(long address) {
        return new VkSubresourceHostMemcpySizeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceHostMemcpySizeEXT createSafe(long address) {
        return address == NULL ? null : new VkSubresourceHostMemcpySizeEXT(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySizeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySizeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySizeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySizeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySizeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySizeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceHostMemcpySizeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySizeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceHostMemcpySizeEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceHostMemcpySizeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceHostMemcpySizeEXT malloc(MemoryStack stack) {
        return new VkSubresourceHostMemcpySizeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceHostMemcpySizeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceHostMemcpySizeEXT calloc(MemoryStack stack) {
        return new VkSubresourceHostMemcpySizeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySizeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySizeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceHostMemcpySizeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceHostMemcpySizeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubresourceHostMemcpySizeEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubresourceHostMemcpySizeEXT.PNEXT); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkSubresourceHostMemcpySizeEXT.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubresourceHostMemcpySizeEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubresourceHostMemcpySizeEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubresourceHostMemcpySizeEXT} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceHostMemcpySizeEXT, Buffer> implements NativeResource {

        private static final VkSubresourceHostMemcpySizeEXT ELEMENT_FACTORY = VkSubresourceHostMemcpySizeEXT.create(-1L);

        /**
         * Creates a new {@code VkSubresourceHostMemcpySizeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceHostMemcpySizeEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceHostMemcpySizeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubresourceHostMemcpySizeEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubresourceHostMemcpySizeEXT.nsType(address()); }
        /** @return the value of the {@link VkSubresourceHostMemcpySizeEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubresourceHostMemcpySizeEXT.npNext(address()); }
        /** @return the value of the {@link VkSubresourceHostMemcpySizeEXT#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSubresourceHostMemcpySizeEXT.nsize(address()); }

        /** Sets the specified value to the {@link VkSubresourceHostMemcpySizeEXT#sType} field. */
        public VkSubresourceHostMemcpySizeEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceHostMemcpySizeEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT} value to the {@link VkSubresourceHostMemcpySizeEXT#sType} field. */
        public VkSubresourceHostMemcpySizeEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT); }
        /** Sets the specified value to the {@link VkSubresourceHostMemcpySizeEXT#pNext} field. */
        public VkSubresourceHostMemcpySizeEXT.Buffer pNext(@NativeType("void *") long value) { VkSubresourceHostMemcpySizeEXT.npNext(address(), value); return this; }

    }

}