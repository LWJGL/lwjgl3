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
 * struct XrTilePropertiesHintMETA {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t propertiesCount;
 *     {@link XrTilePropertiesMETA XrTilePropertiesMETA} const * properties;
 * }</code></pre>
 */
public class XrTilePropertiesHintMETA extends Struct<XrTilePropertiesHintMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PROPERTIESCOUNT,
        PROPERTIES;

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
        PROPERTIESCOUNT = layout.offsetof(2);
        PROPERTIES = layout.offsetof(3);
    }

    protected XrTilePropertiesHintMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTilePropertiesHintMETA create(long address, @Nullable ByteBuffer container) {
        return new XrTilePropertiesHintMETA(address, container);
    }

    /**
     * Creates a {@code XrTilePropertiesHintMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTilePropertiesHintMETA(ByteBuffer container) {
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
    /** @return the value of the {@code propertiesCount} field. */
    @NativeType("uint32_t")
    public int propertiesCount() { return npropertiesCount(address()); }
    /** @return a {@link XrTilePropertiesMETA.Buffer} view of the struct array pointed to by the {@code properties} field. */
    @NativeType("XrTilePropertiesMETA const *")
    public XrTilePropertiesMETA.Buffer properties() { return nproperties(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTilePropertiesHintMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METATilePropertiesHint#XR_TYPE_TILE_PROPERTIES_HINT_META TYPE_TILE_PROPERTIES_HINT_META} value to the {@code type} field. */
    public XrTilePropertiesHintMETA type$Default() { return type(METATilePropertiesHint.XR_TYPE_TILE_PROPERTIES_HINT_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrTilePropertiesHintMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrTilePropertiesMETA.Buffer} to the {@code properties} field. */
    public XrTilePropertiesHintMETA properties(@NativeType("XrTilePropertiesMETA const *") XrTilePropertiesMETA.Buffer value) { nproperties(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTilePropertiesHintMETA set(
        int type,
        long next,
        XrTilePropertiesMETA.Buffer properties
    ) {
        type(type);
        next(next);
        properties(properties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTilePropertiesHintMETA set(XrTilePropertiesHintMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTilePropertiesHintMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTilePropertiesHintMETA malloc() {
        return new XrTilePropertiesHintMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTilePropertiesHintMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTilePropertiesHintMETA calloc() {
        return new XrTilePropertiesHintMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTilePropertiesHintMETA} instance allocated with {@link BufferUtils}. */
    public static XrTilePropertiesHintMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTilePropertiesHintMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrTilePropertiesHintMETA} instance for the specified memory address. */
    public static XrTilePropertiesHintMETA create(long address) {
        return new XrTilePropertiesHintMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTilePropertiesHintMETA createSafe(long address) {
        return address == NULL ? null : new XrTilePropertiesHintMETA(address, null);
    }

    /**
     * Returns a new {@link XrTilePropertiesHintMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesHintMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTilePropertiesHintMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesHintMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTilePropertiesHintMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesHintMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTilePropertiesHintMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesHintMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTilePropertiesHintMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTilePropertiesHintMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTilePropertiesHintMETA malloc(MemoryStack stack) {
        return new XrTilePropertiesHintMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTilePropertiesHintMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTilePropertiesHintMETA calloc(MemoryStack stack) {
        return new XrTilePropertiesHintMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTilePropertiesHintMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesHintMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTilePropertiesHintMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTilePropertiesHintMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTilePropertiesHintMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTilePropertiesHintMETA.NEXT); }
    /** Unsafe version of {@link #propertiesCount}. */
    public static int npropertiesCount(long struct) { return memGetInt(struct + XrTilePropertiesHintMETA.PROPERTIESCOUNT); }
    /** Unsafe version of {@link #properties}. */
    public static XrTilePropertiesMETA.Buffer nproperties(long struct) { return XrTilePropertiesMETA.create(memGetAddress(struct + XrTilePropertiesHintMETA.PROPERTIES), npropertiesCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTilePropertiesHintMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTilePropertiesHintMETA.NEXT, value); }
    /** Sets the specified value to the {@code propertiesCount} field of the specified {@code struct}. */
    public static void npropertiesCount(long struct, int value) { memPutInt(struct + XrTilePropertiesHintMETA.PROPERTIESCOUNT, value); }
    /** Unsafe version of {@link #properties(XrTilePropertiesMETA.Buffer) properties}. */
    public static void nproperties(long struct, XrTilePropertiesMETA.Buffer value) { memPutAddress(struct + XrTilePropertiesHintMETA.PROPERTIES, value.address()); npropertiesCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrTilePropertiesHintMETA.PROPERTIES));
    }

    // -----------------------------------

    /** An array of {@link XrTilePropertiesHintMETA} structs. */
    public static class Buffer extends StructBuffer<XrTilePropertiesHintMETA, Buffer> implements NativeResource {

        private static final XrTilePropertiesHintMETA ELEMENT_FACTORY = XrTilePropertiesHintMETA.create(-1L);

        /**
         * Creates a new {@code XrTilePropertiesHintMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTilePropertiesHintMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTilePropertiesHintMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTilePropertiesHintMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTilePropertiesHintMETA.nnext(address()); }
        /** @return the value of the {@code propertiesCount} field. */
        @NativeType("uint32_t")
        public int propertiesCount() { return XrTilePropertiesHintMETA.npropertiesCount(address()); }
        /** @return a {@link XrTilePropertiesMETA.Buffer} view of the struct array pointed to by the {@code properties} field. */
        @NativeType("XrTilePropertiesMETA const *")
        public XrTilePropertiesMETA.Buffer properties() { return XrTilePropertiesHintMETA.nproperties(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTilePropertiesHintMETA.Buffer type(@NativeType("XrStructureType") int value) { XrTilePropertiesHintMETA.ntype(address(), value); return this; }
        /** Sets the {@link METATilePropertiesHint#XR_TYPE_TILE_PROPERTIES_HINT_META TYPE_TILE_PROPERTIES_HINT_META} value to the {@code type} field. */
        public XrTilePropertiesHintMETA.Buffer type$Default() { return type(METATilePropertiesHint.XR_TYPE_TILE_PROPERTIES_HINT_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrTilePropertiesHintMETA.Buffer next(@NativeType("void *") long value) { XrTilePropertiesHintMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrTilePropertiesMETA.Buffer} to the {@code properties} field. */
        public XrTilePropertiesHintMETA.Buffer properties(@NativeType("XrTilePropertiesMETA const *") XrTilePropertiesMETA.Buffer value) { XrTilePropertiesHintMETA.nproperties(address(), value); return this; }

    }

}