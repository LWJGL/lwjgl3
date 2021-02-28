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
 * struct XrViewConfigurationViewFovEPIC {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrFovf XrFovf} recommendedFov;
 *     {@link XrFovf XrFovf} maxMutableFov;
 * }</code></pre>
 */
public class XrViewConfigurationViewFovEPIC extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOMMENDEDFOV,
        MAXMUTABLEFOV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOMMENDEDFOV = layout.offsetof(2);
        MAXMUTABLEFOV = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrViewConfigurationViewFovEPIC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewConfigurationViewFovEPIC(ByteBuffer container) {
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
    /** Returns a {@link XrFovf} view of the {@code recommendedFov} field. */
    public XrFovf recommendedFov() { return nrecommendedFov(address()); }
    /** Returns a {@link XrFovf} view of the {@code maxMutableFov} field. */
    public XrFovf maxMutableFov() { return nmaxMutableFov(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrViewConfigurationViewFovEPIC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrViewConfigurationViewFovEPIC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrFovf} to the {@code recommendedFov} field. */
    public XrViewConfigurationViewFovEPIC recommendedFov(XrFovf value) { nrecommendedFov(address(), value); return this; }
    /** Passes the {@code recommendedFov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrViewConfigurationViewFovEPIC recommendedFov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(recommendedFov()); return this; }
    /** Copies the specified {@link XrFovf} to the {@code maxMutableFov} field. */
    public XrViewConfigurationViewFovEPIC maxMutableFov(XrFovf value) { nmaxMutableFov(address(), value); return this; }
    /** Passes the {@code maxMutableFov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrViewConfigurationViewFovEPIC maxMutableFov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(maxMutableFov()); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewConfigurationViewFovEPIC set(
        int type,
        long next,
        XrFovf recommendedFov,
        XrFovf maxMutableFov
    ) {
        type(type);
        next(next);
        recommendedFov(recommendedFov);
        maxMutableFov(maxMutableFov);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewConfigurationViewFovEPIC set(XrViewConfigurationViewFovEPIC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationViewFovEPIC malloc() {
        return wrap(XrViewConfigurationViewFovEPIC.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationViewFovEPIC calloc() {
        return wrap(XrViewConfigurationViewFovEPIC.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated with {@link BufferUtils}. */
    public static XrViewConfigurationViewFovEPIC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrViewConfigurationViewFovEPIC.class, memAddress(container), container);
    }

    /** Returns a new {@code XrViewConfigurationViewFovEPIC} instance for the specified memory address. */
    public static XrViewConfigurationViewFovEPIC create(long address) {
        return wrap(XrViewConfigurationViewFovEPIC.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewConfigurationViewFovEPIC createSafe(long address) {
        return address == NULL ? null : wrap(XrViewConfigurationViewFovEPIC.class, address);
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrViewConfigurationViewFovEPIC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewConfigurationViewFovEPIC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrViewConfigurationViewFovEPIC mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrViewConfigurationViewFovEPIC callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationViewFovEPIC mallocStack(MemoryStack stack) {
        return wrap(XrViewConfigurationViewFovEPIC.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrViewConfigurationViewFovEPIC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationViewFovEPIC callocStack(MemoryStack stack) {
        return wrap(XrViewConfigurationViewFovEPIC.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationViewFovEPIC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationViewFovEPIC.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationViewFovEPIC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewConfigurationViewFovEPIC.NEXT); }
    /** Unsafe version of {@link #recommendedFov}. */
    public static XrFovf nrecommendedFov(long struct) { return XrFovf.create(struct + XrViewConfigurationViewFovEPIC.RECOMMENDEDFOV); }
    /** Unsafe version of {@link #maxMutableFov}. */
    public static XrFovf nmaxMutableFov(long struct) { return XrFovf.create(struct + XrViewConfigurationViewFovEPIC.MAXMUTABLEFOV); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationViewFovEPIC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewConfigurationViewFovEPIC.NEXT, check(value)); }
    /** Unsafe version of {@link #recommendedFov(XrFovf) recommendedFov}. */
    public static void nrecommendedFov(long struct, XrFovf value) { memCopy(value.address(), struct + XrViewConfigurationViewFovEPIC.RECOMMENDEDFOV, XrFovf.SIZEOF); }
    /** Unsafe version of {@link #maxMutableFov(XrFovf) maxMutableFov}. */
    public static void nmaxMutableFov(long struct, XrFovf value) { memCopy(value.address(), struct + XrViewConfigurationViewFovEPIC.MAXMUTABLEFOV, XrFovf.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrViewConfigurationViewFovEPIC.NEXT));
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

    /** An array of {@link XrViewConfigurationViewFovEPIC} structs. */
    public static class Buffer extends StructBuffer<XrViewConfigurationViewFovEPIC, Buffer> implements NativeResource {

        private static final XrViewConfigurationViewFovEPIC ELEMENT_FACTORY = XrViewConfigurationViewFovEPIC.create(-1L);

        /**
         * Creates a new {@code XrViewConfigurationViewFovEPIC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewConfigurationViewFovEPIC#SIZEOF}, and its mark will be undefined.
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
        protected XrViewConfigurationViewFovEPIC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewConfigurationViewFovEPIC.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrViewConfigurationViewFovEPIC.nnext(address()); }
        /** Returns a {@link XrFovf} view of the {@code recommendedFov} field. */
        public XrFovf recommendedFov() { return XrViewConfigurationViewFovEPIC.nrecommendedFov(address()); }
        /** Returns a {@link XrFovf} view of the {@code maxMutableFov} field. */
        public XrFovf maxMutableFov() { return XrViewConfigurationViewFovEPIC.nmaxMutableFov(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrViewConfigurationViewFovEPIC.Buffer type(@NativeType("XrStructureType") int value) { XrViewConfigurationViewFovEPIC.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrViewConfigurationViewFovEPIC.Buffer next(@NativeType("void const *") long value) { XrViewConfigurationViewFovEPIC.nnext(address(), value); return this; }
        /** Copies the specified {@link XrFovf} to the {@code recommendedFov} field. */
        public XrViewConfigurationViewFovEPIC.Buffer recommendedFov(XrFovf value) { XrViewConfigurationViewFovEPIC.nrecommendedFov(address(), value); return this; }
        /** Passes the {@code recommendedFov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrViewConfigurationViewFovEPIC.Buffer recommendedFov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(recommendedFov()); return this; }
        /** Copies the specified {@link XrFovf} to the {@code maxMutableFov} field. */
        public XrViewConfigurationViewFovEPIC.Buffer maxMutableFov(XrFovf value) { XrViewConfigurationViewFovEPIC.nmaxMutableFov(address(), value); return this; }
        /** Passes the {@code maxMutableFov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrViewConfigurationViewFovEPIC.Buffer maxMutableFov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(maxMutableFov()); return this; }

    }

}