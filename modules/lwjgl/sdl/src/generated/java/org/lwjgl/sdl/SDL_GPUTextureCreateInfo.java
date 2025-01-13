/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_GPUTextureCreateInfo {
 *     SDL_GPUTextureType type;
 *     SDL_GPUTextureFormat format;
 *     SDL_GPUTextureUsageFlags usage;
 *     Uint32 width;
 *     Uint32 height;
 *     Uint32 layer_count_or_depth;
 *     Uint32 num_levels;
 *     SDL_GPUSampleCount sample_count;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUTextureCreateInfo extends Struct<SDL_GPUTextureCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FORMAT,
        USAGE,
        WIDTH,
        HEIGHT,
        LAYER_COUNT_OR_DEPTH,
        NUM_LEVELS,
        SAMPLE_COUNT,
        PROPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        USAGE = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
        LAYER_COUNT_OR_DEPTH = layout.offsetof(5);
        NUM_LEVELS = layout.offsetof(6);
        SAMPLE_COUNT = layout.offsetof(7);
        PROPS = layout.offsetof(8);
    }

    protected SDL_GPUTextureCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTextureCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTextureCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTextureCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTextureCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_GPUTextureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("SDL_GPUTextureFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("SDL_GPUTextureUsageFlags")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("Uint32")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("Uint32")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code layer_count_or_depth} field. */
    @NativeType("Uint32")
    public int layer_count_or_depth() { return nlayer_count_or_depth(address()); }
    /** @return the value of the {@code num_levels} field. */
    @NativeType("Uint32")
    public int num_levels() { return nnum_levels(address()); }
    /** @return the value of the {@code sample_count} field. */
    @NativeType("SDL_GPUSampleCount")
    public int sample_count() { return nsample_count(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_GPUTextureCreateInfo type(@NativeType("SDL_GPUTextureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SDL_GPUTextureCreateInfo format(@NativeType("SDL_GPUTextureFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public SDL_GPUTextureCreateInfo usage(@NativeType("SDL_GPUTextureUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public SDL_GPUTextureCreateInfo width(@NativeType("Uint32") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public SDL_GPUTextureCreateInfo height(@NativeType("Uint32") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code layer_count_or_depth} field. */
    public SDL_GPUTextureCreateInfo layer_count_or_depth(@NativeType("Uint32") int value) { nlayer_count_or_depth(address(), value); return this; }
    /** Sets the specified value to the {@code num_levels} field. */
    public SDL_GPUTextureCreateInfo num_levels(@NativeType("Uint32") int value) { nnum_levels(address(), value); return this; }
    /** Sets the specified value to the {@code sample_count} field. */
    public SDL_GPUTextureCreateInfo sample_count(@NativeType("SDL_GPUSampleCount") int value) { nsample_count(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUTextureCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTextureCreateInfo set(
        int type,
        int format,
        int usage,
        int width,
        int height,
        int layer_count_or_depth,
        int num_levels,
        int sample_count,
        int props
    ) {
        type(type);
        format(format);
        usage(usage);
        width(width);
        height(height);
        layer_count_or_depth(layer_count_or_depth);
        num_levels(num_levels);
        sample_count(sample_count);
        props(props);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUTextureCreateInfo set(SDL_GPUTextureCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTextureCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureCreateInfo malloc() {
        return new SDL_GPUTextureCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureCreateInfo calloc() {
        return new SDL_GPUTextureCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTextureCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTextureCreateInfo} instance for the specified memory address. */
    public static SDL_GPUTextureCreateInfo create(long address) {
        return new SDL_GPUTextureCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTextureCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTextureCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTextureCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTextureCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTextureCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUTextureCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTextureCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUTextureCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.TYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.FORMAT); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.USAGE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.HEIGHT); }
    /** Unsafe version of {@link #layer_count_or_depth}. */
    public static int nlayer_count_or_depth(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.LAYER_COUNT_OR_DEPTH); }
    /** Unsafe version of {@link #num_levels}. */
    public static int nnum_levels(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.NUM_LEVELS); }
    /** Unsafe version of {@link #sample_count}. */
    public static int nsample_count(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.SAMPLE_COUNT); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUTextureCreateInfo.PROPS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.HEIGHT, value); }
    /** Unsafe version of {@link #layer_count_or_depth(int) layer_count_or_depth}. */
    public static void nlayer_count_or_depth(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.LAYER_COUNT_OR_DEPTH, value); }
    /** Unsafe version of {@link #num_levels(int) num_levels}. */
    public static void nnum_levels(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.NUM_LEVELS, value); }
    /** Unsafe version of {@link #sample_count(int) sample_count}. */
    public static void nsample_count(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.SAMPLE_COUNT, value); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUTextureCreateInfo.PROPS, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUTextureCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTextureCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUTextureCreateInfo ELEMENT_FACTORY = SDL_GPUTextureCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTextureCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTextureCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTextureCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_GPUTextureType")
        public int type() { return SDL_GPUTextureCreateInfo.ntype(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("SDL_GPUTextureFormat")
        public int format() { return SDL_GPUTextureCreateInfo.nformat(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("SDL_GPUTextureUsageFlags")
        public int usage() { return SDL_GPUTextureCreateInfo.nusage(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("Uint32")
        public int width() { return SDL_GPUTextureCreateInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("Uint32")
        public int height() { return SDL_GPUTextureCreateInfo.nheight(address()); }
        /** @return the value of the {@code layer_count_or_depth} field. */
        @NativeType("Uint32")
        public int layer_count_or_depth() { return SDL_GPUTextureCreateInfo.nlayer_count_or_depth(address()); }
        /** @return the value of the {@code num_levels} field. */
        @NativeType("Uint32")
        public int num_levels() { return SDL_GPUTextureCreateInfo.nnum_levels(address()); }
        /** @return the value of the {@code sample_count} field. */
        @NativeType("SDL_GPUSampleCount")
        public int sample_count() { return SDL_GPUTextureCreateInfo.nsample_count(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUTextureCreateInfo.nprops(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_GPUTextureCreateInfo.Buffer type(@NativeType("SDL_GPUTextureType") int value) { SDL_GPUTextureCreateInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SDL_GPUTextureCreateInfo.Buffer format(@NativeType("SDL_GPUTextureFormat") int value) { SDL_GPUTextureCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public SDL_GPUTextureCreateInfo.Buffer usage(@NativeType("SDL_GPUTextureUsageFlags") int value) { SDL_GPUTextureCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public SDL_GPUTextureCreateInfo.Buffer width(@NativeType("Uint32") int value) { SDL_GPUTextureCreateInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public SDL_GPUTextureCreateInfo.Buffer height(@NativeType("Uint32") int value) { SDL_GPUTextureCreateInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code layer_count_or_depth} field. */
        public SDL_GPUTextureCreateInfo.Buffer layer_count_or_depth(@NativeType("Uint32") int value) { SDL_GPUTextureCreateInfo.nlayer_count_or_depth(address(), value); return this; }
        /** Sets the specified value to the {@code num_levels} field. */
        public SDL_GPUTextureCreateInfo.Buffer num_levels(@NativeType("Uint32") int value) { SDL_GPUTextureCreateInfo.nnum_levels(address(), value); return this; }
        /** Sets the specified value to the {@code sample_count} field. */
        public SDL_GPUTextureCreateInfo.Buffer sample_count(@NativeType("SDL_GPUSampleCount") int value) { SDL_GPUTextureCreateInfo.nsample_count(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUTextureCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUTextureCreateInfo.nprops(address(), value); return this; }

    }

}