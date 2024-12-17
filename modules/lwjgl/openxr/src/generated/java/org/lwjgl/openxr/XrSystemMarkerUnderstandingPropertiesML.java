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
 * struct XrSystemMarkerUnderstandingPropertiesML {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsMarkerUnderstanding;
 * }}</pre>
 */
public class XrSystemMarkerUnderstandingPropertiesML extends Struct<XrSystemMarkerUnderstandingPropertiesML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSMARKERUNDERSTANDING;

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
        SUPPORTSMARKERUNDERSTANDING = layout.offsetof(2);
    }

    protected XrSystemMarkerUnderstandingPropertiesML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemMarkerUnderstandingPropertiesML create(long address, @Nullable ByteBuffer container) {
        return new XrSystemMarkerUnderstandingPropertiesML(address, container);
    }

    /**
     * Creates a {@code XrSystemMarkerUnderstandingPropertiesML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemMarkerUnderstandingPropertiesML(ByteBuffer container) {
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
    /** @return the value of the {@code supportsMarkerUnderstanding} field. */
    @NativeType("XrBool32")
    public boolean supportsMarkerUnderstanding() { return nsupportsMarkerUnderstanding(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemMarkerUnderstandingPropertiesML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML} value to the {@code type} field. */
    public XrSystemMarkerUnderstandingPropertiesML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemMarkerUnderstandingPropertiesML next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemMarkerUnderstandingPropertiesML set(
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
    public XrSystemMarkerUnderstandingPropertiesML set(XrSystemMarkerUnderstandingPropertiesML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemMarkerUnderstandingPropertiesML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemMarkerUnderstandingPropertiesML malloc() {
        return new XrSystemMarkerUnderstandingPropertiesML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemMarkerUnderstandingPropertiesML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemMarkerUnderstandingPropertiesML calloc() {
        return new XrSystemMarkerUnderstandingPropertiesML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemMarkerUnderstandingPropertiesML} instance allocated with {@link BufferUtils}. */
    public static XrSystemMarkerUnderstandingPropertiesML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemMarkerUnderstandingPropertiesML(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemMarkerUnderstandingPropertiesML} instance for the specified memory address. */
    public static XrSystemMarkerUnderstandingPropertiesML create(long address) {
        return new XrSystemMarkerUnderstandingPropertiesML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemMarkerUnderstandingPropertiesML createSafe(long address) {
        return address == NULL ? null : new XrSystemMarkerUnderstandingPropertiesML(address, null);
    }

    /**
     * Returns a new {@link XrSystemMarkerUnderstandingPropertiesML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerUnderstandingPropertiesML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerUnderstandingPropertiesML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerUnderstandingPropertiesML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerUnderstandingPropertiesML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerUnderstandingPropertiesML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemMarkerUnderstandingPropertiesML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerUnderstandingPropertiesML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemMarkerUnderstandingPropertiesML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemMarkerUnderstandingPropertiesML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemMarkerUnderstandingPropertiesML malloc(MemoryStack stack) {
        return new XrSystemMarkerUnderstandingPropertiesML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemMarkerUnderstandingPropertiesML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemMarkerUnderstandingPropertiesML calloc(MemoryStack stack) {
        return new XrSystemMarkerUnderstandingPropertiesML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemMarkerUnderstandingPropertiesML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerUnderstandingPropertiesML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerUnderstandingPropertiesML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerUnderstandingPropertiesML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemMarkerUnderstandingPropertiesML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemMarkerUnderstandingPropertiesML.NEXT); }
    /** Unsafe version of {@link #supportsMarkerUnderstanding}. */
    public static int nsupportsMarkerUnderstanding(long struct) { return memGetInt(struct + XrSystemMarkerUnderstandingPropertiesML.SUPPORTSMARKERUNDERSTANDING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemMarkerUnderstandingPropertiesML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemMarkerUnderstandingPropertiesML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemMarkerUnderstandingPropertiesML} structs. */
    public static class Buffer extends StructBuffer<XrSystemMarkerUnderstandingPropertiesML, Buffer> implements NativeResource {

        private static final XrSystemMarkerUnderstandingPropertiesML ELEMENT_FACTORY = XrSystemMarkerUnderstandingPropertiesML.create(-1L);

        /**
         * Creates a new {@code XrSystemMarkerUnderstandingPropertiesML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemMarkerUnderstandingPropertiesML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemMarkerUnderstandingPropertiesML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemMarkerUnderstandingPropertiesML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemMarkerUnderstandingPropertiesML.nnext(address()); }
        /** @return the value of the {@code supportsMarkerUnderstanding} field. */
        @NativeType("XrBool32")
        public boolean supportsMarkerUnderstanding() { return XrSystemMarkerUnderstandingPropertiesML.nsupportsMarkerUnderstanding(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemMarkerUnderstandingPropertiesML.Buffer type(@NativeType("XrStructureType") int value) { XrSystemMarkerUnderstandingPropertiesML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML} value to the {@code type} field. */
        public XrSystemMarkerUnderstandingPropertiesML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemMarkerUnderstandingPropertiesML.Buffer next(@NativeType("void *") long value) { XrSystemMarkerUnderstandingPropertiesML.nnext(address(), value); return this; }

    }

}