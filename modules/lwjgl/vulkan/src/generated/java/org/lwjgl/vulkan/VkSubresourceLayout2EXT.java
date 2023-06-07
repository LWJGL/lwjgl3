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
 * Structure specifying subresource layout.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkImageCompressionPropertiesEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubresourceLayout}, {@link EXTImageCompressionControl#vkGetImageSubresourceLayout2EXT GetImageSubresourceLayout2EXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubresourceLayout2EXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkSubresourceLayout VkSubresourceLayout} {@link #subresourceLayout};
 * }</code></pre>
 */
public class VkSubresourceLayout2EXT extends Struct<VkSubresourceLayout2EXT> implements NativeResource {

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

    protected VkSubresourceLayout2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceLayout2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceLayout2EXT(address, container);
    }

    /**
     * Creates a {@code VkSubresourceLayout2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout2EXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkSubresourceLayout} structure. */
    public VkSubresourceLayout subresourceLayout() { return nsubresourceLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubresourceLayout2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT} value to the {@link #sType} field. */
    public VkSubresourceLayout2EXT sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubresourceLayout2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImageCompressionPropertiesEXT} value to the {@code pNext} chain. */
    public VkSubresourceLayout2EXT pNext(VkImageCompressionPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkSubresourceLayout2EXT set(
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
    public VkSubresourceLayout2EXT set(VkSubresourceLayout2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2EXT malloc() {
        return new VkSubresourceLayout2EXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2EXT calloc() {
        return new VkSubresourceLayout2EXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2EXT} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2EXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout2EXT} instance for the specified memory address. */
    public static VkSubresourceLayout2EXT create(long address) {
        return new VkSubresourceLayout2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout2EXT createSafe(long address) {
        return address == NULL ? null : new VkSubresourceLayout2EXT(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceLayout2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2EXT malloc(MemoryStack stack) {
        return new VkSubresourceLayout2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2EXT calloc(MemoryStack stack) {
        return new VkSubresourceLayout2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubresourceLayout2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubresourceLayout2EXT.PNEXT); }
    /** Unsafe version of {@link #subresourceLayout}. */
    public static VkSubresourceLayout nsubresourceLayout(long struct) { return VkSubresourceLayout.create(struct + VkSubresourceLayout2EXT.SUBRESOURCELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubresourceLayout2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubresourceLayout2EXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout2EXT} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceLayout2EXT, Buffer> implements NativeResource {

        private static final VkSubresourceLayout2EXT ELEMENT_FACTORY = VkSubresourceLayout2EXT.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout2EXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceLayout2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubresourceLayout2EXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubresourceLayout2EXT.nsType(address()); }
        /** @return the value of the {@link VkSubresourceLayout2EXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubresourceLayout2EXT.npNext(address()); }
        /** @return a {@link VkSubresourceLayout} view of the {@link VkSubresourceLayout2EXT#subresourceLayout} field. */
        public VkSubresourceLayout subresourceLayout() { return VkSubresourceLayout2EXT.nsubresourceLayout(address()); }

        /** Sets the specified value to the {@link VkSubresourceLayout2EXT#sType} field. */
        public VkSubresourceLayout2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceLayout2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT} value to the {@link VkSubresourceLayout2EXT#sType} field. */
        public VkSubresourceLayout2EXT.Buffer sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT); }
        /** Sets the specified value to the {@link VkSubresourceLayout2EXT#pNext} field. */
        public VkSubresourceLayout2EXT.Buffer pNext(@NativeType("void *") long value) { VkSubresourceLayout2EXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImageCompressionPropertiesEXT} value to the {@code pNext} chain. */
        public VkSubresourceLayout2EXT.Buffer pNext(VkImageCompressionPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}