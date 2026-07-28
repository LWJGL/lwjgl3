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
 * <pre><code>
 * struct XrSpaceDiscoveryResultsMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t resultCapacityInput;
 *     uint32_t resultCountOutput;
 *     {@link XrSpaceDiscoveryResultMETA XrSpaceDiscoveryResultMETA} * results;
 * }</code></pre>
 */
public class XrSpaceDiscoveryResultsMETA extends Struct<XrSpaceDiscoveryResultsMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RESULTCAPACITYINPUT,
        RESULTCOUNTOUTPUT,
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
        RESULTCAPACITYINPUT = layout.offsetof(2);
        RESULTCOUNTOUTPUT = layout.offsetof(3);
        RESULTS = layout.offsetof(4);
    }

    protected XrSpaceDiscoveryResultsMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceDiscoveryResultsMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceDiscoveryResultsMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceDiscoveryResultsMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceDiscoveryResultsMETA(ByteBuffer container) {
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
    /** @return the value of the {@code resultCapacityInput} field. */
    @NativeType("uint32_t")
    public int resultCapacityInput() { return nresultCapacityInput(address()); }
    /** @return the value of the {@code resultCountOutput} field. */
    @NativeType("uint32_t")
    public int resultCountOutput() { return nresultCountOutput(address()); }
    /** @return a {@link XrSpaceDiscoveryResultMETA.Buffer} view of the struct array pointed to by the {@code results} field. */
    @NativeType("XrSpaceDiscoveryResultMETA *")
    public XrSpaceDiscoveryResultMETA.@Nullable Buffer results() { return nresults(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceDiscoveryResultsMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SPACE_DISCOVERY_RESULTS_META TYPE_SPACE_DISCOVERY_RESULTS_META} value to the {@code type} field. */
    public XrSpaceDiscoveryResultsMETA type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SPACE_DISCOVERY_RESULTS_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceDiscoveryResultsMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code resultCapacityInput} field. */
    public XrSpaceDiscoveryResultsMETA resultCapacityInput(@NativeType("uint32_t") int value) { nresultCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code resultCountOutput} field. */
    public XrSpaceDiscoveryResultsMETA resultCountOutput(@NativeType("uint32_t") int value) { nresultCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceDiscoveryResultMETA.Buffer} to the {@code results} field. */
    public XrSpaceDiscoveryResultsMETA results(@NativeType("XrSpaceDiscoveryResultMETA *") XrSpaceDiscoveryResultMETA.@Nullable Buffer value) { nresults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceDiscoveryResultsMETA set(
        int type,
        long next,
        int resultCapacityInput,
        int resultCountOutput,
        XrSpaceDiscoveryResultMETA.@Nullable Buffer results
    ) {
        type(type);
        next(next);
        resultCapacityInput(resultCapacityInput);
        resultCountOutput(resultCountOutput);
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
    public XrSpaceDiscoveryResultsMETA set(XrSpaceDiscoveryResultsMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceDiscoveryResultsMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceDiscoveryResultsMETA malloc() {
        return new XrSpaceDiscoveryResultsMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceDiscoveryResultsMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceDiscoveryResultsMETA calloc() {
        return new XrSpaceDiscoveryResultsMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceDiscoveryResultsMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceDiscoveryResultsMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceDiscoveryResultsMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceDiscoveryResultsMETA} instance for the specified memory address. */
    public static XrSpaceDiscoveryResultsMETA create(long address) {
        return new XrSpaceDiscoveryResultsMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceDiscoveryResultsMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceDiscoveryResultsMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultsMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultsMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultsMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultsMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultsMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultsMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceDiscoveryResultsMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultsMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceDiscoveryResultsMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceDiscoveryResultsMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceDiscoveryResultsMETA malloc(MemoryStack stack) {
        return new XrSpaceDiscoveryResultsMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceDiscoveryResultsMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceDiscoveryResultsMETA calloc(MemoryStack stack) {
        return new XrSpaceDiscoveryResultsMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultsMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultsMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultsMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultsMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceDiscoveryResultsMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceDiscoveryResultsMETA.NEXT); }
    /** Unsafe version of {@link #resultCapacityInput}. */
    public static int nresultCapacityInput(long struct) { return memGetInt(struct + XrSpaceDiscoveryResultsMETA.RESULTCAPACITYINPUT); }
    /** Unsafe version of {@link #resultCountOutput}. */
    public static int nresultCountOutput(long struct) { return memGetInt(struct + XrSpaceDiscoveryResultsMETA.RESULTCOUNTOUTPUT); }
    /** Unsafe version of {@link #results}. */
    public static XrSpaceDiscoveryResultMETA.@Nullable Buffer nresults(long struct) { return XrSpaceDiscoveryResultMETA.createSafe(memGetAddress(struct + XrSpaceDiscoveryResultsMETA.RESULTS), nresultCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceDiscoveryResultsMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceDiscoveryResultsMETA.NEXT, value); }
    /** Sets the specified value to the {@code resultCapacityInput} field of the specified {@code struct}. */
    public static void nresultCapacityInput(long struct, int value) { memPutInt(struct + XrSpaceDiscoveryResultsMETA.RESULTCAPACITYINPUT, value); }
    /** Unsafe version of {@link #resultCountOutput(int) resultCountOutput}. */
    public static void nresultCountOutput(long struct, int value) { memPutInt(struct + XrSpaceDiscoveryResultsMETA.RESULTCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #results(XrSpaceDiscoveryResultMETA.Buffer) results}. */
    public static void nresults(long struct, XrSpaceDiscoveryResultMETA.@Nullable Buffer value) { memPutAddress(struct + XrSpaceDiscoveryResultsMETA.RESULTS, memAddressSafe(value)); if (value != null) { nresultCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpaceDiscoveryResultsMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceDiscoveryResultsMETA, Buffer> implements NativeResource {

        private static final XrSpaceDiscoveryResultsMETA ELEMENT_FACTORY = XrSpaceDiscoveryResultsMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceDiscoveryResultsMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceDiscoveryResultsMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceDiscoveryResultsMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceDiscoveryResultsMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceDiscoveryResultsMETA.nnext(address()); }
        /** @return the value of the {@code resultCapacityInput} field. */
        @NativeType("uint32_t")
        public int resultCapacityInput() { return XrSpaceDiscoveryResultsMETA.nresultCapacityInput(address()); }
        /** @return the value of the {@code resultCountOutput} field. */
        @NativeType("uint32_t")
        public int resultCountOutput() { return XrSpaceDiscoveryResultsMETA.nresultCountOutput(address()); }
        /** @return a {@link XrSpaceDiscoveryResultMETA.Buffer} view of the struct array pointed to by the {@code results} field. */
        @NativeType("XrSpaceDiscoveryResultMETA *")
        public XrSpaceDiscoveryResultMETA.@Nullable Buffer results() { return XrSpaceDiscoveryResultsMETA.nresults(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceDiscoveryResultsMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceDiscoveryResultsMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SPACE_DISCOVERY_RESULTS_META TYPE_SPACE_DISCOVERY_RESULTS_META} value to the {@code type} field. */
        public XrSpaceDiscoveryResultsMETA.Buffer type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SPACE_DISCOVERY_RESULTS_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceDiscoveryResultsMETA.Buffer next(@NativeType("void const *") long value) { XrSpaceDiscoveryResultsMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code resultCapacityInput} field. */
        public XrSpaceDiscoveryResultsMETA.Buffer resultCapacityInput(@NativeType("uint32_t") int value) { XrSpaceDiscoveryResultsMETA.nresultCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code resultCountOutput} field. */
        public XrSpaceDiscoveryResultsMETA.Buffer resultCountOutput(@NativeType("uint32_t") int value) { XrSpaceDiscoveryResultsMETA.nresultCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceDiscoveryResultMETA.Buffer} to the {@code results} field. */
        public XrSpaceDiscoveryResultsMETA.Buffer results(@NativeType("XrSpaceDiscoveryResultMETA *") XrSpaceDiscoveryResultMETA.@Nullable Buffer value) { XrSpaceDiscoveryResultsMETA.nresults(address(), value); return this; }

    }

}