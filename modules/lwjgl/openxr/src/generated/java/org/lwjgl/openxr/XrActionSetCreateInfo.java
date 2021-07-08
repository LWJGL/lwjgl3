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
 * struct XrActionSetCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     char actionSetName[XR_MAX_ACTION_SET_NAME_SIZE];
 *     char localizedActionSetName[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE];
 *     uint32_t priority;
 * }</code></pre>
 */
public class XrActionSetCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTIONSETNAME,
        LOCALIZEDACTIONSETNAME,
        PRIORITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_ACTION_SET_NAME_SIZE),
            __array(1, XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTIONSETNAME = layout.offsetof(2);
        LOCALIZEDACTIONSETNAME = layout.offsetof(3);
        PRIORITY = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrActionSetCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionSetCreateInfo(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code actionSetName} field. */
    @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
    public ByteBuffer actionSetName() { return nactionSetName(address()); }
    /** @return the null-terminated string stored in the {@code actionSetName} field. */
    @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
    public String actionSetNameString() { return nactionSetNameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code localizedActionSetName} field. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
    public ByteBuffer localizedActionSetName() { return nlocalizedActionSetName(address()); }
    /** @return the null-terminated string stored in the {@code localizedActionSetName} field. */
    @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
    public String localizedActionSetNameString() { return nlocalizedActionSetNameString(address()); }
    /** @return the value of the {@code priority} field. */
    @NativeType("uint32_t")
    public int priority() { return npriority(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrActionSetCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrActionSetCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified encoded string to the {@code actionSetName} field. */
    public XrActionSetCreateInfo actionSetName(@NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]") ByteBuffer value) { nactionSetName(address(), value); return this; }
    /** Copies the specified encoded string to the {@code localizedActionSetName} field. */
    public XrActionSetCreateInfo localizedActionSetName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]") ByteBuffer value) { nlocalizedActionSetName(address(), value); return this; }
    /** Sets the specified value to the {@code priority} field. */
    public XrActionSetCreateInfo priority(@NativeType("uint32_t") int value) { npriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionSetCreateInfo set(
        int type,
        long next,
        ByteBuffer actionSetName,
        ByteBuffer localizedActionSetName,
        int priority
    ) {
        type(type);
        next(next);
        actionSetName(actionSetName);
        localizedActionSetName(localizedActionSetName);
        priority(priority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionSetCreateInfo set(XrActionSetCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionSetCreateInfo malloc() {
        return wrap(XrActionSetCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionSetCreateInfo calloc() {
        return wrap(XrActionSetCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionSetCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionSetCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance for the specified memory address. */
    public static XrActionSetCreateInfo create(long address) {
        return wrap(XrActionSetCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSetCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionSetCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionSetCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionSetCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrActionSetCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrActionSetCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrActionSetCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrActionSetCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSetCreateInfo mallocStack(MemoryStack stack) {
        return wrap(XrActionSetCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionSetCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionSetCreateInfo callocStack(MemoryStack stack) {
        return wrap(XrActionSetCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionSetCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionSetCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionSetCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionSetCreateInfo.NEXT); }
    /** Unsafe version of {@link #actionSetName}. */
    public static ByteBuffer nactionSetName(long struct) { return memByteBuffer(struct + XrActionSetCreateInfo.ACTIONSETNAME, XR_MAX_ACTION_SET_NAME_SIZE); }
    /** Unsafe version of {@link #actionSetNameString}. */
    public static String nactionSetNameString(long struct) { return memUTF8(struct + XrActionSetCreateInfo.ACTIONSETNAME); }
    /** Unsafe version of {@link #localizedActionSetName}. */
    public static ByteBuffer nlocalizedActionSetName(long struct) { return memByteBuffer(struct + XrActionSetCreateInfo.LOCALIZEDACTIONSETNAME, XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE); }
    /** Unsafe version of {@link #localizedActionSetNameString}. */
    public static String nlocalizedActionSetNameString(long struct) { return memUTF8(struct + XrActionSetCreateInfo.LOCALIZEDACTIONSETNAME); }
    /** Unsafe version of {@link #priority}. */
    public static int npriority(long struct) { return UNSAFE.getInt(null, struct + XrActionSetCreateInfo.PRIORITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionSetCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionSetCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #actionSetName(ByteBuffer) actionSetName}. */
    public static void nactionSetName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_ACTION_SET_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionSetCreateInfo.ACTIONSETNAME, value.remaining());
    }
    /** Unsafe version of {@link #localizedActionSetName(ByteBuffer) localizedActionSetName}. */
    public static void nlocalizedActionSetName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrActionSetCreateInfo.LOCALIZEDACTIONSETNAME, value.remaining());
    }
    /** Unsafe version of {@link #priority(int) priority}. */
    public static void npriority(long struct, int value) { UNSAFE.putInt(null, struct + XrActionSetCreateInfo.PRIORITY, value); }

    // -----------------------------------

    /** An array of {@link XrActionSetCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionSetCreateInfo, Buffer> implements NativeResource {

        private static final XrActionSetCreateInfo ELEMENT_FACTORY = XrActionSetCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrActionSetCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionSetCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionSetCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionSetCreateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrActionSetCreateInfo.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code actionSetName} field. */
        @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
        public ByteBuffer actionSetName() { return XrActionSetCreateInfo.nactionSetName(address()); }
        /** @return the null-terminated string stored in the {@code actionSetName} field. */
        @NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]")
        public String actionSetNameString() { return XrActionSetCreateInfo.nactionSetNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code localizedActionSetName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
        public ByteBuffer localizedActionSetName() { return XrActionSetCreateInfo.nlocalizedActionSetName(address()); }
        /** @return the null-terminated string stored in the {@code localizedActionSetName} field. */
        @NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]")
        public String localizedActionSetNameString() { return XrActionSetCreateInfo.nlocalizedActionSetNameString(address()); }
        /** @return the value of the {@code priority} field. */
        @NativeType("uint32_t")
        public int priority() { return XrActionSetCreateInfo.npriority(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrActionSetCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionSetCreateInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrActionSetCreateInfo.Buffer next(@NativeType("void const *") long value) { XrActionSetCreateInfo.nnext(address(), value); return this; }
        /** Copies the specified encoded string to the {@code actionSetName} field. */
        public XrActionSetCreateInfo.Buffer actionSetName(@NativeType("char[XR_MAX_ACTION_SET_NAME_SIZE]") ByteBuffer value) { XrActionSetCreateInfo.nactionSetName(address(), value); return this; }
        /** Copies the specified encoded string to the {@code localizedActionSetName} field. */
        public XrActionSetCreateInfo.Buffer localizedActionSetName(@NativeType("char[XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE]") ByteBuffer value) { XrActionSetCreateInfo.nlocalizedActionSetName(address(), value); return this; }
        /** Sets the specified value to the {@code priority} field. */
        public XrActionSetCreateInfo.Buffer priority(@NativeType("uint32_t") int value) { XrActionSetCreateInfo.npriority(address(), value); return this; }

    }

}