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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSessionCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrSessionCreateFlags createFlags;
 *     XrSystemId systemId;
 * }</code></pre>
 */
public class XrSessionCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS,
        SYSTEMID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        SYSTEMID = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSessionCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSessionCreateInfo(ByteBuffer container) {
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
    /** Returns the value of the {@code createFlags} field. */
    @NativeType("XrSessionCreateFlags")
    public long createFlags() { return ncreateFlags(address()); }
    /** Returns the value of the {@code systemId} field. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSessionCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSessionCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrSessionCreateInfo createFlags(@NativeType("XrSessionCreateFlags") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code systemId} field. */
    public XrSessionCreateInfo systemId(@NativeType("XrSystemId") long value) { nsystemId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSessionCreateInfo set(
        int type,
        long next,
        long createFlags,
        long systemId
    ) {
        type(type);
        next(next);
        createFlags(createFlags);
        systemId(systemId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSessionCreateInfo set(XrSessionCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfo malloc() {
        return wrap(XrSessionCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfo calloc() {
        return wrap(XrSessionCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrSessionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSessionCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSessionCreateInfo} instance for the specified memory address. */
    public static XrSessionCreateInfo create(long address) {
        return wrap(XrSessionCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrSessionCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSessionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSessionCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSessionCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSessionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfo mallocStack(MemoryStack stack) {
        return wrap(XrSessionCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSessionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfo callocStack(MemoryStack stack) {
        return wrap(XrSessionCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSessionCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSessionCreateInfo.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrSessionCreateInfo.CREATEFLAGS); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return UNSAFE.getLong(null, struct + XrSessionCreateInfo.SYSTEMID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSessionCreateInfo.NEXT, check(value)); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSessionCreateInfo.CREATEFLAGS, value); }
    /** Unsafe version of {@link #systemId(long) systemId}. */
    public static void nsystemId(long struct, long value) { UNSAFE.putLong(null, struct + XrSessionCreateInfo.SYSTEMID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSessionCreateInfo.NEXT));
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

    /** An array of {@link XrSessionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrSessionCreateInfo, Buffer> implements NativeResource {

        private static final XrSessionCreateInfo ELEMENT_FACTORY = XrSessionCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrSessionCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSessionCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrSessionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSessionCreateInfo.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSessionCreateInfo.nnext(address()); }
        /** Returns the value of the {@code createFlags} field. */
        @NativeType("XrSessionCreateFlags")
        public long createFlags() { return XrSessionCreateInfo.ncreateFlags(address()); }
        /** Returns the value of the {@code systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrSessionCreateInfo.nsystemId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSessionCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSessionCreateInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSessionCreateInfo.Buffer next(@NativeType("void const *") long value) { XrSessionCreateInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrSessionCreateInfo.Buffer createFlags(@NativeType("XrSessionCreateFlags") long value) { XrSessionCreateInfo.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code systemId} field. */
        public XrSessionCreateInfo.Buffer systemId(@NativeType("XrSystemId") long value) { XrSessionCreateInfo.nsystemId(address(), value); return this; }

    }

}