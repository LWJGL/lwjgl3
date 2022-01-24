/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the location of a scene component.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentLocationMSFT}</li>
 * <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrSceneComponentLocationsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentLocationMSFT {
 *     XrSpaceLocationFlags {@link #flags};
 *     {@link XrPosef XrPosef} {@link #pose};
 * }</code></pre>
 */
public class XrSceneComponentLocationMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        POSE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        POSE = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSceneComponentLocationMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentLocationMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. */
    @NativeType("XrSpaceLocationFlags")
    public long flags() { return nflags(address()); }
    /** an {@link XrPosef} defining the position and orientation of the scene component within the reference frame of the corresponding {@link XrSceneComponentsLocateInfoMSFT}{@code ::baseSpace}. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@link #flags} field. */
    public XrSceneComponentLocationMSFT flags(@NativeType("XrSpaceLocationFlags") long value) { nflags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrSceneComponentLocationMSFT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneComponentLocationMSFT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentLocationMSFT set(
        long flags,
        XrPosef pose
    ) {
        flags(flags);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentLocationMSFT set(XrSceneComponentLocationMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentLocationMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentLocationMSFT malloc() {
        return wrap(XrSceneComponentLocationMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentLocationMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentLocationMSFT calloc() {
        return wrap(XrSceneComponentLocationMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentLocationMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentLocationMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneComponentLocationMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentLocationMSFT} instance for the specified memory address. */
    public static XrSceneComponentLocationMSFT create(long address) {
        return wrap(XrSceneComponentLocationMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentLocationMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneComponentLocationMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneComponentLocationMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentLocationMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentLocationMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentLocationMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneComponentLocationMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneComponentLocationMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentLocationMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneComponentLocationMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneComponentLocationMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrSceneComponentLocationMSFT.FLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSceneComponentLocationMSFT.POSE); }

    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrSceneComponentLocationMSFT.FLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSceneComponentLocationMSFT.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSceneComponentLocationMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentLocationMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentLocationMSFT ELEMENT_FACTORY = XrSceneComponentLocationMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentLocationMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentLocationMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneComponentLocationMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentLocationMSFT#flags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long flags() { return XrSceneComponentLocationMSFT.nflags(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSceneComponentLocationMSFT#pose} field. */
        public XrPosef pose() { return XrSceneComponentLocationMSFT.npose(address()); }

        /** Sets the specified value to the {@link XrSceneComponentLocationMSFT#flags} field. */
        public XrSceneComponentLocationMSFT.Buffer flags(@NativeType("XrSpaceLocationFlags") long value) { XrSceneComponentLocationMSFT.nflags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSceneComponentLocationMSFT#pose} field. */
        public XrSceneComponentLocationMSFT.Buffer pose(XrPosef value) { XrSceneComponentLocationMSFT.npose(address(), value); return this; }
        /** Passes the {@link XrSceneComponentLocationMSFT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneComponentLocationMSFT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}