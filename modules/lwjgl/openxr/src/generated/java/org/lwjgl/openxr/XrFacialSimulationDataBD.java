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
 * struct XrFacialSimulationDataBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t faceExpressionWeightCount;
 *     float * faceExpressionWeights;
 *     XrBool32 isUpperFaceDataValid;
 *     XrBool32 isLowerFaceDataValid;
 *     XrTime time;
 * }}</pre>
 */
public class XrFacialSimulationDataBD extends Struct<XrFacialSimulationDataBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FACEEXPRESSIONWEIGHTCOUNT,
        FACEEXPRESSIONWEIGHTS,
        ISUPPERFACEDATAVALID,
        ISLOWERFACEDATAVALID,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FACEEXPRESSIONWEIGHTCOUNT = layout.offsetof(2);
        FACEEXPRESSIONWEIGHTS = layout.offsetof(3);
        ISUPPERFACEDATAVALID = layout.offsetof(4);
        ISLOWERFACEDATAVALID = layout.offsetof(5);
        TIME = layout.offsetof(6);
    }

    protected XrFacialSimulationDataBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFacialSimulationDataBD create(long address, @Nullable ByteBuffer container) {
        return new XrFacialSimulationDataBD(address, container);
    }

    /**
     * Creates a {@code XrFacialSimulationDataBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialSimulationDataBD(ByteBuffer container) {
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
    /** @return the value of the {@code faceExpressionWeightCount} field. */
    @NativeType("uint32_t")
    public int faceExpressionWeightCount() { return nfaceExpressionWeightCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code faceExpressionWeights} field. */
    @NativeType("float *")
    public FloatBuffer faceExpressionWeights() { return nfaceExpressionWeights(address()); }
    /** @return the value of the {@code isUpperFaceDataValid} field. */
    @NativeType("XrBool32")
    public boolean isUpperFaceDataValid() { return nisUpperFaceDataValid(address()) != 0; }
    /** @return the value of the {@code isLowerFaceDataValid} field. */
    @NativeType("XrBool32")
    public boolean isLowerFaceDataValid() { return nisLowerFaceDataValid(address()) != 0; }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFacialSimulationDataBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDFacialSimulation#XR_TYPE_FACIAL_SIMULATION_DATA_BD TYPE_FACIAL_SIMULATION_DATA_BD} value to the {@code type} field. */
    public XrFacialSimulationDataBD type$Default() { return type(BDFacialSimulation.XR_TYPE_FACIAL_SIMULATION_DATA_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrFacialSimulationDataBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrLipExpressionDataBD} value to the {@code next} chain. */
    public XrFacialSimulationDataBD next(XrLipExpressionDataBD value) { return this.next(value.next(this.next()).address()); }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code faceExpressionWeights} field. */
    public XrFacialSimulationDataBD faceExpressionWeights(@NativeType("float *") FloatBuffer value) { nfaceExpressionWeights(address(), value); return this; }
    /** Sets the specified value to the {@code isUpperFaceDataValid} field. */
    public XrFacialSimulationDataBD isUpperFaceDataValid(@NativeType("XrBool32") boolean value) { nisUpperFaceDataValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code isLowerFaceDataValid} field. */
    public XrFacialSimulationDataBD isLowerFaceDataValid(@NativeType("XrBool32") boolean value) { nisLowerFaceDataValid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrFacialSimulationDataBD time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialSimulationDataBD set(
        int type,
        long next,
        FloatBuffer faceExpressionWeights,
        boolean isUpperFaceDataValid,
        boolean isLowerFaceDataValid,
        long time
    ) {
        type(type);
        next(next);
        faceExpressionWeights(faceExpressionWeights);
        isUpperFaceDataValid(isUpperFaceDataValid);
        isLowerFaceDataValid(isLowerFaceDataValid);
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
    public XrFacialSimulationDataBD set(XrFacialSimulationDataBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialSimulationDataBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialSimulationDataBD malloc() {
        return new XrFacialSimulationDataBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFacialSimulationDataBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialSimulationDataBD calloc() {
        return new XrFacialSimulationDataBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFacialSimulationDataBD} instance allocated with {@link BufferUtils}. */
    public static XrFacialSimulationDataBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFacialSimulationDataBD(memAddress(container), container);
    }

    /** Returns a new {@code XrFacialSimulationDataBD} instance for the specified memory address. */
    public static XrFacialSimulationDataBD create(long address) {
        return new XrFacialSimulationDataBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFacialSimulationDataBD createSafe(long address) {
        return address == NULL ? null : new XrFacialSimulationDataBD(address, null);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFacialSimulationDataBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFacialSimulationDataBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFacialSimulationDataBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialSimulationDataBD malloc(MemoryStack stack) {
        return new XrFacialSimulationDataBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFacialSimulationDataBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialSimulationDataBD calloc(MemoryStack stack) {
        return new XrFacialSimulationDataBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialSimulationDataBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialSimulationDataBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFacialSimulationDataBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialSimulationDataBD.NEXT); }
    /** Unsafe version of {@link #faceExpressionWeightCount}. */
    public static int nfaceExpressionWeightCount(long struct) { return memGetInt(struct + XrFacialSimulationDataBD.FACEEXPRESSIONWEIGHTCOUNT); }
    /** Unsafe version of {@link #faceExpressionWeights() faceExpressionWeights}. */
    public static FloatBuffer nfaceExpressionWeights(long struct) { return memFloatBuffer(memGetAddress(struct + XrFacialSimulationDataBD.FACEEXPRESSIONWEIGHTS), nfaceExpressionWeightCount(struct)); }
    /** Unsafe version of {@link #isUpperFaceDataValid}. */
    public static int nisUpperFaceDataValid(long struct) { return memGetInt(struct + XrFacialSimulationDataBD.ISUPPERFACEDATAVALID); }
    /** Unsafe version of {@link #isLowerFaceDataValid}. */
    public static int nisLowerFaceDataValid(long struct) { return memGetInt(struct + XrFacialSimulationDataBD.ISLOWERFACEDATAVALID); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrFacialSimulationDataBD.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFacialSimulationDataBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialSimulationDataBD.NEXT, value); }
    /** Sets the specified value to the {@code faceExpressionWeightCount} field of the specified {@code struct}. */
    public static void nfaceExpressionWeightCount(long struct, int value) { memPutInt(struct + XrFacialSimulationDataBD.FACEEXPRESSIONWEIGHTCOUNT, value); }
    /** Unsafe version of {@link #faceExpressionWeights(FloatBuffer) faceExpressionWeights}. */
    public static void nfaceExpressionWeights(long struct, FloatBuffer value) { memPutAddress(struct + XrFacialSimulationDataBD.FACEEXPRESSIONWEIGHTS, memAddress(value)); nfaceExpressionWeightCount(struct, value.remaining()); }
    /** Unsafe version of {@link #isUpperFaceDataValid(boolean) isUpperFaceDataValid}. */
    public static void nisUpperFaceDataValid(long struct, int value) { memPutInt(struct + XrFacialSimulationDataBD.ISUPPERFACEDATAVALID, value); }
    /** Unsafe version of {@link #isLowerFaceDataValid(boolean) isLowerFaceDataValid}. */
    public static void nisLowerFaceDataValid(long struct, int value) { memPutInt(struct + XrFacialSimulationDataBD.ISLOWERFACEDATAVALID, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrFacialSimulationDataBD.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrFacialSimulationDataBD.FACEEXPRESSIONWEIGHTS));
    }

    // -----------------------------------

    /** An array of {@link XrFacialSimulationDataBD} structs. */
    public static class Buffer extends StructBuffer<XrFacialSimulationDataBD, Buffer> implements NativeResource {

        private static final XrFacialSimulationDataBD ELEMENT_FACTORY = XrFacialSimulationDataBD.create(-1L);

        /**
         * Creates a new {@code XrFacialSimulationDataBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialSimulationDataBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFacialSimulationDataBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialSimulationDataBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFacialSimulationDataBD.nnext(address()); }
        /** @return the value of the {@code faceExpressionWeightCount} field. */
        @NativeType("uint32_t")
        public int faceExpressionWeightCount() { return XrFacialSimulationDataBD.nfaceExpressionWeightCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code faceExpressionWeights} field. */
        @NativeType("float *")
        public FloatBuffer faceExpressionWeights() { return XrFacialSimulationDataBD.nfaceExpressionWeights(address()); }
        /** @return the value of the {@code isUpperFaceDataValid} field. */
        @NativeType("XrBool32")
        public boolean isUpperFaceDataValid() { return XrFacialSimulationDataBD.nisUpperFaceDataValid(address()) != 0; }
        /** @return the value of the {@code isLowerFaceDataValid} field. */
        @NativeType("XrBool32")
        public boolean isLowerFaceDataValid() { return XrFacialSimulationDataBD.nisLowerFaceDataValid(address()) != 0; }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrFacialSimulationDataBD.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFacialSimulationDataBD.Buffer type(@NativeType("XrStructureType") int value) { XrFacialSimulationDataBD.ntype(address(), value); return this; }
        /** Sets the {@link BDFacialSimulation#XR_TYPE_FACIAL_SIMULATION_DATA_BD TYPE_FACIAL_SIMULATION_DATA_BD} value to the {@code type} field. */
        public XrFacialSimulationDataBD.Buffer type$Default() { return type(BDFacialSimulation.XR_TYPE_FACIAL_SIMULATION_DATA_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrFacialSimulationDataBD.Buffer next(@NativeType("void *") long value) { XrFacialSimulationDataBD.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrLipExpressionDataBD} value to the {@code next} chain. */
        public XrFacialSimulationDataBD.Buffer next(XrLipExpressionDataBD value) { return this.next(value.next(this.next()).address()); }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code faceExpressionWeights} field. */
        public XrFacialSimulationDataBD.Buffer faceExpressionWeights(@NativeType("float *") FloatBuffer value) { XrFacialSimulationDataBD.nfaceExpressionWeights(address(), value); return this; }
        /** Sets the specified value to the {@code isUpperFaceDataValid} field. */
        public XrFacialSimulationDataBD.Buffer isUpperFaceDataValid(@NativeType("XrBool32") boolean value) { XrFacialSimulationDataBD.nisUpperFaceDataValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code isLowerFaceDataValid} field. */
        public XrFacialSimulationDataBD.Buffer isLowerFaceDataValid(@NativeType("XrBool32") boolean value) { XrFacialSimulationDataBD.nisLowerFaceDataValid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrFacialSimulationDataBD.Buffer time(@NativeType("XrTime") long value) { XrFacialSimulationDataBD.ntime(address(), value); return this; }

    }

}