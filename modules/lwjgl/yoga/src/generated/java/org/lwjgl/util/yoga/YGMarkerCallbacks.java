/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code startMarker} &ndash; Accepts marker type, a node ref, and marker data (depends on marker type) can return a handle or id that Yoga will pass to {@code endMarker}.</li>
 * <li>{@code endMarker} &ndash; Accepts marker type, a node ref, marker data, and marker id as returned by {@code startMarker}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGMarkerCallbacks {
 *     void * (*{@link StartMarkerCallbackI startMarker}) (YGMarker marker, YGNodeRef node, void *data);
 *     void (*{@link EndMarkerCallbackI endMarker}) (YGMarker marker, YGNodeRef node, void *data, void *id);
 * }</code></pre>
 */
public class YGMarkerCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STARTMARKER,
        ENDMARKER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STARTMARKER = layout.offsetof(0);
        ENDMARKER = layout.offsetof(1);
    }

    /**
     * Creates a {@code YGMarkerCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGMarkerCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code startMarker} field. */
    @Nullable
    @NativeType("void * (*) (YGMarker, YGNodeRef, void *)")
    public StartMarkerCallback startMarker() { return nstartMarker(address()); }
    /** Returns the value of the {@code endMarker} field. */
    @Nullable
    @NativeType("void (*) (YGMarker, YGNodeRef, void *, void *)")
    public EndMarkerCallback endMarker() { return nendMarker(address()); }

    /** Sets the specified value to the {@code startMarker} field. */
    public YGMarkerCallbacks startMarker(@Nullable @NativeType("void * (*) (YGMarker, YGNodeRef, void *)") StartMarkerCallbackI value) { nstartMarker(address(), value); return this; }
    /** Sets the specified value to the {@code endMarker} field. */
    public YGMarkerCallbacks endMarker(@Nullable @NativeType("void (*) (YGMarker, YGNodeRef, void *, void *)") EndMarkerCallbackI value) { nendMarker(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public YGMarkerCallbacks set(
        StartMarkerCallbackI startMarker,
        EndMarkerCallbackI endMarker
    ) {
        startMarker(startMarker);
        endMarker(endMarker);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public YGMarkerCallbacks set(YGMarkerCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code YGMarkerCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static YGMarkerCallbacks malloc() {
        return wrap(YGMarkerCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code YGMarkerCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGMarkerCallbacks calloc() {
        return wrap(YGMarkerCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code YGMarkerCallbacks} instance allocated with {@link BufferUtils}. */
    public static YGMarkerCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(YGMarkerCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code YGMarkerCallbacks} instance for the specified memory address. */
    public static YGMarkerCallbacks create(long address) {
        return wrap(YGMarkerCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGMarkerCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(YGMarkerCallbacks.class, address);
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link YGMarkerCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGMarkerCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code YGMarkerCallbacks} instance allocated on the thread-local {@link MemoryStack}. */
    public static YGMarkerCallbacks mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code YGMarkerCallbacks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static YGMarkerCallbacks callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code YGMarkerCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGMarkerCallbacks mallocStack(MemoryStack stack) {
        return wrap(YGMarkerCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code YGMarkerCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGMarkerCallbacks callocStack(MemoryStack stack) {
        return wrap(YGMarkerCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGMarkerCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGMarkerCallbacks.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #startMarker}. */
    @Nullable public static StartMarkerCallback nstartMarker(long struct) { return StartMarkerCallback.createSafe(memGetAddress(struct + YGMarkerCallbacks.STARTMARKER)); }
    /** Unsafe version of {@link #endMarker}. */
    @Nullable public static EndMarkerCallback nendMarker(long struct) { return EndMarkerCallback.createSafe(memGetAddress(struct + YGMarkerCallbacks.ENDMARKER)); }

    /** Unsafe version of {@link #startMarker(StartMarkerCallbackI) startMarker}. */
    public static void nstartMarker(long struct, @Nullable StartMarkerCallbackI value) { memPutAddress(struct + YGMarkerCallbacks.STARTMARKER, memAddressSafe(value)); }
    /** Unsafe version of {@link #endMarker(EndMarkerCallbackI) endMarker}. */
    public static void nendMarker(long struct, @Nullable EndMarkerCallbackI value) { memPutAddress(struct + YGMarkerCallbacks.ENDMARKER, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link YGMarkerCallbacks} structs. */
    public static class Buffer extends StructBuffer<YGMarkerCallbacks, Buffer> implements NativeResource {

        private static final YGMarkerCallbacks ELEMENT_FACTORY = YGMarkerCallbacks.create(-1L);

        /**
         * Creates a new {@code YGMarkerCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGMarkerCallbacks#SIZEOF}, and its mark will be undefined.
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
        protected YGMarkerCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code startMarker} field. */
        @Nullable
        @NativeType("void * (*) (YGMarker, YGNodeRef, void *)")
        public StartMarkerCallback startMarker() { return YGMarkerCallbacks.nstartMarker(address()); }
        /** Returns the value of the {@code endMarker} field. */
        @Nullable
        @NativeType("void (*) (YGMarker, YGNodeRef, void *, void *)")
        public EndMarkerCallback endMarker() { return YGMarkerCallbacks.nendMarker(address()); }

        /** Sets the specified value to the {@code startMarker} field. */
        public YGMarkerCallbacks.Buffer startMarker(@Nullable @NativeType("void * (*) (YGMarker, YGNodeRef, void *)") StartMarkerCallbackI value) { YGMarkerCallbacks.nstartMarker(address(), value); return this; }
        /** Sets the specified value to the {@code endMarker} field. */
        public YGMarkerCallbacks.Buffer endMarker(@Nullable @NativeType("void (*) (YGMarker, YGNodeRef, void *, void *)") EndMarkerCallbackI value) { YGMarkerCallbacks.nendMarker(address(), value); return this; }

    }

}