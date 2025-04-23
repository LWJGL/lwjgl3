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
 * struct XrQueriedSenseDataBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t stateCapacityInput;
 *     uint32_t stateCountOutput;
 *     {@link XrSpatialEntityStateBD XrSpatialEntityStateBD} * states;
 * }}</pre>
 */
public class XrQueriedSenseDataBD extends Struct<XrQueriedSenseDataBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATECAPACITYINPUT,
        STATECOUNTOUTPUT,
        STATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATECAPACITYINPUT = layout.offsetof(2);
        STATECOUNTOUTPUT = layout.offsetof(3);
        STATES = layout.offsetof(4);
    }

    protected XrQueriedSenseDataBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrQueriedSenseDataBD create(long address, @Nullable ByteBuffer container) {
        return new XrQueriedSenseDataBD(address, container);
    }

    /**
     * Creates a {@code XrQueriedSenseDataBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrQueriedSenseDataBD(ByteBuffer container) {
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
    /** @return the value of the {@code stateCapacityInput} field. */
    @NativeType("uint32_t")
    public int stateCapacityInput() { return nstateCapacityInput(address()); }
    /** @return the value of the {@code stateCountOutput} field. */
    @NativeType("uint32_t")
    public int stateCountOutput() { return nstateCountOutput(address()); }
    /** @return a {@link XrSpatialEntityStateBD.Buffer} view of the struct array pointed to by the {@code states} field. */
    @NativeType("XrSpatialEntityStateBD *")
    public XrSpatialEntityStateBD.@Nullable Buffer states() { return nstates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrQueriedSenseDataBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_QUERIED_SENSE_DATA_BD TYPE_QUERIED_SENSE_DATA_BD} value to the {@code type} field. */
    public XrQueriedSenseDataBD type$Default() { return type(BDSpatialSensing.XR_TYPE_QUERIED_SENSE_DATA_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrQueriedSenseDataBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code stateCapacityInput} field. */
    public XrQueriedSenseDataBD stateCapacityInput(@NativeType("uint32_t") int value) { nstateCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code stateCountOutput} field. */
    public XrQueriedSenseDataBD stateCountOutput(@NativeType("uint32_t") int value) { nstateCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialEntityStateBD.Buffer} to the {@code states} field. */
    public XrQueriedSenseDataBD states(@NativeType("XrSpatialEntityStateBD *") XrSpatialEntityStateBD.@Nullable Buffer value) { nstates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrQueriedSenseDataBD set(
        int type,
        long next,
        int stateCapacityInput,
        int stateCountOutput,
        XrSpatialEntityStateBD.@Nullable Buffer states
    ) {
        type(type);
        next(next);
        stateCapacityInput(stateCapacityInput);
        stateCountOutput(stateCountOutput);
        states(states);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrQueriedSenseDataBD set(XrQueriedSenseDataBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrQueriedSenseDataBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrQueriedSenseDataBD malloc() {
        return new XrQueriedSenseDataBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrQueriedSenseDataBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrQueriedSenseDataBD calloc() {
        return new XrQueriedSenseDataBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrQueriedSenseDataBD} instance allocated with {@link BufferUtils}. */
    public static XrQueriedSenseDataBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrQueriedSenseDataBD(memAddress(container), container);
    }

    /** Returns a new {@code XrQueriedSenseDataBD} instance for the specified memory address. */
    public static XrQueriedSenseDataBD create(long address) {
        return new XrQueriedSenseDataBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrQueriedSenseDataBD createSafe(long address) {
        return address == NULL ? null : new XrQueriedSenseDataBD(address, null);
    }

    /**
     * Returns a new {@link XrQueriedSenseDataBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrQueriedSenseDataBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrQueriedSenseDataBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrQueriedSenseDataBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrQueriedSenseDataBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrQueriedSenseDataBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrQueriedSenseDataBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrQueriedSenseDataBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrQueriedSenseDataBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrQueriedSenseDataBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrQueriedSenseDataBD malloc(MemoryStack stack) {
        return new XrQueriedSenseDataBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrQueriedSenseDataBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrQueriedSenseDataBD calloc(MemoryStack stack) {
        return new XrQueriedSenseDataBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrQueriedSenseDataBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrQueriedSenseDataBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrQueriedSenseDataBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrQueriedSenseDataBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrQueriedSenseDataBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrQueriedSenseDataBD.NEXT); }
    /** Unsafe version of {@link #stateCapacityInput}. */
    public static int nstateCapacityInput(long struct) { return memGetInt(struct + XrQueriedSenseDataBD.STATECAPACITYINPUT); }
    /** Unsafe version of {@link #stateCountOutput}. */
    public static int nstateCountOutput(long struct) { return memGetInt(struct + XrQueriedSenseDataBD.STATECOUNTOUTPUT); }
    /** Unsafe version of {@link #states}. */
    public static XrSpatialEntityStateBD.@Nullable Buffer nstates(long struct) { return XrSpatialEntityStateBD.createSafe(memGetAddress(struct + XrQueriedSenseDataBD.STATES), nstateCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrQueriedSenseDataBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrQueriedSenseDataBD.NEXT, value); }
    /** Sets the specified value to the {@code stateCapacityInput} field of the specified {@code struct}. */
    public static void nstateCapacityInput(long struct, int value) { memPutInt(struct + XrQueriedSenseDataBD.STATECAPACITYINPUT, value); }
    /** Unsafe version of {@link #stateCountOutput(int) stateCountOutput}. */
    public static void nstateCountOutput(long struct, int value) { memPutInt(struct + XrQueriedSenseDataBD.STATECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #states(XrSpatialEntityStateBD.Buffer) states}. */
    public static void nstates(long struct, XrSpatialEntityStateBD.@Nullable Buffer value) { memPutAddress(struct + XrQueriedSenseDataBD.STATES, memAddressSafe(value)); if (value != null) { nstateCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrQueriedSenseDataBD} structs. */
    public static class Buffer extends StructBuffer<XrQueriedSenseDataBD, Buffer> implements NativeResource {

        private static final XrQueriedSenseDataBD ELEMENT_FACTORY = XrQueriedSenseDataBD.create(-1L);

        /**
         * Creates a new {@code XrQueriedSenseDataBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrQueriedSenseDataBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrQueriedSenseDataBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrQueriedSenseDataBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrQueriedSenseDataBD.nnext(address()); }
        /** @return the value of the {@code stateCapacityInput} field. */
        @NativeType("uint32_t")
        public int stateCapacityInput() { return XrQueriedSenseDataBD.nstateCapacityInput(address()); }
        /** @return the value of the {@code stateCountOutput} field. */
        @NativeType("uint32_t")
        public int stateCountOutput() { return XrQueriedSenseDataBD.nstateCountOutput(address()); }
        /** @return a {@link XrSpatialEntityStateBD.Buffer} view of the struct array pointed to by the {@code states} field. */
        @NativeType("XrSpatialEntityStateBD *")
        public XrSpatialEntityStateBD.@Nullable Buffer states() { return XrQueriedSenseDataBD.nstates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrQueriedSenseDataBD.Buffer type(@NativeType("XrStructureType") int value) { XrQueriedSenseDataBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_QUERIED_SENSE_DATA_BD TYPE_QUERIED_SENSE_DATA_BD} value to the {@code type} field. */
        public XrQueriedSenseDataBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_QUERIED_SENSE_DATA_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrQueriedSenseDataBD.Buffer next(@NativeType("void *") long value) { XrQueriedSenseDataBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code stateCapacityInput} field. */
        public XrQueriedSenseDataBD.Buffer stateCapacityInput(@NativeType("uint32_t") int value) { XrQueriedSenseDataBD.nstateCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code stateCountOutput} field. */
        public XrQueriedSenseDataBD.Buffer stateCountOutput(@NativeType("uint32_t") int value) { XrQueriedSenseDataBD.nstateCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialEntityStateBD.Buffer} to the {@code states} field. */
        public XrQueriedSenseDataBD.Buffer states(@NativeType("XrSpatialEntityStateBD *") XrSpatialEntityStateBD.@Nullable Buffer value) { XrQueriedSenseDataBD.nstates(address(), value); return this; }

    }

}