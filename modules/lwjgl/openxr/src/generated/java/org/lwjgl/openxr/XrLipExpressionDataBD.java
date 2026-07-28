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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrLipExpressionDataBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t lipsyncExpressionWeightCount;
 *     float * lipsyncExpressionWeights;
 * }}</pre>
 */
public class XrLipExpressionDataBD extends Struct<XrLipExpressionDataBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LIPSYNCEXPRESSIONWEIGHTCOUNT,
        LIPSYNCEXPRESSIONWEIGHTS;

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
        LIPSYNCEXPRESSIONWEIGHTCOUNT = layout.offsetof(2);
        LIPSYNCEXPRESSIONWEIGHTS = layout.offsetof(3);
    }

    protected XrLipExpressionDataBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLipExpressionDataBD create(long address, @Nullable ByteBuffer container) {
        return new XrLipExpressionDataBD(address, container);
    }

    /**
     * Creates a {@code XrLipExpressionDataBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLipExpressionDataBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code lipsyncExpressionWeightCount} field. */
    @NativeType("uint32_t")
    public int lipsyncExpressionWeightCount() { return nlipsyncExpressionWeightCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code lipsyncExpressionWeights} field. */
    @NativeType("float *")
    public FloatBuffer lipsyncExpressionWeights() { return nlipsyncExpressionWeights(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLipExpressionDataBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDFacialSimulation#XR_TYPE_LIP_EXPRESSION_DATA_BD TYPE_LIP_EXPRESSION_DATA_BD} value to the {@code type} field. */
    public XrLipExpressionDataBD type$Default() { return type(BDFacialSimulation.XR_TYPE_LIP_EXPRESSION_DATA_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrLipExpressionDataBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code lipsyncExpressionWeights} field. */
    public XrLipExpressionDataBD lipsyncExpressionWeights(@NativeType("float *") FloatBuffer value) { nlipsyncExpressionWeights(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLipExpressionDataBD set(
        int type,
        long next,
        FloatBuffer lipsyncExpressionWeights
    ) {
        type(type);
        next(next);
        lipsyncExpressionWeights(lipsyncExpressionWeights);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLipExpressionDataBD set(XrLipExpressionDataBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLipExpressionDataBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLipExpressionDataBD malloc() {
        return new XrLipExpressionDataBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLipExpressionDataBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLipExpressionDataBD calloc() {
        return new XrLipExpressionDataBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLipExpressionDataBD} instance allocated with {@link BufferUtils}. */
    public static XrLipExpressionDataBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLipExpressionDataBD(memAddress(container), container);
    }

    /** Returns a new {@code XrLipExpressionDataBD} instance for the specified memory address. */
    public static XrLipExpressionDataBD create(long address) {
        return new XrLipExpressionDataBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLipExpressionDataBD createSafe(long address) {
        return address == NULL ? null : new XrLipExpressionDataBD(address, null);
    }

    /**
     * Returns a new {@link XrLipExpressionDataBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLipExpressionDataBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLipExpressionDataBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLipExpressionDataBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLipExpressionDataBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLipExpressionDataBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLipExpressionDataBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLipExpressionDataBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLipExpressionDataBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLipExpressionDataBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLipExpressionDataBD malloc(MemoryStack stack) {
        return new XrLipExpressionDataBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLipExpressionDataBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLipExpressionDataBD calloc(MemoryStack stack) {
        return new XrLipExpressionDataBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLipExpressionDataBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLipExpressionDataBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLipExpressionDataBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLipExpressionDataBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrLipExpressionDataBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLipExpressionDataBD.NEXT); }
    /** Unsafe version of {@link #lipsyncExpressionWeightCount}. */
    public static int nlipsyncExpressionWeightCount(long struct) { return memGetInt(struct + XrLipExpressionDataBD.LIPSYNCEXPRESSIONWEIGHTCOUNT); }
    /** Unsafe version of {@link #lipsyncExpressionWeights() lipsyncExpressionWeights}. */
    public static FloatBuffer nlipsyncExpressionWeights(long struct) { return memFloatBuffer(memGetAddress(struct + XrLipExpressionDataBD.LIPSYNCEXPRESSIONWEIGHTS), nlipsyncExpressionWeightCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrLipExpressionDataBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLipExpressionDataBD.NEXT, value); }
    /** Sets the specified value to the {@code lipsyncExpressionWeightCount} field of the specified {@code struct}. */
    public static void nlipsyncExpressionWeightCount(long struct, int value) { memPutInt(struct + XrLipExpressionDataBD.LIPSYNCEXPRESSIONWEIGHTCOUNT, value); }
    /** Unsafe version of {@link #lipsyncExpressionWeights(FloatBuffer) lipsyncExpressionWeights}. */
    public static void nlipsyncExpressionWeights(long struct, FloatBuffer value) { memPutAddress(struct + XrLipExpressionDataBD.LIPSYNCEXPRESSIONWEIGHTS, memAddress(value)); nlipsyncExpressionWeightCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrLipExpressionDataBD.LIPSYNCEXPRESSIONWEIGHTS));
    }

    // -----------------------------------

    /** An array of {@link XrLipExpressionDataBD} structs. */
    public static class Buffer extends StructBuffer<XrLipExpressionDataBD, Buffer> implements NativeResource {

        private static final XrLipExpressionDataBD ELEMENT_FACTORY = XrLipExpressionDataBD.create(-1L);

        /**
         * Creates a new {@code XrLipExpressionDataBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLipExpressionDataBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLipExpressionDataBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLipExpressionDataBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrLipExpressionDataBD.nnext(address()); }
        /** @return the value of the {@code lipsyncExpressionWeightCount} field. */
        @NativeType("uint32_t")
        public int lipsyncExpressionWeightCount() { return XrLipExpressionDataBD.nlipsyncExpressionWeightCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code lipsyncExpressionWeights} field. */
        @NativeType("float *")
        public FloatBuffer lipsyncExpressionWeights() { return XrLipExpressionDataBD.nlipsyncExpressionWeights(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLipExpressionDataBD.Buffer type(@NativeType("XrStructureType") int value) { XrLipExpressionDataBD.ntype(address(), value); return this; }
        /** Sets the {@link BDFacialSimulation#XR_TYPE_LIP_EXPRESSION_DATA_BD TYPE_LIP_EXPRESSION_DATA_BD} value to the {@code type} field. */
        public XrLipExpressionDataBD.Buffer type$Default() { return type(BDFacialSimulation.XR_TYPE_LIP_EXPRESSION_DATA_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrLipExpressionDataBD.Buffer next(@NativeType("void *") long value) { XrLipExpressionDataBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code lipsyncExpressionWeights} field. */
        public XrLipExpressionDataBD.Buffer lipsyncExpressionWeights(@NativeType("float *") FloatBuffer value) { XrLipExpressionDataBD.nlipsyncExpressionWeights(address(), value); return this; }

    }

}