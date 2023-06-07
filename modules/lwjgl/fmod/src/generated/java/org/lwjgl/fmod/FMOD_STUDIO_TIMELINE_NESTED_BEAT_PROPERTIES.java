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
 * struct FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES {
 *     {@link FMOD_GUID FMOD_GUID} eventid;
 *     {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} properties;
 * }</code></pre>
 */
public class FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES extends Struct<FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EVENTID,
        PROPERTIES;

    static {
        Layout layout = __struct(
            __member(FMOD_GUID.SIZEOF, FMOD_GUID.ALIGNOF),
            __member(FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.SIZEOF, FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EVENTID = layout.offsetof(0);
        PROPERTIES = layout.offsetof(1);
    }

    protected FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FMOD_GUID} view of the {@code eventid} field. */
    public FMOD_GUID eventid() { return neventid(address()); }
    /** @return a {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} view of the {@code properties} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties() { return nproperties(address()); }

    /** Copies the specified {@link FMOD_GUID} to the {@code eventid} field. */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES eventid(FMOD_GUID value) { neventid(address(), value); return this; }
    /** Passes the {@code eventid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES eventid(java.util.function.Consumer<FMOD_GUID> consumer) { consumer.accept(eventid()); return this; }
    /** Copies the specified {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} to the {@code properties} field. */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES properties(FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES value) { nproperties(address(), value); return this; }
    /** Passes the {@code properties} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES properties(java.util.function.Consumer<FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES> consumer) { consumer.accept(properties()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES set(
        FMOD_GUID eventid,
        FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties
    ) {
        eventid(eventid);
        properties(properties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES set(FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES malloc() {
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES calloc() {
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance for the specified memory address. */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES create(long address) {
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES malloc(MemoryStack stack) {
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES calloc(MemoryStack stack) {
        return new FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eventid}. */
    public static FMOD_GUID neventid(long struct) { return FMOD_GUID.create(struct + FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.EVENTID); }
    /** Unsafe version of {@link #properties}. */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES nproperties(long struct) { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.create(struct + FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.PROPERTIES); }

    /** Unsafe version of {@link #eventid(FMOD_GUID) eventid}. */
    public static void neventid(long struct, FMOD_GUID value) { memCopy(value.address(), struct + FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.EVENTID, FMOD_GUID.SIZEOF); }
    /** Unsafe version of {@link #properties(FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES) properties}. */
    public static void nproperties(long struct, FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES value) { memCopy(value.address(), struct + FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.PROPERTIES, FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.SIZEOF); }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES ELEMENT_FACTORY = FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FMOD_GUID} view of the {@code eventid} field. */
        public FMOD_GUID eventid() { return FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.neventid(address()); }
        /** @return a {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} view of the {@code properties} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties() { return FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.nproperties(address()); }

        /** Copies the specified {@link FMOD_GUID} to the {@code eventid} field. */
        public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer eventid(FMOD_GUID value) { FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.neventid(address(), value); return this; }
        /** Passes the {@code eventid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer eventid(java.util.function.Consumer<FMOD_GUID> consumer) { consumer.accept(eventid()); return this; }
        /** Copies the specified {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} to the {@code properties} field. */
        public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer properties(FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES value) { FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.nproperties(address(), value); return this; }
        /** Passes the {@code properties} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES.Buffer properties(java.util.function.Consumer<FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES> consumer) { consumer.accept(properties()); return this; }

    }

}