/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Vertex data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbtt_vertex {
 *     stbtt_vertex_type x;
 *     stbtt_vertex_type y;
 *     stbtt_vertex_type cx;
 *     stbtt_vertex_type cy;
 *     stbtt_vertex_type cx1;
 *     stbtt_vertex_type cy1;
 *     unsigned char type;
 * }</code></pre>
 */
@NativeType("struct stbtt_vertex")
public class STBTTVertex extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        CX,
        CY,
        CX1,
        CY1,
        TYPE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        CX = layout.offsetof(2);
        CY = layout.offsetof(3);
        CX1 = layout.offsetof(4);
        CY1 = layout.offsetof(5);
        TYPE = layout.offsetof(6);
    }

    /**
     * Creates a {@code STBTTVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTVertex(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    @NativeType("stbtt_vertex_type")
    public short x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("stbtt_vertex_type")
    public short y() { return ny(address()); }
    /** @return the value of the {@code cx} field. */
    @NativeType("stbtt_vertex_type")
    public short cx() { return ncx(address()); }
    /** @return the value of the {@code cy} field. */
    @NativeType("stbtt_vertex_type")
    public short cy() { return ncy(address()); }
    /** @return the value of the {@code cx1} field. */
    @NativeType("stbtt_vertex_type")
    public short cx1() { return ncx1(address()); }
    /** @return the value of the {@code cy1} field. */
    @NativeType("stbtt_vertex_type")
    public short cy1() { return ncy1(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("unsigned char")
    public byte type() { return ntype(address()); }

    // -----------------------------------

    /** Returns a new {@code STBTTVertex} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTVertex malloc() {
        return wrap(STBTTVertex.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBTTVertex} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTVertex calloc() {
        return wrap(STBTTVertex.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBTTVertex} instance allocated with {@link BufferUtils}. */
    public static STBTTVertex create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBTTVertex.class, memAddress(container), container);
    }

    /** Returns a new {@code STBTTVertex} instance for the specified memory address. */
    public static STBTTVertex create(long address) {
        return wrap(STBTTVertex.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTVertex createSafe(long address) {
        return address == NULL ? null : wrap(STBTTVertex.class, address);
    }

    /**
     * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTVertex.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTVertex.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTVertex.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBTTVertex.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTVertex.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTVertex.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTVertex mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTVertex callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTVertex mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTVertex callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTVertex.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTVertex.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTVertex.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTVertex.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBTTVertex} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTVertex malloc(MemoryStack stack) {
        return wrap(STBTTVertex.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBTTVertex} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTVertex calloc(MemoryStack stack) {
        return wrap(STBTTVertex.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTVertex.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTVertex.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTVertex.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTVertex.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + STBTTVertex.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + STBTTVertex.Y); }
    /** Unsafe version of {@link #cx}. */
    public static short ncx(long struct) { return UNSAFE.getShort(null, struct + STBTTVertex.CX); }
    /** Unsafe version of {@link #cy}. */
    public static short ncy(long struct) { return UNSAFE.getShort(null, struct + STBTTVertex.CY); }
    /** Unsafe version of {@link #cx1}. */
    public static short ncx1(long struct) { return UNSAFE.getShort(null, struct + STBTTVertex.CX1); }
    /** Unsafe version of {@link #cy1}. */
    public static short ncy1(long struct) { return UNSAFE.getShort(null, struct + STBTTVertex.CY1); }
    /** Unsafe version of {@link #type}. */
    public static byte ntype(long struct) { return UNSAFE.getByte(null, struct + STBTTVertex.TYPE); }

    // -----------------------------------

    /** An array of {@link STBTTVertex} structs. */
    public static class Buffer extends StructBuffer<STBTTVertex, Buffer> implements NativeResource {

        private static final STBTTVertex ELEMENT_FACTORY = STBTTVertex.create(-1L);

        /**
         * Creates a new {@code STBTTVertex.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTVertex#SIZEOF}, and its mark will be undefined.
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
        protected STBTTVertex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        @NativeType("stbtt_vertex_type")
        public short x() { return STBTTVertex.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("stbtt_vertex_type")
        public short y() { return STBTTVertex.ny(address()); }
        /** @return the value of the {@code cx} field. */
        @NativeType("stbtt_vertex_type")
        public short cx() { return STBTTVertex.ncx(address()); }
        /** @return the value of the {@code cy} field. */
        @NativeType("stbtt_vertex_type")
        public short cy() { return STBTTVertex.ncy(address()); }
        /** @return the value of the {@code cx1} field. */
        @NativeType("stbtt_vertex_type")
        public short cx1() { return STBTTVertex.ncx1(address()); }
        /** @return the value of the {@code cy1} field. */
        @NativeType("stbtt_vertex_type")
        public short cy1() { return STBTTVertex.ncy1(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("unsigned char")
        public byte type() { return STBTTVertex.ntype(address()); }

    }

}