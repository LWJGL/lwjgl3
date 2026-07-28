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
 * <pre><code>
 * struct XrSpatialComponentRaycastResultListANDROID {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t raycastResultCount;
 *     {@link XrSpatialRaycastResultDataANDROID XrSpatialRaycastResultDataANDROID} * raycastResults;
 * }</code></pre>
 */
public class XrSpatialComponentRaycastResultListANDROID extends Struct<XrSpatialComponentRaycastResultListANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RAYCASTRESULTCOUNT,
        RAYCASTRESULTS;

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
        RAYCASTRESULTCOUNT = layout.offsetof(2);
        RAYCASTRESULTS = layout.offsetof(3);
    }

    protected XrSpatialComponentRaycastResultListANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentRaycastResultListANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentRaycastResultListANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentRaycastResultListANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentRaycastResultListANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code raycastResultCount} field. */
    @NativeType("uint32_t")
    public int raycastResultCount() { return nraycastResultCount(address()); }
    /** @return a {@link XrSpatialRaycastResultDataANDROID.Buffer} view of the struct array pointed to by the {@code raycastResults} field. */
    @NativeType("XrSpatialRaycastResultDataANDROID *")
    public XrSpatialRaycastResultDataANDROID.Buffer raycastResults() { return nraycastResults(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentRaycastResultListANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID} value to the {@code type} field. */
    public XrSpatialComponentRaycastResultListANDROID type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentRaycastResultListANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialRaycastResultDataANDROID.Buffer} to the {@code raycastResults} field. */
    public XrSpatialComponentRaycastResultListANDROID raycastResults(@NativeType("XrSpatialRaycastResultDataANDROID *") XrSpatialRaycastResultDataANDROID.Buffer value) { nraycastResults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentRaycastResultListANDROID set(
        int type,
        long next,
        XrSpatialRaycastResultDataANDROID.Buffer raycastResults
    ) {
        type(type);
        next(next);
        raycastResults(raycastResults);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentRaycastResultListANDROID set(XrSpatialComponentRaycastResultListANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentRaycastResultListANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentRaycastResultListANDROID malloc() {
        return new XrSpatialComponentRaycastResultListANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentRaycastResultListANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentRaycastResultListANDROID calloc() {
        return new XrSpatialComponentRaycastResultListANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentRaycastResultListANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentRaycastResultListANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentRaycastResultListANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentRaycastResultListANDROID} instance for the specified memory address. */
    public static XrSpatialComponentRaycastResultListANDROID create(long address) {
        return new XrSpatialComponentRaycastResultListANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentRaycastResultListANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentRaycastResultListANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentRaycastResultListANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentRaycastResultListANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentRaycastResultListANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentRaycastResultListANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentRaycastResultListANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentRaycastResultListANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentRaycastResultListANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentRaycastResultListANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentRaycastResultListANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentRaycastResultListANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentRaycastResultListANDROID malloc(MemoryStack stack) {
        return new XrSpatialComponentRaycastResultListANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentRaycastResultListANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentRaycastResultListANDROID calloc(MemoryStack stack) {
        return new XrSpatialComponentRaycastResultListANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentRaycastResultListANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentRaycastResultListANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentRaycastResultListANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentRaycastResultListANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentRaycastResultListANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentRaycastResultListANDROID.NEXT); }
    /** Unsafe version of {@link #raycastResultCount}. */
    public static int nraycastResultCount(long struct) { return memGetInt(struct + XrSpatialComponentRaycastResultListANDROID.RAYCASTRESULTCOUNT); }
    /** Unsafe version of {@link #raycastResults}. */
    public static XrSpatialRaycastResultDataANDROID.Buffer nraycastResults(long struct) { return XrSpatialRaycastResultDataANDROID.create(memGetAddress(struct + XrSpatialComponentRaycastResultListANDROID.RAYCASTRESULTS), nraycastResultCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentRaycastResultListANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentRaycastResultListANDROID.NEXT, value); }
    /** Sets the specified value to the {@code raycastResultCount} field of the specified {@code struct}. */
    public static void nraycastResultCount(long struct, int value) { memPutInt(struct + XrSpatialComponentRaycastResultListANDROID.RAYCASTRESULTCOUNT, value); }
    /** Unsafe version of {@link #raycastResults(XrSpatialRaycastResultDataANDROID.Buffer) raycastResults}. */
    public static void nraycastResults(long struct, XrSpatialRaycastResultDataANDROID.Buffer value) { memPutAddress(struct + XrSpatialComponentRaycastResultListANDROID.RAYCASTRESULTS, value.address()); nraycastResultCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentRaycastResultListANDROID.RAYCASTRESULTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentRaycastResultListANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentRaycastResultListANDROID, Buffer> implements NativeResource {

        private static final XrSpatialComponentRaycastResultListANDROID ELEMENT_FACTORY = XrSpatialComponentRaycastResultListANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentRaycastResultListANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentRaycastResultListANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentRaycastResultListANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentRaycastResultListANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentRaycastResultListANDROID.nnext(address()); }
        /** @return the value of the {@code raycastResultCount} field. */
        @NativeType("uint32_t")
        public int raycastResultCount() { return XrSpatialComponentRaycastResultListANDROID.nraycastResultCount(address()); }
        /** @return a {@link XrSpatialRaycastResultDataANDROID.Buffer} view of the struct array pointed to by the {@code raycastResults} field. */
        @NativeType("XrSpatialRaycastResultDataANDROID *")
        public XrSpatialRaycastResultDataANDROID.Buffer raycastResults() { return XrSpatialComponentRaycastResultListANDROID.nraycastResults(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentRaycastResultListANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentRaycastResultListANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID} value to the {@code type} field. */
        public XrSpatialComponentRaycastResultListANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentRaycastResultListANDROID.Buffer next(@NativeType("void *") long value) { XrSpatialComponentRaycastResultListANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialRaycastResultDataANDROID.Buffer} to the {@code raycastResults} field. */
        public XrSpatialComponentRaycastResultListANDROID.Buffer raycastResults(@NativeType("XrSpatialRaycastResultDataANDROID *") XrSpatialRaycastResultDataANDROID.Buffer value) { XrSpatialComponentRaycastResultListANDROID.nraycastResults(address(), value); return this; }

    }

}