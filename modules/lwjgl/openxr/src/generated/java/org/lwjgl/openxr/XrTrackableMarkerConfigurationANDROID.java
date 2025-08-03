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
 * struct XrTrackableMarkerConfigurationANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrTrackableMarkerTrackingModeANDROID trackingMode;
 *     uint32_t databaseCount;
 *     {@link XrTrackableMarkerDatabaseANDROID XrTrackableMarkerDatabaseANDROID} const * databases;
 * }}</pre>
 */
public class XrTrackableMarkerConfigurationANDROID extends Struct<XrTrackableMarkerConfigurationANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGMODE,
        DATABASECOUNT,
        DATABASES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGMODE = layout.offsetof(2);
        DATABASECOUNT = layout.offsetof(3);
        DATABASES = layout.offsetof(4);
    }

    protected XrTrackableMarkerConfigurationANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableMarkerConfigurationANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableMarkerConfigurationANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableMarkerConfigurationANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableMarkerConfigurationANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackingMode} field. */
    @NativeType("XrTrackableMarkerTrackingModeANDROID")
    public int trackingMode() { return ntrackingMode(address()); }
    /** @return the value of the {@code databaseCount} field. */
    @NativeType("uint32_t")
    public int databaseCount() { return ndatabaseCount(address()); }
    /** @return a {@link XrTrackableMarkerDatabaseANDROID.Buffer} view of the struct array pointed to by the {@code databases} field. */
    @NativeType("XrTrackableMarkerDatabaseANDROID const *")
    public XrTrackableMarkerDatabaseANDROID.Buffer databases() { return ndatabases(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableMarkerConfigurationANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesMarker#XR_TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID} value to the {@code type} field. */
    public XrTrackableMarkerConfigurationANDROID type$Default() { return type(ANDROIDTrackablesMarker.XR_TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableMarkerConfigurationANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingMode} field. */
    public XrTrackableMarkerConfigurationANDROID trackingMode(@NativeType("XrTrackableMarkerTrackingModeANDROID") int value) { ntrackingMode(address(), value); return this; }
    /** Sets the address of the specified {@link XrTrackableMarkerDatabaseANDROID.Buffer} to the {@code databases} field. */
    public XrTrackableMarkerConfigurationANDROID databases(@NativeType("XrTrackableMarkerDatabaseANDROID const *") XrTrackableMarkerDatabaseANDROID.Buffer value) { ndatabases(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableMarkerConfigurationANDROID set(
        int type,
        long next,
        int trackingMode,
        XrTrackableMarkerDatabaseANDROID.Buffer databases
    ) {
        type(type);
        next(next);
        trackingMode(trackingMode);
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
    public XrTrackableMarkerConfigurationANDROID set(XrTrackableMarkerConfigurationANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableMarkerConfigurationANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerConfigurationANDROID malloc() {
        return new XrTrackableMarkerConfigurationANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerConfigurationANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerConfigurationANDROID calloc() {
        return new XrTrackableMarkerConfigurationANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerConfigurationANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableMarkerConfigurationANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableMarkerConfigurationANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableMarkerConfigurationANDROID} instance for the specified memory address. */
    public static XrTrackableMarkerConfigurationANDROID create(long address) {
        return new XrTrackableMarkerConfigurationANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableMarkerConfigurationANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableMarkerConfigurationANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerConfigurationANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerConfigurationANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerConfigurationANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerConfigurationANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableMarkerConfigurationANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerConfigurationANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableMarkerConfigurationANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableMarkerConfigurationANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerConfigurationANDROID malloc(MemoryStack stack) {
        return new XrTrackableMarkerConfigurationANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableMarkerConfigurationANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerConfigurationANDROID calloc(MemoryStack stack) {
        return new XrTrackableMarkerConfigurationANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerConfigurationANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerConfigurationANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableMarkerConfigurationANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableMarkerConfigurationANDROID.NEXT); }
    /** Unsafe version of {@link #trackingMode}. */
    public static int ntrackingMode(long struct) { return memGetInt(struct + XrTrackableMarkerConfigurationANDROID.TRACKINGMODE); }
    /** Unsafe version of {@link #databaseCount}. */
    public static int ndatabaseCount(long struct) { return memGetInt(struct + XrTrackableMarkerConfigurationANDROID.DATABASECOUNT); }
    /** Unsafe version of {@link #databases}. */
    public static XrTrackableMarkerDatabaseANDROID.Buffer ndatabases(long struct) { return XrTrackableMarkerDatabaseANDROID.create(memGetAddress(struct + XrTrackableMarkerConfigurationANDROID.DATABASES), ndatabaseCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableMarkerConfigurationANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableMarkerConfigurationANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingMode(int) trackingMode}. */
    public static void ntrackingMode(long struct, int value) { memPutInt(struct + XrTrackableMarkerConfigurationANDROID.TRACKINGMODE, value); }
    /** Sets the specified value to the {@code databaseCount} field of the specified {@code struct}. */
    public static void ndatabaseCount(long struct, int value) { memPutInt(struct + XrTrackableMarkerConfigurationANDROID.DATABASECOUNT, value); }
    /** Unsafe version of {@link #databases(XrTrackableMarkerDatabaseANDROID.Buffer) databases}. */
    public static void ndatabases(long struct, XrTrackableMarkerDatabaseANDROID.Buffer value) { memPutAddress(struct + XrTrackableMarkerConfigurationANDROID.DATABASES, value.address()); ndatabaseCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int databaseCount = ndatabaseCount(struct);
        long databases = memGetAddress(struct + XrTrackableMarkerConfigurationANDROID.DATABASES);
        check(databases);
        validate(databases, databaseCount, XrTrackableMarkerDatabaseANDROID.SIZEOF, XrTrackableMarkerDatabaseANDROID::validate);
    }

    // -----------------------------------

    /** An array of {@link XrTrackableMarkerConfigurationANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableMarkerConfigurationANDROID, Buffer> implements NativeResource {

        private static final XrTrackableMarkerConfigurationANDROID ELEMENT_FACTORY = XrTrackableMarkerConfigurationANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableMarkerConfigurationANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableMarkerConfigurationANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableMarkerConfigurationANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableMarkerConfigurationANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackableMarkerConfigurationANDROID.nnext(address()); }
        /** @return the value of the {@code trackingMode} field. */
        @NativeType("XrTrackableMarkerTrackingModeANDROID")
        public int trackingMode() { return XrTrackableMarkerConfigurationANDROID.ntrackingMode(address()); }
        /** @return the value of the {@code databaseCount} field. */
        @NativeType("uint32_t")
        public int databaseCount() { return XrTrackableMarkerConfigurationANDROID.ndatabaseCount(address()); }
        /** @return a {@link XrTrackableMarkerDatabaseANDROID.Buffer} view of the struct array pointed to by the {@code databases} field. */
        @NativeType("XrTrackableMarkerDatabaseANDROID const *")
        public XrTrackableMarkerDatabaseANDROID.Buffer databases() { return XrTrackableMarkerConfigurationANDROID.ndatabases(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableMarkerConfigurationANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableMarkerConfigurationANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesMarker#XR_TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID} value to the {@code type} field. */
        public XrTrackableMarkerConfigurationANDROID.Buffer type$Default() { return type(ANDROIDTrackablesMarker.XR_TYPE_TRACKABLE_MARKER_CONFIGURATION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableMarkerConfigurationANDROID.Buffer next(@NativeType("void *") long value) { XrTrackableMarkerConfigurationANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingMode} field. */
        public XrTrackableMarkerConfigurationANDROID.Buffer trackingMode(@NativeType("XrTrackableMarkerTrackingModeANDROID") int value) { XrTrackableMarkerConfigurationANDROID.ntrackingMode(address(), value); return this; }
        /** Sets the address of the specified {@link XrTrackableMarkerDatabaseANDROID.Buffer} to the {@code databases} field. */
        public XrTrackableMarkerConfigurationANDROID.Buffer databases(@NativeType("XrTrackableMarkerDatabaseANDROID const *") XrTrackableMarkerDatabaseANDROID.Buffer value) { XrTrackableMarkerConfigurationANDROID.ndatabases(address(), value); return this; }

    }

}