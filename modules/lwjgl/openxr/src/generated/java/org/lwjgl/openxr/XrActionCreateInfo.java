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

import static org.lwjgl.openxr.XR10.*;

/**
 * <pre>{@code
 * struct XrActionCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     char actionName[XR_MAX_ACTION_NAME_SIZE];
 *     XrActionType actionType;
 *     uint32_t countSubactionPaths;
 *     XrPath const * subactionPaths;
 *     char localizedActionName[XR_MAX_LOCALIZED_ACTION_NAME_SIZE];
 * }}</pre>
 */
public class XrActionCreateInfo extends Struct<XrActionCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTIONNAME,
        ACTIONTYPE,
        COUNTSUBACTIONPATHS,
        SUBACTIONPATHS,
        LOCALIZEDACTIONNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_ACTION_NAME_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_LOCALIZED_ACTION_NAME_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTIONNAME = layout.offsetof(2);
        ACTIONTYPE = layout.offsetof(3);
        COUNTSUBACTIONPATHS = layout.offsetof(4);
        SUBACTIONPATHS = layout.offsetof(5);
        LOCALIZEDACTIONNAME = layout.offsetof(6);
    }

    protected XrActionCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActionCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new XrActionCreateInfo(address, container);
    }

    /**
     * Creates a {@code XrActionCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionCreateInfo(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code actionName} field. */
    @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
    public ByteBuffer actionName() { return nactionName(address()); }
    /** @return the null-terminated string stored in the {@code actionName} field. */
    @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
    public String actionNameString() { return nactionNameString(address()); }
    /** @return the value of the {@code actionType} field. */
    @NativeType("XrActionType")
    public int actionType() { return nactionType(address()); }
    /** @return the value of the {@code countSubactionPaths} field. */
    @NativeType("uint32_t")
    public int countSubactionPaths() { return ncountSubactionPaths(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code subactionPaths} field. */
    @NativeType("XrPath const *")
    public @Nullable LongBuffer subactionPaths() { return nsubactionPaths(address()); }
    /** @return a {@link ByteBuffer} view of the {@code localizedActionName} field. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
    public ByteBuffer localizedActionName() { return nlocalizedActionName(address()); }
    /** @return the null-terminated string stored in the {@code localizedActionName} field. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
    public String localizedActionNameString() { return nlocalizedActionNameString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrActionCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_CREATE_INFO TYPE_ACTION_CREATE_INFO} value to the {@code type} field. */
    public XrActionCreateInfo type$Default() { return type(XR10.XR_TYPE_ACTION_CREATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrActionCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@code actionName} field. */
    public XrActionCreateInfo actionName(@NativeType("char[XR_MAX_ACTION_NAME_SIZE]") ByteBuffer value) { nactionName(address(), value); return this; }
    /** Sets the specified value to the {@code actionType} field. */
    public XrActionCreateInfo actionType(@NativeType("XrActionType") int value) { nactionType(address(), value); return this; }
    /** Sets the specified value to the {@code countSubactionPaths} field. */
    public XrActionCreateInfo countSubactionPaths(@NativeType("uint32_t") int value) { ncountSubactionPaths(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code subactionPaths} field. */
    public XrActionCreateInfo subactionPaths(@Nullable @NativeType("XrPath const *") LongBuffer value) { nsubactionPaths(address(), value); return this; }
    /** Copies the specified encoded string to the {@code localizedActionName} field. */
    public XrActionCreateInfo localizedActionName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]") ByteBuffer value) { nlocalizedActionName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionCreateInfo set(
        int type,
        long next,
        ByteBuffer actionName,
        int actionType,
        int countSubactionPaths,
        @Nullable LongBuffer subactionPaths,
        ByteBuffer localizedActionName
    ) {
        type(type);
        next(next);
        actionName(actionName);
        actionType(actionType);
        countSubactionPaths(countSubactionPaths);
        subactionPaths(subactionPaths);
        localizedActionName(localizedActionName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionCreateInfo set(XrActionCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionCreateInfo malloc() {
        return new XrActionCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionCreateInfo calloc() {
        return new XrActionCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActionCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrActionCreateInfo} instance for the specified memory address. */
    public static XrActionCreateInfo create(long address) {
        return new XrActionCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrActionCreateInfo createSafe(long address) {
        return address == NULL ? null : new XrActionCreateInfo(address, null);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrActionCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionCreateInfo malloc(MemoryStack stack) {
        return new XrActionCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionCreateInfo calloc(MemoryStack stack) {
        return new XrActionCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrActionCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionCreateInfo.NEXT); }
    /** Unsafe version of {@link #actionName}. */
    public static ByteBuffer nactionName(long struct) { return memByteBuffer(struct + XrActionCreateInfo.ACTIONNAME, XR_MAX_ACTION_NAME_SIZE); }
    /** Unsafe version of {@link #actionNameString}. */
    public static String nactionNameString(long struct) { return memUTF8(struct + XrActionCreateInfo.ACTIONNAME); }
    /** Unsafe version of {@link #actionType}. */
    public static int nactionType(long struct) { return memGetInt(struct + XrActionCreateInfo.ACTIONTYPE); }
    /** Unsafe version of {@link #countSubactionPaths}. */
    public static int ncountSubactionPaths(long struct) { return memGetInt(struct + XrActionCreateInfo.COUNTSUBACTIONPATHS); }
    /** Unsafe version of {@link #subactionPaths() subactionPaths}. */
    public static @Nullable LongBuffer nsubactionPaths(long struct) { return memLongBufferSafe(memGetAddress(struct + XrActionCreateInfo.SUBACTIONPATHS), ncountSubactionPaths(struct)); }
    /** Unsafe version of {@link #localizedActionName}. */
    public static ByteBuffer nlocalizedActionName(long struct) { return memByteBuffer(struct + XrActionCreateInfo.LOCALIZEDACTIONNAME, XR_MAX_LOCALIZED_ACTION_NAME_SIZE); }
    /** Unsafe version of {@link #localizedActionNameString}. */
    public static String nlocalizedActionNameString(long struct) { return memUTF8(struct + XrActionCreateInfo.LOCALIZEDACTIONNAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrActionCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #actionName(ByteBuffer) actionName}. */
    public static void nactionName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_ACTION_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionCreateInfo.ACTIONNAME, value.remaining());
    }
    /** Unsafe version of {@link #actionType(int) actionType}. */
    public static void nactionType(long struct, int value) { memPutInt(struct + XrActionCreateInfo.ACTIONTYPE, value); }
    /** Sets the specified value to the {@code countSubactionPaths} field of the specified {@code struct}. */
    public static void ncountSubactionPaths(long struct, int value) { memPutInt(struct + XrActionCreateInfo.COUNTSUBACTIONPATHS, value); }
    /** Unsafe version of {@link #subactionPaths(LongBuffer) subactionPaths}. */
    public static void nsubactionPaths(long struct, @Nullable LongBuffer value) { memPutAddress(struct + XrActionCreateInfo.SUBACTIONPATHS, memAddressSafe(value)); if (value != null) { ncountSubactionPaths(struct, value.remaining()); } }
    /** Unsafe version of {@link #localizedActionName(ByteBuffer) localizedActionName}. */
    public static void nlocalizedActionName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_LOCALIZED_ACTION_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionCreateInfo.LOCALIZEDACTIONNAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link XrActionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionCreateInfo, Buffer> implements NativeResource {

        private static final XrActionCreateInfo ELEMENT_FACTORY = XrActionCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrActionCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionCreateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrActionCreateInfo.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code actionName} field. */
        @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
        public ByteBuffer actionName() { return XrActionCreateInfo.nactionName(address()); }
        /** @return the null-terminated string stored in the {@code actionName} field. */
        @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
        public String actionNameString() { return XrActionCreateInfo.nactionNameString(address()); }
        /** @return the value of the {@code actionType} field. */
        @NativeType("XrActionType")
        public int actionType() { return XrActionCreateInfo.nactionType(address()); }
        /** @return the value of the {@code countSubactionPaths} field. */
        @NativeType("uint32_t")
        public int countSubactionPaths() { return XrActionCreateInfo.ncountSubactionPaths(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code subactionPaths} field. */
        @NativeType("XrPath const *")
        public @Nullable LongBuffer subactionPaths() { return XrActionCreateInfo.nsubactionPaths(address()); }
        /** @return a {@link ByteBuffer} view of the {@code localizedActionName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
        public ByteBuffer localizedActionName() { return XrActionCreateInfo.nlocalizedActionName(address()); }
        /** @return the null-terminated string stored in the {@code localizedActionName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
        public String localizedActionNameString() { return XrActionCreateInfo.nlocalizedActionNameString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrActionCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_CREATE_INFO TYPE_ACTION_CREATE_INFO} value to the {@code type} field. */
        public XrActionCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_CREATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrActionCreateInfo.Buffer next(@NativeType("void const *") long value) { XrActionCreateInfo.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@code actionName} field. */
        public XrActionCreateInfo.Buffer actionName(@NativeType("char[XR_MAX_ACTION_NAME_SIZE]") ByteBuffer value) { XrActionCreateInfo.nactionName(address(), value); return this; }
        /** Sets the specified value to the {@code actionType} field. */
        public XrActionCreateInfo.Buffer actionType(@NativeType("XrActionType") int value) { XrActionCreateInfo.nactionType(address(), value); return this; }
        /** Sets the specified value to the {@code countSubactionPaths} field. */
        public XrActionCreateInfo.Buffer countSubactionPaths(@NativeType("uint32_t") int value) { XrActionCreateInfo.ncountSubactionPaths(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code subactionPaths} field. */
        public XrActionCreateInfo.Buffer subactionPaths(@Nullable @NativeType("XrPath const *") LongBuffer value) { XrActionCreateInfo.nsubactionPaths(address(), value); return this; }
        /** Copies the specified encoded string to the {@code localizedActionName} field. */
        public XrActionCreateInfo.Buffer localizedActionName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]") ByteBuffer value) { XrActionCreateInfo.nlocalizedActionName(address(), value); return this; }

    }

}