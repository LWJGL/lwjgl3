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
 * struct VkSubresourceLayout2 {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkSubresourceLayout VkSubresourceLayout} subresourceLayout;
 * }}</pre>
 */
public class VkSubresourceLayout2 extends Struct<VkSubresourceLayout2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBRESOURCELAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkSubresourceLayout.SIZEOF, VkSubresourceLayout.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBRESOURCELAYOUT = layout.offsetof(2);
    }

    protected VkSubresourceLayout2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceLayout2 create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceLayout2(address, container);
    }

    /**
     * Creates a {@code VkSubresourceLayout2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout2(ByteBuffer container) {
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
    /** @return a {@link VkSubresourceLayout} view of the {@code subresourceLayout} field. */
    public VkSubresourceLayout subresourceLayout() { return nsubresourceLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubresourceLayout2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2} value to the {@code sType} field. */
    public VkSubresourceLayout2 sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubresourceLayout2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImageCompressionPropertiesEXT} value to the {@code pNext} chain. */
    public VkSubresourceLayout2 pNext(VkImageCompressionPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubresourceHostMemcpySize} value to the {@code pNext} chain. */
    public VkSubresourceLayout2 pNext(VkSubresourceHostMemcpySize value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubresourceHostMemcpySizeEXT} value to the {@code pNext} chain. */
    public VkSubresourceLayout2 pNext(VkSubresourceHostMemcpySizeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkSubresourceLayout2 set(
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
    public VkSubresourceLayout2 set(VkSubresourceLayout2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2 malloc() {
        return new VkSubresourceLayout2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2 calloc() {
        return new VkSubresourceLayout2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout2} instance for the specified memory address. */
    public static VkSubresourceLayout2 create(long address) {
        return new VkSubresourceLayout2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubresourceLayout2 createSafe(long address) {
        return address == NULL ? null : new VkSubresourceLayout2(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceLayout2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubresourceLayout2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2 malloc(MemoryStack stack) {
        return new VkSubresourceLayout2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2 calloc(MemoryStack stack) {
        return new VkSubresourceLayout2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubresourceLayout2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubresourceLayout2.PNEXT); }
    /** Unsafe version of {@link #subresourceLayout}. */
    public static VkSubresourceLayout nsubresourceLayout(long struct) { return VkSubresourceLayout.create(struct + VkSubresourceLayout2.SUBRESOURCELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubresourceLayout2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubresourceLayout2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout2} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceLayout2, Buffer> implements NativeResource {

        private static final VkSubresourceLayout2 ELEMENT_FACTORY = VkSubresourceLayout2.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceLayout2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubresourceLayout2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubresourceLayout2.npNext(address()); }
        /** @return a {@link VkSubresourceLayout} view of the {@code subresourceLayout} field. */
        public VkSubresourceLayout subresourceLayout() { return VkSubresourceLayout2.nsubresourceLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubresourceLayout2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceLayout2.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2} value to the {@code sType} field. */
        public VkSubresourceLayout2.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubresourceLayout2.Buffer pNext(@NativeType("void *") long value) { VkSubresourceLayout2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImageCompressionPropertiesEXT} value to the {@code pNext} chain. */
        public VkSubresourceLayout2.Buffer pNext(VkImageCompressionPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubresourceHostMemcpySize} value to the {@code pNext} chain. */
        public VkSubresourceLayout2.Buffer pNext(VkSubresourceHostMemcpySize value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubresourceHostMemcpySizeEXT} value to the {@code pNext} chain. */
        public VkSubresourceLayout2.Buffer pNext(VkSubresourceHostMemcpySizeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}