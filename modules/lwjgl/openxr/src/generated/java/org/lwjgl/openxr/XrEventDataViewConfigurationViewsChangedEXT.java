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
 * struct XrEventDataViewConfigurationViewsChangedEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSystemId systemId;
 *     XrViewConfigurationType viewConfigurationType;
 * }}</pre>
 */
public class XrEventDataViewConfigurationViewsChangedEXT extends Struct<XrEventDataViewConfigurationViewsChangedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SYSTEMID,
        VIEWCONFIGURATIONTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SYSTEMID = layout.offsetof(2);
        VIEWCONFIGURATIONTYPE = layout.offsetof(3);
    }

    protected XrEventDataViewConfigurationViewsChangedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataViewConfigurationViewsChangedEXT create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataViewConfigurationViewsChangedEXT(address, container);
    }

    /**
     * Creates a {@code XrEventDataViewConfigurationViewsChangedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataViewConfigurationViewsChangedEXT(ByteBuffer container) {
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
    /** @return the value of the {@code systemId} field. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }
    /** @return the value of the {@code viewConfigurationType} field. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataViewConfigurationViewsChangedEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTViewConfigurationViewsChange#XR_TYPE_EVENT_DATA_VIEW_CONFIGURATION_VIEWS_CHANGED_EXT TYPE_EVENT_DATA_VIEW_CONFIGURATION_VIEWS_CHANGED_EXT} value to the {@code type} field. */
    public XrEventDataViewConfigurationViewsChangedEXT type$Default() { return type(EXTViewConfigurationViewsChange.XR_TYPE_EVENT_DATA_VIEW_CONFIGURATION_VIEWS_CHANGED_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataViewConfigurationViewsChangedEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataViewConfigurationViewsChangedEXT set(
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
    public XrEventDataViewConfigurationViewsChangedEXT set(XrEventDataViewConfigurationViewsChangedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataViewConfigurationViewsChangedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataViewConfigurationViewsChangedEXT malloc() {
        return new XrEventDataViewConfigurationViewsChangedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataViewConfigurationViewsChangedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataViewConfigurationViewsChangedEXT calloc() {
        return new XrEventDataViewConfigurationViewsChangedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataViewConfigurationViewsChangedEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataViewConfigurationViewsChangedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataViewConfigurationViewsChangedEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataViewConfigurationViewsChangedEXT} instance for the specified memory address. */
    public static XrEventDataViewConfigurationViewsChangedEXT create(long address) {
        return new XrEventDataViewConfigurationViewsChangedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataViewConfigurationViewsChangedEXT createSafe(long address) {
        return address == NULL ? null : new XrEventDataViewConfigurationViewsChangedEXT(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataViewConfigurationViewsChangedEXT}. */
    public static XrEventDataViewConfigurationViewsChangedEXT create(XrEventDataBaseHeader value) {
        return new XrEventDataViewConfigurationViewsChangedEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataViewConfigurationViewsChangedEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataViewConfigurationViewsChangedEXT.Buffer}. */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataViewConfigurationViewsChangedEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataViewConfigurationViewsChangedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataViewConfigurationViewsChangedEXT malloc(MemoryStack stack) {
        return new XrEventDataViewConfigurationViewsChangedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataViewConfigurationViewsChangedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataViewConfigurationViewsChangedEXT calloc(MemoryStack stack) {
        return new XrEventDataViewConfigurationViewsChangedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataViewConfigurationViewsChangedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataViewConfigurationViewsChangedEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataViewConfigurationViewsChangedEXT.NEXT); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return memGetLong(struct + XrEventDataViewConfigurationViewsChangedEXT.SYSTEMID); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return memGetInt(struct + XrEventDataViewConfigurationViewsChangedEXT.VIEWCONFIGURATIONTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataViewConfigurationViewsChangedEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataViewConfigurationViewsChangedEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataViewConfigurationViewsChangedEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataViewConfigurationViewsChangedEXT, Buffer> implements NativeResource {

        private static final XrEventDataViewConfigurationViewsChangedEXT ELEMENT_FACTORY = XrEventDataViewConfigurationViewsChangedEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataViewConfigurationViewsChangedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataViewConfigurationViewsChangedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataViewConfigurationViewsChangedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataViewConfigurationViewsChangedEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataViewConfigurationViewsChangedEXT.nnext(address()); }
        /** @return the value of the {@code systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrEventDataViewConfigurationViewsChangedEXT.nsystemId(address()); }
        /** @return the value of the {@code viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrEventDataViewConfigurationViewsChangedEXT.nviewConfigurationType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataViewConfigurationViewsChangedEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataViewConfigurationViewsChangedEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTViewConfigurationViewsChange#XR_TYPE_EVENT_DATA_VIEW_CONFIGURATION_VIEWS_CHANGED_EXT TYPE_EVENT_DATA_VIEW_CONFIGURATION_VIEWS_CHANGED_EXT} value to the {@code type} field. */
        public XrEventDataViewConfigurationViewsChangedEXT.Buffer type$Default() { return type(EXTViewConfigurationViewsChange.XR_TYPE_EVENT_DATA_VIEW_CONFIGURATION_VIEWS_CHANGED_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataViewConfigurationViewsChangedEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataViewConfigurationViewsChangedEXT.nnext(address(), value); return this; }

    }

}