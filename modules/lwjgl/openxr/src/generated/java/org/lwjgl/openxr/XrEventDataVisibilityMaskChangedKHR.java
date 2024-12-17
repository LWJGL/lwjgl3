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
 * struct XrEventDataVisibilityMaskChangedKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrViewConfigurationType viewConfigurationType;
 *     uint32_t viewIndex;
 * }}</pre>
 */
public class XrEventDataVisibilityMaskChangedKHR extends Struct<XrEventDataVisibilityMaskChangedKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        VIEWCONFIGURATIONTYPE,
        VIEWINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        VIEWCONFIGURATIONTYPE = layout.offsetof(3);
        VIEWINDEX = layout.offsetof(4);
    }

    protected XrEventDataVisibilityMaskChangedKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataVisibilityMaskChangedKHR create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataVisibilityMaskChangedKHR(address, container);
    }

    /**
     * Creates a {@code XrEventDataVisibilityMaskChangedKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataVisibilityMaskChangedKHR(ByteBuffer container) {
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
    /** @return the value of the {@code session} field. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** @return the value of the {@code viewConfigurationType} field. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** @return the value of the {@code viewIndex} field. */
    @NativeType("uint32_t")
    public int viewIndex() { return nviewIndex(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataVisibilityMaskChangedKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVisibilityMask#XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR} value to the {@code type} field. */
    public XrEventDataVisibilityMaskChangedKHR type$Default() { return type(KHRVisibilityMask.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataVisibilityMaskChangedKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVisibilityMaskChangedKHR set(
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
    public XrEventDataVisibilityMaskChangedKHR set(XrEventDataVisibilityMaskChangedKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataVisibilityMaskChangedKHR malloc() {
        return new XrEventDataVisibilityMaskChangedKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataVisibilityMaskChangedKHR calloc() {
        return new XrEventDataVisibilityMaskChangedKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated with {@link BufferUtils}. */
    public static XrEventDataVisibilityMaskChangedKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataVisibilityMaskChangedKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance for the specified memory address. */
    public static XrEventDataVisibilityMaskChangedKHR create(long address) {
        return new XrEventDataVisibilityMaskChangedKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataVisibilityMaskChangedKHR createSafe(long address) {
        return address == NULL ? null : new XrEventDataVisibilityMaskChangedKHR(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataVisibilityMaskChangedKHR}. */
    public static XrEventDataVisibilityMaskChangedKHR create(XrEventDataBaseHeader value) {
        return new XrEventDataVisibilityMaskChangedKHR(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataVisibilityMaskChangedKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataVisibilityMaskChangedKHR.Buffer}. */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataVisibilityMaskChangedKHR.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVisibilityMaskChangedKHR malloc(MemoryStack stack) {
        return new XrEventDataVisibilityMaskChangedKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVisibilityMaskChangedKHR calloc(MemoryStack stack) {
        return new XrEventDataVisibilityMaskChangedKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataVisibilityMaskChangedKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVisibilityMaskChangedKHR.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataVisibilityMaskChangedKHR.SESSION); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return memGetInt(struct + XrEventDataVisibilityMaskChangedKHR.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #viewIndex}. */
    public static int nviewIndex(long struct) { return memGetInt(struct + XrEventDataVisibilityMaskChangedKHR.VIEWINDEX); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataVisibilityMaskChangedKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVisibilityMaskChangedKHR.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataVisibilityMaskChangedKHR} structs. */
    public static class Buffer extends StructBuffer<XrEventDataVisibilityMaskChangedKHR, Buffer> implements NativeResource {

        private static final XrEventDataVisibilityMaskChangedKHR ELEMENT_FACTORY = XrEventDataVisibilityMaskChangedKHR.create(-1L);

        /**
         * Creates a new {@code XrEventDataVisibilityMaskChangedKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataVisibilityMaskChangedKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataVisibilityMaskChangedKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVisibilityMaskChangedKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVisibilityMaskChangedKHR.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataVisibilityMaskChangedKHR.nsession(address()); }
        /** @return the value of the {@code viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrEventDataVisibilityMaskChangedKHR.nviewConfigurationType(address()); }
        /** @return the value of the {@code viewIndex} field. */
        @NativeType("uint32_t")
        public int viewIndex() { return XrEventDataVisibilityMaskChangedKHR.nviewIndex(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVisibilityMaskChangedKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVisibilityMask#XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR} value to the {@code type} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer type$Default() { return type(KHRVisibilityMask.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer next(@NativeType("void const *") long value) { XrEventDataVisibilityMaskChangedKHR.nnext(address(), value); return this; }

    }

}