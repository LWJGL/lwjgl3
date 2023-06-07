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
 * A structure to hold the parameters used by a raster's render function, passed as an argument to {@link FreeType#FT_Outline_Render Outline_Render}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Raster_Params {
 *     {@link FT_Bitmap FT_Bitmap} const * target;
 *     void const * source;
 *     int flags;
 *     {@link FT_SpanFuncI FT_SpanFunc} gray_spans;
 *     {@link FT_SpanFuncI FT_SpanFunc} black_spans;
 *     FT_Raster_BitTest_Func bit_test;
 *     FT_Raster_BitTest_Func bit_set;
 *     void * user;
 *     {@link FT_BBox FT_BBox} clip_box;
 * }</code></pre>
 */
public class FT_Raster_Params extends Struct<FT_Raster_Params> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TARGET,
        SOURCE,
        FLAGS,
        GRAY_SPANS,
        BLACK_SPANS,
        BIT_TEST,
        BIT_SET,
        USER,
        CLIP_BOX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(FT_BBox.SIZEOF, FT_BBox.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TARGET = layout.offsetof(0);
        SOURCE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GRAY_SPANS = layout.offsetof(3);
        BLACK_SPANS = layout.offsetof(4);
        BIT_TEST = layout.offsetof(5);
        BIT_SET = layout.offsetof(6);
        USER = layout.offsetof(7);
        CLIP_BOX = layout.offsetof(8);
    }

    protected FT_Raster_Params(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Raster_Params create(long address, @Nullable ByteBuffer container) {
        return new FT_Raster_Params(address, container);
    }

    /**
     * Creates a {@code FT_Raster_Params} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Raster_Params(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Bitmap} view of the struct pointed to by the {@code target} field. */
    @Nullable
    @NativeType("FT_Bitmap const *")
    public FT_Bitmap target() { return ntarget(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code source} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer source(int capacity) { return nsource(address(), capacity); }
    /** @return the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code gray_spans} field. */
    @Nullable
    public FT_SpanFunc gray_spans() { return ngray_spans(address()); }
    /** @return the value of the {@code user} field. */
    @NativeType("void *")
    public long user() { return nuser(address()); }
    /** @return a {@link FT_BBox} view of the {@code clip_box} field. */
    public FT_BBox clip_box() { return nclip_box(address()); }

    /** Sets the address of the specified {@link FT_Bitmap} to the {@code target} field. */
    public FT_Raster_Params target(@Nullable @NativeType("FT_Bitmap const *") FT_Bitmap value) { ntarget(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code source} field. */
    public FT_Raster_Params source(@Nullable @NativeType("void const *") ByteBuffer value) { nsource(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public FT_Raster_Params flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code gray_spans} field. */
    public FT_Raster_Params gray_spans(@Nullable @NativeType("FT_SpanFunc") FT_SpanFuncI value) { ngray_spans(address(), value); return this; }
    /** Sets the specified value to the {@code user} field. */
    public FT_Raster_Params user(@NativeType("void *") long value) { nuser(address(), value); return this; }
    /** Copies the specified {@link FT_BBox} to the {@code clip_box} field. */
    public FT_Raster_Params clip_box(FT_BBox value) { nclip_box(address(), value); return this; }
    /** Passes the {@code clip_box} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FT_Raster_Params clip_box(java.util.function.Consumer<FT_BBox> consumer) { consumer.accept(clip_box()); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Raster_Params set(
        @Nullable FT_Bitmap target,
        @Nullable ByteBuffer source,
        int flags,
        @Nullable FT_SpanFuncI gray_spans,
        long user,
        FT_BBox clip_box
    ) {
        target(target);
        source(source);
        flags(flags);
        gray_spans(gray_spans);
        user(user);
        clip_box(clip_box);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Raster_Params set(FT_Raster_Params src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Raster_Params} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Raster_Params malloc() {
        return new FT_Raster_Params(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Raster_Params} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Raster_Params calloc() {
        return new FT_Raster_Params(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Raster_Params} instance allocated with {@link BufferUtils}. */
    public static FT_Raster_Params create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Raster_Params(memAddress(container), container);
    }

    /** Returns a new {@code FT_Raster_Params} instance for the specified memory address. */
    public static FT_Raster_Params create(long address) {
        return new FT_Raster_Params(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Raster_Params createSafe(long address) {
        return address == NULL ? null : new FT_Raster_Params(address, null);
    }

    /**
     * Returns a new {@link FT_Raster_Params.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Params.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Raster_Params.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Params.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Raster_Params.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Params.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Raster_Params.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Params.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Raster_Params.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Raster_Params} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Raster_Params malloc(MemoryStack stack) {
        return new FT_Raster_Params(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Raster_Params} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Raster_Params calloc(MemoryStack stack) {
        return new FT_Raster_Params(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Raster_Params.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Params.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Raster_Params.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Raster_Params.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #target}. */
    @Nullable public static FT_Bitmap ntarget(long struct) { return FT_Bitmap.createSafe(memGetAddress(struct + FT_Raster_Params.TARGET)); }
    /** Unsafe version of {@link #source(int) source}. */
    @Nullable public static ByteBuffer nsource(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_Raster_Params.SOURCE), capacity); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + FT_Raster_Params.FLAGS); }
    /** Unsafe version of {@link #gray_spans}. */
    @Nullable public static FT_SpanFunc ngray_spans(long struct) { return FT_SpanFunc.createSafe(memGetAddress(struct + FT_Raster_Params.GRAY_SPANS)); }
    @Nullable public static FT_SpanFunc nblack_spans(long struct) { return FT_SpanFunc.createSafe(memGetAddress(struct + FT_Raster_Params.BLACK_SPANS)); }
    public static long nbit_test(long struct) { return memGetAddress(struct + FT_Raster_Params.BIT_TEST); }
    public static long nbit_set(long struct) { return memGetAddress(struct + FT_Raster_Params.BIT_SET); }
    /** Unsafe version of {@link #user}. */
    public static long nuser(long struct) { return memGetAddress(struct + FT_Raster_Params.USER); }
    /** Unsafe version of {@link #clip_box}. */
    public static FT_BBox nclip_box(long struct) { return FT_BBox.create(struct + FT_Raster_Params.CLIP_BOX); }

    /** Unsafe version of {@link #target(FT_Bitmap) target}. */
    public static void ntarget(long struct, @Nullable FT_Bitmap value) { memPutAddress(struct + FT_Raster_Params.TARGET, memAddressSafe(value)); }
    /** Unsafe version of {@link #source(ByteBuffer) source}. */
    public static void nsource(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Raster_Params.SOURCE, memAddressSafe(value)); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + FT_Raster_Params.FLAGS, value); }
    /** Unsafe version of {@link #gray_spans(FT_SpanFuncI) gray_spans}. */
    public static void ngray_spans(long struct, @Nullable FT_SpanFuncI value) { memPutAddress(struct + FT_Raster_Params.GRAY_SPANS, memAddressSafe(value)); }
    public static void nblack_spans(long struct, @Nullable FT_SpanFuncI value) { memPutAddress(struct + FT_Raster_Params.BLACK_SPANS, memAddressSafe(value)); }
    public static void nbit_test(long struct, long value) { memPutAddress(struct + FT_Raster_Params.BIT_TEST, value); }
    public static void nbit_set(long struct, long value) { memPutAddress(struct + FT_Raster_Params.BIT_SET, value); }
    /** Unsafe version of {@link #user(long) user}. */
    public static void nuser(long struct, long value) { memPutAddress(struct + FT_Raster_Params.USER, value); }
    /** Unsafe version of {@link #clip_box(FT_BBox) clip_box}. */
    public static void nclip_box(long struct, FT_BBox value) { memCopy(value.address(), struct + FT_Raster_Params.CLIP_BOX, FT_BBox.SIZEOF); }

    // -----------------------------------

    /** An array of {@link FT_Raster_Params} structs. */
    public static class Buffer extends StructBuffer<FT_Raster_Params, Buffer> implements NativeResource {

        private static final FT_Raster_Params ELEMENT_FACTORY = FT_Raster_Params.create(-1L);

        /**
         * Creates a new {@code FT_Raster_Params.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Raster_Params#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Raster_Params getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Bitmap} view of the struct pointed to by the {@code target} field. */
        @Nullable
        @NativeType("FT_Bitmap const *")
        public FT_Bitmap target() { return FT_Raster_Params.ntarget(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code source} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer source(int capacity) { return FT_Raster_Params.nsource(address(), capacity); }
        /** @return the value of the {@code flags} field. */
        public int flags() { return FT_Raster_Params.nflags(address()); }
        /** @return the value of the {@code gray_spans} field. */
        @Nullable
        public FT_SpanFunc gray_spans() { return FT_Raster_Params.ngray_spans(address()); }
        /** @return the value of the {@code user} field. */
        @NativeType("void *")
        public long user() { return FT_Raster_Params.nuser(address()); }
        /** @return a {@link FT_BBox} view of the {@code clip_box} field. */
        public FT_BBox clip_box() { return FT_Raster_Params.nclip_box(address()); }

        /** Sets the address of the specified {@link FT_Bitmap} to the {@code target} field. */
        public FT_Raster_Params.Buffer target(@Nullable @NativeType("FT_Bitmap const *") FT_Bitmap value) { FT_Raster_Params.ntarget(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code source} field. */
        public FT_Raster_Params.Buffer source(@Nullable @NativeType("void const *") ByteBuffer value) { FT_Raster_Params.nsource(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public FT_Raster_Params.Buffer flags(int value) { FT_Raster_Params.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code gray_spans} field. */
        public FT_Raster_Params.Buffer gray_spans(@Nullable @NativeType("FT_SpanFunc") FT_SpanFuncI value) { FT_Raster_Params.ngray_spans(address(), value); return this; }
        /** Sets the specified value to the {@code user} field. */
        public FT_Raster_Params.Buffer user(@NativeType("void *") long value) { FT_Raster_Params.nuser(address(), value); return this; }
        /** Copies the specified {@link FT_BBox} to the {@code clip_box} field. */
        public FT_Raster_Params.Buffer clip_box(FT_BBox value) { FT_Raster_Params.nclip_box(address(), value); return this; }
        /** Passes the {@code clip_box} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FT_Raster_Params.Buffer clip_box(java.util.function.Consumer<FT_BBox> consumer) { consumer.accept(clip_box()); return this; }

    }

}