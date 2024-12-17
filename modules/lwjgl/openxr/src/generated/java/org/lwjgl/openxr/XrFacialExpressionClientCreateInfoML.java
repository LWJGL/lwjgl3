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
 * struct XrFacialExpressionClientCreateInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t requestedCount;
 *     XrFacialBlendShapeML const * requestedFacialBlendShapes;
 * }}</pre>
 */
public class XrFacialExpressionClientCreateInfoML extends Struct<XrFacialExpressionClientCreateInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTEDCOUNT,
        REQUESTEDFACIALBLENDSHAPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTEDCOUNT = layout.offsetof(2);
        REQUESTEDFACIALBLENDSHAPES = layout.offsetof(3);
    }

    protected XrFacialExpressionClientCreateInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFacialExpressionClientCreateInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrFacialExpressionClientCreateInfoML(address, container);
    }

    /**
     * Creates a {@code XrFacialExpressionClientCreateInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialExpressionClientCreateInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code requestedCount} field. */
    @NativeType("uint32_t")
    public int requestedCount() { return nrequestedCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code requestedFacialBlendShapes} field. */
    @NativeType("XrFacialBlendShapeML const *")
    public @Nullable IntBuffer requestedFacialBlendShapes() { return nrequestedFacialBlendShapes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFacialExpressionClientCreateInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLFacialExpression#XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML} value to the {@code type} field. */
    public XrFacialExpressionClientCreateInfoML type$Default() { return type(MLFacialExpression.XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrFacialExpressionClientCreateInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code requestedCount} field. */
    public XrFacialExpressionClientCreateInfoML requestedCount(@NativeType("uint32_t") int value) { nrequestedCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code requestedFacialBlendShapes} field. */
    public XrFacialExpressionClientCreateInfoML requestedFacialBlendShapes(@Nullable @NativeType("XrFacialBlendShapeML const *") IntBuffer value) { nrequestedFacialBlendShapes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialExpressionClientCreateInfoML set(
        int type,
        long next,
        int requestedCount,
        @Nullable IntBuffer requestedFacialBlendShapes
    ) {
        type(type);
        next(next);
        requestedCount(requestedCount);
        requestedFacialBlendShapes(requestedFacialBlendShapes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFacialExpressionClientCreateInfoML set(XrFacialExpressionClientCreateInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialExpressionClientCreateInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionClientCreateInfoML malloc() {
        return new XrFacialExpressionClientCreateInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionClientCreateInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionClientCreateInfoML calloc() {
        return new XrFacialExpressionClientCreateInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionClientCreateInfoML} instance allocated with {@link BufferUtils}. */
    public static XrFacialExpressionClientCreateInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFacialExpressionClientCreateInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrFacialExpressionClientCreateInfoML} instance for the specified memory address. */
    public static XrFacialExpressionClientCreateInfoML create(long address) {
        return new XrFacialExpressionClientCreateInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFacialExpressionClientCreateInfoML createSafe(long address) {
        return address == NULL ? null : new XrFacialExpressionClientCreateInfoML(address, null);
    }

    /**
     * Returns a new {@link XrFacialExpressionClientCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionClientCreateInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionClientCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionClientCreateInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionClientCreateInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionClientCreateInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFacialExpressionClientCreateInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionClientCreateInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFacialExpressionClientCreateInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFacialExpressionClientCreateInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionClientCreateInfoML malloc(MemoryStack stack) {
        return new XrFacialExpressionClientCreateInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFacialExpressionClientCreateInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionClientCreateInfoML calloc(MemoryStack stack) {
        return new XrFacialExpressionClientCreateInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFacialExpressionClientCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionClientCreateInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionClientCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionClientCreateInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFacialExpressionClientCreateInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialExpressionClientCreateInfoML.NEXT); }
    /** Unsafe version of {@link #requestedCount}. */
    public static int nrequestedCount(long struct) { return memGetInt(struct + XrFacialExpressionClientCreateInfoML.REQUESTEDCOUNT); }
    /** Unsafe version of {@link #requestedFacialBlendShapes() requestedFacialBlendShapes}. */
    public static @Nullable IntBuffer nrequestedFacialBlendShapes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrFacialExpressionClientCreateInfoML.REQUESTEDFACIALBLENDSHAPES), nrequestedCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFacialExpressionClientCreateInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialExpressionClientCreateInfoML.NEXT, value); }
    /** Sets the specified value to the {@code requestedCount} field of the specified {@code struct}. */
    public static void nrequestedCount(long struct, int value) { memPutInt(struct + XrFacialExpressionClientCreateInfoML.REQUESTEDCOUNT, value); }
    /** Unsafe version of {@link #requestedFacialBlendShapes(IntBuffer) requestedFacialBlendShapes}. */
    public static void nrequestedFacialBlendShapes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrFacialExpressionClientCreateInfoML.REQUESTEDFACIALBLENDSHAPES, memAddressSafe(value)); if (value != null) { nrequestedCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrFacialExpressionClientCreateInfoML} structs. */
    public static class Buffer extends StructBuffer<XrFacialExpressionClientCreateInfoML, Buffer> implements NativeResource {

        private static final XrFacialExpressionClientCreateInfoML ELEMENT_FACTORY = XrFacialExpressionClientCreateInfoML.create(-1L);

        /**
         * Creates a new {@code XrFacialExpressionClientCreateInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialExpressionClientCreateInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFacialExpressionClientCreateInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialExpressionClientCreateInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFacialExpressionClientCreateInfoML.nnext(address()); }
        /** @return the value of the {@code requestedCount} field. */
        @NativeType("uint32_t")
        public int requestedCount() { return XrFacialExpressionClientCreateInfoML.nrequestedCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code requestedFacialBlendShapes} field. */
        @NativeType("XrFacialBlendShapeML const *")
        public @Nullable IntBuffer requestedFacialBlendShapes() { return XrFacialExpressionClientCreateInfoML.nrequestedFacialBlendShapes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFacialExpressionClientCreateInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrFacialExpressionClientCreateInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLFacialExpression#XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML} value to the {@code type} field. */
        public XrFacialExpressionClientCreateInfoML.Buffer type$Default() { return type(MLFacialExpression.XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrFacialExpressionClientCreateInfoML.Buffer next(@NativeType("void const *") long value) { XrFacialExpressionClientCreateInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code requestedCount} field. */
        public XrFacialExpressionClientCreateInfoML.Buffer requestedCount(@NativeType("uint32_t") int value) { XrFacialExpressionClientCreateInfoML.nrequestedCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code requestedFacialBlendShapes} field. */
        public XrFacialExpressionClientCreateInfoML.Buffer requestedFacialBlendShapes(@Nullable @NativeType("XrFacialBlendShapeML const *") IntBuffer value) { XrFacialExpressionClientCreateInfoML.nrequestedFacialBlendShapes(address(), value); return this; }

    }

}