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
 * struct XrInstanceCreateInfoAndroidKHR {
 *     XrStructureType type;
 *     void const * next;
 *     void * applicationVM;
 *     void * applicationActivity;
 * }</code></pre>
 */
public class XrInstanceCreateInfoAndroidKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        APPLICATIONVM,
        APPLICATIONACTIVITY;

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
        APPLICATIONACTIVITY = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrInstanceCreateInfoAndroidKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInstanceCreateInfoAndroidKHR(ByteBuffer container) {
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
    /** @return the value of the {@code applicationVM} field. */
    @NativeType("void *")
    public long applicationVM() { return napplicationVM(address()); }
    /** @return the value of the {@code applicationActivity} field. */
    @NativeType("void *")
    public long applicationActivity() { return napplicationActivity(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInstanceCreateInfoAndroidKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrInstanceCreateInfoAndroidKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code applicationVM} field. */
    public XrInstanceCreateInfoAndroidKHR applicationVM(@NativeType("void *") long value) { napplicationVM(address(), value); return this; }
    /** Sets the specified value to the {@code applicationActivity} field. */
    public XrInstanceCreateInfoAndroidKHR applicationActivity(@NativeType("void *") long value) { napplicationActivity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInstanceCreateInfoAndroidKHR set(
        int type,
        long next,
        long applicationVM,
        long applicationActivity
    ) {
        type(type);
        next(next);
        applicationVM(applicationVM);
        applicationActivity(applicationActivity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInstanceCreateInfoAndroidKHR set(XrInstanceCreateInfoAndroidKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfoAndroidKHR malloc() {
        return wrap(XrInstanceCreateInfoAndroidKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfoAndroidKHR calloc() {
        return wrap(XrInstanceCreateInfoAndroidKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated with {@link BufferUtils}. */
    public static XrInstanceCreateInfoAndroidKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrInstanceCreateInfoAndroidKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance for the specified memory address. */
    public static XrInstanceCreateInfoAndroidKHR create(long address) {
        return wrap(XrInstanceCreateInfoAndroidKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceCreateInfoAndroidKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrInstanceCreateInfoAndroidKHR.class, address);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceCreateInfoAndroidKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrInstanceCreateInfoAndroidKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrInstanceCreateInfoAndroidKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfoAndroidKHR mallocStack(MemoryStack stack) {
        return wrap(XrInstanceCreateInfoAndroidKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrInstanceCreateInfoAndroidKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfoAndroidKHR callocStack(MemoryStack stack) {
        return wrap(XrInstanceCreateInfoAndroidKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfoAndroidKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfoAndroidKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInstanceCreateInfoAndroidKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.NEXT); }
    /** Unsafe version of {@link #applicationVM}. */
    public static long napplicationVM(long struct) { return memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONVM); }
    /** Unsafe version of {@link #applicationActivity}. */
    public static long napplicationActivity(long struct) { return memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONACTIVITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInstanceCreateInfoAndroidKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfoAndroidKHR.NEXT, value); }
    /** Unsafe version of {@link #applicationVM(long) applicationVM}. */
    public static void napplicationVM(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONVM, check(value)); }
    /** Unsafe version of {@link #applicationActivity(long) applicationActivity}. */
    public static void napplicationActivity(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONACTIVITY, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONVM));
        check(memGetAddress(struct + XrInstanceCreateInfoAndroidKHR.APPLICATIONACTIVITY));
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

    /** An array of {@link XrInstanceCreateInfoAndroidKHR} structs. */
    public static class Buffer extends StructBuffer<XrInstanceCreateInfoAndroidKHR, Buffer> implements NativeResource {

        private static final XrInstanceCreateInfoAndroidKHR ELEMENT_FACTORY = XrInstanceCreateInfoAndroidKHR.create(-1L);

        /**
         * Creates a new {@code XrInstanceCreateInfoAndroidKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInstanceCreateInfoAndroidKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrInstanceCreateInfoAndroidKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInstanceCreateInfoAndroidKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInstanceCreateInfoAndroidKHR.nnext(address()); }
        /** @return the value of the {@code applicationVM} field. */
        @NativeType("void *")
        public long applicationVM() { return XrInstanceCreateInfoAndroidKHR.napplicationVM(address()); }
        /** @return the value of the {@code applicationActivity} field. */
        @NativeType("void *")
        public long applicationActivity() { return XrInstanceCreateInfoAndroidKHR.napplicationActivity(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer type(@NativeType("XrStructureType") int value) { XrInstanceCreateInfoAndroidKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer next(@NativeType("void const *") long value) { XrInstanceCreateInfoAndroidKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code applicationVM} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer applicationVM(@NativeType("void *") long value) { XrInstanceCreateInfoAndroidKHR.napplicationVM(address(), value); return this; }
        /** Sets the specified value to the {@code applicationActivity} field. */
        public XrInstanceCreateInfoAndroidKHR.Buffer applicationActivity(@NativeType("void *") long value) { XrInstanceCreateInfoAndroidKHR.napplicationActivity(address(), value); return this; }

    }

}