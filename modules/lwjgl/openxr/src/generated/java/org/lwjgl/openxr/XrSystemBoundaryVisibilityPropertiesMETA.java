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
 * struct XrSystemBoundaryVisibilityPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsBoundaryVisibility;
 * }}</pre>
 */
public class XrSystemBoundaryVisibilityPropertiesMETA extends Struct<XrSystemBoundaryVisibilityPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSBOUNDARYVISIBILITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSBOUNDARYVISIBILITY = layout.offsetof(2);
    }

    protected XrSystemBoundaryVisibilityPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemBoundaryVisibilityPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemBoundaryVisibilityPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemBoundaryVisibilityPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemBoundaryVisibilityPropertiesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code supportsBoundaryVisibility} field. */
    @NativeType("XrBool32")
    public boolean supportsBoundaryVisibility() { return nsupportsBoundaryVisibility(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemBoundaryVisibilityPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METABoundaryVisibility#XR_TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemBoundaryVisibilityPropertiesMETA type$Default() { return type(METABoundaryVisibility.XR_TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemBoundaryVisibilityPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemBoundaryVisibilityPropertiesMETA set(
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
    public XrSystemBoundaryVisibilityPropertiesMETA set(XrSystemBoundaryVisibilityPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemBoundaryVisibilityPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemBoundaryVisibilityPropertiesMETA malloc() {
        return new XrSystemBoundaryVisibilityPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemBoundaryVisibilityPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemBoundaryVisibilityPropertiesMETA calloc() {
        return new XrSystemBoundaryVisibilityPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemBoundaryVisibilityPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemBoundaryVisibilityPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemBoundaryVisibilityPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemBoundaryVisibilityPropertiesMETA} instance for the specified memory address. */
    public static XrSystemBoundaryVisibilityPropertiesMETA create(long address) {
        return new XrSystemBoundaryVisibilityPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemBoundaryVisibilityPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemBoundaryVisibilityPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemBoundaryVisibilityPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemBoundaryVisibilityPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemBoundaryVisibilityPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemBoundaryVisibilityPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemBoundaryVisibilityPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBoundaryVisibilityPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemBoundaryVisibilityPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemBoundaryVisibilityPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsBoundaryVisibility}. */
    public static int nsupportsBoundaryVisibility(long struct) { return memGetInt(struct + XrSystemBoundaryVisibilityPropertiesMETA.SUPPORTSBOUNDARYVISIBILITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemBoundaryVisibilityPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemBoundaryVisibilityPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemBoundaryVisibilityPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemBoundaryVisibilityPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemBoundaryVisibilityPropertiesMETA ELEMENT_FACTORY = XrSystemBoundaryVisibilityPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemBoundaryVisibilityPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemBoundaryVisibilityPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemBoundaryVisibilityPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemBoundaryVisibilityPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemBoundaryVisibilityPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsBoundaryVisibility} field. */
        @NativeType("XrBool32")
        public boolean supportsBoundaryVisibility() { return XrSystemBoundaryVisibilityPropertiesMETA.nsupportsBoundaryVisibility(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemBoundaryVisibilityPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemBoundaryVisibilityPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METABoundaryVisibility#XR_TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemBoundaryVisibilityPropertiesMETA.Buffer type$Default() { return type(METABoundaryVisibility.XR_TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemBoundaryVisibilityPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemBoundaryVisibilityPropertiesMETA.nnext(address(), value); return this; }

    }

}