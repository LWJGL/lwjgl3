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
 * Information used to query for anchors.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsQueryInfoBaseHeaderML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MLSpatialAnchorsStorage#xrQuerySpatialAnchorsAsyncML QuerySpatialAnchorsAsyncML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsQueryInfoBaseHeaderML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrSpatialAnchorsQueryInfoBaseHeaderML extends Struct<XrSpatialAnchorsQueryInfoBaseHeaderML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSpatialAnchorsQueryInfoBaseHeaderML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsQueryInfoBaseHeaderML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsQueryInfoBaseHeaderML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsQueryInfoBaseHeaderML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsQueryInfoBaseHeaderML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsQueryInfoBaseHeaderML set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsQueryInfoBaseHeaderML set(XrSpatialAnchorsQueryInfoBaseHeaderML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML malloc() {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML calloc() {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance for the specified memory address. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML create(long address) {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsQueryInfoBaseHeaderML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsQueryInfoBaseHeaderML(address, null);
    }

    /** Upcasts the specified {@code XrSpatialAnchorsQueryInfoRadiusML} instance to {@code XrSpatialAnchorsQueryInfoBaseHeaderML}. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML create(XrSpatialAnchorsQueryInfoRadiusML value) {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance to {@code XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer}. */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer create(XrSpatialAnchorsQueryInfoRadiusML.Buffer value) {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryInfoBaseHeaderML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsQueryInfoBaseHeaderML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsQueryInfoBaseHeaderML.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsQueryInfoBaseHeaderML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsQueryInfoBaseHeaderML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsQueryInfoBaseHeaderML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsQueryInfoBaseHeaderML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsQueryInfoBaseHeaderML ELEMENT_FACTORY = XrSpatialAnchorsQueryInfoBaseHeaderML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsQueryInfoBaseHeaderML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsQueryInfoBaseHeaderML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsQueryInfoBaseHeaderML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsQueryInfoBaseHeaderML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsQueryInfoBaseHeaderML#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsQueryInfoBaseHeaderML.nnext(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsQueryInfoBaseHeaderML#type} field. */
        public XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsQueryInfoBaseHeaderML.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsQueryInfoBaseHeaderML#next} field. */
        public XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsQueryInfoBaseHeaderML.nnext(address(), value); return this; }

    }

}