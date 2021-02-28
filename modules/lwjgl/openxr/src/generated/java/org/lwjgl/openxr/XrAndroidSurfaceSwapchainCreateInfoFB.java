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
 * struct XrAndroidSurfaceSwapchainCreateInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrAndroidSurfaceSwapchainFlagsFB createFlags;
 * }</code></pre>
 */
public class XrAndroidSurfaceSwapchainCreateInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAndroidSurfaceSwapchainCreateInfoFB(ByteBuffer container) {
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
    @NativeType("XrAndroidSurfaceSwapchainFlagsFB")
    public long createFlags() { return ncreateFlags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrAndroidSurfaceSwapchainCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrAndroidSurfaceSwapchainCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrAndroidSurfaceSwapchainCreateInfoFB createFlags(@NativeType("XrAndroidSurfaceSwapchainFlagsFB") long value) { ncreateFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrAndroidSurfaceSwapchainCreateInfoFB set(
        int type,
        long next,
        long createFlags
    ) {
        type(type);
        next(next);
        createFlags(createFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrAndroidSurfaceSwapchainCreateInfoFB set(XrAndroidSurfaceSwapchainCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAndroidSurfaceSwapchainCreateInfoFB malloc() {
        return wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAndroidSurfaceSwapchainCreateInfoFB calloc() {
        return wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrAndroidSurfaceSwapchainCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance for the specified memory address. */
    public static XrAndroidSurfaceSwapchainCreateInfoFB create(long address) {
        return wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrAndroidSurfaceSwapchainCreateInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrAndroidSurfaceSwapchainCreateInfoFB mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrAndroidSurfaceSwapchainCreateInfoFB callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB mallocStack(MemoryStack stack) {
        return wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrAndroidSurfaceSwapchainCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB callocStack(MemoryStack stack) {
        return wrap(XrAndroidSurfaceSwapchainCreateInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAndroidSurfaceSwapchainCreateInfoFB.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrAndroidSurfaceSwapchainCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrAndroidSurfaceSwapchainCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrAndroidSurfaceSwapchainCreateInfoFB.CREATEFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrAndroidSurfaceSwapchainCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrAndroidSurfaceSwapchainCreateInfoFB.NEXT, check(value)); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrAndroidSurfaceSwapchainCreateInfoFB.CREATEFLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrAndroidSurfaceSwapchainCreateInfoFB.NEXT));
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

    /** An array of {@link XrAndroidSurfaceSwapchainCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrAndroidSurfaceSwapchainCreateInfoFB, Buffer> implements NativeResource {

        private static final XrAndroidSurfaceSwapchainCreateInfoFB ELEMENT_FACTORY = XrAndroidSurfaceSwapchainCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrAndroidSurfaceSwapchainCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAndroidSurfaceSwapchainCreateInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrAndroidSurfaceSwapchainCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrAndroidSurfaceSwapchainCreateInfoFB.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrAndroidSurfaceSwapchainCreateInfoFB.nnext(address()); }
        /** Returns the value of the {@code createFlags} field. */
        @NativeType("XrAndroidSurfaceSwapchainFlagsFB")
        public long createFlags() { return XrAndroidSurfaceSwapchainCreateInfoFB.ncreateFlags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrAndroidSurfaceSwapchainCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrAndroidSurfaceSwapchainCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrAndroidSurfaceSwapchainCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrAndroidSurfaceSwapchainCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrAndroidSurfaceSwapchainCreateInfoFB.Buffer createFlags(@NativeType("XrAndroidSurfaceSwapchainFlagsFB") long value) { XrAndroidSurfaceSwapchainCreateInfoFB.ncreateFlags(address(), value); return this; }

    }

}