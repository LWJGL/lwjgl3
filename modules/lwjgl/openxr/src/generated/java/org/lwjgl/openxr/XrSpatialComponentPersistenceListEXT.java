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
 * struct XrSpatialComponentPersistenceListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t persistDataCount;
 *     {@link XrSpatialPersistenceDataEXT XrSpatialPersistenceDataEXT} * persistData;
 * }</code></pre>
 */
public class XrSpatialComponentPersistenceListEXT extends Struct<XrSpatialComponentPersistenceListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PERSISTDATACOUNT,
        PERSISTDATA;

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
        PERSISTDATACOUNT = layout.offsetof(2);
        PERSISTDATA = layout.offsetof(3);
    }

    protected XrSpatialComponentPersistenceListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentPersistenceListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentPersistenceListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentPersistenceListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentPersistenceListEXT(ByteBuffer container) {
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
    /** @return the value of the {@code persistDataCount} field. */
    @NativeType("uint32_t")
    public int persistDataCount() { return npersistDataCount(address()); }
    /** @return a {@link XrSpatialPersistenceDataEXT.Buffer} view of the struct array pointed to by the {@code persistData} field. */
    @NativeType("XrSpatialPersistenceDataEXT *")
    public XrSpatialPersistenceDataEXT.Buffer persistData() { return npersistData(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentPersistenceListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentPersistenceListEXT type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentPersistenceListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialPersistenceDataEXT.Buffer} to the {@code persistData} field. */
    public XrSpatialComponentPersistenceListEXT persistData(@NativeType("XrSpatialPersistenceDataEXT *") XrSpatialPersistenceDataEXT.Buffer value) { npersistData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentPersistenceListEXT set(
        int type,
        long next,
        XrSpatialPersistenceDataEXT.Buffer persistData
    ) {
        type(type);
        next(next);
        persistData(persistData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentPersistenceListEXT set(XrSpatialComponentPersistenceListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentPersistenceListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPersistenceListEXT malloc() {
        return new XrSpatialComponentPersistenceListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPersistenceListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPersistenceListEXT calloc() {
        return new XrSpatialComponentPersistenceListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPersistenceListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentPersistenceListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentPersistenceListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentPersistenceListEXT} instance for the specified memory address. */
    public static XrSpatialComponentPersistenceListEXT create(long address) {
        return new XrSpatialComponentPersistenceListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentPersistenceListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentPersistenceListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPersistenceListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPersistenceListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPersistenceListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPersistenceListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPersistenceListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPersistenceListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentPersistenceListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPersistenceListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentPersistenceListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentPersistenceListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPersistenceListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentPersistenceListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentPersistenceListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPersistenceListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentPersistenceListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPersistenceListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPersistenceListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPersistenceListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPersistenceListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentPersistenceListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentPersistenceListEXT.NEXT); }
    /** Unsafe version of {@link #persistDataCount}. */
    public static int npersistDataCount(long struct) { return memGetInt(struct + XrSpatialComponentPersistenceListEXT.PERSISTDATACOUNT); }
    /** Unsafe version of {@link #persistData}. */
    public static XrSpatialPersistenceDataEXT.Buffer npersistData(long struct) { return XrSpatialPersistenceDataEXT.create(memGetAddress(struct + XrSpatialComponentPersistenceListEXT.PERSISTDATA), npersistDataCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentPersistenceListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentPersistenceListEXT.NEXT, value); }
    /** Sets the specified value to the {@code persistDataCount} field of the specified {@code struct}. */
    public static void npersistDataCount(long struct, int value) { memPutInt(struct + XrSpatialComponentPersistenceListEXT.PERSISTDATACOUNT, value); }
    /** Unsafe version of {@link #persistData(XrSpatialPersistenceDataEXT.Buffer) persistData}. */
    public static void npersistData(long struct, XrSpatialPersistenceDataEXT.Buffer value) { memPutAddress(struct + XrSpatialComponentPersistenceListEXT.PERSISTDATA, value.address()); npersistDataCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentPersistenceListEXT.PERSISTDATA));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentPersistenceListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentPersistenceListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentPersistenceListEXT ELEMENT_FACTORY = XrSpatialComponentPersistenceListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentPersistenceListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentPersistenceListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentPersistenceListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentPersistenceListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentPersistenceListEXT.nnext(address()); }
        /** @return the value of the {@code persistDataCount} field. */
        @NativeType("uint32_t")
        public int persistDataCount() { return XrSpatialComponentPersistenceListEXT.npersistDataCount(address()); }
        /** @return a {@link XrSpatialPersistenceDataEXT.Buffer} view of the struct array pointed to by the {@code persistData} field. */
        @NativeType("XrSpatialPersistenceDataEXT *")
        public XrSpatialPersistenceDataEXT.Buffer persistData() { return XrSpatialComponentPersistenceListEXT.npersistData(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentPersistenceListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentPersistenceListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentPersistenceListEXT.Buffer type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentPersistenceListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentPersistenceListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialPersistenceDataEXT.Buffer} to the {@code persistData} field. */
        public XrSpatialComponentPersistenceListEXT.Buffer persistData(@NativeType("XrSpatialPersistenceDataEXT *") XrSpatialPersistenceDataEXT.Buffer value) { XrSpatialComponentPersistenceListEXT.npersistData(address(), value); return this; }

    }

}