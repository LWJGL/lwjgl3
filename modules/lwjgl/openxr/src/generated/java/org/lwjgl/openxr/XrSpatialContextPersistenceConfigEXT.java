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
 * struct XrSpatialContextPersistenceConfigEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t persistenceContextCount;
 *     XrSpatialPersistenceContextEXT const * persistenceContexts;
 * }}</pre>
 */
public class XrSpatialContextPersistenceConfigEXT extends Struct<XrSpatialContextPersistenceConfigEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PERSISTENCECONTEXTCOUNT,
        PERSISTENCECONTEXTS;

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
        PERSISTENCECONTEXTCOUNT = layout.offsetof(2);
        PERSISTENCECONTEXTS = layout.offsetof(3);
    }

    protected XrSpatialContextPersistenceConfigEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialContextPersistenceConfigEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialContextPersistenceConfigEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialContextPersistenceConfigEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialContextPersistenceConfigEXT(ByteBuffer container) {
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
    /** @return the value of the {@code persistenceContextCount} field. */
    @NativeType("uint32_t")
    public int persistenceContextCount() { return npersistenceContextCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code persistenceContexts} field. */
    @NativeType("XrSpatialPersistenceContextEXT const *")
    public PointerBuffer persistenceContexts() { return npersistenceContexts(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialContextPersistenceConfigEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT} value to the {@code type} field. */
    public XrSpatialContextPersistenceConfigEXT type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialContextPersistenceConfigEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code persistenceContexts} field. */
    public XrSpatialContextPersistenceConfigEXT persistenceContexts(@NativeType("XrSpatialPersistenceContextEXT const *") PointerBuffer value) { npersistenceContexts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialContextPersistenceConfigEXT set(
        int type,
        long next,
        PointerBuffer persistenceContexts
    ) {
        type(type);
        next(next);
        persistenceContexts(persistenceContexts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialContextPersistenceConfigEXT set(XrSpatialContextPersistenceConfigEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialContextPersistenceConfigEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialContextPersistenceConfigEXT malloc() {
        return new XrSpatialContextPersistenceConfigEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialContextPersistenceConfigEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialContextPersistenceConfigEXT calloc() {
        return new XrSpatialContextPersistenceConfigEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialContextPersistenceConfigEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialContextPersistenceConfigEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialContextPersistenceConfigEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialContextPersistenceConfigEXT} instance for the specified memory address. */
    public static XrSpatialContextPersistenceConfigEXT create(long address) {
        return new XrSpatialContextPersistenceConfigEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialContextPersistenceConfigEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialContextPersistenceConfigEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialContextPersistenceConfigEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextPersistenceConfigEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialContextPersistenceConfigEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextPersistenceConfigEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialContextPersistenceConfigEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextPersistenceConfigEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialContextPersistenceConfigEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextPersistenceConfigEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialContextPersistenceConfigEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialContextPersistenceConfigEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialContextPersistenceConfigEXT malloc(MemoryStack stack) {
        return new XrSpatialContextPersistenceConfigEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialContextPersistenceConfigEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialContextPersistenceConfigEXT calloc(MemoryStack stack) {
        return new XrSpatialContextPersistenceConfigEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialContextPersistenceConfigEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextPersistenceConfigEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialContextPersistenceConfigEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextPersistenceConfigEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialContextPersistenceConfigEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialContextPersistenceConfigEXT.NEXT); }
    /** Unsafe version of {@link #persistenceContextCount}. */
    public static int npersistenceContextCount(long struct) { return memGetInt(struct + XrSpatialContextPersistenceConfigEXT.PERSISTENCECONTEXTCOUNT); }
    /** Unsafe version of {@link #persistenceContexts() persistenceContexts}. */
    public static PointerBuffer npersistenceContexts(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpatialContextPersistenceConfigEXT.PERSISTENCECONTEXTS), npersistenceContextCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialContextPersistenceConfigEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialContextPersistenceConfigEXT.NEXT, value); }
    /** Sets the specified value to the {@code persistenceContextCount} field of the specified {@code struct}. */
    public static void npersistenceContextCount(long struct, int value) { memPutInt(struct + XrSpatialContextPersistenceConfigEXT.PERSISTENCECONTEXTCOUNT, value); }
    /** Unsafe version of {@link #persistenceContexts(PointerBuffer) persistenceContexts}. */
    public static void npersistenceContexts(long struct, PointerBuffer value) { memPutAddress(struct + XrSpatialContextPersistenceConfigEXT.PERSISTENCECONTEXTS, memAddress(value)); npersistenceContextCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialContextPersistenceConfigEXT.PERSISTENCECONTEXTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialContextPersistenceConfigEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialContextPersistenceConfigEXT, Buffer> implements NativeResource {

        private static final XrSpatialContextPersistenceConfigEXT ELEMENT_FACTORY = XrSpatialContextPersistenceConfigEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialContextPersistenceConfigEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialContextPersistenceConfigEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialContextPersistenceConfigEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialContextPersistenceConfigEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialContextPersistenceConfigEXT.nnext(address()); }
        /** @return the value of the {@code persistenceContextCount} field. */
        @NativeType("uint32_t")
        public int persistenceContextCount() { return XrSpatialContextPersistenceConfigEXT.npersistenceContextCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code persistenceContexts} field. */
        @NativeType("XrSpatialPersistenceContextEXT const *")
        public PointerBuffer persistenceContexts() { return XrSpatialContextPersistenceConfigEXT.npersistenceContexts(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialContextPersistenceConfigEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialContextPersistenceConfigEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT} value to the {@code type} field. */
        public XrSpatialContextPersistenceConfigEXT.Buffer type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialContextPersistenceConfigEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialContextPersistenceConfigEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code persistenceContexts} field. */
        public XrSpatialContextPersistenceConfigEXT.Buffer persistenceContexts(@NativeType("XrSpatialPersistenceContextEXT const *") PointerBuffer value) { XrSpatialContextPersistenceConfigEXT.npersistenceContexts(address(), value); return this; }

    }

}