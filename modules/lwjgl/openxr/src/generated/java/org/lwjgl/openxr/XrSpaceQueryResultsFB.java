/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used to retrieve query results.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceQueryResultsFB} structure is used by the {@link FBSpatialEntityQuery#xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} function to retrieve query results.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using {@link XrSpaceQueryResultsFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityQuery#XR_TYPE_SPACE_QUERY_RESULTS_FB TYPE_SPACE_QUERY_RESULTS_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code resultCapacityInput} is not 0, {@code results} <b>must</b> be a pointer to an array of {@code resultCapacityInput} {@link XrSpaceQueryResultFB} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpaceQueryResultFB}, {@link FBSpatialEntityQuery#xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceQueryResultsFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #resultCapacityInput};
 *     uint32_t {@link #resultCountOutput};
 *     {@link XrSpaceQueryResultFB XrSpaceQueryResultFB} * {@link #results};
 * }</code></pre>
 */
public class XrSpaceQueryResultsFB extends Struct<XrSpaceQueryResultsFB> implements NativeResource {

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

    protected XrSpaceQueryResultsFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceQueryResultsFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceQueryResultsFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceQueryResultsFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceQueryResultsFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the capacity of the {@code results} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int resultCapacityInput() { return nresultCapacityInput(address()); }
    /** an output parameter containing the count of results retrieved, or returns the required capacity in the case that {@code resultCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int resultCountOutput() { return nresultCountOutput(address()); }
    /** a pointer to an array of results, but <b>can</b> be {@code NULL} if {@code resultCapacityInput} is 0. */
    @Nullable
    @NativeType("XrSpaceQueryResultFB *")
    public XrSpaceQueryResultFB.Buffer results() { return nresults(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceQueryResultsFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_QUERY_RESULTS_FB TYPE_SPACE_QUERY_RESULTS_FB} value to the {@link #type} field. */
    public XrSpaceQueryResultsFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_QUERY_RESULTS_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceQueryResultsFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #resultCapacityInput} field. */
    public XrSpaceQueryResultsFB resultCapacityInput(@NativeType("uint32_t") int value) { nresultCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #resultCountOutput} field. */
    public XrSpaceQueryResultsFB resultCountOutput(@NativeType("uint32_t") int value) { nresultCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceQueryResultFB.Buffer} to the {@link #results} field. */
    public XrSpaceQueryResultsFB results(@Nullable @NativeType("XrSpaceQueryResultFB *") XrSpaceQueryResultFB.Buffer value) { nresults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceQueryResultsFB set(
        int type,
        long next,
        int resultCapacityInput,
        int resultCountOutput,
        @Nullable XrSpaceQueryResultFB.Buffer results
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
    public XrSpaceQueryResultsFB set(XrSpaceQueryResultsFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceQueryResultsFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceQueryResultsFB malloc() {
        return new XrSpaceQueryResultsFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceQueryResultsFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceQueryResultsFB calloc() {
        return new XrSpaceQueryResultsFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceQueryResultsFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceQueryResultsFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceQueryResultsFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceQueryResultsFB} instance for the specified memory address. */
    public static XrSpaceQueryResultsFB create(long address) {
        return new XrSpaceQueryResultsFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceQueryResultsFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceQueryResultsFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceQueryResultsFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultsFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryResultsFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultsFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryResultsFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultsFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceQueryResultsFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultsFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceQueryResultsFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceQueryResultsFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceQueryResultsFB malloc(MemoryStack stack) {
        return new XrSpaceQueryResultsFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceQueryResultsFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceQueryResultsFB calloc(MemoryStack stack) {
        return new XrSpaceQueryResultsFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceQueryResultsFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultsFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryResultsFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultsFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceQueryResultsFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceQueryResultsFB.NEXT); }
    /** Unsafe version of {@link #resultCapacityInput}. */
    public static int nresultCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrSpaceQueryResultsFB.RESULTCAPACITYINPUT); }
    /** Unsafe version of {@link #resultCountOutput}. */
    public static int nresultCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrSpaceQueryResultsFB.RESULTCOUNTOUTPUT); }
    /** Unsafe version of {@link #results}. */
    @Nullable public static XrSpaceQueryResultFB.Buffer nresults(long struct) { return XrSpaceQueryResultFB.createSafe(memGetAddress(struct + XrSpaceQueryResultsFB.RESULTS), nresultCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceQueryResultsFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceQueryResultsFB.NEXT, value); }
    /** Sets the specified value to the {@code resultCapacityInput} field of the specified {@code struct}. */
    public static void nresultCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceQueryResultsFB.RESULTCAPACITYINPUT, value); }
    /** Unsafe version of {@link #resultCountOutput(int) resultCountOutput}. */
    public static void nresultCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceQueryResultsFB.RESULTCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #results(XrSpaceQueryResultFB.Buffer) results}. */
    public static void nresults(long struct, @Nullable XrSpaceQueryResultFB.Buffer value) { memPutAddress(struct + XrSpaceQueryResultsFB.RESULTS, memAddressSafe(value)); if (value != null) { nresultCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpaceQueryResultsFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceQueryResultsFB, Buffer> implements NativeResource {

        private static final XrSpaceQueryResultsFB ELEMENT_FACTORY = XrSpaceQueryResultsFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceQueryResultsFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceQueryResultsFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceQueryResultsFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceQueryResultsFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceQueryResultsFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceQueryResultsFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceQueryResultsFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceQueryResultsFB#resultCapacityInput} field. */
        @NativeType("uint32_t")
        public int resultCapacityInput() { return XrSpaceQueryResultsFB.nresultCapacityInput(address()); }
        /** @return the value of the {@link XrSpaceQueryResultsFB#resultCountOutput} field. */
        @NativeType("uint32_t")
        public int resultCountOutput() { return XrSpaceQueryResultsFB.nresultCountOutput(address()); }
        /** @return a {@link XrSpaceQueryResultFB.Buffer} view of the struct array pointed to by the {@link XrSpaceQueryResultsFB#results} field. */
        @Nullable
        @NativeType("XrSpaceQueryResultFB *")
        public XrSpaceQueryResultFB.Buffer results() { return XrSpaceQueryResultsFB.nresults(address()); }

        /** Sets the specified value to the {@link XrSpaceQueryResultsFB#type} field. */
        public XrSpaceQueryResultsFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceQueryResultsFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_QUERY_RESULTS_FB TYPE_SPACE_QUERY_RESULTS_FB} value to the {@link XrSpaceQueryResultsFB#type} field. */
        public XrSpaceQueryResultsFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_QUERY_RESULTS_FB); }
        /** Sets the specified value to the {@link XrSpaceQueryResultsFB#next} field. */
        public XrSpaceQueryResultsFB.Buffer next(@NativeType("void *") long value) { XrSpaceQueryResultsFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceQueryResultsFB#resultCapacityInput} field. */
        public XrSpaceQueryResultsFB.Buffer resultCapacityInput(@NativeType("uint32_t") int value) { XrSpaceQueryResultsFB.nresultCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceQueryResultsFB#resultCountOutput} field. */
        public XrSpaceQueryResultsFB.Buffer resultCountOutput(@NativeType("uint32_t") int value) { XrSpaceQueryResultsFB.nresultCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceQueryResultFB.Buffer} to the {@link XrSpaceQueryResultsFB#results} field. */
        public XrSpaceQueryResultsFB.Buffer results(@Nullable @NativeType("XrSpaceQueryResultFB *") XrSpaceQueryResultFB.Buffer value) { XrSpaceQueryResultsFB.nresults(address(), value); return this; }

    }

}