/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Baked character data, returned by {@link STBTruetype#stbtt_BakeFontBitmap BakeFontBitmap}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbtt_bakedchar {
 *     unsigned short x0;
 *     unsigned short y0;
 *     unsigned short x1;
 *     unsigned short y1;
 *     float xoff;
 *     float yoff;
 *     float xadvance;
 * }</code></pre>
 */
@NativeType("struct stbtt_bakedchar")
public class STBTTBakedChar extends Struct<STBTTBakedChar> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X0,
        Y0,
        X1,
        Y1,
        XOFF,
        YOFF,
        XADVANCE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X0 = layout.offsetof(0);
        Y0 = layout.offsetof(1);
        X1 = layout.offsetof(2);
        Y1 = layout.offsetof(3);
        XOFF = layout.offsetof(4);
        YOFF = layout.offsetof(5);
        XADVANCE = layout.offsetof(6);
    }

    protected STBTTBakedChar(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected STBTTBakedChar create(long address, @Nullable ByteBuffer container) {
        return new STBTTBakedChar(address, container);
    }

    /**
     * Creates a {@code STBTTBakedChar} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTBakedChar(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x0} field. */
    @NativeType("unsigned short")
    public short x0() { return nx0(address()); }
    /** @return the value of the {@code y0} field. */
    @NativeType("unsigned short")
    public short y0() { return ny0(address()); }
    /** @return the value of the {@code x1} field. */
    @NativeType("unsigned short")
    public short x1() { return nx1(address()); }
    /** @return the value of the {@code y1} field. */
    @NativeType("unsigned short")
    public short y1() { return ny1(address()); }
    /** @return the value of the {@code xoff} field. */
    public float xoff() { return nxoff(address()); }
    /** @return the value of the {@code yoff} field. */
    public float yoff() { return nyoff(address()); }
    /** @return the value of the {@code xadvance} field. */
    public float xadvance() { return nxadvance(address()); }

    // -----------------------------------

    /** Returns a new {@code STBTTBakedChar} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTBakedChar malloc() {
        return new STBTTBakedChar(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code STBTTBakedChar} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTBakedChar calloc() {
        return new STBTTBakedChar(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code STBTTBakedChar} instance allocated with {@link BufferUtils}. */
    public static STBTTBakedChar create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTBakedChar(memAddress(container), container);
    }

    /** Returns a new {@code STBTTBakedChar} instance for the specified memory address. */
    public static STBTTBakedChar create(long address) {
        return new STBTTBakedChar(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable STBTTBakedChar createSafe(long address) {
        return address == NULL ? null : new STBTTBakedChar(address, null);
    }

    /**
     * Returns a new {@link STBTTBakedChar.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTBakedChar.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTBakedChar.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTBakedChar.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBakedChar.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTBakedChar.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link STBTTBakedChar.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTBakedChar.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static STBTTBakedChar.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTBakedChar.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBTTBakedChar} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTBakedChar malloc(MemoryStack stack) {
        return new STBTTBakedChar(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code STBTTBakedChar} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTBakedChar calloc(MemoryStack stack) {
        return new STBTTBakedChar(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link STBTTBakedChar.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTBakedChar.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTBakedChar.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTBakedChar.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x0}. */
    public static short nx0(long struct) { return memGetShort(struct + STBTTBakedChar.X0); }
    /** Unsafe version of {@link #y0}. */
    public static short ny0(long struct) { return memGetShort(struct + STBTTBakedChar.Y0); }
    /** Unsafe version of {@link #x1}. */
    public static short nx1(long struct) { return memGetShort(struct + STBTTBakedChar.X1); }
    /** Unsafe version of {@link #y1}. */
    public static short ny1(long struct) { return memGetShort(struct + STBTTBakedChar.Y1); }
    /** Unsafe version of {@link #xoff}. */
    public static float nxoff(long struct) { return memGetFloat(struct + STBTTBakedChar.XOFF); }
    /** Unsafe version of {@link #yoff}. */
    public static float nyoff(long struct) { return memGetFloat(struct + STBTTBakedChar.YOFF); }
    /** Unsafe version of {@link #xadvance}. */
    public static float nxadvance(long struct) { return memGetFloat(struct + STBTTBakedChar.XADVANCE); }

    // -----------------------------------

    /** An array of {@link STBTTBakedChar} structs. */
    public static class Buffer extends StructBuffer<STBTTBakedChar, Buffer> implements NativeResource {

        private static final STBTTBakedChar ELEMENT_FACTORY = STBTTBakedChar.create(-1L);

        /**
         * Creates a new {@code STBTTBakedChar.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTBakedChar#SIZEOF}, and its mark will be undefined.</p>
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
        protected STBTTBakedChar getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x0} field. */
        @NativeType("unsigned short")
        public short x0() { return STBTTBakedChar.nx0(address()); }
        /** @return the value of the {@code y0} field. */
        @NativeType("unsigned short")
        public short y0() { return STBTTBakedChar.ny0(address()); }
        /** @return the value of the {@code x1} field. */
        @NativeType("unsigned short")
        public short x1() { return STBTTBakedChar.nx1(address()); }
        /** @return the value of the {@code y1} field. */
        @NativeType("unsigned short")
        public short y1() { return STBTTBakedChar.ny1(address()); }
        /** @return the value of the {@code xoff} field. */
        public float xoff() { return STBTTBakedChar.nxoff(address()); }
        /** @return the value of the {@code yoff} field. */
        public float yoff() { return STBTTBakedChar.nyoff(address()); }
        /** @return the value of the {@code xadvance} field. */
        public float xadvance() { return STBTTBakedChar.nxadvance(address()); }

    }

}