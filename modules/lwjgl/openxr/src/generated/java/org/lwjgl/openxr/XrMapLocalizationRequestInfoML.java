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
 * struct XrMapLocalizationRequestInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuidEXT XrUuidEXT} mapUuid;
 * }}</pre>
 */
public class XrMapLocalizationRequestInfoML extends Struct<XrMapLocalizationRequestInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MAPUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MAPUUID = layout.offsetof(2);
    }

    protected XrMapLocalizationRequestInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMapLocalizationRequestInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMapLocalizationRequestInfoML(address, container);
    }

    /**
     * Creates a {@code XrMapLocalizationRequestInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMapLocalizationRequestInfoML(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code mapUuid} field. */
    public XrUuidEXT mapUuid() { return nmapUuid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMapLocalizationRequestInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLLocalizationMap#XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML} value to the {@code type} field. */
    public XrMapLocalizationRequestInfoML type$Default() { return type(MLLocalizationMap.XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrMapLocalizationRequestInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code mapUuid} field. */
    public XrMapLocalizationRequestInfoML mapUuid(XrUuidEXT value) { nmapUuid(address(), value); return this; }
    /** Passes the {@code mapUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrMapLocalizationRequestInfoML mapUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(mapUuid()); return this; }

    /** Initializes this struct with the specified values. */
    public XrMapLocalizationRequestInfoML set(
        int type,
        long next,
        XrUuidEXT mapUuid
    ) {
        type(type);
        next(next);
        mapUuid(mapUuid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMapLocalizationRequestInfoML set(XrMapLocalizationRequestInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMapLocalizationRequestInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMapLocalizationRequestInfoML malloc() {
        return new XrMapLocalizationRequestInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMapLocalizationRequestInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMapLocalizationRequestInfoML calloc() {
        return new XrMapLocalizationRequestInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMapLocalizationRequestInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMapLocalizationRequestInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMapLocalizationRequestInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMapLocalizationRequestInfoML} instance for the specified memory address. */
    public static XrMapLocalizationRequestInfoML create(long address) {
        return new XrMapLocalizationRequestInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMapLocalizationRequestInfoML createSafe(long address) {
        return address == NULL ? null : new XrMapLocalizationRequestInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMapLocalizationRequestInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMapLocalizationRequestInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMapLocalizationRequestInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMapLocalizationRequestInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMapLocalizationRequestInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMapLocalizationRequestInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMapLocalizationRequestInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMapLocalizationRequestInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMapLocalizationRequestInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMapLocalizationRequestInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMapLocalizationRequestInfoML malloc(MemoryStack stack) {
        return new XrMapLocalizationRequestInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMapLocalizationRequestInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMapLocalizationRequestInfoML calloc(MemoryStack stack) {
        return new XrMapLocalizationRequestInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMapLocalizationRequestInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMapLocalizationRequestInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMapLocalizationRequestInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMapLocalizationRequestInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMapLocalizationRequestInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMapLocalizationRequestInfoML.NEXT); }
    /** Unsafe version of {@link #mapUuid}. */
    public static XrUuidEXT nmapUuid(long struct) { return XrUuidEXT.create(struct + XrMapLocalizationRequestInfoML.MAPUUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMapLocalizationRequestInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMapLocalizationRequestInfoML.NEXT, value); }
    /** Unsafe version of {@link #mapUuid(XrUuidEXT) mapUuid}. */
    public static void nmapUuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrMapLocalizationRequestInfoML.MAPUUID, XrUuidEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrMapLocalizationRequestInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMapLocalizationRequestInfoML, Buffer> implements NativeResource {

        private static final XrMapLocalizationRequestInfoML ELEMENT_FACTORY = XrMapLocalizationRequestInfoML.create(-1L);

        /**
         * Creates a new {@code XrMapLocalizationRequestInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMapLocalizationRequestInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMapLocalizationRequestInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMapLocalizationRequestInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMapLocalizationRequestInfoML.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code mapUuid} field. */
        public XrUuidEXT mapUuid() { return XrMapLocalizationRequestInfoML.nmapUuid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrMapLocalizationRequestInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMapLocalizationRequestInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLLocalizationMap#XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML} value to the {@code type} field. */
        public XrMapLocalizationRequestInfoML.Buffer type$Default() { return type(MLLocalizationMap.XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrMapLocalizationRequestInfoML.Buffer next(@NativeType("void const *") long value) { XrMapLocalizationRequestInfoML.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code mapUuid} field. */
        public XrMapLocalizationRequestInfoML.Buffer mapUuid(XrUuidEXT value) { XrMapLocalizationRequestInfoML.nmapUuid(address(), value); return this; }
        /** Passes the {@code mapUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrMapLocalizationRequestInfoML.Buffer mapUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(mapUuid()); return this; }

    }

}