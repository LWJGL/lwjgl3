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
 * struct XrHapticActionInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrAction action;
 *     XrPath subactionPath;
 * }</code></pre>
 */
public class XrHapticActionInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION,
        SUBACTIONPATH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTION = layout.offsetof(2);
        SUBACTIONPATH = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHapticActionInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticActionInfo(ByteBuffer container) {
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
    /** @return the value of the {@code action} field. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** @return the value of the {@code subactionPath} field. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticActionInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticActionInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code action} field. */
    public XrHapticActionInfo action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@code subactionPath} field. */
    public XrHapticActionInfo subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticActionInfo set(
        int type,
        long next,
        XrAction action,
        long subactionPath
    ) {
        type(type);
        next(next);
        action(action);
        subactionPath(subactionPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticActionInfo set(XrHapticActionInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticActionInfo malloc() {
        return wrap(XrHapticActionInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticActionInfo calloc() {
        return wrap(XrHapticActionInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated with {@link BufferUtils}. */
    public static XrHapticActionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHapticActionInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHapticActionInfo} instance for the specified memory address. */
    public static XrHapticActionInfo create(long address) {
        return wrap(XrHapticActionInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticActionInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrHapticActionInfo.class, address);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHapticActionInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticActionInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticActionInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHapticActionInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHapticActionInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHapticActionInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHapticActionInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticActionInfo mallocStack(MemoryStack stack) {
        return wrap(XrHapticActionInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHapticActionInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticActionInfo callocStack(MemoryStack stack) {
        return wrap(XrHapticActionInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticActionInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticActionInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHapticActionInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticActionInfo.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrHapticActionInfo.ACTION); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return UNSAFE.getLong(null, struct + XrHapticActionInfo.SUBACTIONPATH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticActionInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticActionInfo.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrHapticActionInfo.ACTION, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { UNSAFE.putLong(null, struct + XrHapticActionInfo.SUBACTIONPATH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHapticActionInfo.ACTION));
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

    /** An array of {@link XrHapticActionInfo} structs. */
    public static class Buffer extends StructBuffer<XrHapticActionInfo, Buffer> implements NativeResource {

        private static final XrHapticActionInfo ELEMENT_FACTORY = XrHapticActionInfo.create(-1L);

        /**
         * Creates a new {@code XrHapticActionInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticActionInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrHapticActionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticActionInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticActionInfo.nnext(address()); }
        /** @return the value of the {@code action} field. */
        @NativeType("XrAction")
        public long action() { return XrHapticActionInfo.naction(address()); }
        /** @return the value of the {@code subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrHapticActionInfo.nsubactionPath(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticActionInfo.Buffer type(@NativeType("XrStructureType") int value) { XrHapticActionInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticActionInfo.Buffer next(@NativeType("void const *") long value) { XrHapticActionInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code action} field. */
        public XrHapticActionInfo.Buffer action(XrAction value) { XrHapticActionInfo.naction(address(), value); return this; }
        /** Sets the specified value to the {@code subactionPath} field. */
        public XrHapticActionInfo.Buffer subactionPath(@NativeType("XrPath") long value) { XrHapticActionInfo.nsubactionPath(address(), value); return this; }

    }

}