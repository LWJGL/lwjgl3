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
 * Completion structure to retrieve the per anchor result of the anchor deletion.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsDeleteCompletionDetailsML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code results} <b>must</b> be a pointer to an array of {@code resultCount} {@link XrSpatialAnchorCompletionResultML} structures</li>
 * <li>The {@code resultCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpatialAnchorCompletionResultML}, {@link XrSpatialAnchorsDeleteCompletionML}, {@link MLSpatialAnchorsStorage#xrDeleteSpatialAnchorsAsyncML DeleteSpatialAnchorsAsyncML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsDeleteCompletionDetailsML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #resultCount};
 *     {@link XrSpatialAnchorCompletionResultML XrSpatialAnchorCompletionResultML} * {@link #results};
 * }</code></pre>
 */
public class XrSpatialAnchorsDeleteCompletionDetailsML extends Struct<XrSpatialAnchorsDeleteCompletionDetailsML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RESULTCOUNT,
        RESULTS;

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
        RESULTCOUNT = layout.offsetof(2);
        RESULTS = layout.offsetof(3);
    }

    protected XrSpatialAnchorsDeleteCompletionDetailsML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsDeleteCompletionDetailsML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsDeleteCompletionDetailsML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsDeleteCompletionDetailsML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the capacity of the {@code results} array and <b>must</b> match the number of anchors passed to {@link MLSpatialAnchorsStorage#xrDeleteSpatialAnchorsAsyncML DeleteSpatialAnchorsAsyncML} */
    @NativeType("uint32_t")
    public int resultCount() { return nresultCount(address()); }
    /** the per UUID status of the delete operation. The order of results in this array correspond to the async request order. */
    @NativeType("XrSpatialAnchorCompletionResultML *")
    public XrSpatialAnchorCompletionResultML.Buffer results() { return nresults(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsDeleteCompletionDetailsML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML} value to the {@link #type} field. */
    public XrSpatialAnchorsDeleteCompletionDetailsML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsDeleteCompletionDetailsML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialAnchorCompletionResultML.Buffer} to the {@link #results} field. */
    public XrSpatialAnchorsDeleteCompletionDetailsML results(@NativeType("XrSpatialAnchorCompletionResultML *") XrSpatialAnchorCompletionResultML.Buffer value) { nresults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsDeleteCompletionDetailsML set(
        int type,
        long next,
        XrSpatialAnchorCompletionResultML.Buffer results
    ) {
        type(type);
        next(next);
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
    public XrSpatialAnchorsDeleteCompletionDetailsML set(XrSpatialAnchorsDeleteCompletionDetailsML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsDeleteCompletionDetailsML malloc() {
        return new XrSpatialAnchorsDeleteCompletionDetailsML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsDeleteCompletionDetailsML calloc() {
        return new XrSpatialAnchorsDeleteCompletionDetailsML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsDeleteCompletionDetailsML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsDeleteCompletionDetailsML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance for the specified memory address. */
    public static XrSpatialAnchorsDeleteCompletionDetailsML create(long address) {
        return new XrSpatialAnchorsDeleteCompletionDetailsML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsDeleteCompletionDetailsML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsDeleteCompletionDetailsML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsDeleteCompletionDetailsML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsDeleteCompletionDetailsML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsDeleteCompletionDetailsML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteCompletionDetailsML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsDeleteCompletionDetailsML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsDeleteCompletionDetailsML.NEXT); }
    /** Unsafe version of {@link #resultCount}. */
    public static int nresultCount(long struct) { return memGetInt(struct + XrSpatialAnchorsDeleteCompletionDetailsML.RESULTCOUNT); }
    /** Unsafe version of {@link #results}. */
    public static XrSpatialAnchorCompletionResultML.Buffer nresults(long struct) { return XrSpatialAnchorCompletionResultML.create(memGetAddress(struct + XrSpatialAnchorsDeleteCompletionDetailsML.RESULTS), nresultCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsDeleteCompletionDetailsML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsDeleteCompletionDetailsML.NEXT, value); }
    /** Sets the specified value to the {@code resultCount} field of the specified {@code struct}. */
    public static void nresultCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsDeleteCompletionDetailsML.RESULTCOUNT, value); }
    /** Unsafe version of {@link #results(XrSpatialAnchorCompletionResultML.Buffer) results}. */
    public static void nresults(long struct, XrSpatialAnchorCompletionResultML.Buffer value) { memPutAddress(struct + XrSpatialAnchorsDeleteCompletionDetailsML.RESULTS, value.address()); nresultCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsDeleteCompletionDetailsML.RESULTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsDeleteCompletionDetailsML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsDeleteCompletionDetailsML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsDeleteCompletionDetailsML ELEMENT_FACTORY = XrSpatialAnchorsDeleteCompletionDetailsML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsDeleteCompletionDetailsML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsDeleteCompletionDetailsML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsDeleteCompletionDetailsML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsDeleteCompletionDetailsML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsDeleteCompletionDetailsML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsDeleteCompletionDetailsML#next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsDeleteCompletionDetailsML.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorsDeleteCompletionDetailsML#resultCount} field. */
        @NativeType("uint32_t")
        public int resultCount() { return XrSpatialAnchorsDeleteCompletionDetailsML.nresultCount(address()); }
        /** @return a {@link XrSpatialAnchorCompletionResultML.Buffer} view of the struct array pointed to by the {@link XrSpatialAnchorsDeleteCompletionDetailsML#results} field. */
        @NativeType("XrSpatialAnchorCompletionResultML *")
        public XrSpatialAnchorCompletionResultML.Buffer results() { return XrSpatialAnchorsDeleteCompletionDetailsML.nresults(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsDeleteCompletionDetailsML#type} field. */
        public XrSpatialAnchorsDeleteCompletionDetailsML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsDeleteCompletionDetailsML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML} value to the {@link XrSpatialAnchorsDeleteCompletionDetailsML#type} field. */
        public XrSpatialAnchorsDeleteCompletionDetailsML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML); }
        /** Sets the specified value to the {@link XrSpatialAnchorsDeleteCompletionDetailsML#next} field. */
        public XrSpatialAnchorsDeleteCompletionDetailsML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsDeleteCompletionDetailsML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialAnchorCompletionResultML.Buffer} to the {@link XrSpatialAnchorsDeleteCompletionDetailsML#results} field. */
        public XrSpatialAnchorsDeleteCompletionDetailsML.Buffer results(@NativeType("XrSpatialAnchorCompletionResultML *") XrSpatialAnchorCompletionResultML.Buffer value) { XrSpatialAnchorsDeleteCompletionDetailsML.nresults(address(), value); return this; }

    }

}