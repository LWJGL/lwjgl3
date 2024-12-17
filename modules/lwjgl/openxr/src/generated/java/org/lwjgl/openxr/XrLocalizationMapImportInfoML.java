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
 * <pre>{@code
 * struct XrLocalizationMapImportInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t size;
 *     char * data;
 * }}</pre>
 */
public class XrLocalizationMapImportInfoML extends Struct<XrLocalizationMapImportInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SIZE,
        DATA;

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
        SIZE = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected XrLocalizationMapImportInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLocalizationMapImportInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrLocalizationMapImportInfoML(address, container);
    }

    /**
     * Creates a {@code XrLocalizationMapImportInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLocalizationMapImportInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("char *")
    public ByteBuffer data() { return ndata(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLocalizationMapImportInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLLocalizationMap#XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML} value to the {@code type} field. */
    public XrLocalizationMapImportInfoML type$Default() { return type(MLLocalizationMap.XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrLocalizationMapImportInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public XrLocalizationMapImportInfoML data(@NativeType("char *") ByteBuffer value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLocalizationMapImportInfoML set(
        int type,
        long next,
        ByteBuffer data
    ) {
        type(type);
        next(next);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLocalizationMapImportInfoML set(XrLocalizationMapImportInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLocalizationMapImportInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLocalizationMapImportInfoML malloc() {
        return new XrLocalizationMapImportInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLocalizationMapImportInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLocalizationMapImportInfoML calloc() {
        return new XrLocalizationMapImportInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLocalizationMapImportInfoML} instance allocated with {@link BufferUtils}. */
    public static XrLocalizationMapImportInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLocalizationMapImportInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrLocalizationMapImportInfoML} instance for the specified memory address. */
    public static XrLocalizationMapImportInfoML create(long address) {
        return new XrLocalizationMapImportInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLocalizationMapImportInfoML createSafe(long address) {
        return address == NULL ? null : new XrLocalizationMapImportInfoML(address, null);
    }

    /**
     * Returns a new {@link XrLocalizationMapImportInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapImportInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLocalizationMapImportInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapImportInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLocalizationMapImportInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapImportInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLocalizationMapImportInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapImportInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLocalizationMapImportInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLocalizationMapImportInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLocalizationMapImportInfoML malloc(MemoryStack stack) {
        return new XrLocalizationMapImportInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLocalizationMapImportInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLocalizationMapImportInfoML calloc(MemoryStack stack) {
        return new XrLocalizationMapImportInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLocalizationMapImportInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapImportInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLocalizationMapImportInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLocalizationMapImportInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrLocalizationMapImportInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLocalizationMapImportInfoML.NEXT); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + XrLocalizationMapImportInfoML.SIZE); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + XrLocalizationMapImportInfoML.DATA), nsize(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrLocalizationMapImportInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLocalizationMapImportInfoML.NEXT, value); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + XrLocalizationMapImportInfoML.SIZE, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + XrLocalizationMapImportInfoML.DATA, memAddress(value)); nsize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrLocalizationMapImportInfoML.DATA));
    }

    // -----------------------------------

    /** An array of {@link XrLocalizationMapImportInfoML} structs. */
    public static class Buffer extends StructBuffer<XrLocalizationMapImportInfoML, Buffer> implements NativeResource {

        private static final XrLocalizationMapImportInfoML ELEMENT_FACTORY = XrLocalizationMapImportInfoML.create(-1L);

        /**
         * Creates a new {@code XrLocalizationMapImportInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLocalizationMapImportInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLocalizationMapImportInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLocalizationMapImportInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrLocalizationMapImportInfoML.nnext(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return XrLocalizationMapImportInfoML.nsize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("char *")
        public ByteBuffer data() { return XrLocalizationMapImportInfoML.ndata(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLocalizationMapImportInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrLocalizationMapImportInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLLocalizationMap#XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML} value to the {@code type} field. */
        public XrLocalizationMapImportInfoML.Buffer type$Default() { return type(MLLocalizationMap.XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrLocalizationMapImportInfoML.Buffer next(@NativeType("void const *") long value) { XrLocalizationMapImportInfoML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public XrLocalizationMapImportInfoML.Buffer data(@NativeType("char *") ByteBuffer value) { XrLocalizationMapImportInfoML.ndata(address(), value); return this; }

    }

}