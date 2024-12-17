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
 * struct VkHostImageLayoutTransitionInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }}</pre>
 */
public class VkHostImageLayoutTransitionInfo extends Struct<VkHostImageLayoutTransitionInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        OLDLAYOUT,
        NEWLAYOUT,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        OLDLAYOUT = layout.offsetof(3);
        NEWLAYOUT = layout.offsetof(4);
        SUBRESOURCERANGE = layout.offsetof(5);
    }

    protected VkHostImageLayoutTransitionInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostImageLayoutTransitionInfo create(long address, @Nullable ByteBuffer container) {
        return new VkHostImageLayoutTransitionInfo(address, container);
    }

    /**
     * Creates a {@code VkHostImageLayoutTransitionInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostImageLayoutTransitionInfo(ByteBuffer container) {
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
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code oldLayout} field. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** @return the value of the {@code newLayout} field. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkHostImageLayoutTransitionInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO} value to the {@code sType} field. */
    public VkHostImageLayoutTransitionInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkHostImageLayoutTransitionInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkHostImageLayoutTransitionInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code oldLayout} field. */
    public VkHostImageLayoutTransitionInfo oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@code newLayout} field. */
    public VkHostImageLayoutTransitionInfo newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkHostImageLayoutTransitionInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHostImageLayoutTransitionInfo subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkHostImageLayoutTransitionInfo set(
        int sType,
        long pNext,
        long image,
        int oldLayout,
        int newLayout,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        oldLayout(oldLayout);
        newLayout(newLayout);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHostImageLayoutTransitionInfo set(VkHostImageLayoutTransitionInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfo malloc() {
        return new VkHostImageLayoutTransitionInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfo calloc() {
        return new VkHostImageLayoutTransitionInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated with {@link BufferUtils}. */
    public static VkHostImageLayoutTransitionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageLayoutTransitionInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance for the specified memory address. */
    public static VkHostImageLayoutTransitionInfo create(long address) {
        return new VkHostImageLayoutTransitionInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHostImageLayoutTransitionInfo createSafe(long address) {
        return address == NULL ? null : new VkHostImageLayoutTransitionInfo(address, null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostImageLayoutTransitionInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHostImageLayoutTransitionInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfo malloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfo calloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkHostImageLayoutTransitionInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHostImageLayoutTransitionInfo.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkHostImageLayoutTransitionInfo.IMAGE); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return memGetInt(struct + VkHostImageLayoutTransitionInfo.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return memGetInt(struct + VkHostImageLayoutTransitionInfo.NEWLAYOUT); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkHostImageLayoutTransitionInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHostImageLayoutTransitionInfo.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkHostImageLayoutTransitionInfo.IMAGE, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { memPutInt(struct + VkHostImageLayoutTransitionInfo.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { memPutInt(struct + VkHostImageLayoutTransitionInfo.NEWLAYOUT, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkHostImageLayoutTransitionInfo} structs. */
    public static class Buffer extends StructBuffer<VkHostImageLayoutTransitionInfo, Buffer> implements NativeResource {

        private static final VkHostImageLayoutTransitionInfo ELEMENT_FACTORY = VkHostImageLayoutTransitionInfo.create(-1L);

        /**
         * Creates a new {@code VkHostImageLayoutTransitionInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostImageLayoutTransitionInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostImageLayoutTransitionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHostImageLayoutTransitionInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHostImageLayoutTransitionInfo.npNext(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkHostImageLayoutTransitionInfo.nimage(address()); }
        /** @return the value of the {@code oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkHostImageLayoutTransitionInfo.noldLayout(address()); }
        /** @return the value of the {@code newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkHostImageLayoutTransitionInfo.nnewLayout(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkHostImageLayoutTransitionInfo.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkHostImageLayoutTransitionInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkHostImageLayoutTransitionInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO} value to the {@code sType} field. */
        public VkHostImageLayoutTransitionInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkHostImageLayoutTransitionInfo.Buffer pNext(@NativeType("void const *") long value) { VkHostImageLayoutTransitionInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkHostImageLayoutTransitionInfo.Buffer image(@NativeType("VkImage") long value) { VkHostImageLayoutTransitionInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code oldLayout} field. */
        public VkHostImageLayoutTransitionInfo.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@code newLayout} field. */
        public VkHostImageLayoutTransitionInfo.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.nnewLayout(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkHostImageLayoutTransitionInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkHostImageLayoutTransitionInfo.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHostImageLayoutTransitionInfo.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}