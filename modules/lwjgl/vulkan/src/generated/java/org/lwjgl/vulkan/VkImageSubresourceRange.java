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
 * struct VkImageSubresourceRange {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t baseMipLevel;
 *     uint32_t levelCount;
 *     uint32_t baseArrayLayer;
 *     uint32_t layerCount;
 * }}</pre>
 */
public class VkImageSubresourceRange extends Struct<VkImageSubresourceRange> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        BASEMIPLEVEL,
        LEVELCOUNT,
        BASEARRAYLAYER,
        LAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        BASEMIPLEVEL = layout.offsetof(1);
        LEVELCOUNT = layout.offsetof(2);
        BASEARRAYLAYER = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
    }

    protected VkImageSubresourceRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageSubresourceRange create(long address, @Nullable ByteBuffer container) {
        return new VkImageSubresourceRange(address, container);
    }

    /**
     * Creates a {@code VkImageSubresourceRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresourceRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** @return the value of the {@code baseMipLevel} field. */
    @NativeType("uint32_t")
    public int baseMipLevel() { return nbaseMipLevel(address()); }
    /** @return the value of the {@code levelCount} field. */
    @NativeType("uint32_t")
    public int levelCount() { return nlevelCount(address()); }
    /** @return the value of the {@code baseArrayLayer} field. */
    @NativeType("uint32_t")
    public int baseArrayLayer() { return nbaseArrayLayer(address()); }
    /** @return the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }

    /** Sets the specified value to the {@code aspectMask} field. */
    public VkImageSubresourceRange aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@code baseMipLevel} field. */
    public VkImageSubresourceRange baseMipLevel(@NativeType("uint32_t") int value) { nbaseMipLevel(address(), value); return this; }
    /** Sets the specified value to the {@code levelCount} field. */
    public VkImageSubresourceRange levelCount(@NativeType("uint32_t") int value) { nlevelCount(address(), value); return this; }
    /** Sets the specified value to the {@code baseArrayLayer} field. */
    public VkImageSubresourceRange baseArrayLayer(@NativeType("uint32_t") int value) { nbaseArrayLayer(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public VkImageSubresourceRange layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSubresourceRange set(
        int aspectMask,
        int baseMipLevel,
        int levelCount,
        int baseArrayLayer,
        int layerCount
    ) {
        aspectMask(aspectMask);
        baseMipLevel(baseMipLevel);
        levelCount(levelCount);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresourceRange set(VkImageSubresourceRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSubresourceRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresourceRange malloc() {
        return new VkImageSubresourceRange(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresourceRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresourceRange calloc() {
        return new VkImageSubresourceRange(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresourceRange} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresourceRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresourceRange(memAddress(container), container);
    }

    /** Returns a new {@code VkImageSubresourceRange} instance for the specified memory address. */
    public static VkImageSubresourceRange create(long address) {
        return new VkImageSubresourceRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageSubresourceRange createSafe(long address) {
        return address == NULL ? null : new VkImageSubresourceRange(address, null);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageSubresourceRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageSubresourceRange.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageSubresourceRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresourceRange malloc(MemoryStack stack) {
        return new VkImageSubresourceRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageSubresourceRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresourceRange calloc(MemoryStack stack) {
        return new VkImageSubresourceRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkImageSubresourceRange.ASPECTMASK); }
    /** Unsafe version of {@link #baseMipLevel}. */
    public static int nbaseMipLevel(long struct) { return memGetInt(struct + VkImageSubresourceRange.BASEMIPLEVEL); }
    /** Unsafe version of {@link #levelCount}. */
    public static int nlevelCount(long struct) { return memGetInt(struct + VkImageSubresourceRange.LEVELCOUNT); }
    /** Unsafe version of {@link #baseArrayLayer}. */
    public static int nbaseArrayLayer(long struct) { return memGetInt(struct + VkImageSubresourceRange.BASEARRAYLAYER); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return memGetInt(struct + VkImageSubresourceRange.LAYERCOUNT); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.ASPECTMASK, value); }
    /** Unsafe version of {@link #baseMipLevel(int) baseMipLevel}. */
    public static void nbaseMipLevel(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.BASEMIPLEVEL, value); }
    /** Unsafe version of {@link #levelCount(int) levelCount}. */
    public static void nlevelCount(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.LEVELCOUNT, value); }
    /** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
    public static void nbaseArrayLayer(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.BASEARRAYLAYER, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { memPutInt(struct + VkImageSubresourceRange.LAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkImageSubresourceRange} structs. */
    public static class Buffer extends StructBuffer<VkImageSubresourceRange, Buffer> implements NativeResource {

        private static final VkImageSubresourceRange ELEMENT_FACTORY = VkImageSubresourceRange.create(-1L);

        /**
         * Creates a new {@code VkImageSubresourceRange.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresourceRange#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageSubresourceRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkImageSubresourceRange.naspectMask(address()); }
        /** @return the value of the {@code baseMipLevel} field. */
        @NativeType("uint32_t")
        public int baseMipLevel() { return VkImageSubresourceRange.nbaseMipLevel(address()); }
        /** @return the value of the {@code levelCount} field. */
        @NativeType("uint32_t")
        public int levelCount() { return VkImageSubresourceRange.nlevelCount(address()); }
        /** @return the value of the {@code baseArrayLayer} field. */
        @NativeType("uint32_t")
        public int baseArrayLayer() { return VkImageSubresourceRange.nbaseArrayLayer(address()); }
        /** @return the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkImageSubresourceRange.nlayerCount(address()); }

        /** Sets the specified value to the {@code aspectMask} field. */
        public VkImageSubresourceRange.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkImageSubresourceRange.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@code baseMipLevel} field. */
        public VkImageSubresourceRange.Buffer baseMipLevel(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nbaseMipLevel(address(), value); return this; }
        /** Sets the specified value to the {@code levelCount} field. */
        public VkImageSubresourceRange.Buffer levelCount(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nlevelCount(address(), value); return this; }
        /** Sets the specified value to the {@code baseArrayLayer} field. */
        public VkImageSubresourceRange.Buffer baseArrayLayer(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nbaseArrayLayer(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public VkImageSubresourceRange.Buffer layerCount(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nlayerCount(address(), value); return this; }

    }

}