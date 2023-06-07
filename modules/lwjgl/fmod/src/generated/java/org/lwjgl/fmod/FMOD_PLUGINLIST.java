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
 * struct FMOD_PLUGINLIST {
 *     FMOD_PLUGINTYPE type;
 *     void * description;
 * }</code></pre>
 */
public class FMOD_PLUGINLIST extends Struct<FMOD_PLUGINLIST> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DESCRIPTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DESCRIPTION = layout.offsetof(1);
    }

    protected FMOD_PLUGINLIST(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_PLUGINLIST create(long address, @Nullable ByteBuffer container) {
        return new FMOD_PLUGINLIST(address, container);
    }

    /**
     * Creates a {@code FMOD_PLUGINLIST} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_PLUGINLIST(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("FMOD_PLUGINTYPE")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code description} field. */
    @NativeType("void *")
    public long description() { return ndescription(address()); }

    /** Sets the specified value to the {@code type} field. */
    public FMOD_PLUGINLIST type(@NativeType("FMOD_PLUGINTYPE") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code description} field. */
    public FMOD_PLUGINLIST description(@NativeType("void *") long value) { ndescription(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_PLUGINLIST set(
        int type,
        long description
    ) {
        type(type);
        description(description);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_PLUGINLIST set(FMOD_PLUGINLIST src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_PLUGINLIST} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_PLUGINLIST malloc() {
        return new FMOD_PLUGINLIST(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_PLUGINLIST} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_PLUGINLIST calloc() {
        return new FMOD_PLUGINLIST(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_PLUGINLIST} instance allocated with {@link BufferUtils}. */
    public static FMOD_PLUGINLIST create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_PLUGINLIST(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_PLUGINLIST} instance for the specified memory address. */
    public static FMOD_PLUGINLIST create(long address) {
        return new FMOD_PLUGINLIST(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_PLUGINLIST createSafe(long address) {
        return address == NULL ? null : new FMOD_PLUGINLIST(address, null);
    }

    /**
     * Returns a new {@link FMOD_PLUGINLIST.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_PLUGINLIST.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_PLUGINLIST.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_PLUGINLIST.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_PLUGINLIST.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_PLUGINLIST.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_PLUGINLIST.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_PLUGINLIST.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_PLUGINLIST.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_PLUGINLIST} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_PLUGINLIST malloc(MemoryStack stack) {
        return new FMOD_PLUGINLIST(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_PLUGINLIST} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_PLUGINLIST calloc(MemoryStack stack) {
        return new FMOD_PLUGINLIST(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_PLUGINLIST.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_PLUGINLIST.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_PLUGINLIST.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_PLUGINLIST.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FMOD_PLUGINLIST.TYPE); }
    /** Unsafe version of {@link #description}. */
    public static long ndescription(long struct) { return memGetAddress(struct + FMOD_PLUGINLIST.DESCRIPTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_PLUGINLIST.TYPE, value); }
    /** Unsafe version of {@link #description(long) description}. */
    public static void ndescription(long struct, long value) { memPutAddress(struct + FMOD_PLUGINLIST.DESCRIPTION, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_PLUGINLIST.DESCRIPTION));
    }

    // -----------------------------------

    /** An array of {@link FMOD_PLUGINLIST} structs. */
    public static class Buffer extends StructBuffer<FMOD_PLUGINLIST, Buffer> implements NativeResource {

        private static final FMOD_PLUGINLIST ELEMENT_FACTORY = FMOD_PLUGINLIST.create(-1L);

        /**
         * Creates a new {@code FMOD_PLUGINLIST.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_PLUGINLIST#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_PLUGINLIST getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("FMOD_PLUGINTYPE")
        public int type() { return FMOD_PLUGINLIST.ntype(address()); }
        /** @return the value of the {@code description} field. */
        @NativeType("void *")
        public long description() { return FMOD_PLUGINLIST.ndescription(address()); }

        /** Sets the specified value to the {@code type} field. */
        public FMOD_PLUGINLIST.Buffer type(@NativeType("FMOD_PLUGINTYPE") int value) { FMOD_PLUGINLIST.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code description} field. */
        public FMOD_PLUGINLIST.Buffer description(@NativeType("void *") long value) { FMOD_PLUGINLIST.ndescription(address(), value); return this; }

    }

}