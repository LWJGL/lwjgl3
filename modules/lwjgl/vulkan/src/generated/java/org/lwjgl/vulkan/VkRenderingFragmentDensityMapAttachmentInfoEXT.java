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
 * struct VkRenderingFragmentDensityMapAttachmentInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageView imageView;
 *     VkImageLayout imageLayout;
 * }}</pre>
 */
public class VkRenderingFragmentDensityMapAttachmentInfoEXT extends Struct<VkRenderingFragmentDensityMapAttachmentInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW,
        IMAGELAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        IMAGELAYOUT = layout.offsetof(3);
    }

    protected VkRenderingFragmentDensityMapAttachmentInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingFragmentDensityMapAttachmentInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code imageView} field. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** @return the value of the {@code imageLayout} field. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT} value to the {@code sType} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageView} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@code imageLayout} field. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT set(
        int sType,
        long pNext,
        long imageView,
        int imageLayout
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingFragmentDensityMapAttachmentInfoEXT set(VkRenderingFragmentDensityMapAttachmentInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT malloc() {
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT calloc() {
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance for the specified memory address. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT create(long address) {
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingFragmentDensityMapAttachmentInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT malloc(MemoryStack stack) {
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT calloc(MemoryStack stack) {
        return new VkRenderingFragmentDensityMapAttachmentInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return memGetLong(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGEVIEW); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return memGetInt(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { memPutLong(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGEVIEW, value); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { memPutInt(struct + VkRenderingFragmentDensityMapAttachmentInfoEXT.IMAGELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderingFragmentDensityMapAttachmentInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderingFragmentDensityMapAttachmentInfoEXT ELEMENT_FACTORY = VkRenderingFragmentDensityMapAttachmentInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingFragmentDensityMapAttachmentInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingFragmentDensityMapAttachmentInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.npNext(address()); }
        /** @return the value of the {@code imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageView(address()); }
        /** @return the value of the {@code imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT} value to the {@code sType} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageView} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer imageView(@NativeType("VkImageView") long value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@code imageLayout} field. */
        public VkRenderingFragmentDensityMapAttachmentInfoEXT.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkRenderingFragmentDensityMapAttachmentInfoEXT.nimageLayout(address(), value); return this; }

    }

}