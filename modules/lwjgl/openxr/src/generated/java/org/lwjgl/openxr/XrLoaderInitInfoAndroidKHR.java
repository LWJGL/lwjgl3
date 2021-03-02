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
 * struct XrLoaderInitInfoAndroidKHR {
 *     XrStructureType type;
 *     void const * next;
 *     void * applicationVM;
 *     void * applicationContext;
 * }</code></pre>
 */
public class XrLoaderInitInfoAndroidKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        APPLICATIONVM,
        APPLICATIONCONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        APPLICATIONVM = layout.offsetof(2);
        APPLICATIONCONTEXT = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrLoaderInitInfoAndroidKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLoaderInitInfoAndroidKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code applicationVM} field. */
    @NativeType("void *")
    public long applicationVM() { return napplicationVM(address()); }
    /** Returns the value of the {@code applicationContext} field. */
    @NativeType("void *")
    public long applicationContext() { return napplicationContext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrLoaderInitInfoAndroidKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrLoaderInitInfoAndroidKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code applicationVM} field. */
    public XrLoaderInitInfoAndroidKHR applicationVM(@NativeType("void *") long value) { napplicationVM(address(), value); return this; }
    /** Sets the specified value to the {@code applicationContext} field. */
    public XrLoaderInitInfoAndroidKHR applicationContext(@NativeType("void *") long value) { napplicationContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLoaderInitInfoAndroidKHR set(
        int type,
        long next,
        long applicationVM,
        long applicationContext
    ) {
        type(type);
        next(next);
        applicationVM(applicationVM);
        applicationContext(applicationContext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLoaderInitInfoAndroidKHR set(XrLoaderInitInfoAndroidKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLoaderInitInfoAndroidKHR malloc() {
        return wrap(XrLoaderInitInfoAndroidKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLoaderInitInfoAndroidKHR calloc() {
        return wrap(XrLoaderInitInfoAndroidKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated with {@link BufferUtils}. */
    public static XrLoaderInitInfoAndroidKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrLoaderInitInfoAndroidKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrLoaderInitInfoAndroidKHR} instance for the specified memory address. */
    public static XrLoaderInitInfoAndroidKHR create(long address) {
        return wrap(XrLoaderInitInfoAndroidKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrLoaderInitInfoAndroidKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrLoaderInitInfoAndroidKHR.class, address);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrLoaderInitInfoAndroidKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrLoaderInitInfoAndroidKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrLoaderInitInfoAndroidKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrLoaderInitInfoAndroidKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitInfoAndroidKHR mallocStack(MemoryStack stack) {
        return wrap(XrLoaderInitInfoAndroidKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrLoaderInitInfoAndroidKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLoaderInitInfoAndroidKHR callocStack(MemoryStack stack) {
        return wrap(XrLoaderInitInfoAndroidKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLoaderInitInfoAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLoaderInitInfoAndroidKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrLoaderInitInfoAndroidKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLoaderInitInfoAndroidKHR.NEXT); }
    /** Unsafe version of {@link #applicationVM}. */
    public static long napplicationVM(long struct) { return memGetAddress(struct + XrLoaderInitInfoAndroidKHR.APPLICATIONVM); }
    /** Unsafe version of {@link #applicationContext}. */
    public static long napplicationContext(long struct) { return memGetAddress(struct + XrLoaderInitInfoAndroidKHR.APPLICATIONCONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrLoaderInitInfoAndroidKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLoaderInitInfoAndroidKHR.NEXT, value); }
    /** Unsafe version of {@link #applicationVM(long) applicationVM}. */
    public static void napplicationVM(long struct, long value) { memPutAddress(struct + XrLoaderInitInfoAndroidKHR.APPLICATIONVM, check(value)); }
    /** Unsafe version of {@link #applicationContext(long) applicationContext}. */
    public static void napplicationContext(long struct, long value) { memPutAddress(struct + XrLoaderInitInfoAndroidKHR.APPLICATIONCONTEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrLoaderInitInfoAndroidKHR.APPLICATIONVM));
        check(memGetAddress(struct + XrLoaderInitInfoAndroidKHR.APPLICATIONCONTEXT));
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

    /** An array of {@link XrLoaderInitInfoAndroidKHR} structs. */
    public static class Buffer extends StructBuffer<XrLoaderInitInfoAndroidKHR, Buffer> implements NativeResource {

        private static final XrLoaderInitInfoAndroidKHR ELEMENT_FACTORY = XrLoaderInitInfoAndroidKHR.create(-1L);

        /**
         * Creates a new {@code XrLoaderInitInfoAndroidKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLoaderInitInfoAndroidKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrLoaderInitInfoAndroidKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLoaderInitInfoAndroidKHR.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrLoaderInitInfoAndroidKHR.nnext(address()); }
        /** Returns the value of the {@code applicationVM} field. */
        @NativeType("void *")
        public long applicationVM() { return XrLoaderInitInfoAndroidKHR.napplicationVM(address()); }
        /** Returns the value of the {@code applicationContext} field. */
        @NativeType("void *")
        public long applicationContext() { return XrLoaderInitInfoAndroidKHR.napplicationContext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrLoaderInitInfoAndroidKHR.Buffer type(@NativeType("XrStructureType") int value) { XrLoaderInitInfoAndroidKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrLoaderInitInfoAndroidKHR.Buffer next(@NativeType("void const *") long value) { XrLoaderInitInfoAndroidKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code applicationVM} field. */
        public XrLoaderInitInfoAndroidKHR.Buffer applicationVM(@NativeType("void *") long value) { XrLoaderInitInfoAndroidKHR.napplicationVM(address(), value); return this; }
        /** Sets the specified value to the {@code applicationContext} field. */
        public XrLoaderInitInfoAndroidKHR.Buffer applicationContext(@NativeType("void *") long value) { XrLoaderInitInfoAndroidKHR.napplicationContext(address(), value); return this; }

    }

}