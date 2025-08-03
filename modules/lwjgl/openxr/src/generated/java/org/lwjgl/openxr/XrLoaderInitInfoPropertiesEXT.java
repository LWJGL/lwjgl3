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
 * struct XrLoaderInitInfoPropertiesEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t propertyValueCount;
 *     {@link XrLoaderInitPropertyValueEXT XrLoaderInitPropertyValueEXT} const * propertyValues;
 * }}</pre>
 */
public class XrLoaderInitInfoPropertiesEXT extends Struct<XrLoaderInitInfoPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PROPERTYVALUECOUNT,
        PROPERTYVALUES;

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
        PROPERTYVALUECOUNT = layout.offsetof(2);
        PROPERTYVALUES = layout.offsetof(3);
    }

    protected XrLoaderInitInfoPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLoaderInitInfoPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrLoaderInitInfoPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrLoaderInitInfoPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLoaderInitInfoPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code propertyValueCount} field. */
    @NativeType("uint32_t")
    public int propertyValueCount() { return npropertyValueCount(address()); }
    /** @return a {@link XrLoaderInitPropertyValueEXT.Buffer} view of the struct array pointed to by the {@code propertyValues} field. */
    @NativeType("XrLoaderInitPropertyValueEXT const *")
    public XrLoaderInitPropertyValueEXT.Buffer propertyValues() { return npropertyValues(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLoaderInitInfoPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTLoaderInitProperties#XR_TYPE_LOADER_INIT_INFO_PROPERTIES_EXT TYPE_LOADER_INIT_INFO_PROPERTIES_EXT} value to the {@code type} field. */
    public XrLoaderInitInfoPropertiesEXT type$Default() { return type(EXTLoaderInitProperties.XR_TYPE_LOADER_INIT_INFO_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrLoaderInitInfoPropertiesEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrLoaderInitPropertyValueEXT.Buffer} to the {@code propertyValues} field. */
    public XrLoaderInitInfoPropertiesEXT propertyValues(@NativeType("XrLoaderInitPropertyValueEXT const *") XrLoaderInitPropertyValueEXT.Buffer value) { npropertyValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLoaderInitInfoPropertiesEXT set(
        int type,
        long next,
        XrLoaderInitPropertyValueEXT.Buffer propertyValues
    ) {
        type(type);
        next(next);
        propertyValues(propertyValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLoaderInitInfoPropertiesEXT set(XrLoaderInitInfoPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLoaderInitInfoPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLoaderInitInfoPropertiesEXT malloc() {
        return new XrLoaderInitInfoPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLoaderInitInfoPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLoaderInitInfoPropertiesEXT calloc() {
        return new XrLoaderInitInfoPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLoaderInitInfoPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrLoaderInitInfoPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLoaderInitInfoPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrLoaderInitInfoPropertiesEXT} instance for the specified memory address. */
    public static XrLoaderInitInfoPropertiesEXT create(long address) {
        return new XrLoaderInitInfoPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrLoaderInitInfoPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrLoaderInitInfoPropertiesEXT(address, null);
    }

    /** Downcasts the specified {@code XrLoaderInitInfoBaseHeaderKHR} instance to {@code XrLoaderInitInfoPropertiesEXT}. */
    public static XrLoaderInitInfoPropertiesEXT create(XrLoaderInitInfoBaseHeaderKHR value) {
        return new XrLoaderInitInfoPropertiesEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrLoaderInitInfoPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLoaderInitInfoPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrLoaderInitInfoPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrLoaderInitInfoBaseHeaderKHR.Buffer} instance to {@code XrLoaderInitInfoPropertiesEXT.Buffer}. */
    public static XrLoaderInitInfoPropertiesEXT.Buffer create(XrLoaderInitInfoBaseHeaderKHR.Buffer value) {
        return new XrLoaderInitInfoPropertiesEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrLoaderInitInfoPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitInfoPropertiesEXT malloc(MemoryStack stack) {
        return new XrLoaderInitInfoPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLoaderInitInfoPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitInfoPropertiesEXT calloc(MemoryStack stack) {
        return new XrLoaderInitInfoPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrLoaderInitInfoPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLoaderInitInfoPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #propertyValueCount}. */
    public static int npropertyValueCount(long struct) { return memGetInt(struct + XrLoaderInitInfoPropertiesEXT.PROPERTYVALUECOUNT); }
    /** Unsafe version of {@link #propertyValues}. */
    public static XrLoaderInitPropertyValueEXT.Buffer npropertyValues(long struct) { return XrLoaderInitPropertyValueEXT.create(memGetAddress(struct + XrLoaderInitInfoPropertiesEXT.PROPERTYVALUES), npropertyValueCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrLoaderInitInfoPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLoaderInitInfoPropertiesEXT.NEXT, value); }
    /** Sets the specified value to the {@code propertyValueCount} field of the specified {@code struct}. */
    public static void npropertyValueCount(long struct, int value) { memPutInt(struct + XrLoaderInitInfoPropertiesEXT.PROPERTYVALUECOUNT, value); }
    /** Unsafe version of {@link #propertyValues(XrLoaderInitPropertyValueEXT.Buffer) propertyValues}. */
    public static void npropertyValues(long struct, XrLoaderInitPropertyValueEXT.Buffer value) { memPutAddress(struct + XrLoaderInitInfoPropertiesEXT.PROPERTYVALUES, value.address()); npropertyValueCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int propertyValueCount = npropertyValueCount(struct);
        long propertyValues = memGetAddress(struct + XrLoaderInitInfoPropertiesEXT.PROPERTYVALUES);
        check(propertyValues);
        validate(propertyValues, propertyValueCount, XrLoaderInitPropertyValueEXT.SIZEOF, XrLoaderInitPropertyValueEXT::validate);
    }

    // -----------------------------------

    /** An array of {@link XrLoaderInitInfoPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrLoaderInitInfoPropertiesEXT, Buffer> implements NativeResource {

        private static final XrLoaderInitInfoPropertiesEXT ELEMENT_FACTORY = XrLoaderInitInfoPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrLoaderInitInfoPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLoaderInitInfoPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLoaderInitInfoPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLoaderInitInfoPropertiesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrLoaderInitInfoPropertiesEXT.nnext(address()); }
        /** @return the value of the {@code propertyValueCount} field. */
        @NativeType("uint32_t")
        public int propertyValueCount() { return XrLoaderInitInfoPropertiesEXT.npropertyValueCount(address()); }
        /** @return a {@link XrLoaderInitPropertyValueEXT.Buffer} view of the struct array pointed to by the {@code propertyValues} field. */
        @NativeType("XrLoaderInitPropertyValueEXT const *")
        public XrLoaderInitPropertyValueEXT.Buffer propertyValues() { return XrLoaderInitInfoPropertiesEXT.npropertyValues(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLoaderInitInfoPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrLoaderInitInfoPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTLoaderInitProperties#XR_TYPE_LOADER_INIT_INFO_PROPERTIES_EXT TYPE_LOADER_INIT_INFO_PROPERTIES_EXT} value to the {@code type} field. */
        public XrLoaderInitInfoPropertiesEXT.Buffer type$Default() { return type(EXTLoaderInitProperties.XR_TYPE_LOADER_INIT_INFO_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrLoaderInitInfoPropertiesEXT.Buffer next(@NativeType("void const *") long value) { XrLoaderInitInfoPropertiesEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrLoaderInitPropertyValueEXT.Buffer} to the {@code propertyValues} field. */
        public XrLoaderInitInfoPropertiesEXT.Buffer propertyValues(@NativeType("XrLoaderInitPropertyValueEXT const *") XrLoaderInitPropertyValueEXT.Buffer value) { XrLoaderInitInfoPropertiesEXT.npropertyValues(address(), value); return this; }

    }

}