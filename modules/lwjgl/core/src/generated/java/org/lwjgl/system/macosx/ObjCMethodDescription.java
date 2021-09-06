/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines a method.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct objc_method_description {
 *     SEL {@link #name};
 *     char * {@link #types};
 * }</code></pre>
 */
@NativeType("struct objc_method_description")
public class ObjCMethodDescription extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPES = layout.offsetof(1);
    }

    /**
     * Creates a {@code ObjCMethodDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ObjCMethodDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the name of the method at runtime */
    @NativeType("SEL")
    public long name() { return nname(address()); }
    /** the types of the method arguments */
    @NativeType("char *")
    public ByteBuffer types() { return ntypes(address()); }
    /** the types of the method arguments */
    @NativeType("char *")
    public String typesString() { return ntypesString(address()); }

    // -----------------------------------

    /** Returns a new {@code ObjCMethodDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ObjCMethodDescription malloc() {
        return wrap(ObjCMethodDescription.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ObjCMethodDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ObjCMethodDescription calloc() {
        return wrap(ObjCMethodDescription.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ObjCMethodDescription} instance allocated with {@link BufferUtils}. */
    public static ObjCMethodDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ObjCMethodDescription.class, memAddress(container), container);
    }

    /** Returns a new {@code ObjCMethodDescription} instance for the specified memory address. */
    public static ObjCMethodDescription create(long address) {
        return wrap(ObjCMethodDescription.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ObjCMethodDescription createSafe(long address) {
        return address == NULL ? null : wrap(ObjCMethodDescription.class, address);
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ObjCMethodDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ObjCMethodDescription.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ObjCMethodDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ObjCMethodDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ObjCMethodDescription malloc(MemoryStack stack) {
        return wrap(ObjCMethodDescription.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ObjCMethodDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ObjCMethodDescription calloc(MemoryStack stack) {
        return wrap(ObjCMethodDescription.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static long nname(long struct) { return memGetAddress(struct + ObjCMethodDescription.NAME); }
    /** Unsafe version of {@link #types}. */
    public static ByteBuffer ntypes(long struct) { return memByteBufferNT1(memGetAddress(struct + ObjCMethodDescription.TYPES)); }
    /** Unsafe version of {@link #typesString}. */
    public static String ntypesString(long struct) { return memUTF8(memGetAddress(struct + ObjCMethodDescription.TYPES)); }

    // -----------------------------------

    /** An array of {@link ObjCMethodDescription} structs. */
    public static class Buffer extends StructBuffer<ObjCMethodDescription, Buffer> implements NativeResource {

        private static final ObjCMethodDescription ELEMENT_FACTORY = ObjCMethodDescription.create(-1L);

        /**
         * Creates a new {@code ObjCMethodDescription.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ObjCMethodDescription#SIZEOF}, and its mark will be undefined.
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
        protected ObjCMethodDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ObjCMethodDescription#name} field. */
        @NativeType("SEL")
        public long name() { return ObjCMethodDescription.nname(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link ObjCMethodDescription#types} field. */
        @NativeType("char *")
        public ByteBuffer types() { return ObjCMethodDescription.ntypes(address()); }
        /** @return the null-terminated string pointed to by the {@link ObjCMethodDescription#types} field. */
        @NativeType("char *")
        public String typesString() { return ObjCMethodDescription.ntypesString(address()); }

    }

}