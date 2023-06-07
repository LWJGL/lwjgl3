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
 * A structure to model a size request.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Size_RequestRec {
 *     FT_Size_Request_Type type;
 *     FT_Long width;
 *     FT_Long height;
 *     FT_UInt horiResolution;
 *     FT_UInt vertResolution;
 * }</code></pre>
 */
@NativeType("struct FT_Size_RequestRec")
public class FT_Size_Request extends Struct<FT_Size_Request> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        WIDTH,
        HEIGHT,
        HORIRESOLUTION,
        VERTRESOLUTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        HORIRESOLUTION = layout.offsetof(3);
        VERTRESOLUTION = layout.offsetof(4);
    }

    protected FT_Size_Request(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Size_Request create(long address, @Nullable ByteBuffer container) {
        return new FT_Size_Request(address, container);
    }

    /**
     * Creates a {@code FT_Size_Request} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Size_Request(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("FT_Size_Request_Type")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("FT_Long")
    public long width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("FT_Long")
    public long height() { return nheight(address()); }
    /** @return the value of the {@code horiResolution} field. */
    @NativeType("FT_UInt")
    public int horiResolution() { return nhoriResolution(address()); }
    /** @return the value of the {@code vertResolution} field. */
    @NativeType("FT_UInt")
    public int vertResolution() { return nvertResolution(address()); }

    /** Sets the specified value to the {@code type} field. */
    public FT_Size_Request type(@NativeType("FT_Size_Request_Type") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public FT_Size_Request width(@NativeType("FT_Long") long value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public FT_Size_Request height(@NativeType("FT_Long") long value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code horiResolution} field. */
    public FT_Size_Request horiResolution(@NativeType("FT_UInt") int value) { nhoriResolution(address(), value); return this; }
    /** Sets the specified value to the {@code vertResolution} field. */
    public FT_Size_Request vertResolution(@NativeType("FT_UInt") int value) { nvertResolution(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Size_Request set(
        int type,
        long width,
        long height,
        int horiResolution,
        int vertResolution
    ) {
        type(type);
        width(width);
        height(height);
        horiResolution(horiResolution);
        vertResolution(vertResolution);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Size_Request set(FT_Size_Request src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Size_Request} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Size_Request malloc() {
        return new FT_Size_Request(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Size_Request} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Size_Request calloc() {
        return new FT_Size_Request(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Size_Request} instance allocated with {@link BufferUtils}. */
    public static FT_Size_Request create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Size_Request(memAddress(container), container);
    }

    /** Returns a new {@code FT_Size_Request} instance for the specified memory address. */
    public static FT_Size_Request create(long address) {
        return new FT_Size_Request(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Size_Request createSafe(long address) {
        return address == NULL ? null : new FT_Size_Request(address, null);
    }

    /**
     * Returns a new {@link FT_Size_Request.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Size_Request.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Size_Request.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Size_Request.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Size_Request.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Size_Request.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Size_Request.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Size_Request.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Size_Request.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Size_Request} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Size_Request malloc(MemoryStack stack) {
        return new FT_Size_Request(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Size_Request} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Size_Request calloc(MemoryStack stack) {
        return new FT_Size_Request(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Size_Request.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Size_Request.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Size_Request.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Size_Request.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FT_Size_Request.TYPE); }
    /** Unsafe version of {@link #width}. */
    public static long nwidth(long struct) { return memGetCLong(struct + FT_Size_Request.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static long nheight(long struct) { return memGetCLong(struct + FT_Size_Request.HEIGHT); }
    /** Unsafe version of {@link #horiResolution}. */
    public static int nhoriResolution(long struct) { return UNSAFE.getInt(null, struct + FT_Size_Request.HORIRESOLUTION); }
    /** Unsafe version of {@link #vertResolution}. */
    public static int nvertResolution(long struct) { return UNSAFE.getInt(null, struct + FT_Size_Request.VERTRESOLUTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FT_Size_Request.TYPE, value); }
    /** Unsafe version of {@link #width(long) width}. */
    public static void nwidth(long struct, long value) { memPutCLong(struct + FT_Size_Request.WIDTH, value); }
    /** Unsafe version of {@link #height(long) height}. */
    public static void nheight(long struct, long value) { memPutCLong(struct + FT_Size_Request.HEIGHT, value); }
    /** Unsafe version of {@link #horiResolution(int) horiResolution}. */
    public static void nhoriResolution(long struct, int value) { UNSAFE.putInt(null, struct + FT_Size_Request.HORIRESOLUTION, value); }
    /** Unsafe version of {@link #vertResolution(int) vertResolution}. */
    public static void nvertResolution(long struct, int value) { UNSAFE.putInt(null, struct + FT_Size_Request.VERTRESOLUTION, value); }

    // -----------------------------------

    /** An array of {@link FT_Size_Request} structs. */
    public static class Buffer extends StructBuffer<FT_Size_Request, Buffer> implements NativeResource {

        private static final FT_Size_Request ELEMENT_FACTORY = FT_Size_Request.create(-1L);

        /**
         * Creates a new {@code FT_Size_Request.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Size_Request#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Size_Request getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("FT_Size_Request_Type")
        public int type() { return FT_Size_Request.ntype(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("FT_Long")
        public long width() { return FT_Size_Request.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("FT_Long")
        public long height() { return FT_Size_Request.nheight(address()); }
        /** @return the value of the {@code horiResolution} field. */
        @NativeType("FT_UInt")
        public int horiResolution() { return FT_Size_Request.nhoriResolution(address()); }
        /** @return the value of the {@code vertResolution} field. */
        @NativeType("FT_UInt")
        public int vertResolution() { return FT_Size_Request.nvertResolution(address()); }

        /** Sets the specified value to the {@code type} field. */
        public FT_Size_Request.Buffer type(@NativeType("FT_Size_Request_Type") int value) { FT_Size_Request.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public FT_Size_Request.Buffer width(@NativeType("FT_Long") long value) { FT_Size_Request.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public FT_Size_Request.Buffer height(@NativeType("FT_Long") long value) { FT_Size_Request.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code horiResolution} field. */
        public FT_Size_Request.Buffer horiResolution(@NativeType("FT_UInt") int value) { FT_Size_Request.nhoriResolution(address(), value); return this; }
        /** Sets the specified value to the {@code vertResolution} field. */
        public FT_Size_Request.Buffer vertResolution(@NativeType("FT_UInt") int value) { FT_Size_Request.nvertResolution(address(), value); return this; }

    }

}