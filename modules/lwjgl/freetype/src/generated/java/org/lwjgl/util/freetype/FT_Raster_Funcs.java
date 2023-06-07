/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure used to describe a given raster class to the library.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Raster_Funcs {
 *     FT_Glyph_Format glyph_format;
 *     {@link FT_Raster_NewFuncI FT_Raster_NewFunc} raster_new;
 *     {@link FT_Raster_ResetFuncI FT_Raster_ResetFunc} raster_reset;
 *     {@link FT_Raster_SetModeFuncI FT_Raster_SetModeFunc} raster_set_mode;
 *     {@link FT_Raster_RenderFuncI FT_Raster_RenderFunc} raster_render;
 *     {@link FT_Raster_DoneFuncI FT_Raster_DoneFunc} raster_done;
 * }</code></pre>
 */
public class FT_Raster_Funcs extends Struct<FT_Raster_Funcs> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLYPH_FORMAT,
        RASTER_NEW,
        RASTER_RESET,
        RASTER_SET_MODE,
        RASTER_RENDER,
        RASTER_DONE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLYPH_FORMAT = layout.offsetof(0);
        RASTER_NEW = layout.offsetof(1);
        RASTER_RESET = layout.offsetof(2);
        RASTER_SET_MODE = layout.offsetof(3);
        RASTER_RENDER = layout.offsetof(4);
        RASTER_DONE = layout.offsetof(5);
    }

    protected FT_Raster_Funcs(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Raster_Funcs create(long address, @Nullable ByteBuffer container) {
        return new FT_Raster_Funcs(address, container);
    }

    /**
     * Creates a {@code FT_Raster_Funcs} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Raster_Funcs(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code glyph_format} field. */
    @NativeType("FT_Glyph_Format")
    public int glyph_format() { return nglyph_format(address()); }
    /** @return the value of the {@code raster_new} field. */
    @Nullable
    public FT_Raster_NewFunc raster_new() { return nraster_new(address()); }
    /** @return the value of the {@code raster_reset} field. */
    @Nullable
    public FT_Raster_ResetFunc raster_reset() { return nraster_reset(address()); }
    /** @return the value of the {@code raster_set_mode} field. */
    @Nullable
    public FT_Raster_SetModeFunc raster_set_mode() { return nraster_set_mode(address()); }
    /** @return the value of the {@code raster_render} field. */
    @Nullable
    public FT_Raster_RenderFunc raster_render() { return nraster_render(address()); }
    /** @return the value of the {@code raster_done} field. */
    @Nullable
    public FT_Raster_DoneFunc raster_done() { return nraster_done(address()); }

    /** Sets the specified value to the {@code glyph_format} field. */
    public FT_Raster_Funcs glyph_format(@NativeType("FT_Glyph_Format") int value) { nglyph_format(address(), value); return this; }
    /** Sets the specified value to the {@code raster_new} field. */
    public FT_Raster_Funcs raster_new(@Nullable @NativeType("FT_Raster_NewFunc") FT_Raster_NewFuncI value) { nraster_new(address(), value); return this; }
    /** Sets the specified value to the {@code raster_reset} field. */
    public FT_Raster_Funcs raster_reset(@Nullable @NativeType("FT_Raster_ResetFunc") FT_Raster_ResetFuncI value) { nraster_reset(address(), value); return this; }
    /** Sets the specified value to the {@code raster_set_mode} field. */
    public FT_Raster_Funcs raster_set_mode(@Nullable @NativeType("FT_Raster_SetModeFunc") FT_Raster_SetModeFuncI value) { nraster_set_mode(address(), value); return this; }
    /** Sets the specified value to the {@code raster_render} field. */
    public FT_Raster_Funcs raster_render(@Nullable @NativeType("FT_Raster_RenderFunc") FT_Raster_RenderFuncI value) { nraster_render(address(), value); return this; }
    /** Sets the specified value to the {@code raster_done} field. */
    public FT_Raster_Funcs raster_done(@Nullable @NativeType("FT_Raster_DoneFunc") FT_Raster_DoneFuncI value) { nraster_done(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Raster_Funcs set(
        int glyph_format,
        FT_Raster_NewFuncI raster_new,
        FT_Raster_ResetFuncI raster_reset,
        FT_Raster_SetModeFuncI raster_set_mode,
        FT_Raster_RenderFuncI raster_render,
        FT_Raster_DoneFuncI raster_done
    ) {
        glyph_format(glyph_format);
        raster_new(raster_new);
        raster_reset(raster_reset);
        raster_set_mode(raster_set_mode);
        raster_render(raster_render);
        raster_done(raster_done);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Raster_Funcs set(FT_Raster_Funcs src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Raster_Funcs} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Raster_Funcs malloc() {
        return new FT_Raster_Funcs(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Raster_Funcs} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Raster_Funcs calloc() {
        return new FT_Raster_Funcs(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Raster_Funcs} instance allocated with {@link BufferUtils}. */
    public static FT_Raster_Funcs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Raster_Funcs(memAddress(container), container);
    }

    /** Returns a new {@code FT_Raster_Funcs} instance for the specified memory address. */
    public static FT_Raster_Funcs create(long address) {
        return new FT_Raster_Funcs(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Raster_Funcs createSafe(long address) {
        return address == NULL ? null : new FT_Raster_Funcs(address, null);
    }

    /**
     * Returns a new {@link FT_Raster_Funcs.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Funcs.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Raster_Funcs.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Funcs.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Raster_Funcs.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Funcs.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Raster_Funcs.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Funcs.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Raster_Funcs.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Raster_Funcs} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Raster_Funcs malloc(MemoryStack stack) {
        return new FT_Raster_Funcs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Raster_Funcs} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Raster_Funcs calloc(MemoryStack stack) {
        return new FT_Raster_Funcs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Raster_Funcs.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Funcs.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Raster_Funcs.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Funcs.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #glyph_format}. */
    public static int nglyph_format(long struct) { return UNSAFE.getInt(null, struct + FT_Raster_Funcs.GLYPH_FORMAT); }
    /** Unsafe version of {@link #raster_new}. */
    @Nullable public static FT_Raster_NewFunc nraster_new(long struct) { return FT_Raster_NewFunc.createSafe(memGetAddress(struct + FT_Raster_Funcs.RASTER_NEW)); }
    /** Unsafe version of {@link #raster_reset}. */
    @Nullable public static FT_Raster_ResetFunc nraster_reset(long struct) { return FT_Raster_ResetFunc.createSafe(memGetAddress(struct + FT_Raster_Funcs.RASTER_RESET)); }
    /** Unsafe version of {@link #raster_set_mode}. */
    @Nullable public static FT_Raster_SetModeFunc nraster_set_mode(long struct) { return FT_Raster_SetModeFunc.createSafe(memGetAddress(struct + FT_Raster_Funcs.RASTER_SET_MODE)); }
    /** Unsafe version of {@link #raster_render}. */
    @Nullable public static FT_Raster_RenderFunc nraster_render(long struct) { return FT_Raster_RenderFunc.createSafe(memGetAddress(struct + FT_Raster_Funcs.RASTER_RENDER)); }
    /** Unsafe version of {@link #raster_done}. */
    @Nullable public static FT_Raster_DoneFunc nraster_done(long struct) { return FT_Raster_DoneFunc.createSafe(memGetAddress(struct + FT_Raster_Funcs.RASTER_DONE)); }

    /** Unsafe version of {@link #glyph_format(int) glyph_format}. */
    public static void nglyph_format(long struct, int value) { UNSAFE.putInt(null, struct + FT_Raster_Funcs.GLYPH_FORMAT, value); }
    /** Unsafe version of {@link #raster_new(FT_Raster_NewFuncI) raster_new}. */
    public static void nraster_new(long struct, @Nullable FT_Raster_NewFuncI value) { memPutAddress(struct + FT_Raster_Funcs.RASTER_NEW, memAddressSafe(value)); }
    /** Unsafe version of {@link #raster_reset(FT_Raster_ResetFuncI) raster_reset}. */
    public static void nraster_reset(long struct, @Nullable FT_Raster_ResetFuncI value) { memPutAddress(struct + FT_Raster_Funcs.RASTER_RESET, memAddressSafe(value)); }
    /** Unsafe version of {@link #raster_set_mode(FT_Raster_SetModeFuncI) raster_set_mode}. */
    public static void nraster_set_mode(long struct, @Nullable FT_Raster_SetModeFuncI value) { memPutAddress(struct + FT_Raster_Funcs.RASTER_SET_MODE, memAddressSafe(value)); }
    /** Unsafe version of {@link #raster_render(FT_Raster_RenderFuncI) raster_render}. */
    public static void nraster_render(long struct, @Nullable FT_Raster_RenderFuncI value) { memPutAddress(struct + FT_Raster_Funcs.RASTER_RENDER, memAddressSafe(value)); }
    /** Unsafe version of {@link #raster_done(FT_Raster_DoneFuncI) raster_done}. */
    public static void nraster_done(long struct, @Nullable FT_Raster_DoneFuncI value) { memPutAddress(struct + FT_Raster_Funcs.RASTER_DONE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FT_Raster_Funcs} structs. */
    public static class Buffer extends StructBuffer<FT_Raster_Funcs, Buffer> implements NativeResource {

        private static final FT_Raster_Funcs ELEMENT_FACTORY = FT_Raster_Funcs.create(-1L);

        /**
         * Creates a new {@code FT_Raster_Funcs.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Raster_Funcs#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Raster_Funcs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code glyph_format} field. */
        @NativeType("FT_Glyph_Format")
        public int glyph_format() { return FT_Raster_Funcs.nglyph_format(address()); }
        /** @return the value of the {@code raster_new} field. */
        @Nullable
        public FT_Raster_NewFunc raster_new() { return FT_Raster_Funcs.nraster_new(address()); }
        /** @return the value of the {@code raster_reset} field. */
        @Nullable
        public FT_Raster_ResetFunc raster_reset() { return FT_Raster_Funcs.nraster_reset(address()); }
        /** @return the value of the {@code raster_set_mode} field. */
        @Nullable
        public FT_Raster_SetModeFunc raster_set_mode() { return FT_Raster_Funcs.nraster_set_mode(address()); }
        /** @return the value of the {@code raster_render} field. */
        @Nullable
        public FT_Raster_RenderFunc raster_render() { return FT_Raster_Funcs.nraster_render(address()); }
        /** @return the value of the {@code raster_done} field. */
        @Nullable
        public FT_Raster_DoneFunc raster_done() { return FT_Raster_Funcs.nraster_done(address()); }

        /** Sets the specified value to the {@code glyph_format} field. */
        public FT_Raster_Funcs.Buffer glyph_format(@NativeType("FT_Glyph_Format") int value) { FT_Raster_Funcs.nglyph_format(address(), value); return this; }
        /** Sets the specified value to the {@code raster_new} field. */
        public FT_Raster_Funcs.Buffer raster_new(@Nullable @NativeType("FT_Raster_NewFunc") FT_Raster_NewFuncI value) { FT_Raster_Funcs.nraster_new(address(), value); return this; }
        /** Sets the specified value to the {@code raster_reset} field. */
        public FT_Raster_Funcs.Buffer raster_reset(@Nullable @NativeType("FT_Raster_ResetFunc") FT_Raster_ResetFuncI value) { FT_Raster_Funcs.nraster_reset(address(), value); return this; }
        /** Sets the specified value to the {@code raster_set_mode} field. */
        public FT_Raster_Funcs.Buffer raster_set_mode(@Nullable @NativeType("FT_Raster_SetModeFunc") FT_Raster_SetModeFuncI value) { FT_Raster_Funcs.nraster_set_mode(address(), value); return this; }
        /** Sets the specified value to the {@code raster_render} field. */
        public FT_Raster_Funcs.Buffer raster_render(@Nullable @NativeType("FT_Raster_RenderFunc") FT_Raster_RenderFuncI value) { FT_Raster_Funcs.nraster_render(address(), value); return this; }
        /** Sets the specified value to the {@code raster_done} field. */
        public FT_Raster_Funcs.Buffer raster_done(@Nullable @NativeType("FT_Raster_DoneFunc") FT_Raster_DoneFuncI value) { FT_Raster_Funcs.nraster_done(address(), value); return this; }

    }

}