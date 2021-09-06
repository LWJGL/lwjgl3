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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrPosef {
 *     {@link OVRQuatf ovrQuatf} {@link #Orientation};
 *     {@link OVRVector3f ovrVector3f} {@link #Position};
 * }</code></pre>
 */
@NativeType("struct ovrPosef")
public class OVRPosef extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code OVRPosef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRPosef(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the pose orientation */
    @NativeType("ovrQuatf")
    public OVRQuatf Orientation() { return nOrientation(address()); }
    /** the pose position */
    @NativeType("ovrVector3f")
    public OVRVector3f Position() { return nPosition(address()); }

    /** Copies the specified {@link OVRQuatf} to the {@link #Orientation} field. */
    public OVRPosef Orientation(@NativeType("ovrQuatf") OVRQuatf value) { nOrientation(address(), value); return this; }
    /** Passes the {@link #Orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRPosef Orientation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(Orientation()); return this; }
    /** Copies the specified {@link OVRVector3f} to the {@link #Position} field. */
    public OVRPosef Position(@NativeType("ovrVector3f") OVRVector3f value) { nPosition(address(), value); return this; }
    /** Passes the {@link #Position} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRPosef Position(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(Position()); return this; }

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

    /** Returns a new {@code OVRPosef} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRPosef malloc() {
        return wrap(OVRPosef.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRPosef} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRPosef calloc() {
        return wrap(OVRPosef.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRPosef} instance allocated with {@link BufferUtils}. */
    public static OVRPosef create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRPosef.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRPosef} instance for the specified memory address. */
    public static OVRPosef create(long address) {
        return wrap(OVRPosef.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPosef createSafe(long address) {
        return address == NULL ? null : wrap(OVRPosef.class, address);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRPosef.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRPosef.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRPosef mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRPosef callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRPosef mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRPosef callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPosef.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPosef.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPosef.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRPosef.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRPosef} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPosef malloc(MemoryStack stack) {
        return wrap(OVRPosef.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRPosef} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRPosef calloc(MemoryStack stack) {
        return wrap(OVRPosef.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRPosef.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRPosef.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        private static final OVRPosef ELEMENT_FACTORY = OVRPosef.create(-1L);

        /**
         * Creates a new {@code OVRPosef.Buffer} instance backed by the specified container.
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
        protected OVRPosef getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRQuatf} view of the {@link OVRPosef#Orientation} field. */
        @NativeType("ovrQuatf")
        public OVRQuatf Orientation() { return OVRPosef.nOrientation(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRPosef#Position} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f Position() { return OVRPosef.nPosition(address()); }

        /** Copies the specified {@link OVRQuatf} to the {@link OVRPosef#Orientation} field. */
        public OVRPosef.Buffer Orientation(@NativeType("ovrQuatf") OVRQuatf value) { OVRPosef.nOrientation(address(), value); return this; }
        /** Passes the {@link OVRPosef#Orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRPosef.Buffer Orientation(java.util.function.Consumer<OVRQuatf> consumer) { consumer.accept(Orientation()); return this; }
        /** Copies the specified {@link OVRVector3f} to the {@link OVRPosef#Position} field. */
        public OVRPosef.Buffer Position(@NativeType("ovrVector3f") OVRVector3f value) { OVRPosef.nPosition(address(), value); return this; }
        /** Passes the {@link OVRPosef#Position} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRPosef.Buffer Position(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(Position()); return this; }

    }

}