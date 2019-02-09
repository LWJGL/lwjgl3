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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name} &ndash; the name of the method at runtime</li>
 * <li>{@code types} &ndash; the types of the method arguments</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct objc_method_description {
 *     SEL name;
 *     char * types;
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

    /** Returns the value of the {@code name} field. */
    @NativeType("SEL")
    public long name() { return nname(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code types} field. */
    @NativeType("char *")
    public ByteBuffer types() { return ntypes(address()); }
    /** Decodes the null-terminated string pointed to by the {@code types} field. */
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

    /** Returns a new {@code ObjCMethodDescription} instance allocated on the thread-local {@link MemoryStack}. */
    public static ObjCMethodDescription mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ObjCMethodDescription} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ObjCMethodDescription callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ObjCMethodDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ObjCMethodDescription mallocStack(MemoryStack stack) {
        return wrap(ObjCMethodDescription.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ObjCMethodDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ObjCMethodDescription callocStack(MemoryStack stack) {
        return wrap(ObjCMethodDescription.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ObjCMethodDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ObjCMethodDescription.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code name} field. */
        @NativeType("SEL")
        public long name() { return ObjCMethodDescription.nname(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code types} field. */
        @NativeType("char *")
        public ByteBuffer types() { return ObjCMethodDescription.ntypes(address()); }
        /** Decodes the null-terminated string pointed to by the {@code types} field. */
        @NativeType("char *")
        public String typesString() { return ObjCMethodDescription.ntypesString(address()); }

    }

}