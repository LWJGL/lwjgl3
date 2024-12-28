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
 * struct SDL_GPUBlitInfo {
 *     {@link SDL_GPUBlitRegion SDL_GPUBlitRegion} source;
 *     {@link SDL_GPUBlitRegion SDL_GPUBlitRegion} destination;
 *     SDL_GPULoadOp load_op;
 *     {@link SDL_FColor SDL_FColor} clear_color;
 *     SDL_FlipMode flip_mode;
 *     SDL_GPUFilter filter;
 *     bool cycle;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_GPUBlitInfo extends Struct<SDL_GPUBlitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SOURCE,
        DESTINATION,
        LOAD_OP,
        CLEAR_COLOR,
        FLIP_MODE,
        FILTER,
        CYCLE,
        PADDING1,
        PADDING2,
        PADDING3;

    static {
        Layout layout = __struct(
            __member(SDL_GPUBlitRegion.SIZEOF, SDL_GPUBlitRegion.ALIGNOF),
            __member(SDL_GPUBlitRegion.SIZEOF, SDL_GPUBlitRegion.ALIGNOF),
            __member(4),
            __member(SDL_FColor.SIZEOF, SDL_FColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SOURCE = layout.offsetof(0);
        DESTINATION = layout.offsetof(1);
        LOAD_OP = layout.offsetof(2);
        CLEAR_COLOR = layout.offsetof(3);
        FLIP_MODE = layout.offsetof(4);
        FILTER = layout.offsetof(5);
        CYCLE = layout.offsetof(6);
        PADDING1 = layout.offsetof(7);
        PADDING2 = layout.offsetof(8);
        PADDING3 = layout.offsetof(9);
    }

    protected SDL_GPUBlitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUBlitInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUBlitInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUBlitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUBlitInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SDL_GPUBlitRegion} view of the {@code source} field. */
    public SDL_GPUBlitRegion source() { return nsource(address()); }
    /** @return a {@link SDL_GPUBlitRegion} view of the {@code destination} field. */
    public SDL_GPUBlitRegion destination() { return ndestination(address()); }
    /** @return the value of the {@code load_op} field. */
    @NativeType("SDL_GPULoadOp")
    public int load_op() { return nload_op(address()); }
    /** @return a {@link SDL_FColor} view of the {@code clear_color} field. */
    public SDL_FColor clear_color() { return nclear_color(address()); }
    /** @return the value of the {@code flip_mode} field. */
    @NativeType("SDL_FlipMode")
    public int flip_mode() { return nflip_mode(address()); }
    /** @return the value of the {@code filter} field. */
    @NativeType("SDL_GPUFilter")
    public int filter() { return nfilter(address()); }
    /** @return the value of the {@code cycle} field. */
    @NativeType("bool")
    public boolean cycle() { return ncycle(address()); }

    /** Copies the specified {@link SDL_GPUBlitRegion} to the {@code source} field. */
    public SDL_GPUBlitInfo source(SDL_GPUBlitRegion value) { nsource(address(), value); return this; }
    /** Passes the {@code source} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUBlitInfo source(java.util.function.Consumer<SDL_GPUBlitRegion> consumer) { consumer.accept(source()); return this; }
    /** Copies the specified {@link SDL_GPUBlitRegion} to the {@code destination} field. */
    public SDL_GPUBlitInfo destination(SDL_GPUBlitRegion value) { ndestination(address(), value); return this; }
    /** Passes the {@code destination} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUBlitInfo destination(java.util.function.Consumer<SDL_GPUBlitRegion> consumer) { consumer.accept(destination()); return this; }
    /** Sets the specified value to the {@code load_op} field. */
    public SDL_GPUBlitInfo load_op(@NativeType("SDL_GPULoadOp") int value) { nload_op(address(), value); return this; }
    /** Copies the specified {@link SDL_FColor} to the {@code clear_color} field. */
    public SDL_GPUBlitInfo clear_color(SDL_FColor value) { nclear_color(address(), value); return this; }
    /** Passes the {@code clear_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUBlitInfo clear_color(java.util.function.Consumer<SDL_FColor> consumer) { consumer.accept(clear_color()); return this; }
    /** Sets the specified value to the {@code flip_mode} field. */
    public SDL_GPUBlitInfo flip_mode(@NativeType("SDL_FlipMode") int value) { nflip_mode(address(), value); return this; }
    /** Sets the specified value to the {@code filter} field. */
    public SDL_GPUBlitInfo filter(@NativeType("SDL_GPUFilter") int value) { nfilter(address(), value); return this; }
    /** Sets the specified value to the {@code cycle} field. */
    public SDL_GPUBlitInfo cycle(@NativeType("bool") boolean value) { ncycle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUBlitInfo set(
        SDL_GPUBlitRegion source,
        SDL_GPUBlitRegion destination,
        int load_op,
        SDL_FColor clear_color,
        int flip_mode,
        int filter,
        boolean cycle
    ) {
        source(source);
        destination(destination);
        load_op(load_op);
        clear_color(clear_color);
        flip_mode(flip_mode);
        filter(filter);
        cycle(cycle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUBlitInfo set(SDL_GPUBlitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUBlitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUBlitInfo malloc() {
        return new SDL_GPUBlitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBlitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUBlitInfo calloc() {
        return new SDL_GPUBlitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBlitInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUBlitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBlitInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUBlitInfo} instance for the specified memory address. */
    public static SDL_GPUBlitInfo create(long address) {
        return new SDL_GPUBlitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUBlitInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUBlitInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUBlitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBlitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBlitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUBlitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUBlitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUBlitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBlitInfo malloc(MemoryStack stack) {
        return new SDL_GPUBlitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUBlitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBlitInfo calloc(MemoryStack stack) {
        return new SDL_GPUBlitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUBlitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBlitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #source}. */
    public static SDL_GPUBlitRegion nsource(long struct) { return SDL_GPUBlitRegion.create(struct + SDL_GPUBlitInfo.SOURCE); }
    /** Unsafe version of {@link #destination}. */
    public static SDL_GPUBlitRegion ndestination(long struct) { return SDL_GPUBlitRegion.create(struct + SDL_GPUBlitInfo.DESTINATION); }
    /** Unsafe version of {@link #load_op}. */
    public static int nload_op(long struct) { return memGetInt(struct + SDL_GPUBlitInfo.LOAD_OP); }
    /** Unsafe version of {@link #clear_color}. */
    public static SDL_FColor nclear_color(long struct) { return SDL_FColor.create(struct + SDL_GPUBlitInfo.CLEAR_COLOR); }
    /** Unsafe version of {@link #flip_mode}. */
    public static int nflip_mode(long struct) { return memGetInt(struct + SDL_GPUBlitInfo.FLIP_MODE); }
    /** Unsafe version of {@link #filter}. */
    public static int nfilter(long struct) { return memGetInt(struct + SDL_GPUBlitInfo.FILTER); }
    /** Unsafe version of {@link #cycle}. */
    public static boolean ncycle(long struct) { return memGetByte(struct + SDL_GPUBlitInfo.CYCLE) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUBlitInfo.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUBlitInfo.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GPUBlitInfo.PADDING3); }

    /** Unsafe version of {@link #source(SDL_GPUBlitRegion) source}. */
    public static void nsource(long struct, SDL_GPUBlitRegion value) { memCopy(value.address(), struct + SDL_GPUBlitInfo.SOURCE, SDL_GPUBlitRegion.SIZEOF); }
    /** Unsafe version of {@link #destination(SDL_GPUBlitRegion) destination}. */
    public static void ndestination(long struct, SDL_GPUBlitRegion value) { memCopy(value.address(), struct + SDL_GPUBlitInfo.DESTINATION, SDL_GPUBlitRegion.SIZEOF); }
    /** Unsafe version of {@link #load_op(int) load_op}. */
    public static void nload_op(long struct, int value) { memPutInt(struct + SDL_GPUBlitInfo.LOAD_OP, value); }
    /** Unsafe version of {@link #clear_color(SDL_FColor) clear_color}. */
    public static void nclear_color(long struct, SDL_FColor value) { memCopy(value.address(), struct + SDL_GPUBlitInfo.CLEAR_COLOR, SDL_FColor.SIZEOF); }
    /** Unsafe version of {@link #flip_mode(int) flip_mode}. */
    public static void nflip_mode(long struct, int value) { memPutInt(struct + SDL_GPUBlitInfo.FLIP_MODE, value); }
    /** Unsafe version of {@link #filter(int) filter}. */
    public static void nfilter(long struct, int value) { memPutInt(struct + SDL_GPUBlitInfo.FILTER, value); }
    /** Unsafe version of {@link #cycle(boolean) cycle}. */
    public static void ncycle(long struct, boolean value) { memPutByte(struct + SDL_GPUBlitInfo.CYCLE, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUBlitInfo.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUBlitInfo.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GPUBlitInfo.PADDING3, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        SDL_GPUBlitRegion.validate(struct + SDL_GPUBlitInfo.SOURCE);
        SDL_GPUBlitRegion.validate(struct + SDL_GPUBlitInfo.DESTINATION);
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUBlitInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUBlitInfo, Buffer> implements NativeResource {

        private static final SDL_GPUBlitInfo ELEMENT_FACTORY = SDL_GPUBlitInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUBlitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUBlitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUBlitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SDL_GPUBlitRegion} view of the {@code source} field. */
        public SDL_GPUBlitRegion source() { return SDL_GPUBlitInfo.nsource(address()); }
        /** @return a {@link SDL_GPUBlitRegion} view of the {@code destination} field. */
        public SDL_GPUBlitRegion destination() { return SDL_GPUBlitInfo.ndestination(address()); }
        /** @return the value of the {@code load_op} field. */
        @NativeType("SDL_GPULoadOp")
        public int load_op() { return SDL_GPUBlitInfo.nload_op(address()); }
        /** @return a {@link SDL_FColor} view of the {@code clear_color} field. */
        public SDL_FColor clear_color() { return SDL_GPUBlitInfo.nclear_color(address()); }
        /** @return the value of the {@code flip_mode} field. */
        @NativeType("SDL_FlipMode")
        public int flip_mode() { return SDL_GPUBlitInfo.nflip_mode(address()); }
        /** @return the value of the {@code filter} field. */
        @NativeType("SDL_GPUFilter")
        public int filter() { return SDL_GPUBlitInfo.nfilter(address()); }
        /** @return the value of the {@code cycle} field. */
        @NativeType("bool")
        public boolean cycle() { return SDL_GPUBlitInfo.ncycle(address()); }

        /** Copies the specified {@link SDL_GPUBlitRegion} to the {@code source} field. */
        public SDL_GPUBlitInfo.Buffer source(SDL_GPUBlitRegion value) { SDL_GPUBlitInfo.nsource(address(), value); return this; }
        /** Passes the {@code source} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUBlitInfo.Buffer source(java.util.function.Consumer<SDL_GPUBlitRegion> consumer) { consumer.accept(source()); return this; }
        /** Copies the specified {@link SDL_GPUBlitRegion} to the {@code destination} field. */
        public SDL_GPUBlitInfo.Buffer destination(SDL_GPUBlitRegion value) { SDL_GPUBlitInfo.ndestination(address(), value); return this; }
        /** Passes the {@code destination} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUBlitInfo.Buffer destination(java.util.function.Consumer<SDL_GPUBlitRegion> consumer) { consumer.accept(destination()); return this; }
        /** Sets the specified value to the {@code load_op} field. */
        public SDL_GPUBlitInfo.Buffer load_op(@NativeType("SDL_GPULoadOp") int value) { SDL_GPUBlitInfo.nload_op(address(), value); return this; }
        /** Copies the specified {@link SDL_FColor} to the {@code clear_color} field. */
        public SDL_GPUBlitInfo.Buffer clear_color(SDL_FColor value) { SDL_GPUBlitInfo.nclear_color(address(), value); return this; }
        /** Passes the {@code clear_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUBlitInfo.Buffer clear_color(java.util.function.Consumer<SDL_FColor> consumer) { consumer.accept(clear_color()); return this; }
        /** Sets the specified value to the {@code flip_mode} field. */
        public SDL_GPUBlitInfo.Buffer flip_mode(@NativeType("SDL_FlipMode") int value) { SDL_GPUBlitInfo.nflip_mode(address(), value); return this; }
        /** Sets the specified value to the {@code filter} field. */
        public SDL_GPUBlitInfo.Buffer filter(@NativeType("SDL_GPUFilter") int value) { SDL_GPUBlitInfo.nfilter(address(), value); return this; }
        /** Sets the specified value to the {@code cycle} field. */
        public SDL_GPUBlitInfo.Buffer cycle(@NativeType("bool") boolean value) { SDL_GPUBlitInfo.ncycle(address(), value); return this; }

    }

}