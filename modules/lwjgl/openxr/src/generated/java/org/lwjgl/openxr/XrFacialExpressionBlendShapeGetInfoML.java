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
 * struct XrFacialExpressionBlendShapeGetInfoML {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrFacialExpressionBlendShapeGetInfoML extends Struct<XrFacialExpressionBlendShapeGetInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrFacialExpressionBlendShapeGetInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFacialExpressionBlendShapeGetInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrFacialExpressionBlendShapeGetInfoML(address, container);
    }

    /**
     * Creates a {@code XrFacialExpressionBlendShapeGetInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialExpressionBlendShapeGetInfoML(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrFacialExpressionBlendShapeGetInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLFacialExpression#XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML} value to the {@code type} field. */
    public XrFacialExpressionBlendShapeGetInfoML type$Default() { return type(MLFacialExpression.XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrFacialExpressionBlendShapeGetInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialExpressionBlendShapeGetInfoML set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFacialExpressionBlendShapeGetInfoML set(XrFacialExpressionBlendShapeGetInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialExpressionBlendShapeGetInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionBlendShapeGetInfoML malloc() {
        return new XrFacialExpressionBlendShapeGetInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionBlendShapeGetInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionBlendShapeGetInfoML calloc() {
        return new XrFacialExpressionBlendShapeGetInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionBlendShapeGetInfoML} instance allocated with {@link BufferUtils}. */
    public static XrFacialExpressionBlendShapeGetInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFacialExpressionBlendShapeGetInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrFacialExpressionBlendShapeGetInfoML} instance for the specified memory address. */
    public static XrFacialExpressionBlendShapeGetInfoML create(long address) {
        return new XrFacialExpressionBlendShapeGetInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFacialExpressionBlendShapeGetInfoML createSafe(long address) {
        return address == NULL ? null : new XrFacialExpressionBlendShapeGetInfoML(address, null);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapeGetInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapeGetInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapeGetInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapeGetInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapeGetInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapeGetInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFacialExpressionBlendShapeGetInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapeGetInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFacialExpressionBlendShapeGetInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFacialExpressionBlendShapeGetInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionBlendShapeGetInfoML malloc(MemoryStack stack) {
        return new XrFacialExpressionBlendShapeGetInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFacialExpressionBlendShapeGetInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionBlendShapeGetInfoML calloc(MemoryStack stack) {
        return new XrFacialExpressionBlendShapeGetInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapeGetInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapeGetInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapeGetInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapeGetInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFacialExpressionBlendShapeGetInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialExpressionBlendShapeGetInfoML.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFacialExpressionBlendShapeGetInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialExpressionBlendShapeGetInfoML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrFacialExpressionBlendShapeGetInfoML} structs. */
    public static class Buffer extends StructBuffer<XrFacialExpressionBlendShapeGetInfoML, Buffer> implements NativeResource {

        private static final XrFacialExpressionBlendShapeGetInfoML ELEMENT_FACTORY = XrFacialExpressionBlendShapeGetInfoML.create(-1L);

        /**
         * Creates a new {@code XrFacialExpressionBlendShapeGetInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialExpressionBlendShapeGetInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFacialExpressionBlendShapeGetInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialExpressionBlendShapeGetInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFacialExpressionBlendShapeGetInfoML.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFacialExpressionBlendShapeGetInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrFacialExpressionBlendShapeGetInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLFacialExpression#XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML} value to the {@code type} field. */
        public XrFacialExpressionBlendShapeGetInfoML.Buffer type$Default() { return type(MLFacialExpression.XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrFacialExpressionBlendShapeGetInfoML.Buffer next(@NativeType("void const *") long value) { XrFacialExpressionBlendShapeGetInfoML.nnext(address(), value); return this; }

    }

}