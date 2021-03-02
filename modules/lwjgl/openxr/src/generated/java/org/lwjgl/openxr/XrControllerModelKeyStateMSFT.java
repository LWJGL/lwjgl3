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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrControllerModelKeyStateMSFT {
 *     XrStructureType type;
 *     void * next;
 *     XrControllerModelKeyMSFT modelKey;
 * }</code></pre>
 */
public class XrControllerModelKeyStateMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MODELKEY;

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
        MODELKEY = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrControllerModelKeyStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelKeyStateMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code modelKey} field. */
    @NativeType("XrControllerModelKeyMSFT")
    public long modelKey() { return nmodelKey(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrControllerModelKeyStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrControllerModelKeyStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code modelKey} field. */
    public XrControllerModelKeyStateMSFT modelKey(@NativeType("XrControllerModelKeyMSFT") long value) { nmodelKey(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelKeyStateMSFT set(
        int type,
        long next,
        long modelKey
    ) {
        type(type);
        next(next);
        modelKey(modelKey);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelKeyStateMSFT set(XrControllerModelKeyStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelKeyStateMSFT malloc() {
        return wrap(XrControllerModelKeyStateMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelKeyStateMSFT calloc() {
        return wrap(XrControllerModelKeyStateMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelKeyStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrControllerModelKeyStateMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelKeyStateMSFT} instance for the specified memory address. */
    public static XrControllerModelKeyStateMSFT create(long address) {
        return wrap(XrControllerModelKeyStateMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelKeyStateMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrControllerModelKeyStateMSFT.class, address);
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrControllerModelKeyStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrControllerModelKeyStateMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrControllerModelKeyStateMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrControllerModelKeyStateMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelKeyStateMSFT mallocStack(MemoryStack stack) {
        return wrap(XrControllerModelKeyStateMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrControllerModelKeyStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelKeyStateMSFT callocStack(MemoryStack stack) {
        return wrap(XrControllerModelKeyStateMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelKeyStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelKeyStateMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrControllerModelKeyStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelKeyStateMSFT.NEXT); }
    /** Unsafe version of {@link #modelKey}. */
    public static long nmodelKey(long struct) { return UNSAFE.getLong(null, struct + XrControllerModelKeyStateMSFT.MODELKEY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrControllerModelKeyStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelKeyStateMSFT.NEXT, value); }
    /** Unsafe version of {@link #modelKey(long) modelKey}. */
    public static void nmodelKey(long struct, long value) { UNSAFE.putLong(null, struct + XrControllerModelKeyStateMSFT.MODELKEY, value); }

    // -----------------------------------

    /** An array of {@link XrControllerModelKeyStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelKeyStateMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelKeyStateMSFT ELEMENT_FACTORY = XrControllerModelKeyStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelKeyStateMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelKeyStateMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrControllerModelKeyStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelKeyStateMSFT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelKeyStateMSFT.nnext(address()); }
        /** Returns the value of the {@code modelKey} field. */
        @NativeType("XrControllerModelKeyMSFT")
        public long modelKey() { return XrControllerModelKeyStateMSFT.nmodelKey(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrControllerModelKeyStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelKeyStateMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrControllerModelKeyStateMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelKeyStateMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code modelKey} field. */
        public XrControllerModelKeyStateMSFT.Buffer modelKey(@NativeType("XrControllerModelKeyMSFT") long value) { XrControllerModelKeyStateMSFT.nmodelKey(address(), value); return this; }

    }

}