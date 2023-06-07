/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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
 * struct FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES {
 *     char const * name;
 *     int position;
 * }</code></pre>
 */
public class FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES extends Struct<FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        POSITION;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        POSITION = layout.offsetof(1);
    }

    protected FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code position} field. */
    public int position$() { return nposition$(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code position} field. */
    public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES position$(int value) { nposition$(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES set(
        ByteBuffer name,
        int position$
    ) {
        name(name);
        position$(position$);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES set(FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES malloc() {
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES calloc() {
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance for the specified memory address. */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES create(long address) {
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES malloc(MemoryStack stack) {
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES calloc(MemoryStack stack) {
        return new FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.NAME)); }
    /** Unsafe version of {@link #position$}. */
    public static int nposition$(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.POSITION); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #position$(int) position$}. */
    public static void nposition$(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.POSITION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.NAME));
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES ELEMENT_FACTORY = FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.nnameString(address()); }
        /** @return the value of the {@code position} field. */
        public int position$() { return FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.nposition$(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer name(@NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.nname(address(), value); return this; }
        /** Sets the specified value to the {@code position} field. */
        public FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.Buffer position$(int value) { FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES.nposition$(address(), value); return this; }

    }

}