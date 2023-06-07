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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_3D_ATTRIBUTES {
 *     {@link FMOD_VECTOR FMOD_VECTOR} position;
 *     {@link FMOD_VECTOR FMOD_VECTOR} velocity;
 *     {@link FMOD_VECTOR FMOD_VECTOR} forward;
 *     {@link FMOD_VECTOR FMOD_VECTOR} up;
 * }</code></pre>
 */
public class FMOD_3D_ATTRIBUTES extends Struct<FMOD_3D_ATTRIBUTES> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITION,
        VELOCITY,
        FORWARD,
        UP;

    static {
        Layout layout = __struct(
            __member(FMOD_VECTOR.SIZEOF, FMOD_VECTOR.ALIGNOF),
            __member(FMOD_VECTOR.SIZEOF, FMOD_VECTOR.ALIGNOF),
            __member(FMOD_VECTOR.SIZEOF, FMOD_VECTOR.ALIGNOF),
            __member(FMOD_VECTOR.SIZEOF, FMOD_VECTOR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITION = layout.offsetof(0);
        VELOCITY = layout.offsetof(1);
        FORWARD = layout.offsetof(2);
        UP = layout.offsetof(3);
    }

    protected FMOD_3D_ATTRIBUTES(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_3D_ATTRIBUTES create(long address, @Nullable ByteBuffer container) {
        return new FMOD_3D_ATTRIBUTES(address, container);
    }

    /**
     * Creates a {@code FMOD_3D_ATTRIBUTES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_3D_ATTRIBUTES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FMOD_VECTOR} view of the {@code position} field. */
    public FMOD_VECTOR position$() { return nposition$(address()); }
    /** @return a {@link FMOD_VECTOR} view of the {@code velocity} field. */
    public FMOD_VECTOR velocity() { return nvelocity(address()); }
    /** @return a {@link FMOD_VECTOR} view of the {@code forward} field. */
    public FMOD_VECTOR forward() { return nforward(address()); }
    /** @return a {@link FMOD_VECTOR} view of the {@code up} field. */
    public FMOD_VECTOR up() { return nup(address()); }

    /** Copies the specified {@link FMOD_VECTOR} to the {@code position} field. */
    public FMOD_3D_ATTRIBUTES position$(FMOD_VECTOR value) { nposition$(address(), value); return this; }
    /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_3D_ATTRIBUTES position$(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(position$()); return this; }
    /** Copies the specified {@link FMOD_VECTOR} to the {@code velocity} field. */
    public FMOD_3D_ATTRIBUTES velocity(FMOD_VECTOR value) { nvelocity(address(), value); return this; }
    /** Passes the {@code velocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_3D_ATTRIBUTES velocity(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(velocity()); return this; }
    /** Copies the specified {@link FMOD_VECTOR} to the {@code forward} field. */
    public FMOD_3D_ATTRIBUTES forward(FMOD_VECTOR value) { nforward(address(), value); return this; }
    /** Passes the {@code forward} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_3D_ATTRIBUTES forward(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(forward()); return this; }
    /** Copies the specified {@link FMOD_VECTOR} to the {@code up} field. */
    public FMOD_3D_ATTRIBUTES up(FMOD_VECTOR value) { nup(address(), value); return this; }
    /** Passes the {@code up} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_3D_ATTRIBUTES up(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(up()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_3D_ATTRIBUTES set(
        FMOD_VECTOR position$,
        FMOD_VECTOR velocity,
        FMOD_VECTOR forward,
        FMOD_VECTOR up
    ) {
        position$(position$);
        velocity(velocity);
        forward(forward);
        up(up);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_3D_ATTRIBUTES set(FMOD_3D_ATTRIBUTES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_3D_ATTRIBUTES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_3D_ATTRIBUTES malloc() {
        return new FMOD_3D_ATTRIBUTES(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_3D_ATTRIBUTES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_3D_ATTRIBUTES calloc() {
        return new FMOD_3D_ATTRIBUTES(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_3D_ATTRIBUTES} instance allocated with {@link BufferUtils}. */
    public static FMOD_3D_ATTRIBUTES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_3D_ATTRIBUTES(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_3D_ATTRIBUTES} instance for the specified memory address. */
    public static FMOD_3D_ATTRIBUTES create(long address) {
        return new FMOD_3D_ATTRIBUTES(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_3D_ATTRIBUTES createSafe(long address) {
        return address == NULL ? null : new FMOD_3D_ATTRIBUTES(address, null);
    }

    /**
     * Returns a new {@link FMOD_3D_ATTRIBUTES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_3D_ATTRIBUTES.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_3D_ATTRIBUTES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_3D_ATTRIBUTES.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_3D_ATTRIBUTES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_3D_ATTRIBUTES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_3D_ATTRIBUTES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_3D_ATTRIBUTES.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_3D_ATTRIBUTES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_3D_ATTRIBUTES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_3D_ATTRIBUTES malloc(MemoryStack stack) {
        return new FMOD_3D_ATTRIBUTES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_3D_ATTRIBUTES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_3D_ATTRIBUTES calloc(MemoryStack stack) {
        return new FMOD_3D_ATTRIBUTES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_3D_ATTRIBUTES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_3D_ATTRIBUTES.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_3D_ATTRIBUTES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_3D_ATTRIBUTES.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #position$}. */
    public static FMOD_VECTOR nposition$(long struct) { return FMOD_VECTOR.create(struct + FMOD_3D_ATTRIBUTES.POSITION); }
    /** Unsafe version of {@link #velocity}. */
    public static FMOD_VECTOR nvelocity(long struct) { return FMOD_VECTOR.create(struct + FMOD_3D_ATTRIBUTES.VELOCITY); }
    /** Unsafe version of {@link #forward}. */
    public static FMOD_VECTOR nforward(long struct) { return FMOD_VECTOR.create(struct + FMOD_3D_ATTRIBUTES.FORWARD); }
    /** Unsafe version of {@link #up}. */
    public static FMOD_VECTOR nup(long struct) { return FMOD_VECTOR.create(struct + FMOD_3D_ATTRIBUTES.UP); }

    /** Unsafe version of {@link #position$(FMOD_VECTOR) position$}. */
    public static void nposition$(long struct, FMOD_VECTOR value) { memCopy(value.address(), struct + FMOD_3D_ATTRIBUTES.POSITION, FMOD_VECTOR.SIZEOF); }
    /** Unsafe version of {@link #velocity(FMOD_VECTOR) velocity}. */
    public static void nvelocity(long struct, FMOD_VECTOR value) { memCopy(value.address(), struct + FMOD_3D_ATTRIBUTES.VELOCITY, FMOD_VECTOR.SIZEOF); }
    /** Unsafe version of {@link #forward(FMOD_VECTOR) forward}. */
    public static void nforward(long struct, FMOD_VECTOR value) { memCopy(value.address(), struct + FMOD_3D_ATTRIBUTES.FORWARD, FMOD_VECTOR.SIZEOF); }
    /** Unsafe version of {@link #up(FMOD_VECTOR) up}. */
    public static void nup(long struct, FMOD_VECTOR value) { memCopy(value.address(), struct + FMOD_3D_ATTRIBUTES.UP, FMOD_VECTOR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link FMOD_3D_ATTRIBUTES} structs. */
    public static class Buffer extends StructBuffer<FMOD_3D_ATTRIBUTES, Buffer> implements NativeResource {

        private static final FMOD_3D_ATTRIBUTES ELEMENT_FACTORY = FMOD_3D_ATTRIBUTES.create(-1L);

        /**
         * Creates a new {@code FMOD_3D_ATTRIBUTES.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_3D_ATTRIBUTES#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_3D_ATTRIBUTES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FMOD_VECTOR} view of the {@code position} field. */
        public FMOD_VECTOR position$() { return FMOD_3D_ATTRIBUTES.nposition$(address()); }
        /** @return a {@link FMOD_VECTOR} view of the {@code velocity} field. */
        public FMOD_VECTOR velocity() { return FMOD_3D_ATTRIBUTES.nvelocity(address()); }
        /** @return a {@link FMOD_VECTOR} view of the {@code forward} field. */
        public FMOD_VECTOR forward() { return FMOD_3D_ATTRIBUTES.nforward(address()); }
        /** @return a {@link FMOD_VECTOR} view of the {@code up} field. */
        public FMOD_VECTOR up() { return FMOD_3D_ATTRIBUTES.nup(address()); }

        /** Copies the specified {@link FMOD_VECTOR} to the {@code position} field. */
        public FMOD_3D_ATTRIBUTES.Buffer position$(FMOD_VECTOR value) { FMOD_3D_ATTRIBUTES.nposition$(address(), value); return this; }
        /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_3D_ATTRIBUTES.Buffer position$(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(position$()); return this; }
        /** Copies the specified {@link FMOD_VECTOR} to the {@code velocity} field. */
        public FMOD_3D_ATTRIBUTES.Buffer velocity(FMOD_VECTOR value) { FMOD_3D_ATTRIBUTES.nvelocity(address(), value); return this; }
        /** Passes the {@code velocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_3D_ATTRIBUTES.Buffer velocity(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(velocity()); return this; }
        /** Copies the specified {@link FMOD_VECTOR} to the {@code forward} field. */
        public FMOD_3D_ATTRIBUTES.Buffer forward(FMOD_VECTOR value) { FMOD_3D_ATTRIBUTES.nforward(address(), value); return this; }
        /** Passes the {@code forward} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_3D_ATTRIBUTES.Buffer forward(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(forward()); return this; }
        /** Copies the specified {@link FMOD_VECTOR} to the {@code up} field. */
        public FMOD_3D_ATTRIBUTES.Buffer up(FMOD_VECTOR value) { FMOD_3D_ATTRIBUTES.nup(address(), value); return this; }
        /** Passes the {@code up} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_3D_ATTRIBUTES.Buffer up(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(up()); return this; }

    }

}