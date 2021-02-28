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
 * struct XrSecondaryViewConfigurationFrameStateMSFT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t viewConfigurationCount;
 *     {@link XrSecondaryViewConfigurationStateMSFT XrSecondaryViewConfigurationStateMSFT} * viewConfigurationStates;
 * }</code></pre>
 */
public class XrSecondaryViewConfigurationFrameStateMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONCOUNT,
        VIEWCONFIGURATIONSTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONCOUNT = layout.offsetof(2);
        VIEWCONFIGURATIONSTATES = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationFrameStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationFrameStateMSFT(ByteBuffer container) {
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
    /** Returns the value of the {@code viewConfigurationCount} field. */
    @NativeType("uint32_t")
    public int viewConfigurationCount() { return nviewConfigurationCount(address()); }
    /** Returns a {@link XrSecondaryViewConfigurationStateMSFT.Buffer} view of the struct array pointed to by the {@code viewConfigurationStates} field. */
    @NativeType("XrSecondaryViewConfigurationStateMSFT *")
    public XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationStates() { return nviewConfigurationStates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSecondaryViewConfigurationStateMSFT.Buffer} to the {@code viewConfigurationStates} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT viewConfigurationStates(@NativeType("XrSecondaryViewConfigurationStateMSFT *") XrSecondaryViewConfigurationStateMSFT.Buffer value) { nviewConfigurationStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationFrameStateMSFT set(
        int type,
        long next,
        XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationStates
    ) {
        type(type);
        next(next);
        viewConfigurationStates(viewConfigurationStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationFrameStateMSFT set(XrSecondaryViewConfigurationFrameStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationFrameStateMSFT malloc() {
        return wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationFrameStateMSFT calloc() {
        return wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationFrameStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationFrameStateMSFT create(long address) {
        return wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationFrameStateMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSecondaryViewConfigurationFrameStateMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSecondaryViewConfigurationFrameStateMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT mallocStack(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT callocStack(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationFrameStateMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationFrameStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationCount}. */
    public static int nviewConfigurationCount(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONCOUNT); }
    /** Unsafe version of {@link #viewConfigurationStates}. */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer nviewConfigurationStates(long struct) { return XrSecondaryViewConfigurationStateMSFT.create(memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONSTATES), nviewConfigurationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationFrameStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.NEXT, check(value)); }
    /** Sets the specified value to the {@code viewConfigurationCount} field of the specified {@code struct}. */
    public static void nviewConfigurationCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONCOUNT, value); }
    /** Unsafe version of {@link #viewConfigurationStates(XrSecondaryViewConfigurationStateMSFT.Buffer) viewConfigurationStates}. */
    public static void nviewConfigurationStates(long struct, XrSecondaryViewConfigurationStateMSFT.Buffer value) { memPutAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONSTATES, value.address()); nviewConfigurationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.NEXT));
        int viewConfigurationCount = nviewConfigurationCount(struct);
        long viewConfigurationStates = memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONSTATES);
        check(viewConfigurationStates);
        XrSecondaryViewConfigurationStateMSFT.validate(viewConfigurationStates, viewConfigurationCount);
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

    /** An array of {@link XrSecondaryViewConfigurationFrameStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationFrameStateMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationFrameStateMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationFrameStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationFrameStateMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSecondaryViewConfigurationFrameStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationFrameStateMSFT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSecondaryViewConfigurationFrameStateMSFT.nnext(address()); }
        /** Returns the value of the {@code viewConfigurationCount} field. */
        @NativeType("uint32_t")
        public int viewConfigurationCount() { return XrSecondaryViewConfigurationFrameStateMSFT.nviewConfigurationCount(address()); }
        /** Returns a {@link XrSecondaryViewConfigurationStateMSFT.Buffer} view of the struct array pointed to by the {@code viewConfigurationStates} field. */
        @NativeType("XrSecondaryViewConfigurationStateMSFT *")
        public XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationStates() { return XrSecondaryViewConfigurationFrameStateMSFT.nviewConfigurationStates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationFrameStateMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer next(@NativeType("void *") long value) { XrSecondaryViewConfigurationFrameStateMSFT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSecondaryViewConfigurationStateMSFT.Buffer} to the {@code viewConfigurationStates} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer viewConfigurationStates(@NativeType("XrSecondaryViewConfigurationStateMSFT *") XrSecondaryViewConfigurationStateMSFT.Buffer value) { XrSecondaryViewConfigurationFrameStateMSFT.nviewConfigurationStates(address(), value); return this; }

    }

}