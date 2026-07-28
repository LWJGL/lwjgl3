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
 * struct XrTrackableImageConfigurationANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t databaseCount;
 *     XrTrackableImageDatabaseANDROID const * databases;
 * }}</pre>
 */
public class XrTrackableImageConfigurationANDROID extends Struct<XrTrackableImageConfigurationANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DATABASECOUNT,
        DATABASES;

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
        DATABASECOUNT = layout.offsetof(2);
        DATABASES = layout.offsetof(3);
    }

    protected XrTrackableImageConfigurationANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableImageConfigurationANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableImageConfigurationANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableImageConfigurationANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableImageConfigurationANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code databaseCount} field. */
    @NativeType("uint32_t")
    public int databaseCount() { return ndatabaseCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code databases} field. */
    @NativeType("XrTrackableImageDatabaseANDROID const *")
    public PointerBuffer databases() { return ndatabases(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableImageConfigurationANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID} value to the {@code type} field. */
    public XrTrackableImageConfigurationANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableImageConfigurationANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code databases} field. */
    public XrTrackableImageConfigurationANDROID databases(@NativeType("XrTrackableImageDatabaseANDROID const *") PointerBuffer value) { ndatabases(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableImageConfigurationANDROID set(
        int type,
        long next,
        PointerBuffer databases
    ) {
        type(type);
        next(next);
        databases(databases);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableImageConfigurationANDROID set(XrTrackableImageConfigurationANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableImageConfigurationANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableImageConfigurationANDROID malloc() {
        return new XrTrackableImageConfigurationANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageConfigurationANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableImageConfigurationANDROID calloc() {
        return new XrTrackableImageConfigurationANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageConfigurationANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableImageConfigurationANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableImageConfigurationANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableImageConfigurationANDROID} instance for the specified memory address. */
    public static XrTrackableImageConfigurationANDROID create(long address) {
        return new XrTrackableImageConfigurationANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableImageConfigurationANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableImageConfigurationANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableImageConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageConfigurationANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageConfigurationANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageConfigurationANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageConfigurationANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableImageConfigurationANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageConfigurationANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableImageConfigurationANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableImageConfigurationANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageConfigurationANDROID malloc(MemoryStack stack) {
        return new XrTrackableImageConfigurationANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableImageConfigurationANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageConfigurationANDROID calloc(MemoryStack stack) {
        return new XrTrackableImageConfigurationANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableImageConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageConfigurationANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageConfigurationANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableImageConfigurationANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableImageConfigurationANDROID.NEXT); }
    /** Unsafe version of {@link #databaseCount}. */
    public static int ndatabaseCount(long struct) { return memGetInt(struct + XrTrackableImageConfigurationANDROID.DATABASECOUNT); }
    /** Unsafe version of {@link #databases() databases}. */
    public static PointerBuffer ndatabases(long struct) { return memPointerBuffer(memGetAddress(struct + XrTrackableImageConfigurationANDROID.DATABASES), ndatabaseCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableImageConfigurationANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableImageConfigurationANDROID.NEXT, value); }
    /** Sets the specified value to the {@code databaseCount} field of the specified {@code struct}. */
    public static void ndatabaseCount(long struct, int value) { memPutInt(struct + XrTrackableImageConfigurationANDROID.DATABASECOUNT, value); }
    /** Unsafe version of {@link #databases(PointerBuffer) databases}. */
    public static void ndatabases(long struct, PointerBuffer value) { memPutAddress(struct + XrTrackableImageConfigurationANDROID.DATABASES, memAddress(value)); ndatabaseCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrTrackableImageConfigurationANDROID.DATABASES));
    }

    // -----------------------------------

    /** An array of {@link XrTrackableImageConfigurationANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableImageConfigurationANDROID, Buffer> implements NativeResource {

        private static final XrTrackableImageConfigurationANDROID ELEMENT_FACTORY = XrTrackableImageConfigurationANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableImageConfigurationANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableImageConfigurationANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableImageConfigurationANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableImageConfigurationANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrTrackableImageConfigurationANDROID.nnext(address()); }
        /** @return the value of the {@code databaseCount} field. */
        @NativeType("uint32_t")
        public int databaseCount() { return XrTrackableImageConfigurationANDROID.ndatabaseCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code databases} field. */
        @NativeType("XrTrackableImageDatabaseANDROID const *")
        public PointerBuffer databases() { return XrTrackableImageConfigurationANDROID.ndatabases(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableImageConfigurationANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableImageConfigurationANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID} value to the {@code type} field. */
        public XrTrackableImageConfigurationANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableImageConfigurationANDROID.Buffer next(@NativeType("void const *") long value) { XrTrackableImageConfigurationANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code databases} field. */
        public XrTrackableImageConfigurationANDROID.Buffer databases(@NativeType("XrTrackableImageDatabaseANDROID const *") PointerBuffer value) { XrTrackableImageConfigurationANDROID.ndatabases(address(), value); return this; }

    }

}