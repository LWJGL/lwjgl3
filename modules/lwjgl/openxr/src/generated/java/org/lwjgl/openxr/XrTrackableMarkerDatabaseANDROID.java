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
 * struct XrTrackableMarkerDatabaseANDROID {
 *     XrTrackableMarkerDictionaryANDROID dictionary;
 *     uint32_t entryCount;
 *     {@link XrTrackableMarkerDatabaseEntryANDROID XrTrackableMarkerDatabaseEntryANDROID} const * entries;
 * }}</pre>
 */
public class XrTrackableMarkerDatabaseANDROID extends Struct<XrTrackableMarkerDatabaseANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DICTIONARY,
        ENTRYCOUNT,
        ENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DICTIONARY = layout.offsetof(0);
        ENTRYCOUNT = layout.offsetof(1);
        ENTRIES = layout.offsetof(2);
    }

    protected XrTrackableMarkerDatabaseANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableMarkerDatabaseANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableMarkerDatabaseANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableMarkerDatabaseANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableMarkerDatabaseANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code dictionary} field. */
    @NativeType("XrTrackableMarkerDictionaryANDROID")
    public int dictionary() { return ndictionary(address()); }
    /** @return the value of the {@code entryCount} field. */
    @NativeType("uint32_t")
    public int entryCount() { return nentryCount(address()); }
    /** @return a {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} view of the struct array pointed to by the {@code entries} field. */
    @NativeType("XrTrackableMarkerDatabaseEntryANDROID const *")
    public XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer entries() { return nentries(address()); }

    /** Sets the specified value to the {@code dictionary} field. */
    public XrTrackableMarkerDatabaseANDROID dictionary(@NativeType("XrTrackableMarkerDictionaryANDROID") int value) { ndictionary(address(), value); return this; }
    /** Sets the address of the specified {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} to the {@code entries} field. */
    public XrTrackableMarkerDatabaseANDROID entries(@NativeType("XrTrackableMarkerDatabaseEntryANDROID const *") XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer value) { nentries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableMarkerDatabaseANDROID set(
        int dictionary,
        XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer entries
    ) {
        dictionary(dictionary);
        entries(entries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableMarkerDatabaseANDROID set(XrTrackableMarkerDatabaseANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableMarkerDatabaseANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerDatabaseANDROID malloc() {
        return new XrTrackableMarkerDatabaseANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerDatabaseANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerDatabaseANDROID calloc() {
        return new XrTrackableMarkerDatabaseANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerDatabaseANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableMarkerDatabaseANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableMarkerDatabaseANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableMarkerDatabaseANDROID} instance for the specified memory address. */
    public static XrTrackableMarkerDatabaseANDROID create(long address) {
        return new XrTrackableMarkerDatabaseANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableMarkerDatabaseANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableMarkerDatabaseANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableMarkerDatabaseANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableMarkerDatabaseANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableMarkerDatabaseANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerDatabaseANDROID malloc(MemoryStack stack) {
        return new XrTrackableMarkerDatabaseANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableMarkerDatabaseANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerDatabaseANDROID calloc(MemoryStack stack) {
        return new XrTrackableMarkerDatabaseANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dictionary}. */
    public static int ndictionary(long struct) { return memGetInt(struct + XrTrackableMarkerDatabaseANDROID.DICTIONARY); }
    /** Unsafe version of {@link #entryCount}. */
    public static int nentryCount(long struct) { return memGetInt(struct + XrTrackableMarkerDatabaseANDROID.ENTRYCOUNT); }
    /** Unsafe version of {@link #entries}. */
    public static XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer nentries(long struct) { return XrTrackableMarkerDatabaseEntryANDROID.createSafe(memGetAddress(struct + XrTrackableMarkerDatabaseANDROID.ENTRIES), nentryCount(struct)); }

    /** Unsafe version of {@link #dictionary(int) dictionary}. */
    public static void ndictionary(long struct, int value) { memPutInt(struct + XrTrackableMarkerDatabaseANDROID.DICTIONARY, value); }
    /** Sets the specified value to the {@code entryCount} field of the specified {@code struct}. */
    public static void nentryCount(long struct, int value) { memPutInt(struct + XrTrackableMarkerDatabaseANDROID.ENTRYCOUNT, value); }
    /** Unsafe version of {@link #entries(XrTrackableMarkerDatabaseEntryANDROID.Buffer) entries}. */
    public static void nentries(long struct, XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer value) { memPutAddress(struct + XrTrackableMarkerDatabaseANDROID.ENTRIES, memAddressSafe(value)); nentryCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nentryCount(struct) != 0) {
            check(memGetAddress(struct + XrTrackableMarkerDatabaseANDROID.ENTRIES));
        }
    }

    // -----------------------------------

    /** An array of {@link XrTrackableMarkerDatabaseANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableMarkerDatabaseANDROID, Buffer> implements NativeResource {

        private static final XrTrackableMarkerDatabaseANDROID ELEMENT_FACTORY = XrTrackableMarkerDatabaseANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableMarkerDatabaseANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableMarkerDatabaseANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableMarkerDatabaseANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dictionary} field. */
        @NativeType("XrTrackableMarkerDictionaryANDROID")
        public int dictionary() { return XrTrackableMarkerDatabaseANDROID.ndictionary(address()); }
        /** @return the value of the {@code entryCount} field. */
        @NativeType("uint32_t")
        public int entryCount() { return XrTrackableMarkerDatabaseANDROID.nentryCount(address()); }
        /** @return a {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} view of the struct array pointed to by the {@code entries} field. */
        @NativeType("XrTrackableMarkerDatabaseEntryANDROID const *")
        public XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer entries() { return XrTrackableMarkerDatabaseANDROID.nentries(address()); }

        /** Sets the specified value to the {@code dictionary} field. */
        public XrTrackableMarkerDatabaseANDROID.Buffer dictionary(@NativeType("XrTrackableMarkerDictionaryANDROID") int value) { XrTrackableMarkerDatabaseANDROID.ndictionary(address(), value); return this; }
        /** Sets the address of the specified {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} to the {@code entries} field. */
        public XrTrackableMarkerDatabaseANDROID.Buffer entries(@NativeType("XrTrackableMarkerDatabaseEntryANDROID const *") XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer value) { XrTrackableMarkerDatabaseANDROID.nentries(address(), value); return this; }

    }

}