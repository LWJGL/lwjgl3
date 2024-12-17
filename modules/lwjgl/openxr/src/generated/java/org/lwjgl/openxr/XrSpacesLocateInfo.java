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
 * struct XrSpacesLocateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     uint32_t spaceCount;
 *     XrSpace const * spaces;
 * }}</pre>
 */
public class XrSpacesLocateInfo extends Struct<XrSpacesLocateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        SPACECOUNT,
        SPACES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        SPACECOUNT = layout.offsetof(4);
        SPACES = layout.offsetof(5);
    }

    protected XrSpacesLocateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpacesLocateInfo create(long address, @Nullable ByteBuffer container) {
        return new XrSpacesLocateInfo(address, container);
    }

    /**
     * Creates a {@code XrSpacesLocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpacesLocateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return the value of the {@code spaceCount} field. */
    @NativeType("uint32_t")
    public int spaceCount() { return nspaceCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
    @NativeType("XrSpace const *")
    public PointerBuffer spaces() { return nspaces(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpacesLocateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR11#XR_TYPE_SPACES_LOCATE_INFO TYPE_SPACES_LOCATE_INFO} value to the {@code type} field. */
    public XrSpacesLocateInfo type$Default() { return type(XR11.XR_TYPE_SPACES_LOCATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpacesLocateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSpacesLocateInfo baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpacesLocateInfo time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
    public XrSpacesLocateInfo spaces(@NativeType("XrSpace const *") PointerBuffer value) { nspaces(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpacesLocateInfo set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        PointerBuffer spaces
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        spaces(spaces);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpacesLocateInfo set(XrSpacesLocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpacesLocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpacesLocateInfo malloc() {
        return new XrSpacesLocateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesLocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpacesLocateInfo calloc() {
        return new XrSpacesLocateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpacesLocateInfo} instance allocated with {@link BufferUtils}. */
    public static XrSpacesLocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpacesLocateInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrSpacesLocateInfo} instance for the specified memory address. */
    public static XrSpacesLocateInfo create(long address) {
        return new XrSpacesLocateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpacesLocateInfo createSafe(long address) {
        return address == NULL ? null : new XrSpacesLocateInfo(address, null);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpacesLocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpacesLocateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpacesLocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesLocateInfo malloc(MemoryStack stack) {
        return new XrSpacesLocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpacesLocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpacesLocateInfo calloc(MemoryStack stack) {
        return new XrSpacesLocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpacesLocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpacesLocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpacesLocateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpacesLocateInfo.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSpacesLocateInfo.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpacesLocateInfo.TIME); }
    /** Unsafe version of {@link #spaceCount}. */
    public static int nspaceCount(long struct) { return memGetInt(struct + XrSpacesLocateInfo.SPACECOUNT); }
    /** Unsafe version of {@link #spaces() spaces}. */
    public static PointerBuffer nspaces(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpacesLocateInfo.SPACES), nspaceCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpacesLocateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpacesLocateInfo.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSpacesLocateInfo.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpacesLocateInfo.TIME, value); }
    /** Sets the specified value to the {@code spaceCount} field of the specified {@code struct}. */
    public static void nspaceCount(long struct, int value) { memPutInt(struct + XrSpacesLocateInfo.SPACECOUNT, value); }
    /** Unsafe version of {@link #spaces(PointerBuffer) spaces}. */
    public static void nspaces(long struct, PointerBuffer value) { memPutAddress(struct + XrSpacesLocateInfo.SPACES, memAddress(value)); nspaceCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpacesLocateInfo.BASESPACE));
        check(memGetAddress(struct + XrSpacesLocateInfo.SPACES));
    }

    // -----------------------------------

    /** An array of {@link XrSpacesLocateInfo} structs. */
    public static class Buffer extends StructBuffer<XrSpacesLocateInfo, Buffer> implements NativeResource {

        private static final XrSpacesLocateInfo ELEMENT_FACTORY = XrSpacesLocateInfo.create(-1L);

        /**
         * Creates a new {@code XrSpacesLocateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpacesLocateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpacesLocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpacesLocateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpacesLocateInfo.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSpacesLocateInfo.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpacesLocateInfo.ntime(address()); }
        /** @return the value of the {@code spaceCount} field. */
        @NativeType("uint32_t")
        public int spaceCount() { return XrSpacesLocateInfo.nspaceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
        @NativeType("XrSpace const *")
        public PointerBuffer spaces() { return XrSpacesLocateInfo.nspaces(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpacesLocateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSpacesLocateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR11#XR_TYPE_SPACES_LOCATE_INFO TYPE_SPACES_LOCATE_INFO} value to the {@code type} field. */
        public XrSpacesLocateInfo.Buffer type$Default() { return type(XR11.XR_TYPE_SPACES_LOCATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpacesLocateInfo.Buffer next(@NativeType("void const *") long value) { XrSpacesLocateInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSpacesLocateInfo.Buffer baseSpace(XrSpace value) { XrSpacesLocateInfo.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpacesLocateInfo.Buffer time(@NativeType("XrTime") long value) { XrSpacesLocateInfo.ntime(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
        public XrSpacesLocateInfo.Buffer spaces(@NativeType("XrSpace const *") PointerBuffer value) { XrSpacesLocateInfo.nspaces(address(), value); return this; }

    }

}