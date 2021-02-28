/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.XR10.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     char actionName[XR_MAX_ACTION_NAME_SIZE];
 *     XrActionType actionType;
 *     uint32_t countSubactionPaths;
 *     XrPath const * subactionPaths;
 *     char localizedActionName[XR_MAX_LOCALIZED_ACTION_NAME_SIZE];
 * }</code></pre>
 */
public class XrActionCreateInfo extends Struct implements NativeResource {

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

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code actionName} field. */
    @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
    public ByteBuffer actionName() { return nactionName(address()); }
    /** Decodes the null-terminated string stored in the {@code actionName} field. */
    @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
    public String actionNameString() { return nactionNameString(address()); }
    /** Returns the value of the {@code actionType} field. */
    @NativeType("XrActionType")
    public int actionType() { return nactionType(address()); }
    /** Returns the value of the {@code countSubactionPaths} field. */
    @NativeType("uint32_t")
    public int countSubactionPaths() { return ncountSubactionPaths(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code subactionPaths} field. */
    @Nullable
    @NativeType("XrPath const *")
    public LongBuffer subactionPaths() { return nsubactionPaths(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code localizedActionName} field. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
    public ByteBuffer localizedActionName() { return nlocalizedActionName(address()); }
    /** Decodes the null-terminated string stored in the {@code localizedActionName} field. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
    public String localizedActionNameString() { return nlocalizedActionNameString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrActionCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
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
        return wrap(XrActionCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionCreateInfo calloc() {
        return wrap(XrActionCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionCreateInfo} instance for the specified memory address. */
    public static XrActionCreateInfo create(long address) {
        return wrap(XrActionCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrActionCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrActionCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrActionCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrActionCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrActionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionCreateInfo mallocStack(MemoryStack stack) {
        return wrap(XrActionCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionCreateInfo callocStack(MemoryStack stack) {
        return wrap(XrActionCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionCreateInfo.NEXT); }
    /** Unsafe version of {@link #actionName}. */
    public static ByteBuffer nactionName(long struct) { return memByteBuffer(struct + XrActionCreateInfo.ACTIONNAME, XR_MAX_ACTION_NAME_SIZE); }
    /** Unsafe version of {@link #actionNameString}. */
    public static String nactionNameString(long struct) { return memUTF8(struct + XrActionCreateInfo.ACTIONNAME); }
    /** Unsafe version of {@link #actionType}. */
    public static int nactionType(long struct) { return UNSAFE.getInt(null, struct + XrActionCreateInfo.ACTIONTYPE); }
    /** Unsafe version of {@link #countSubactionPaths}. */
    public static int ncountSubactionPaths(long struct) { return UNSAFE.getInt(null, struct + XrActionCreateInfo.COUNTSUBACTIONPATHS); }
    /** Unsafe version of {@link #subactionPaths() subactionPaths}. */
    @Nullable public static LongBuffer nsubactionPaths(long struct) { return memLongBufferSafe(memGetAddress(struct + XrActionCreateInfo.SUBACTIONPATHS), ncountSubactionPaths(struct)); }
    /** Unsafe version of {@link #localizedActionName}. */
    public static ByteBuffer nlocalizedActionName(long struct) { return memByteBuffer(struct + XrActionCreateInfo.LOCALIZEDACTIONNAME, XR_MAX_LOCALIZED_ACTION_NAME_SIZE); }
    /** Unsafe version of {@link #localizedActionNameString}. */
    public static String nlocalizedActionNameString(long struct) { return memUTF8(struct + XrActionCreateInfo.LOCALIZEDACTIONNAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionCreateInfo.NEXT, check(value)); }
    /** Unsafe version of {@link #actionName(ByteBuffer) actionName}. */
    public static void nactionName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_ACTION_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionCreateInfo.ACTIONNAME, value.remaining());
    }
    /** Unsafe version of {@link #actionType(int) actionType}. */
    public static void nactionType(long struct, int value) { UNSAFE.putInt(null, struct + XrActionCreateInfo.ACTIONTYPE, value); }
    /** Sets the specified value to the {@code countSubactionPaths} field of the specified {@code struct}. */
    public static void ncountSubactionPaths(long struct, int value) { UNSAFE.putInt(null, struct + XrActionCreateInfo.COUNTSUBACTIONPATHS, value); }
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

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActionCreateInfo.NEXT));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrActionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionCreateInfo, Buffer> implements NativeResource {

        private static final XrActionCreateInfo ELEMENT_FACTORY = XrActionCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrActionCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionCreateInfo.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrActionCreateInfo.nnext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code actionName} field. */
        @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
        public ByteBuffer actionName() { return XrActionCreateInfo.nactionName(address()); }
        /** Decodes the null-terminated string stored in the {@code actionName} field. */
        @NativeType("char[XR_MAX_ACTION_NAME_SIZE]")
        public String actionNameString() { return XrActionCreateInfo.nactionNameString(address()); }
        /** Returns the value of the {@code actionType} field. */
        @NativeType("XrActionType")
        public int actionType() { return XrActionCreateInfo.nactionType(address()); }
        /** Returns the value of the {@code countSubactionPaths} field. */
        @NativeType("uint32_t")
        public int countSubactionPaths() { return XrActionCreateInfo.ncountSubactionPaths(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code subactionPaths} field. */
        @Nullable
        @NativeType("XrPath const *")
        public LongBuffer subactionPaths() { return XrActionCreateInfo.nsubactionPaths(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code localizedActionName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
        public ByteBuffer localizedActionName() { return XrActionCreateInfo.nlocalizedActionName(address()); }
        /** Decodes the null-terminated string stored in the {@code localizedActionName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_NAME_SIZE]")
        public String localizedActionNameString() { return XrActionCreateInfo.nlocalizedActionNameString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrActionCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionCreateInfo.ntype(address(), value); return this; }
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