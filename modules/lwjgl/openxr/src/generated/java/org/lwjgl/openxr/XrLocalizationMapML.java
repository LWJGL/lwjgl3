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

import static org.lwjgl.openxr.MLLocalizationMap.*;

/**
 * <pre>{@code
 * struct XrLocalizationMapML {
 *     XrStructureType type;
 *     void * next;
 *     char name[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML];
 *     {@link XrUuidEXT XrUuidEXT} mapUuid;
 *     XrLocalizationMapTypeML mapType;
 * }}</pre>
 */
public class XrLocalizationMapML extends Struct<XrLocalizationMapML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NAME,
        MAPUUID,
        MAPTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        MAPUUID = layout.offsetof(3);
        MAPTYPE = layout.offsetof(4);
    }

    protected XrLocalizationMapML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLocalizationMapML create(long address, @Nullable ByteBuffer container) {
        return new XrLocalizationMapML(address, container);
    }

    /**
     * Creates a {@code XrLocalizationMapML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLocalizationMapML(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML]")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link XrUuidEXT} view of the {@code mapUuid} field. */
    public XrUuidEXT mapUuid() { return nmapUuid(address()); }
    /** @return the value of the {@code mapType} field. */
    @NativeType("XrLocalizationMapTypeML")
    public int mapType() { return nmapType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLocalizationMapML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLLocalizationMap#XR_TYPE_LOCALIZATION_MAP_ML TYPE_LOCALIZATION_MAP_ML} value to the {@code type} field. */
    public XrLocalizationMapML type$Default() { return type(MLLocalizationMap.XR_TYPE_LOCALIZATION_MAP_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrLocalizationMapML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@code name} field. */
    public XrLocalizationMapML name(@NativeType("char[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML]") ByteBuffer value) { nname(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code mapUuid} field. */
    public XrLocalizationMapML mapUuid(XrUuidEXT value) { nmapUuid(address(), value); return this; }
    /** Passes the {@code mapUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrLocalizationMapML mapUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(mapUuid()); return this; }
    /** Sets the specified value to the {@code mapType} field. */
    public XrLocalizationMapML mapType(@NativeType("XrLocalizationMapTypeML") int value) { nmapType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLocalizationMapML set(
        int type,
        long next,
        ByteBuffer name,
        XrUuidEXT mapUuid,
        int mapType
    ) {
        type(type);
        next(next);
        name(name);
        mapUuid(mapUuid);
        mapType(mapType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLocalizationMapML set(XrLocalizationMapML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLocalizationMapML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLocalizationMapML malloc() {
        return new XrLocalizationMapML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLocalizationMapML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLocalizationMapML calloc() {
        return new XrLocalizationMapML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLocalizationMapML} instance allocated with {@link BufferUtils}. */
    public static XrLocalizationMapML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLocalizationMapML(memAddress(container), container);
    }

    /** Returns a new {@code XrLocalizationMapML} instance for the specified memory address. */
    public static XrLocalizationMapML create(long address) {
        return new XrLocalizationMapML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLocalizationMapML createSafe(long address) {
        return address == NULL ? null : new XrLocalizationMapML(address, null);
    }

    /**
     * Returns a new {@link XrLocalizationMapML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLocalizationMapML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLocalizationMapML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLocalizationMapML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLocalizationMapML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLocalizationMapML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLocalizationMapML malloc(MemoryStack stack) {
        return new XrLocalizationMapML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLocalizationMapML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLocalizationMapML calloc(MemoryStack stack) {
        return new XrLocalizationMapML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLocalizationMapML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLocalizationMapML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrLocalizationMapML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLocalizationMapML.NEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + XrLocalizationMapML.NAME, XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + XrLocalizationMapML.NAME); }
    /** Unsafe version of {@link #mapUuid}. */
    public static XrUuidEXT nmapUuid(long struct) { return XrUuidEXT.create(struct + XrLocalizationMapML.MAPUUID); }
    /** Unsafe version of {@link #mapType}. */
    public static int nmapType(long struct) { return memGetInt(struct + XrLocalizationMapML.MAPTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrLocalizationMapML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLocalizationMapML.NEXT, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML);
        }
        memCopy(memAddress(value), struct + XrLocalizationMapML.NAME, value.remaining());
    }
    /** Unsafe version of {@link #mapUuid(XrUuidEXT) mapUuid}. */
    public static void nmapUuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrLocalizationMapML.MAPUUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #mapType(int) mapType}. */
    public static void nmapType(long struct, int value) { memPutInt(struct + XrLocalizationMapML.MAPTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrLocalizationMapML} structs. */
    public static class Buffer extends StructBuffer<XrLocalizationMapML, Buffer> implements NativeResource {

        private static final XrLocalizationMapML ELEMENT_FACTORY = XrLocalizationMapML.create(-1L);

        /**
         * Creates a new {@code XrLocalizationMapML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLocalizationMapML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLocalizationMapML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLocalizationMapML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrLocalizationMapML.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML]")
        public ByteBuffer name() { return XrLocalizationMapML.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML]")
        public String nameString() { return XrLocalizationMapML.nnameString(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code mapUuid} field. */
        public XrUuidEXT mapUuid() { return XrLocalizationMapML.nmapUuid(address()); }
        /** @return the value of the {@code mapType} field. */
        @NativeType("XrLocalizationMapTypeML")
        public int mapType() { return XrLocalizationMapML.nmapType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLocalizationMapML.Buffer type(@NativeType("XrStructureType") int value) { XrLocalizationMapML.ntype(address(), value); return this; }
        /** Sets the {@link MLLocalizationMap#XR_TYPE_LOCALIZATION_MAP_ML TYPE_LOCALIZATION_MAP_ML} value to the {@code type} field. */
        public XrLocalizationMapML.Buffer type$Default() { return type(MLLocalizationMap.XR_TYPE_LOCALIZATION_MAP_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrLocalizationMapML.Buffer next(@NativeType("void *") long value) { XrLocalizationMapML.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@code name} field. */
        public XrLocalizationMapML.Buffer name(@NativeType("char[XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML]") ByteBuffer value) { XrLocalizationMapML.nname(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code mapUuid} field. */
        public XrLocalizationMapML.Buffer mapUuid(XrUuidEXT value) { XrLocalizationMapML.nmapUuid(address(), value); return this; }
        /** Passes the {@code mapUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrLocalizationMapML.Buffer mapUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(mapUuid()); return this; }
        /** Sets the specified value to the {@code mapType} field. */
        public XrLocalizationMapML.Buffer mapType(@NativeType("XrLocalizationMapTypeML") int value) { XrLocalizationMapML.nmapType(address(), value); return this; }

    }

}