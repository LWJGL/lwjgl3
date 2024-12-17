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
 * struct XrFacialExpressionsHTC {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 isActive;
 *     XrTime sampleTime;
 *     uint32_t expressionCount;
 *     float * expressionWeightings;
 * }}</pre>
 */
public class XrFacialExpressionsHTC extends Struct<XrFacialExpressionsHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        SAMPLETIME,
        EXPRESSIONCOUNT,
        EXPRESSIONWEIGHTINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        SAMPLETIME = layout.offsetof(3);
        EXPRESSIONCOUNT = layout.offsetof(4);
        EXPRESSIONWEIGHTINGS = layout.offsetof(5);
    }

    protected XrFacialExpressionsHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFacialExpressionsHTC create(long address, @Nullable ByteBuffer container) {
        return new XrFacialExpressionsHTC(address, container);
    }

    /**
     * Creates a {@code XrFacialExpressionsHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialExpressionsHTC(ByteBuffer container) {
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
    /** @return the value of the {@code isActive} field. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** @return the value of the {@code sampleTime} field. */
    @NativeType("XrTime")
    public long sampleTime() { return nsampleTime(address()); }
    /** @return the value of the {@code expressionCount} field. */
    @NativeType("uint32_t")
    public int expressionCount() { return nexpressionCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code expressionWeightings} field. */
    @NativeType("float *")
    public FloatBuffer expressionWeightings(int capacity) { return nexpressionWeightings(address(), capacity); }

    /** Sets the specified value to the {@code type} field. */
    public XrFacialExpressionsHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFacialTracking#XR_TYPE_FACIAL_EXPRESSIONS_HTC TYPE_FACIAL_EXPRESSIONS_HTC} value to the {@code type} field. */
    public XrFacialExpressionsHTC type$Default() { return type(HTCFacialTracking.XR_TYPE_FACIAL_EXPRESSIONS_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrFacialExpressionsHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code isActive} field. */
    public XrFacialExpressionsHTC isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sampleTime} field. */
    public XrFacialExpressionsHTC sampleTime(@NativeType("XrTime") long value) { nsampleTime(address(), value); return this; }
    /** Sets the specified value to the {@code expressionCount} field. */
    public XrFacialExpressionsHTC expressionCount(@NativeType("uint32_t") int value) { nexpressionCount(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code expressionWeightings} field. */
    public XrFacialExpressionsHTC expressionWeightings(@NativeType("float *") FloatBuffer value) { nexpressionWeightings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialExpressionsHTC set(
        int type,
        long next,
        boolean isActive,
        long sampleTime,
        int expressionCount,
        FloatBuffer expressionWeightings
    ) {
        type(type);
        next(next);
        isActive(isActive);
        sampleTime(sampleTime);
        expressionCount(expressionCount);
        expressionWeightings(expressionWeightings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFacialExpressionsHTC set(XrFacialExpressionsHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialExpressionsHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionsHTC malloc() {
        return new XrFacialExpressionsHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionsHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionsHTC calloc() {
        return new XrFacialExpressionsHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionsHTC} instance allocated with {@link BufferUtils}. */
    public static XrFacialExpressionsHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFacialExpressionsHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrFacialExpressionsHTC} instance for the specified memory address. */
    public static XrFacialExpressionsHTC create(long address) {
        return new XrFacialExpressionsHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFacialExpressionsHTC createSafe(long address) {
        return address == NULL ? null : new XrFacialExpressionsHTC(address, null);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFacialExpressionsHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFacialExpressionsHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFacialExpressionsHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionsHTC malloc(MemoryStack stack) {
        return new XrFacialExpressionsHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFacialExpressionsHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionsHTC calloc(MemoryStack stack) {
        return new XrFacialExpressionsHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionsHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionsHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFacialExpressionsHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialExpressionsHTC.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return memGetInt(struct + XrFacialExpressionsHTC.ISACTIVE); }
    /** Unsafe version of {@link #sampleTime}. */
    public static long nsampleTime(long struct) { return memGetLong(struct + XrFacialExpressionsHTC.SAMPLETIME); }
    /** Unsafe version of {@link #expressionCount}. */
    public static int nexpressionCount(long struct) { return memGetInt(struct + XrFacialExpressionsHTC.EXPRESSIONCOUNT); }
    /** Unsafe version of {@link #expressionWeightings(int) expressionWeightings}. */
    public static FloatBuffer nexpressionWeightings(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + XrFacialExpressionsHTC.EXPRESSIONWEIGHTINGS), capacity); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFacialExpressionsHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialExpressionsHTC.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { memPutInt(struct + XrFacialExpressionsHTC.ISACTIVE, value); }
    /** Unsafe version of {@link #sampleTime(long) sampleTime}. */
    public static void nsampleTime(long struct, long value) { memPutLong(struct + XrFacialExpressionsHTC.SAMPLETIME, value); }
    /** Unsafe version of {@link #expressionCount(int) expressionCount}. */
    public static void nexpressionCount(long struct, int value) { memPutInt(struct + XrFacialExpressionsHTC.EXPRESSIONCOUNT, value); }
    /** Unsafe version of {@link #expressionWeightings(FloatBuffer) expressionWeightings}. */
    public static void nexpressionWeightings(long struct, FloatBuffer value) { memPutAddress(struct + XrFacialExpressionsHTC.EXPRESSIONWEIGHTINGS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrFacialExpressionsHTC.EXPRESSIONWEIGHTINGS));
    }

    // -----------------------------------

    /** An array of {@link XrFacialExpressionsHTC} structs. */
    public static class Buffer extends StructBuffer<XrFacialExpressionsHTC, Buffer> implements NativeResource {

        private static final XrFacialExpressionsHTC ELEMENT_FACTORY = XrFacialExpressionsHTC.create(-1L);

        /**
         * Creates a new {@code XrFacialExpressionsHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialExpressionsHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFacialExpressionsHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialExpressionsHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFacialExpressionsHTC.nnext(address()); }
        /** @return the value of the {@code isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrFacialExpressionsHTC.nisActive(address()) != 0; }
        /** @return the value of the {@code sampleTime} field. */
        @NativeType("XrTime")
        public long sampleTime() { return XrFacialExpressionsHTC.nsampleTime(address()); }
        /** @return the value of the {@code expressionCount} field. */
        @NativeType("uint32_t")
        public int expressionCount() { return XrFacialExpressionsHTC.nexpressionCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code expressionWeightings} field. */
        @NativeType("float *")
        public FloatBuffer expressionWeightings(int capacity) { return XrFacialExpressionsHTC.nexpressionWeightings(address(), capacity); }

        /** Sets the specified value to the {@code type} field. */
        public XrFacialExpressionsHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFacialExpressionsHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFacialTracking#XR_TYPE_FACIAL_EXPRESSIONS_HTC TYPE_FACIAL_EXPRESSIONS_HTC} value to the {@code type} field. */
        public XrFacialExpressionsHTC.Buffer type$Default() { return type(HTCFacialTracking.XR_TYPE_FACIAL_EXPRESSIONS_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrFacialExpressionsHTC.Buffer next(@NativeType("void const *") long value) { XrFacialExpressionsHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code isActive} field. */
        public XrFacialExpressionsHTC.Buffer isActive(@NativeType("XrBool32") boolean value) { XrFacialExpressionsHTC.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sampleTime} field. */
        public XrFacialExpressionsHTC.Buffer sampleTime(@NativeType("XrTime") long value) { XrFacialExpressionsHTC.nsampleTime(address(), value); return this; }
        /** Sets the specified value to the {@code expressionCount} field. */
        public XrFacialExpressionsHTC.Buffer expressionCount(@NativeType("uint32_t") int value) { XrFacialExpressionsHTC.nexpressionCount(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code expressionWeightings} field. */
        public XrFacialExpressionsHTC.Buffer expressionWeightings(@NativeType("float *") FloatBuffer value) { XrFacialExpressionsHTC.nexpressionWeightings(address(), value); return this; }

    }

}