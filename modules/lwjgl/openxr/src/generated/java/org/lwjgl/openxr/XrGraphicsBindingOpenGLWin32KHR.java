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

import org.lwjgl.system.windows.*;
import org.lwjgl.opengl.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingOpenGLWin32KHR {
 *     XrStructureType type;
 *     void const * next;
 *     HDC hDC;
 *     HGLRC hGLRC;
 * }</code></pre>
 */
public class XrGraphicsBindingOpenGLWin32KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HDC,
        HGLRC;

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
        HDC = layout.offsetof(2);
        HGLRC = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrGraphicsBindingOpenGLWin32KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingOpenGLWin32KHR(ByteBuffer container) {
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
    /** Returns the value of the {@code hDC} field. */
    @NativeType("HDC")
    public long hDC() { return nhDC(address()); }
    /** Returns the value of the {@code hGLRC} field. */
    @NativeType("HGLRC")
    public long hGLRC() { return nhGLRC(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingOpenGLWin32KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingOpenGLWin32KHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code hDC} field. */
    public XrGraphicsBindingOpenGLWin32KHR hDC(@NativeType("HDC") long value) { nhDC(address(), value); return this; }
    /** Sets the specified value to the {@code hGLRC} field. */
    public XrGraphicsBindingOpenGLWin32KHR hGLRC(@NativeType("HGLRC") long value) { nhGLRC(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingOpenGLWin32KHR set(
        int type,
        long next,
        long hDC,
        long hGLRC
    ) {
        type(type);
        next(next);
        hDC(hDC);
        hGLRC(hGLRC);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingOpenGLWin32KHR set(XrGraphicsBindingOpenGLWin32KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWin32KHR malloc() {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWin32KHR calloc() {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLWin32KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLWin32KHR create(long address) {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLWin32KHR createSafe(long address) {
        return address == NULL ? null : wrap(XrGraphicsBindingOpenGLWin32KHR.class, address);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrGraphicsBindingOpenGLWin32KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrGraphicsBindingOpenGLWin32KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWin32KHR mallocStack(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWin32KHR callocStack(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLWin32KHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.NEXT); }
    /** Unsafe version of {@link #hDC}. */
    public static long nhDC(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC); }
    /** Unsafe version of {@link #hGLRC}. */
    public static long nhGLRC(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLWin32KHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWin32KHR.NEXT, check(value)); }
    /** Unsafe version of {@link #hDC(long) hDC}. */
    public static void nhDC(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC, check(value)); }
    /** Unsafe version of {@link #hGLRC(long) hGLRC}. */
    public static void nhGLRC(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.NEXT));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC));
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

    /** An array of {@link XrGraphicsBindingOpenGLWin32KHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingOpenGLWin32KHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingOpenGLWin32KHR ELEMENT_FACTORY = XrGraphicsBindingOpenGLWin32KHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingOpenGLWin32KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLWin32KHR#SIZEOF}, and its mark will be undefined.
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
        protected XrGraphicsBindingOpenGLWin32KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLWin32KHR.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLWin32KHR.nnext(address()); }
        /** Returns the value of the {@code hDC} field. */
        @NativeType("HDC")
        public long hDC() { return XrGraphicsBindingOpenGLWin32KHR.nhDC(address()); }
        /** Returns the value of the {@code hGLRC} field. */
        @NativeType("HGLRC")
        public long hGLRC() { return XrGraphicsBindingOpenGLWin32KHR.nhGLRC(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLWin32KHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLWin32KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code hDC} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer hDC(@NativeType("HDC") long value) { XrGraphicsBindingOpenGLWin32KHR.nhDC(address(), value); return this; }
        /** Sets the specified value to the {@code hGLRC} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer hGLRC(@NativeType("HGLRC") long value) { XrGraphicsBindingOpenGLWin32KHR.nhGLRC(address(), value); return this; }

    }

}