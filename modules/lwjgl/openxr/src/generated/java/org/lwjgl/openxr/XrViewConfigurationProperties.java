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
 * struct XrViewConfigurationProperties {
 *     XrStructureType type;
 *     void * next;
 *     XrViewConfigurationType viewConfigurationType;
 *     XrBool32 fovMutable;
 * }</code></pre>
 */
public class XrViewConfigurationProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONTYPE,
        FOVMUTABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONTYPE = layout.offsetof(2);
        FOVMUTABLE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrViewConfigurationProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewConfigurationProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code viewConfigurationType} field. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** @return the value of the {@code fovMutable} field. */
    @NativeType("XrBool32")
    public boolean fovMutable() { return nfovMutable(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrViewConfigurationProperties type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrViewConfigurationProperties next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code viewConfigurationType} field. */
    public XrViewConfigurationProperties viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }
    /** Sets the specified value to the {@code fovMutable} field. */
    public XrViewConfigurationProperties fovMutable(@NativeType("XrBool32") boolean value) { nfovMutable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewConfigurationProperties set(
        int type,
        long next,
        int viewConfigurationType,
        boolean fovMutable
    ) {
        type(type);
        next(next);
        viewConfigurationType(viewConfigurationType);
        fovMutable(fovMutable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewConfigurationProperties set(XrViewConfigurationProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationProperties malloc() {
        return wrap(XrViewConfigurationProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrViewConfigurationProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationProperties calloc() {
        return wrap(XrViewConfigurationProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrViewConfigurationProperties} instance allocated with {@link BufferUtils}. */
    public static XrViewConfigurationProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrViewConfigurationProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code XrViewConfigurationProperties} instance for the specified memory address. */
    public static XrViewConfigurationProperties create(long address) {
        return wrap(XrViewConfigurationProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewConfigurationProperties createSafe(long address) {
        return address == NULL ? null : wrap(XrViewConfigurationProperties.class, address);
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrViewConfigurationProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewConfigurationProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrViewConfigurationProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrViewConfigurationProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrViewConfigurationProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrViewConfigurationProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationProperties mallocStack(MemoryStack stack) {
        return wrap(XrViewConfigurationProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrViewConfigurationProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationProperties callocStack(MemoryStack stack) {
        return wrap(XrViewConfigurationProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationProperties.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewConfigurationProperties.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationProperties.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #fovMutable}. */
    public static int nfovMutable(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationProperties.FOVMUTABLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationProperties.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewConfigurationProperties.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationProperties.VIEWCONFIGURATIONTYPE, value); }
    /** Unsafe version of {@link #fovMutable(boolean) fovMutable}. */
    public static void nfovMutable(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationProperties.FOVMUTABLE, value); }

    // -----------------------------------

    /** An array of {@link XrViewConfigurationProperties} structs. */
    public static class Buffer extends StructBuffer<XrViewConfigurationProperties, Buffer> implements NativeResource {

        private static final XrViewConfigurationProperties ELEMENT_FACTORY = XrViewConfigurationProperties.create(-1L);

        /**
         * Creates a new {@code XrViewConfigurationProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewConfigurationProperties#SIZEOF}, and its mark will be undefined.
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
        protected XrViewConfigurationProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewConfigurationProperties.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrViewConfigurationProperties.nnext(address()); }
        /** @return the value of the {@code viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrViewConfigurationProperties.nviewConfigurationType(address()); }
        /** @return the value of the {@code fovMutable} field. */
        @NativeType("XrBool32")
        public boolean fovMutable() { return XrViewConfigurationProperties.nfovMutable(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrViewConfigurationProperties.Buffer type(@NativeType("XrStructureType") int value) { XrViewConfigurationProperties.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrViewConfigurationProperties.Buffer next(@NativeType("void *") long value) { XrViewConfigurationProperties.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code viewConfigurationType} field. */
        public XrViewConfigurationProperties.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrViewConfigurationProperties.nviewConfigurationType(address(), value); return this; }
        /** Sets the specified value to the {@code fovMutable} field. */
        public XrViewConfigurationProperties.Buffer fovMutable(@NativeType("XrBool32") boolean value) { XrViewConfigurationProperties.nfovMutable(address(), value ? 1 : 0); return this; }

    }

}