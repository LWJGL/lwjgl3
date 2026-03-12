/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct GLResourceReference {
 *     uint32_t identifier;
 *     uint32_t name;
 * }}</pre>
 */
public class GLResourceReference extends Struct<GLResourceReference> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IDENTIFIER,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IDENTIFIER = layout.offsetof(0);
        NAME = layout.offsetof(1);
    }

    protected GLResourceReference(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLResourceReference create(long address, @Nullable ByteBuffer container) {
        return new GLResourceReference(address, container);
    }

    /**
     * Creates a {@code GLResourceReference} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLResourceReference(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code identifier} field. */
    @NativeType("uint32_t")
    public int identifier() { return nidentifier(address()); }
    /** @return the value of the {@code name} field. */
    @NativeType("uint32_t")
    public int name() { return nname(address()); }

    /** Sets the specified value to the {@code identifier} field. */
    public GLResourceReference identifier(@NativeType("uint32_t") int value) { nidentifier(address(), value); return this; }
    /** Sets the specified value to the {@code name} field. */
    public GLResourceReference name(@NativeType("uint32_t") int value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLResourceReference set(
        int identifier,
        int name
    ) {
        identifier(identifier);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLResourceReference set(GLResourceReference src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLResourceReference} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLResourceReference malloc() {
        return new GLResourceReference(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLResourceReference} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLResourceReference calloc() {
        return new GLResourceReference(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLResourceReference} instance allocated with {@link BufferUtils}. */
    public static GLResourceReference create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLResourceReference(memAddress(container), container);
    }

    /** Returns a new {@code GLResourceReference} instance for the specified memory address. */
    public static GLResourceReference create(long address) {
        return new GLResourceReference(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLResourceReference createSafe(long address) {
        return address == NULL ? null : new GLResourceReference(address, null);
    }

    /**
     * Returns a new {@link GLResourceReference.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLResourceReference.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLResourceReference.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLResourceReference.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLResourceReference.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLResourceReference.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLResourceReference.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLResourceReference.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLResourceReference.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLResourceReference} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLResourceReference malloc(MemoryStack stack) {
        return new GLResourceReference(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLResourceReference} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLResourceReference calloc(MemoryStack stack) {
        return new GLResourceReference(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLResourceReference.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLResourceReference.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLResourceReference.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLResourceReference.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #identifier}. */
    public static int nidentifier(long struct) { return memGetInt(struct + GLResourceReference.IDENTIFIER); }
    /** Unsafe version of {@link #name}. */
    public static int nname(long struct) { return memGetInt(struct + GLResourceReference.NAME); }

    /** Unsafe version of {@link #identifier(int) identifier}. */
    public static void nidentifier(long struct, int value) { memPutInt(struct + GLResourceReference.IDENTIFIER, value); }
    /** Unsafe version of {@link #name(int) name}. */
    public static void nname(long struct, int value) { memPutInt(struct + GLResourceReference.NAME, value); }

    // -----------------------------------

    /** An array of {@link GLResourceReference} structs. */
    public static class Buffer extends StructBuffer<GLResourceReference, Buffer> implements NativeResource {

        private static final GLResourceReference ELEMENT_FACTORY = GLResourceReference.create(-1L);

        /**
         * Creates a new {@code GLResourceReference.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLResourceReference#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected GLResourceReference getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code identifier} field. */
        @NativeType("uint32_t")
        public int identifier() { return GLResourceReference.nidentifier(address()); }
        /** @return the value of the {@code name} field. */
        @NativeType("uint32_t")
        public int name() { return GLResourceReference.nname(address()); }

        /** Sets the specified value to the {@code identifier} field. */
        public GLResourceReference.Buffer identifier(@NativeType("uint32_t") int value) { GLResourceReference.nidentifier(address(), value); return this; }
        /** Sets the specified value to the {@code name} field. */
        public GLResourceReference.Buffer name(@NativeType("uint32_t") int value) { GLResourceReference.nname(address(), value); return this; }

    }

}