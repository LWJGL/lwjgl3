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
 * struct XrSphericalHarmonicsANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrLightEstimateStateANDROID state;
 *     XrSphericalHarmonicsKindANDROID kind;
 *     float coefficients[9][3];
 * }}</pre>
 */
public class XrSphericalHarmonicsANDROID extends Struct<XrSphericalHarmonicsANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATE,
        KIND,
        COEFFICIENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __array(4, 9 * 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATE = layout.offsetof(2);
        KIND = layout.offsetof(3);
        COEFFICIENTS = layout.offsetof(4);
    }

    protected XrSphericalHarmonicsANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSphericalHarmonicsANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSphericalHarmonicsANDROID(address, container);
    }

    /**
     * Creates a {@code XrSphericalHarmonicsANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSphericalHarmonicsANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("XrLightEstimateStateANDROID")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code kind} field. */
    @NativeType("XrSphericalHarmonicsKindANDROID")
    public int kind() { return nkind(address()); }
    /** @return a {@link FloatBuffer} view of the {@code coefficients} field. */
    @NativeType("float[9][3]")
    public FloatBuffer coefficients() { return ncoefficients(address()); }
    /** @return the value at the specified index of the {@code coefficients} field. */
    public float coefficients(int index) { return ncoefficients(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XrSphericalHarmonicsANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_SPHERICAL_HARMONICS_ANDROID TYPE_SPHERICAL_HARMONICS_ANDROID} value to the {@code type} field. */
    public XrSphericalHarmonicsANDROID type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_SPHERICAL_HARMONICS_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSphericalHarmonicsANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XrSphericalHarmonicsANDROID state(@NativeType("XrLightEstimateStateANDROID") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code kind} field. */
    public XrSphericalHarmonicsANDROID kind(@NativeType("XrSphericalHarmonicsKindANDROID") int value) { nkind(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code coefficients} field. */
    public XrSphericalHarmonicsANDROID coefficients(@NativeType("float[9][3]") FloatBuffer value) { ncoefficients(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code coefficients} field. */
    public XrSphericalHarmonicsANDROID coefficients(int index, float value) { ncoefficients(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSphericalHarmonicsANDROID set(
        int type,
        long next,
        int state,
        int kind,
        FloatBuffer coefficients
    ) {
        type(type);
        next(next);
        state(state);
        kind(kind);
        coefficients(coefficients);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSphericalHarmonicsANDROID set(XrSphericalHarmonicsANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSphericalHarmonicsANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSphericalHarmonicsANDROID malloc() {
        return new XrSphericalHarmonicsANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSphericalHarmonicsANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSphericalHarmonicsANDROID calloc() {
        return new XrSphericalHarmonicsANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSphericalHarmonicsANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSphericalHarmonicsANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSphericalHarmonicsANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSphericalHarmonicsANDROID} instance for the specified memory address. */
    public static XrSphericalHarmonicsANDROID create(long address) {
        return new XrSphericalHarmonicsANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSphericalHarmonicsANDROID createSafe(long address) {
        return address == NULL ? null : new XrSphericalHarmonicsANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSphericalHarmonicsANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSphericalHarmonicsANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSphericalHarmonicsANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSphericalHarmonicsANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSphericalHarmonicsANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSphericalHarmonicsANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSphericalHarmonicsANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSphericalHarmonicsANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSphericalHarmonicsANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSphericalHarmonicsANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSphericalHarmonicsANDROID malloc(MemoryStack stack) {
        return new XrSphericalHarmonicsANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSphericalHarmonicsANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSphericalHarmonicsANDROID calloc(MemoryStack stack) {
        return new XrSphericalHarmonicsANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSphericalHarmonicsANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSphericalHarmonicsANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSphericalHarmonicsANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSphericalHarmonicsANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSphericalHarmonicsANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSphericalHarmonicsANDROID.NEXT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrSphericalHarmonicsANDROID.STATE); }
    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return memGetInt(struct + XrSphericalHarmonicsANDROID.KIND); }
    /** Unsafe version of {@link #coefficients}. */
    public static FloatBuffer ncoefficients(long struct) { return memFloatBuffer(struct + XrSphericalHarmonicsANDROID.COEFFICIENTS, 9 * 3); }
    /** Unsafe version of {@link #coefficients(int) coefficients}. */
    public static float ncoefficients(long struct, int index) {
        return memGetFloat(struct + XrSphericalHarmonicsANDROID.COEFFICIENTS + check(index, 9 * 3) * 4);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSphericalHarmonicsANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSphericalHarmonicsANDROID.NEXT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { memPutInt(struct + XrSphericalHarmonicsANDROID.STATE, value); }
    /** Unsafe version of {@link #kind(int) kind}. */
    public static void nkind(long struct, int value) { memPutInt(struct + XrSphericalHarmonicsANDROID.KIND, value); }
    /** Unsafe version of {@link #coefficients(FloatBuffer) coefficients}. */
    public static void ncoefficients(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 9 * 3); }
        memCopy(memAddress(value), struct + XrSphericalHarmonicsANDROID.COEFFICIENTS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #coefficients(int, float) coefficients}. */
    public static void ncoefficients(long struct, int index, float value) {
        memPutFloat(struct + XrSphericalHarmonicsANDROID.COEFFICIENTS + check(index, 9 * 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link XrSphericalHarmonicsANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSphericalHarmonicsANDROID, Buffer> implements NativeResource {

        private static final XrSphericalHarmonicsANDROID ELEMENT_FACTORY = XrSphericalHarmonicsANDROID.create(-1L);

        /**
         * Creates a new {@code XrSphericalHarmonicsANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSphericalHarmonicsANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSphericalHarmonicsANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSphericalHarmonicsANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSphericalHarmonicsANDROID.nnext(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrLightEstimateStateANDROID")
        public int state() { return XrSphericalHarmonicsANDROID.nstate(address()); }
        /** @return the value of the {@code kind} field. */
        @NativeType("XrSphericalHarmonicsKindANDROID")
        public int kind() { return XrSphericalHarmonicsANDROID.nkind(address()); }
        /** @return a {@link FloatBuffer} view of the {@code coefficients} field. */
        @NativeType("float[9][3]")
        public FloatBuffer coefficients() { return XrSphericalHarmonicsANDROID.ncoefficients(address()); }
        /** @return the value at the specified index of the {@code coefficients} field. */
        public float coefficients(int index) { return XrSphericalHarmonicsANDROID.ncoefficients(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XrSphericalHarmonicsANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSphericalHarmonicsANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDLightEstimation#XR_TYPE_SPHERICAL_HARMONICS_ANDROID TYPE_SPHERICAL_HARMONICS_ANDROID} value to the {@code type} field. */
        public XrSphericalHarmonicsANDROID.Buffer type$Default() { return type(ANDROIDLightEstimation.XR_TYPE_SPHERICAL_HARMONICS_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSphericalHarmonicsANDROID.Buffer next(@NativeType("void *") long value) { XrSphericalHarmonicsANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XrSphericalHarmonicsANDROID.Buffer state(@NativeType("XrLightEstimateStateANDROID") int value) { XrSphericalHarmonicsANDROID.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code kind} field. */
        public XrSphericalHarmonicsANDROID.Buffer kind(@NativeType("XrSphericalHarmonicsKindANDROID") int value) { XrSphericalHarmonicsANDROID.nkind(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code coefficients} field. */
        public XrSphericalHarmonicsANDROID.Buffer coefficients(@NativeType("float[9][3]") FloatBuffer value) { XrSphericalHarmonicsANDROID.ncoefficients(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code coefficients} field. */
        public XrSphericalHarmonicsANDROID.Buffer coefficients(int index, float value) { XrSphericalHarmonicsANDROID.ncoefficients(address(), index, value); return this; }

    }

}