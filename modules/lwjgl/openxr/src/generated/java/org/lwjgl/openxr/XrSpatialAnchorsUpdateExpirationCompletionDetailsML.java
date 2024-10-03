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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Completion structure to retrieve the per anchor result of the anchor expiration update.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code results} <b>must</b> be a pointer to an array of {@code resultCount} {@link XrSpatialAnchorCompletionResultML} structures</li>
 * <li>The {@code resultCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpatialAnchorCompletionResultML}, {@link XrSpatialAnchorsUpdateExpirationCompletionML}, {@link MLSpatialAnchorsStorage#xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsUpdateExpirationCompletionDetailsML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #resultCount};
 *     {@link XrSpatialAnchorCompletionResultML XrSpatialAnchorCompletionResultML} * {@link #results};
 * }</code></pre>
 */
public class XrSpatialAnchorsUpdateExpirationCompletionDetailsML extends Struct<XrSpatialAnchorsUpdateExpirationCompletionDetailsML> implements NativeResource {

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

    protected XrSpatialAnchorsUpdateExpirationCompletionDetailsML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsUpdateExpirationCompletionDetailsML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML(ByteBuffer container) {
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
    /** the capacity of the {@code results} array and <b>must</b> match the number of anchors passed to {@link MLSpatialAnchorsStorage#xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML} */
    @NativeType("uint32_t")
    public int resultCount() { return nresultCount(address()); }
    /** the per UUID status of the update operation. The order of anchors in this array <b>must</b> match the async request order. */
    @NativeType("XrSpatialAnchorCompletionResultML *")
    public XrSpatialAnchorCompletionResultML.Buffer results() { return nresults(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML} value to the {@link #type} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialAnchorCompletionResultML.Buffer} to the {@link #results} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML results(@NativeType("XrSpatialAnchorCompletionResultML *") XrSpatialAnchorCompletionResultML.Buffer value) { nresults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML set(
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
    public XrSpatialAnchorsUpdateExpirationCompletionDetailsML set(XrSpatialAnchorsUpdateExpirationCompletionDetailsML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML malloc() {
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML calloc() {
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance for the specified memory address. */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML create(long address) {
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationCompletionDetailsML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.NEXT); }
    /** Unsafe version of {@link #resultCount}. */
    public static int nresultCount(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.RESULTCOUNT); }
    /** Unsafe version of {@link #results}. */
    public static XrSpatialAnchorCompletionResultML.Buffer nresults(long struct) { return XrSpatialAnchorCompletionResultML.create(memGetAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.RESULTS), nresultCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.NEXT, value); }
    /** Sets the specified value to the {@code resultCount} field of the specified {@code struct}. */
    public static void nresultCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.RESULTCOUNT, value); }
    /** Unsafe version of {@link #results(XrSpatialAnchorCompletionResultML.Buffer) results}. */
    public static void nresults(long struct, XrSpatialAnchorCompletionResultML.Buffer value) { memPutAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.RESULTS, value.address()); nresultCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionDetailsML.RESULTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsUpdateExpirationCompletionDetailsML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsUpdateExpirationCompletionDetailsML ELEMENT_FACTORY = XrSpatialAnchorsUpdateExpirationCompletionDetailsML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsUpdateExpirationCompletionDetailsML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsUpdateExpirationCompletionDetailsML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsUpdateExpirationCompletionDetailsML.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#resultCount} field. */
        @NativeType("uint32_t")
        public int resultCount() { return XrSpatialAnchorsUpdateExpirationCompletionDetailsML.nresultCount(address()); }
        /** @return a {@link XrSpatialAnchorCompletionResultML.Buffer} view of the struct array pointed to by the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#results} field. */
        @NativeType("XrSpatialAnchorCompletionResultML *")
        public XrSpatialAnchorCompletionResultML.Buffer results() { return XrSpatialAnchorsUpdateExpirationCompletionDetailsML.nresults(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#type} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsUpdateExpirationCompletionDetailsML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML} value to the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#type} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML); }
        /** Sets the specified value to the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#next} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsUpdateExpirationCompletionDetailsML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialAnchorCompletionResultML.Buffer} to the {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML#results} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionDetailsML.Buffer results(@NativeType("XrSpatialAnchorCompletionResultML *") XrSpatialAnchorCompletionResultML.Buffer value) { XrSpatialAnchorsUpdateExpirationCompletionDetailsML.nresults(address(), value); return this; }

    }

}