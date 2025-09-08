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
 * <pre><code>
 * struct VkImageSubresource2 {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkImageSubresource VkImageSubresource} imageSubresource;
 * }</code></pre>
 */
public class VkImageSubresource2 extends Struct<VkImageSubresource2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGESUBRESOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageSubresource.SIZEOF, VkImageSubresource.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGESUBRESOURCE = layout.offsetof(2);
    }

    protected VkImageSubresource2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageSubresource2 create(long address, @Nullable ByteBuffer container) {
        return new VkImageSubresource2(address, container);
    }

    /**
     * Creates a {@code VkImageSubresource2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresource2(ByteBuffer container) {
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
    /** @return a {@link VkImageSubresource} view of the {@code imageSubresource} field. */
    public VkImageSubresource imageSubresource() { return nimageSubresource(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageSubresource2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2} value to the {@code sType} field. */
    public VkImageSubresource2 sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageSubresource2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresource} to the {@code imageSubresource} field. */
    public VkImageSubresource2 imageSubresource(VkImageSubresource value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageSubresource2 imageSubresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(imageSubresource()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSubresource2 set(
        int sType,
        long pNext,
        VkImageSubresource imageSubresource
    ) {
        sType(sType);
        pNext(pNext);
        imageSubresource(imageSubresource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresource2 set(VkImageSubresource2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSubresource2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresource2 malloc() {
        return new VkImageSubresource2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresource2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresource2 calloc() {
        return new VkImageSubresource2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresource2} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresource2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresource2(memAddress(container), container);
    }

    /** Returns a new {@code VkImageSubresource2} instance for the specified memory address. */
    public static VkImageSubresource2 create(long address) {
        return new VkImageSubresource2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageSubresource2 createSafe(long address) {
        return address == NULL ? null : new VkImageSubresource2(address, null);
    }

    /**
     * Returns a new {@link VkImageSubresource2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageSubresource2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageSubresource2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageSubresource2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource2 malloc(MemoryStack stack) {
        return new VkImageSubresource2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageSubresource2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource2 calloc(MemoryStack stack) {
        return new VkImageSubresource2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageSubresource2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageSubresource2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageSubresource2.PNEXT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresource nimageSubresource(long struct) { return VkImageSubresource.create(struct + VkImageSubresource2.IMAGESUBRESOURCE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageSubresource2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageSubresource2.PNEXT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresource) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresource value) { memCopy(value.address(), struct + VkImageSubresource2.IMAGESUBRESOURCE, VkImageSubresource.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageSubresource2} structs. */
    public static class Buffer extends StructBuffer<VkImageSubresource2, Buffer> implements NativeResource {

        private static final VkImageSubresource2 ELEMENT_FACTORY = VkImageSubresource2.create(-1L);

        /**
         * Creates a new {@code VkImageSubresource2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresource2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageSubresource2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageSubresource2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkImageSubresource2.npNext(address()); }
        /** @return a {@link VkImageSubresource} view of the {@code imageSubresource} field. */
        public VkImageSubresource imageSubresource() { return VkImageSubresource2.nimageSubresource(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageSubresource2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageSubresource2.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2} value to the {@code sType} field. */
        public VkImageSubresource2.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageSubresource2.Buffer pNext(@NativeType("void *") long value) { VkImageSubresource2.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresource} to the {@code imageSubresource} field. */
        public VkImageSubresource2.Buffer imageSubresource(VkImageSubresource value) { VkImageSubresource2.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageSubresource2.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(imageSubresource()); return this; }

    }

}