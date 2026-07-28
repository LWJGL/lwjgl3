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
 * struct XrTrackableImageDatabaseCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t entryCount;
 *     {@link XrTrackableImageDatabaseEntryANDROID XrTrackableImageDatabaseEntryANDROID} const * entries;
 * }</code></pre>
 */
public class XrTrackableImageDatabaseCreateInfoANDROID extends Struct<XrTrackableImageDatabaseCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENTRYCOUNT,
        ENTRIES;

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
        ENTRYCOUNT = layout.offsetof(2);
        ENTRIES = layout.offsetof(3);
    }

    protected XrTrackableImageDatabaseCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableImageDatabaseCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableImageDatabaseCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableImageDatabaseCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableImageDatabaseCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code entryCount} field. */
    @NativeType("uint32_t")
    public int entryCount() { return nentryCount(address()); }
    /** @return a {@link XrTrackableImageDatabaseEntryANDROID.Buffer} view of the struct array pointed to by the {@code entries} field. */
    @NativeType("XrTrackableImageDatabaseEntryANDROID const *")
    public XrTrackableImageDatabaseEntryANDROID.Buffer entries() { return nentries(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableImageDatabaseCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrTrackableImageDatabaseCreateInfoANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableImageDatabaseCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrTrackableImageDatabaseEntryANDROID.Buffer} to the {@code entries} field. */
    public XrTrackableImageDatabaseCreateInfoANDROID entries(@NativeType("XrTrackableImageDatabaseEntryANDROID const *") XrTrackableImageDatabaseEntryANDROID.Buffer value) { nentries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableImageDatabaseCreateInfoANDROID set(
        int type,
        long next,
        XrTrackableImageDatabaseEntryANDROID.Buffer entries
    ) {
        type(type);
        next(next);
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
    public XrTrackableImageDatabaseCreateInfoANDROID set(XrTrackableImageDatabaseCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableImageDatabaseCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableImageDatabaseCreateInfoANDROID malloc() {
        return new XrTrackableImageDatabaseCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageDatabaseCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableImageDatabaseCreateInfoANDROID calloc() {
        return new XrTrackableImageDatabaseCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageDatabaseCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableImageDatabaseCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableImageDatabaseCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableImageDatabaseCreateInfoANDROID} instance for the specified memory address. */
    public static XrTrackableImageDatabaseCreateInfoANDROID create(long address) {
        return new XrTrackableImageDatabaseCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableImageDatabaseCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableImageDatabaseCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableImageDatabaseCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableImageDatabaseCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrTrackableImageDatabaseCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableImageDatabaseCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrTrackableImageDatabaseCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageDatabaseCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableImageDatabaseCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableImageDatabaseCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #entryCount}. */
    public static int nentryCount(long struct) { return memGetInt(struct + XrTrackableImageDatabaseCreateInfoANDROID.ENTRYCOUNT); }
    /** Unsafe version of {@link #entries}. */
    public static XrTrackableImageDatabaseEntryANDROID.Buffer nentries(long struct) { return XrTrackableImageDatabaseEntryANDROID.create(memGetAddress(struct + XrTrackableImageDatabaseCreateInfoANDROID.ENTRIES), nentryCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableImageDatabaseCreateInfoANDROID.NEXT, value); }
    /** Sets the specified value to the {@code entryCount} field of the specified {@code struct}. */
    public static void nentryCount(long struct, int value) { memPutInt(struct + XrTrackableImageDatabaseCreateInfoANDROID.ENTRYCOUNT, value); }
    /** Unsafe version of {@link #entries(XrTrackableImageDatabaseEntryANDROID.Buffer) entries}. */
    public static void nentries(long struct, XrTrackableImageDatabaseEntryANDROID.Buffer value) { memPutAddress(struct + XrTrackableImageDatabaseCreateInfoANDROID.ENTRIES, value.address()); nentryCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int entryCount = nentryCount(struct);
        long entries = memGetAddress(struct + XrTrackableImageDatabaseCreateInfoANDROID.ENTRIES);
        check(entries);
        validate(entries, entryCount, XrTrackableImageDatabaseEntryANDROID.SIZEOF, XrTrackableImageDatabaseEntryANDROID::validate);
    }

    // -----------------------------------

    /** An array of {@link XrTrackableImageDatabaseCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableImageDatabaseCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrTrackableImageDatabaseCreateInfoANDROID ELEMENT_FACTORY = XrTrackableImageDatabaseCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableImageDatabaseCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableImageDatabaseCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableImageDatabaseCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableImageDatabaseCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrTrackableImageDatabaseCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code entryCount} field. */
        @NativeType("uint32_t")
        public int entryCount() { return XrTrackableImageDatabaseCreateInfoANDROID.nentryCount(address()); }
        /** @return a {@link XrTrackableImageDatabaseEntryANDROID.Buffer} view of the struct array pointed to by the {@code entries} field. */
        @NativeType("XrTrackableImageDatabaseEntryANDROID const *")
        public XrTrackableImageDatabaseEntryANDROID.Buffer entries() { return XrTrackableImageDatabaseCreateInfoANDROID.nentries(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableImageDatabaseCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableImageDatabaseCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrTrackableImageDatabaseCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableImageDatabaseCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrTrackableImageDatabaseCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrTrackableImageDatabaseEntryANDROID.Buffer} to the {@code entries} field. */
        public XrTrackableImageDatabaseCreateInfoANDROID.Buffer entries(@NativeType("XrTrackableImageDatabaseEntryANDROID const *") XrTrackableImageDatabaseEntryANDROID.Buffer value) { XrTrackableImageDatabaseCreateInfoANDROID.nentries(address(), value); return this; }

    }

}