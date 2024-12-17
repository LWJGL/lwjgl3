/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct bgfx_texture_info_t {
 *     bgfx_texture_format_t format;
 *     uint32_t storageSize;
 *     uint16_t width;
 *     uint16_t height;
 *     uint16_t depth;
 *     uint16_t numLayers;
 *     uint8_t numMips;
 *     uint8_t bitsPerPixel;
 *     bool cubeMap;
 * }}</pre>
 */
@NativeType("struct bgfx_texture_info_t")
public class BGFXTextureInfo extends Struct<BGFXTextureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        STORAGESIZE,
        WIDTH,
        HEIGHT,
        DEPTH,
        NUMLAYERS,
        NUMMIPS,
        BITSPERPIXEL,
        CUBEMAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        STORAGESIZE = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        DEPTH = layout.offsetof(4);
        NUMLAYERS = layout.offsetof(5);
        NUMMIPS = layout.offsetof(6);
        BITSPERPIXEL = layout.offsetof(7);
        CUBEMAP = layout.offsetof(8);
    }

    protected BGFXTextureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXTextureInfo create(long address, @Nullable ByteBuffer container) {
        return new BGFXTextureInfo(address, container);
    }

    /**
     * Creates a {@code BGFXTextureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTextureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("bgfx_texture_format_t")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code storageSize} field. */
    @NativeType("uint32_t")
    public int storageSize() { return nstorageSize(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("uint16_t")
    public short depth() { return ndepth(address()); }
    /** @return the value of the {@code numLayers} field. */
    @NativeType("uint16_t")
    public short numLayers() { return nnumLayers(address()); }
    /** @return the value of the {@code numMips} field. */
    @NativeType("uint8_t")
    public byte numMips() { return nnumMips(address()); }
    /** @return the value of the {@code bitsPerPixel} field. */
    @NativeType("uint8_t")
    public byte bitsPerPixel() { return nbitsPerPixel(address()); }
    /** @return the value of the {@code cubeMap} field. */
    @NativeType("bool")
    public boolean cubeMap() { return ncubeMap(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXTextureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTextureInfo malloc() {
        return new BGFXTextureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BGFXTextureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTextureInfo calloc() {
        return new BGFXTextureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BGFXTextureInfo} instance allocated with {@link BufferUtils}. */
    public static BGFXTextureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BGFXTextureInfo(memAddress(container), container);
    }

    /** Returns a new {@code BGFXTextureInfo} instance for the specified memory address. */
    public static BGFXTextureInfo create(long address) {
        return new BGFXTextureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXTextureInfo createSafe(long address) {
        return address == NULL ? null : new BGFXTextureInfo(address, null);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTextureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTextureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTextureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link BGFXTextureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXTextureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXTextureInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTextureInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXTextureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTextureInfo malloc(MemoryStack stack) {
        return new BGFXTextureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BGFXTextureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTextureInfo calloc(MemoryStack stack) {
        return new BGFXTextureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTextureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTextureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTextureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + BGFXTextureInfo.FORMAT); }
    /** Unsafe version of {@link #storageSize}. */
    public static int nstorageSize(long struct) { return memGetInt(struct + BGFXTextureInfo.STORAGESIZE); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return memGetShort(struct + BGFXTextureInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return memGetShort(struct + BGFXTextureInfo.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static short ndepth(long struct) { return memGetShort(struct + BGFXTextureInfo.DEPTH); }
    /** Unsafe version of {@link #numLayers}. */
    public static short nnumLayers(long struct) { return memGetShort(struct + BGFXTextureInfo.NUMLAYERS); }
    /** Unsafe version of {@link #numMips}. */
    public static byte nnumMips(long struct) { return memGetByte(struct + BGFXTextureInfo.NUMMIPS); }
    /** Unsafe version of {@link #bitsPerPixel}. */
    public static byte nbitsPerPixel(long struct) { return memGetByte(struct + BGFXTextureInfo.BITSPERPIXEL); }
    /** Unsafe version of {@link #cubeMap}. */
    public static boolean ncubeMap(long struct) { return memGetByte(struct + BGFXTextureInfo.CUBEMAP) != 0; }

    // -----------------------------------

    /** An array of {@link BGFXTextureInfo} structs. */
    public static class Buffer extends StructBuffer<BGFXTextureInfo, Buffer> implements NativeResource {

        private static final BGFXTextureInfo ELEMENT_FACTORY = BGFXTextureInfo.create(-1L);

        /**
         * Creates a new {@code BGFXTextureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTextureInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXTextureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("bgfx_texture_format_t")
        public int format() { return BGFXTextureInfo.nformat(address()); }
        /** @return the value of the {@code storageSize} field. */
        @NativeType("uint32_t")
        public int storageSize() { return BGFXTextureInfo.nstorageSize(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint16_t")
        public short width() { return BGFXTextureInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint16_t")
        public short height() { return BGFXTextureInfo.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("uint16_t")
        public short depth() { return BGFXTextureInfo.ndepth(address()); }
        /** @return the value of the {@code numLayers} field. */
        @NativeType("uint16_t")
        public short numLayers() { return BGFXTextureInfo.nnumLayers(address()); }
        /** @return the value of the {@code numMips} field. */
        @NativeType("uint8_t")
        public byte numMips() { return BGFXTextureInfo.nnumMips(address()); }
        /** @return the value of the {@code bitsPerPixel} field. */
        @NativeType("uint8_t")
        public byte bitsPerPixel() { return BGFXTextureInfo.nbitsPerPixel(address()); }
        /** @return the value of the {@code cubeMap} field. */
        @NativeType("bool")
        public boolean cubeMap() { return BGFXTextureInfo.ncubeMap(address()); }

    }

}