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
 * struct XrEventDataLocalizationChangedML {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrLocalizationMapStateML state;
 *     {@link XrLocalizationMapML XrLocalizationMapML} map;
 *     XrLocalizationMapConfidenceML confidence;
 *     XrLocalizationMapErrorFlagsML errorFlags;
 * }}</pre>
 */
public class XrEventDataLocalizationChangedML extends Struct<XrEventDataLocalizationChangedML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        STATE,
        MAP,
        CONFIDENCE,
        ERRORFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrLocalizationMapML.SIZEOF, XrLocalizationMapML.ALIGNOF),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        STATE = layout.offsetof(3);
        MAP = layout.offsetof(4);
        CONFIDENCE = layout.offsetof(5);
        ERRORFLAGS = layout.offsetof(6);
    }

    protected XrEventDataLocalizationChangedML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataLocalizationChangedML create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataLocalizationChangedML(address, container);
    }

    /**
     * Creates a {@code XrEventDataLocalizationChangedML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataLocalizationChangedML(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("XrLocalizationMapStateML")
    public int state() { return nstate(address()); }
    /** @return a {@link XrLocalizationMapML} view of the {@code map} field. */
    public XrLocalizationMapML map() { return nmap(address()); }
    /** @return the value of the {@code confidence} field. */
    @NativeType("XrLocalizationMapConfidenceML")
    public int confidence() { return nconfidence(address()); }
    /** @return the value of the {@code errorFlags} field. */
    @NativeType("XrLocalizationMapErrorFlagsML")
    public long errorFlags() { return nerrorFlags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataLocalizationChangedML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLLocalizationMap#XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML} value to the {@code type} field. */
    public XrEventDataLocalizationChangedML type$Default() { return type(MLLocalizationMap.XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataLocalizationChangedML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataLocalizationChangedML set(
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
    public XrEventDataLocalizationChangedML set(XrEventDataLocalizationChangedML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataLocalizationChangedML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataLocalizationChangedML malloc() {
        return new XrEventDataLocalizationChangedML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataLocalizationChangedML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataLocalizationChangedML calloc() {
        return new XrEventDataLocalizationChangedML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataLocalizationChangedML} instance allocated with {@link BufferUtils}. */
    public static XrEventDataLocalizationChangedML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataLocalizationChangedML(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataLocalizationChangedML} instance for the specified memory address. */
    public static XrEventDataLocalizationChangedML create(long address) {
        return new XrEventDataLocalizationChangedML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataLocalizationChangedML createSafe(long address) {
        return address == NULL ? null : new XrEventDataLocalizationChangedML(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataLocalizationChangedML}. */
    public static XrEventDataLocalizationChangedML create(XrEventDataBaseHeader value) {
        return new XrEventDataLocalizationChangedML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataLocalizationChangedML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataLocalizationChangedML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataLocalizationChangedML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataLocalizationChangedML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataLocalizationChangedML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataLocalizationChangedML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataLocalizationChangedML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataLocalizationChangedML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataLocalizationChangedML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataLocalizationChangedML.Buffer}. */
    public static XrEventDataLocalizationChangedML.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataLocalizationChangedML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataLocalizationChangedML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataLocalizationChangedML malloc(MemoryStack stack) {
        return new XrEventDataLocalizationChangedML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataLocalizationChangedML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataLocalizationChangedML calloc(MemoryStack stack) {
        return new XrEventDataLocalizationChangedML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataLocalizationChangedML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataLocalizationChangedML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataLocalizationChangedML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataLocalizationChangedML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataLocalizationChangedML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataLocalizationChangedML.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataLocalizationChangedML.SESSION); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrEventDataLocalizationChangedML.STATE); }
    /** Unsafe version of {@link #map}. */
    public static XrLocalizationMapML nmap(long struct) { return XrLocalizationMapML.create(struct + XrEventDataLocalizationChangedML.MAP); }
    /** Unsafe version of {@link #confidence}. */
    public static int nconfidence(long struct) { return memGetInt(struct + XrEventDataLocalizationChangedML.CONFIDENCE); }
    /** Unsafe version of {@link #errorFlags}. */
    public static long nerrorFlags(long struct) { return memGetLong(struct + XrEventDataLocalizationChangedML.ERRORFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataLocalizationChangedML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataLocalizationChangedML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataLocalizationChangedML} structs. */
    public static class Buffer extends StructBuffer<XrEventDataLocalizationChangedML, Buffer> implements NativeResource {

        private static final XrEventDataLocalizationChangedML ELEMENT_FACTORY = XrEventDataLocalizationChangedML.create(-1L);

        /**
         * Creates a new {@code XrEventDataLocalizationChangedML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataLocalizationChangedML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataLocalizationChangedML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataLocalizationChangedML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataLocalizationChangedML.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataLocalizationChangedML.nsession(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrLocalizationMapStateML")
        public int state() { return XrEventDataLocalizationChangedML.nstate(address()); }
        /** @return a {@link XrLocalizationMapML} view of the {@code map} field. */
        public XrLocalizationMapML map() { return XrEventDataLocalizationChangedML.nmap(address()); }
        /** @return the value of the {@code confidence} field. */
        @NativeType("XrLocalizationMapConfidenceML")
        public int confidence() { return XrEventDataLocalizationChangedML.nconfidence(address()); }
        /** @return the value of the {@code errorFlags} field. */
        @NativeType("XrLocalizationMapErrorFlagsML")
        public long errorFlags() { return XrEventDataLocalizationChangedML.nerrorFlags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataLocalizationChangedML.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataLocalizationChangedML.ntype(address(), value); return this; }
        /** Sets the {@link MLLocalizationMap#XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML} value to the {@code type} field. */
        public XrEventDataLocalizationChangedML.Buffer type$Default() { return type(MLLocalizationMap.XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataLocalizationChangedML.Buffer next(@NativeType("void const *") long value) { XrEventDataLocalizationChangedML.nnext(address(), value); return this; }

    }

}