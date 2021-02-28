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
 * struct XrSpaceVelocity {
 *     XrStructureType type;
 *     void * next;
 *     XrSpaceVelocityFlags velocityFlags;
 *     {@link XrVector3f XrVector3f} linearVelocity;
 *     {@link XrVector3f XrVector3f} angularVelocity;
 * }</code></pre>
 */
public class XrSpaceVelocity extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VELOCITYFLAGS,
        LINEARVELOCITY,
        ANGULARVELOCITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VELOCITYFLAGS = layout.offsetof(2);
        LINEARVELOCITY = layout.offsetof(3);
        ANGULARVELOCITY = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSpaceVelocity} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceVelocity(ByteBuffer container) {
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
    /** Returns the value of the {@code velocityFlags} field. */
    @NativeType("XrSpaceVelocityFlags")
    public long velocityFlags() { return nvelocityFlags(address()); }
    /** Returns a {@link XrVector3f} view of the {@code linearVelocity} field. */
    public XrVector3f linearVelocity() { return nlinearVelocity(address()); }
    /** Returns a {@link XrVector3f} view of the {@code angularVelocity} field. */
    public XrVector3f angularVelocity() { return nangularVelocity(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceVelocity type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceVelocity next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code velocityFlags} field. */
    public XrSpaceVelocity velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { nvelocityFlags(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code linearVelocity} field. */
    public XrSpaceVelocity linearVelocity(XrVector3f value) { nlinearVelocity(address(), value); return this; }
    /** Passes the {@code linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceVelocity linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code angularVelocity} field. */
    public XrSpaceVelocity angularVelocity(XrVector3f value) { nangularVelocity(address(), value); return this; }
    /** Passes the {@code angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceVelocity angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceVelocity set(
        int type,
        long next,
        long velocityFlags,
        XrVector3f linearVelocity,
        XrVector3f angularVelocity
    ) {
        type(type);
        next(next);
        velocityFlags(velocityFlags);
        linearVelocity(linearVelocity);
        angularVelocity(angularVelocity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceVelocity set(XrSpaceVelocity src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceVelocity} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocity malloc() {
        return wrap(XrSpaceVelocity.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpaceVelocity} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocity calloc() {
        return wrap(XrSpaceVelocity.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpaceVelocity} instance allocated with {@link BufferUtils}. */
    public static XrSpaceVelocity create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpaceVelocity.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceVelocity} instance for the specified memory address. */
    public static XrSpaceVelocity create(long address) {
        return wrap(XrSpaceVelocity.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceVelocity createSafe(long address) {
        return address == NULL ? null : wrap(XrSpaceVelocity.class, address);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpaceVelocity.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceVelocity.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceVelocity} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSpaceVelocity mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSpaceVelocity} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSpaceVelocity callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSpaceVelocity} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocity mallocStack(MemoryStack stack) {
        return wrap(XrSpaceVelocity.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpaceVelocity} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocity callocStack(MemoryStack stack) {
        return wrap(XrSpaceVelocity.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceVelocity.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceVelocity.NEXT); }
    /** Unsafe version of {@link #velocityFlags}. */
    public static long nvelocityFlags(long struct) { return UNSAFE.getLong(null, struct + XrSpaceVelocity.VELOCITYFLAGS); }
    /** Unsafe version of {@link #linearVelocity}. */
    public static XrVector3f nlinearVelocity(long struct) { return XrVector3f.create(struct + XrSpaceVelocity.LINEARVELOCITY); }
    /** Unsafe version of {@link #angularVelocity}. */
    public static XrVector3f nangularVelocity(long struct) { return XrVector3f.create(struct + XrSpaceVelocity.ANGULARVELOCITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceVelocity.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceVelocity.NEXT, check(value)); }
    /** Unsafe version of {@link #velocityFlags(long) velocityFlags}. */
    public static void nvelocityFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSpaceVelocity.VELOCITYFLAGS, value); }
    /** Unsafe version of {@link #linearVelocity(XrVector3f) linearVelocity}. */
    public static void nlinearVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpaceVelocity.LINEARVELOCITY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #angularVelocity(XrVector3f) angularVelocity}. */
    public static void nangularVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpaceVelocity.ANGULARVELOCITY, XrVector3f.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceVelocity.NEXT));
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

    /** An array of {@link XrSpaceVelocity} structs. */
    public static class Buffer extends StructBuffer<XrSpaceVelocity, Buffer> implements NativeResource {

        private static final XrSpaceVelocity ELEMENT_FACTORY = XrSpaceVelocity.create(-1L);

        /**
         * Creates a new {@code XrSpaceVelocity.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceVelocity#SIZEOF}, and its mark will be undefined.
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
        protected XrSpaceVelocity getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceVelocity.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceVelocity.nnext(address()); }
        /** Returns the value of the {@code velocityFlags} field. */
        @NativeType("XrSpaceVelocityFlags")
        public long velocityFlags() { return XrSpaceVelocity.nvelocityFlags(address()); }
        /** Returns a {@link XrVector3f} view of the {@code linearVelocity} field. */
        public XrVector3f linearVelocity() { return XrSpaceVelocity.nlinearVelocity(address()); }
        /** Returns a {@link XrVector3f} view of the {@code angularVelocity} field. */
        public XrVector3f angularVelocity() { return XrSpaceVelocity.nangularVelocity(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceVelocity.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceVelocity.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceVelocity.Buffer next(@NativeType("void *") long value) { XrSpaceVelocity.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code velocityFlags} field. */
        public XrSpaceVelocity.Buffer velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { XrSpaceVelocity.nvelocityFlags(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code linearVelocity} field. */
        public XrSpaceVelocity.Buffer linearVelocity(XrVector3f value) { XrSpaceVelocity.nlinearVelocity(address(), value); return this; }
        /** Passes the {@code linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceVelocity.Buffer linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code angularVelocity} field. */
        public XrSpaceVelocity.Buffer angularVelocity(XrVector3f value) { XrSpaceVelocity.nangularVelocity(address(), value); return this; }
        /** Passes the {@code angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceVelocity.Buffer angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    }

}