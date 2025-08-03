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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpacesEraseInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t spaceCount;
 *     XrSpace * spaces;
 *     uint32_t uuidCount;
 *     {@link XrUuidEXT XrUuidEXT} * uuids;
 * }}</pre>
 */
public class XrSpacesEraseInfoMETA extends Struct<XrSpacesEraseInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACECOUNT,
        SPACES,
        UUIDCOUNT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACECOUNT = layout.offsetof(2);
        SPACES = layout.offsetof(3);
        UUIDCOUNT = layout.offsetof(4);
        UUIDS = layout.offsetof(5);
    }

    protected XrSpacesEraseInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpacesEraseInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpacesEraseInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSpacesEraseInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpacesEraseInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code spaceCount} field. */
    @NativeType("uint32_t")
    public int spaceCount() { return nspaceCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
    @NativeType("XrSpace *")
    public @Nullable PointerBuffer spaces() { return nspaces(address()); }
    /** @return the value of the {@code uuidCount} field. */
    @NativeType("uint32_t")
    public int uuidCount() { return nuuidCount(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.@Nullable Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpacesEraseInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityPersistence#XR_TYPE_SPACES_ERASE_INFO_META TYPE_SPACES_ERASE_INFO_META} value to the {@code type} field. */
    public XrSpacesEraseInfoMETA type$Default() { return type(METASpatialEntityPersistence.XR_TYPE_SPACES_ERASE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpacesEraseInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code spaceCount} field. */
    public XrSpacesEraseInfoMETA spaceCount(@NativeType("uint32_t") int value) { nspaceCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
    public XrSpacesEraseInfoMETA spaces(@Nullable @NativeType("XrSpace *") PointerBuffer value) { nspaces(address(), value); return this; }
    /** Sets the specified value to the {@code uuidCount} field. */
    public XrSpacesEraseInfoMETA uuidCount(@NativeType("uint32_t") int value) { nuuidCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpacesEraseInfoMETA uuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpacesEraseInfoMETA set(
        int type,
        long next,
        int spaceCount,
        @Nullable PointerBuffer spaces,
        int uuidCount,
        XrUuidEXT.@Nullable Buffer uuids
    ) {
        type(type);
        next(next);
        spaceCount(spaceCount);
        spaces(spaces);
        uuidCount(uuidCount);
        uuids(uuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpacesEraseInfoMETA set(XrSpacesEraseInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpacesEraseInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpacesEraseInfoMETA malloc() {
        return new XrSpacesEraseInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesEraseInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpacesEraseInfoMETA calloc() {
        return new XrSpacesEraseInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesEraseInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpacesEraseInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpacesEraseInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpacesEraseInfoMETA} instance for the specified memory address. */
    public static XrSpacesEraseInfoMETA create(long address) {
        return new XrSpacesEraseInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpacesEraseInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSpacesEraseInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpacesEraseInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesEraseInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpacesEraseInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesEraseInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesEraseInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesEraseInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpacesEraseInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpacesEraseInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpacesEraseInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpacesEraseInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesEraseInfoMETA malloc(MemoryStack stack) {
        return new XrSpacesEraseInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpacesEraseInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesEraseInfoMETA calloc(MemoryStack stack) {
        return new XrSpacesEraseInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpacesEraseInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesEraseInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesEraseInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesEraseInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpacesEraseInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpacesEraseInfoMETA.NEXT); }
    /** Unsafe version of {@link #spaceCount}. */
    public static int nspaceCount(long struct) { return memGetInt(struct + XrSpacesEraseInfoMETA.SPACECOUNT); }
    /** Unsafe version of {@link #spaces() spaces}. */
    public static @Nullable PointerBuffer nspaces(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrSpacesEraseInfoMETA.SPACES), nspaceCount(struct)); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return memGetInt(struct + XrSpacesEraseInfoMETA.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.@Nullable Buffer nuuids(long struct) { return XrUuidEXT.createSafe(memGetAddress(struct + XrSpacesEraseInfoMETA.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpacesEraseInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpacesEraseInfoMETA.NEXT, value); }
    /** Sets the specified value to the {@code spaceCount} field of the specified {@code struct}. */
    public static void nspaceCount(long struct, int value) { memPutInt(struct + XrSpacesEraseInfoMETA.SPACECOUNT, value); }
    /** Unsafe version of {@link #spaces(PointerBuffer) spaces}. */
    public static void nspaces(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrSpacesEraseInfoMETA.SPACES, memAddressSafe(value)); if (value != null) { nspaceCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { memPutInt(struct + XrSpacesEraseInfoMETA.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.@Nullable Buffer value) { memPutAddress(struct + XrSpacesEraseInfoMETA.UUIDS, memAddressSafe(value)); if (value != null) { nuuidCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpacesEraseInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpacesEraseInfoMETA, Buffer> implements NativeResource {

        private static final XrSpacesEraseInfoMETA ELEMENT_FACTORY = XrSpacesEraseInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSpacesEraseInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpacesEraseInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpacesEraseInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpacesEraseInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpacesEraseInfoMETA.nnext(address()); }
        /** @return the value of the {@code spaceCount} field. */
        @NativeType("uint32_t")
        public int spaceCount() { return XrSpacesEraseInfoMETA.nspaceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
        @NativeType("XrSpace *")
        public @Nullable PointerBuffer spaces() { return XrSpacesEraseInfoMETA.nspaces(address()); }
        /** @return the value of the {@code uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpacesEraseInfoMETA.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.@Nullable Buffer uuids() { return XrSpacesEraseInfoMETA.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpacesEraseInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpacesEraseInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityPersistence#XR_TYPE_SPACES_ERASE_INFO_META TYPE_SPACES_ERASE_INFO_META} value to the {@code type} field. */
        public XrSpacesEraseInfoMETA.Buffer type$Default() { return type(METASpatialEntityPersistence.XR_TYPE_SPACES_ERASE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpacesEraseInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSpacesEraseInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code spaceCount} field. */
        public XrSpacesEraseInfoMETA.Buffer spaceCount(@NativeType("uint32_t") int value) { XrSpacesEraseInfoMETA.nspaceCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
        public XrSpacesEraseInfoMETA.Buffer spaces(@Nullable @NativeType("XrSpace *") PointerBuffer value) { XrSpacesEraseInfoMETA.nspaces(address(), value); return this; }
        /** Sets the specified value to the {@code uuidCount} field. */
        public XrSpacesEraseInfoMETA.Buffer uuidCount(@NativeType("uint32_t") int value) { XrSpacesEraseInfoMETA.nuuidCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpacesEraseInfoMETA.Buffer uuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { XrSpacesEraseInfoMETA.nuuids(address(), value); return this; }

    }

}