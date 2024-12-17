/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrFaceExpressionInfo2FB {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime time;
 * }}</pre>
 */
public class XrFaceExpressionInfo2FB extends Struct<XrFaceExpressionInfo2FB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIME = layout.offsetof(2);
    }

    protected XrFaceExpressionInfo2FB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceExpressionInfo2FB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceExpressionInfo2FB(address, container);
    }

    /**
     * Creates a {@code XrFaceExpressionInfo2FB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceExpressionInfo2FB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceExpressionInfo2FB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_INFO2_FB TYPE_FACE_EXPRESSION_INFO2_FB} value to the {@code type} field. */
    public XrFaceExpressionInfo2FB type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_EXPRESSION_INFO2_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceExpressionInfo2FB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrFaceExpressionInfo2FB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceExpressionInfo2FB set(
        int type,
        long next,
        long time
    ) {
        type(type);
        next(next);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceExpressionInfo2FB set(XrFaceExpressionInfo2FB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceExpressionInfo2FB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionInfo2FB malloc() {
        return new XrFaceExpressionInfo2FB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionInfo2FB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionInfo2FB calloc() {
        return new XrFaceExpressionInfo2FB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionInfo2FB} instance allocated with {@link BufferUtils}. */
    public static XrFaceExpressionInfo2FB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceExpressionInfo2FB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceExpressionInfo2FB} instance for the specified memory address. */
    public static XrFaceExpressionInfo2FB create(long address) {
        return new XrFaceExpressionInfo2FB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceExpressionInfo2FB createSafe(long address) {
        return address == NULL ? null : new XrFaceExpressionInfo2FB(address, null);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfo2FB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfo2FB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfo2FB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfo2FB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfo2FB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfo2FB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceExpressionInfo2FB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfo2FB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceExpressionInfo2FB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceExpressionInfo2FB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionInfo2FB malloc(MemoryStack stack) {
        return new XrFaceExpressionInfo2FB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceExpressionInfo2FB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionInfo2FB calloc(MemoryStack stack) {
        return new XrFaceExpressionInfo2FB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfo2FB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfo2FB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfo2FB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfo2FB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceExpressionInfo2FB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceExpressionInfo2FB.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrFaceExpressionInfo2FB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceExpressionInfo2FB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceExpressionInfo2FB.NEXT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrFaceExpressionInfo2FB.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrFaceExpressionInfo2FB} structs. */
    public static class Buffer extends StructBuffer<XrFaceExpressionInfo2FB, Buffer> implements NativeResource {

        private static final XrFaceExpressionInfo2FB ELEMENT_FACTORY = XrFaceExpressionInfo2FB.create(-1L);

        /**
         * Creates a new {@code XrFaceExpressionInfo2FB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceExpressionInfo2FB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceExpressionInfo2FB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceExpressionInfo2FB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFaceExpressionInfo2FB.nnext(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrFaceExpressionInfo2FB.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceExpressionInfo2FB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceExpressionInfo2FB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_EXPRESSION_INFO2_FB TYPE_FACE_EXPRESSION_INFO2_FB} value to the {@code type} field. */
        public XrFaceExpressionInfo2FB.Buffer type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_EXPRESSION_INFO2_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceExpressionInfo2FB.Buffer next(@NativeType("void const *") long value) { XrFaceExpressionInfo2FB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrFaceExpressionInfo2FB.Buffer time(@NativeType("XrTime") long value) { XrFaceExpressionInfo2FB.ntime(address(), value); return this; }

    }

}