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
 * struct XrRaycastHitResultsANDROID {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t resultsCapacityInput;
 *     uint32_t resultsCountOutput;
 *     {@link XrRaycastHitResultANDROID XrRaycastHitResultANDROID} * results;
 * }}</pre>
 */
public class XrRaycastHitResultsANDROID extends Struct<XrRaycastHitResultsANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RESULTSCAPACITYINPUT,
        RESULTSCOUNTOUTPUT,
        RESULTS;

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
        RESULTSCAPACITYINPUT = layout.offsetof(2);
        RESULTSCOUNTOUTPUT = layout.offsetof(3);
        RESULTS = layout.offsetof(4);
    }

    protected XrRaycastHitResultsANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRaycastHitResultsANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrRaycastHitResultsANDROID(address, container);
    }

    /**
     * Creates a {@code XrRaycastHitResultsANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRaycastHitResultsANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code resultsCapacityInput} field. */
    @NativeType("uint32_t")
    public int resultsCapacityInput() { return nresultsCapacityInput(address()); }
    /** @return the value of the {@code resultsCountOutput} field. */
    @NativeType("uint32_t")
    public int resultsCountOutput() { return nresultsCountOutput(address()); }
    /** @return a {@link XrRaycastHitResultANDROID.Buffer} view of the struct array pointed to by the {@code results} field. */
    @NativeType("XrRaycastHitResultANDROID *")
    public XrRaycastHitResultANDROID.@Nullable Buffer results() { return nresults(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRaycastHitResultsANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDRaycast#XR_TYPE_RAYCAST_HIT_RESULTS_ANDROID TYPE_RAYCAST_HIT_RESULTS_ANDROID} value to the {@code type} field. */
    public XrRaycastHitResultsANDROID type$Default() { return type(ANDROIDRaycast.XR_TYPE_RAYCAST_HIT_RESULTS_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrRaycastHitResultsANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code resultsCapacityInput} field. */
    public XrRaycastHitResultsANDROID resultsCapacityInput(@NativeType("uint32_t") int value) { nresultsCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code resultsCountOutput} field. */
    public XrRaycastHitResultsANDROID resultsCountOutput(@NativeType("uint32_t") int value) { nresultsCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrRaycastHitResultANDROID.Buffer} to the {@code results} field. */
    public XrRaycastHitResultsANDROID results(@NativeType("XrRaycastHitResultANDROID *") XrRaycastHitResultANDROID.@Nullable Buffer value) { nresults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRaycastHitResultsANDROID set(
        int type,
        long next,
        int resultsCapacityInput,
        int resultsCountOutput,
        XrRaycastHitResultANDROID.@Nullable Buffer results
    ) {
        type(type);
        next(next);
        resultsCapacityInput(resultsCapacityInput);
        resultsCountOutput(resultsCountOutput);
        results(results);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRaycastHitResultsANDROID set(XrRaycastHitResultsANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRaycastHitResultsANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRaycastHitResultsANDROID malloc() {
        return new XrRaycastHitResultsANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRaycastHitResultsANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRaycastHitResultsANDROID calloc() {
        return new XrRaycastHitResultsANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRaycastHitResultsANDROID} instance allocated with {@link BufferUtils}. */
    public static XrRaycastHitResultsANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRaycastHitResultsANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrRaycastHitResultsANDROID} instance for the specified memory address. */
    public static XrRaycastHitResultsANDROID create(long address) {
        return new XrRaycastHitResultsANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRaycastHitResultsANDROID createSafe(long address) {
        return address == NULL ? null : new XrRaycastHitResultsANDROID(address, null);
    }

    /**
     * Returns a new {@link XrRaycastHitResultsANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultsANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRaycastHitResultsANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultsANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRaycastHitResultsANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultsANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRaycastHitResultsANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultsANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRaycastHitResultsANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRaycastHitResultsANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRaycastHitResultsANDROID malloc(MemoryStack stack) {
        return new XrRaycastHitResultsANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRaycastHitResultsANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRaycastHitResultsANDROID calloc(MemoryStack stack) {
        return new XrRaycastHitResultsANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRaycastHitResultsANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultsANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRaycastHitResultsANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultsANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRaycastHitResultsANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRaycastHitResultsANDROID.NEXT); }
    /** Unsafe version of {@link #resultsCapacityInput}. */
    public static int nresultsCapacityInput(long struct) { return memGetInt(struct + XrRaycastHitResultsANDROID.RESULTSCAPACITYINPUT); }
    /** Unsafe version of {@link #resultsCountOutput}. */
    public static int nresultsCountOutput(long struct) { return memGetInt(struct + XrRaycastHitResultsANDROID.RESULTSCOUNTOUTPUT); }
    /** Unsafe version of {@link #results}. */
    public static XrRaycastHitResultANDROID.@Nullable Buffer nresults(long struct) { return XrRaycastHitResultANDROID.createSafe(memGetAddress(struct + XrRaycastHitResultsANDROID.RESULTS), nresultsCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRaycastHitResultsANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRaycastHitResultsANDROID.NEXT, value); }
    /** Sets the specified value to the {@code resultsCapacityInput} field of the specified {@code struct}. */
    public static void nresultsCapacityInput(long struct, int value) { memPutInt(struct + XrRaycastHitResultsANDROID.RESULTSCAPACITYINPUT, value); }
    /** Unsafe version of {@link #resultsCountOutput(int) resultsCountOutput}. */
    public static void nresultsCountOutput(long struct, int value) { memPutInt(struct + XrRaycastHitResultsANDROID.RESULTSCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #results(XrRaycastHitResultANDROID.Buffer) results}. */
    public static void nresults(long struct, XrRaycastHitResultANDROID.@Nullable Buffer value) { memPutAddress(struct + XrRaycastHitResultsANDROID.RESULTS, memAddressSafe(value)); if (value != null) { nresultsCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRaycastHitResultsANDROID} structs. */
    public static class Buffer extends StructBuffer<XrRaycastHitResultsANDROID, Buffer> implements NativeResource {

        private static final XrRaycastHitResultsANDROID ELEMENT_FACTORY = XrRaycastHitResultsANDROID.create(-1L);

        /**
         * Creates a new {@code XrRaycastHitResultsANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRaycastHitResultsANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRaycastHitResultsANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRaycastHitResultsANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRaycastHitResultsANDROID.nnext(address()); }
        /** @return the value of the {@code resultsCapacityInput} field. */
        @NativeType("uint32_t")
        public int resultsCapacityInput() { return XrRaycastHitResultsANDROID.nresultsCapacityInput(address()); }
        /** @return the value of the {@code resultsCountOutput} field. */
        @NativeType("uint32_t")
        public int resultsCountOutput() { return XrRaycastHitResultsANDROID.nresultsCountOutput(address()); }
        /** @return a {@link XrRaycastHitResultANDROID.Buffer} view of the struct array pointed to by the {@code results} field. */
        @NativeType("XrRaycastHitResultANDROID *")
        public XrRaycastHitResultANDROID.@Nullable Buffer results() { return XrRaycastHitResultsANDROID.nresults(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRaycastHitResultsANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrRaycastHitResultsANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDRaycast#XR_TYPE_RAYCAST_HIT_RESULTS_ANDROID TYPE_RAYCAST_HIT_RESULTS_ANDROID} value to the {@code type} field. */
        public XrRaycastHitResultsANDROID.Buffer type$Default() { return type(ANDROIDRaycast.XR_TYPE_RAYCAST_HIT_RESULTS_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrRaycastHitResultsANDROID.Buffer next(@NativeType("void *") long value) { XrRaycastHitResultsANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code resultsCapacityInput} field. */
        public XrRaycastHitResultsANDROID.Buffer resultsCapacityInput(@NativeType("uint32_t") int value) { XrRaycastHitResultsANDROID.nresultsCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code resultsCountOutput} field. */
        public XrRaycastHitResultsANDROID.Buffer resultsCountOutput(@NativeType("uint32_t") int value) { XrRaycastHitResultsANDROID.nresultsCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrRaycastHitResultANDROID.Buffer} to the {@code results} field. */
        public XrRaycastHitResultsANDROID.Buffer results(@NativeType("XrRaycastHitResultANDROID *") XrRaycastHitResultANDROID.@Nullable Buffer value) { XrRaycastHitResultsANDROID.nresults(address(), value); return this; }

    }

}