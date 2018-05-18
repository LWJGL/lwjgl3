/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Position and orientation together.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Orientation} &ndash; the pose orientation</li>
 * <li>{@code Position} &ndash; the pose position</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrPosef {
 *     {@link OVRQuatf ovrQuatf} Orientation;
 *     {@link OVRVector3f ovrVector3f} Position;
 * }</pre></code>
 */
@NativeType("struct ovrPosef")
public class OVRPosef extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIENTATION,
        POSITION;

    static {
        Layout layout = __struct(
            __member(OVRQuatf.SIZEOF, OVRQuatf.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIENTATION = layout.offsetof(0);
        POSITION = layout.offsetof(1);
    }

    OVRPosef(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRPosef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRPosef(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRQuatf} view of the {@code Orientation} field. */
    @NativeType("ovrQuatf")
    public OVRQuatf Orientation() { return nOrientation(address()); }
    /** Passes the {@code Orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRPosef Orientation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(Orientation()); return this; }
    /** Returns a {@link OVRVector3f} view of the {@code Position} field. */
    @NativeType("ovrVector3f")
    public OVRVector3f Position() { return nPosition(address()); }
    /** Passes the {@code Position} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRPosef Position(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(Position()); return this; }

    /** Copies the specified {@link OVRQuatf} to the {@code Orientation} field. */
    public OVRPosef Orientation(@NativeType("ovrQuatf") OVRQuatf value) { nOrientation(address(), value); return this; }
    /** Copies the specified {@link OVRVector3f} to the {@code Position} field. */
    public OVRPosef Position(@NativeType("ovrVector3f") OVRVector3f value) { nPosition(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRPosef set(
        OVRQuatf Orientation,
        OVRVector3f Position
    ) {
        Orientation(Orientation);
        Position(Position);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRPosef set(OVRPosef src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRPosef} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRPosef malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRPosef} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRPosef calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRPosef} instance allocated with {@link BufferUtils}. */
    public static OVRPosef create() {
        return new OVRPosef(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRPosef} instance for the specified memory address. */
    public static OVRPosef create(long address) {
        return new OVRPosef(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPosef createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRPosef.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPosef.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRPosef} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRPosef mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRPosef} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRPosef callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRPosef} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPosef mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRPosef} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPosef callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Orientation}. */
    public static OVRQuatf nOrientation(long struct) { return OVRQuatf.create(struct + OVRPosef.ORIENTATION); }
    /** Unsafe version of {@link #Position}. */
    public static OVRVector3f nPosition(long struct) { return OVRVector3f.create(struct + OVRPosef.POSITION); }

    /** Unsafe version of {@link #Orientation(OVRQuatf) Orientation}. */
    public static void nOrientation(long struct, OVRQuatf value) { memCopy(value.address(), struct + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
    /** Unsafe version of {@link #Position(OVRVector3f) Position}. */
    public static void nPosition(long struct, OVRVector3f value) { memCopy(value.address(), struct + OVRPosef.POSITION, OVRVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link OVRPosef} structs. */
    public static class Buffer extends StructBuffer<OVRPosef, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRPosef.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRPosef#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRPosef newInstance(long address) {
            return new OVRPosef(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRQuatf} view of the {@code Orientation} field. */
        @NativeType("ovrQuatf")
        public OVRQuatf Orientation() { return OVRPosef.nOrientation(address()); }
        /** Passes the {@code Orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRPosef.Buffer Orientation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(Orientation()); return this; }
        /** Returns a {@link OVRVector3f} view of the {@code Position} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f Position() { return OVRPosef.nPosition(address()); }
        /** Passes the {@code Position} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRPosef.Buffer Position(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(Position()); return this; }

        /** Copies the specified {@link OVRQuatf} to the {@code Orientation} field. */
        public OVRPosef.Buffer Orientation(@NativeType("ovrQuatf") OVRQuatf value) { OVRPosef.nOrientation(address(), value); return this; }
        /** Copies the specified {@link OVRVector3f} to the {@code Position} field. */
        public OVRPosef.Buffer Position(@NativeType("ovrVector3f") OVRVector3f value) { OVRPosef.nPosition(address(), value); return this; }

    }

}