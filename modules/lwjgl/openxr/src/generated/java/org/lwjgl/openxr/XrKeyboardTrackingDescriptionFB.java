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

import static org.lwjgl.openxr.FBKeyboardTracking.*;

/**
 * Description of a trackable keyboard.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrKeyboardTrackingDescriptionFB} describes a trackable keyboard and its associated metadata.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using {@link XrKeyboardTrackingDescriptionFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVector3f}, {@link FBKeyboardTracking#xrQuerySystemTrackedKeyboardFB QuerySystemTrackedKeyboardFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrKeyboardTrackingDescriptionFB {
 *     uint64_t {@link #trackedKeyboardId};
 *     {@link XrVector3f XrVector3f} {@link #size};
 *     XrKeyboardTrackingFlagsFB {@link #flags};
 *     char {@link #name}[XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB];
 * }</code></pre>
 */
public class XrKeyboardTrackingDescriptionFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRACKEDKEYBOARDID,
        SIZE,
        FLAGS,
        NAME;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(8),
            __array(1, XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRACKEDKEYBOARDID = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        NAME = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrKeyboardTrackingDescriptionFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrKeyboardTrackingDescriptionFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** abstract identifier describing the type of keyboard. */
    @NativeType("uint64_t")
    public long trackedKeyboardId() { return ntrackedKeyboardId(address()); }
    /** bounding box. */
    public XrVector3f size() { return nsize(address()); }
    /** additional information on the type of keyboard available. If {@link FBKeyboardTracking#XR_KEYBOARD_TRACKING_EXISTS_BIT_FB KEYBOARD_TRACKING_EXISTS_BIT_FB} is not set there is no keyboard. */
    @NativeType("XrKeyboardTrackingFlagsFB")
    public long flags() { return nflags(address()); }
    /** human readable keyboard identifier. */
    @NativeType("char[XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB]")
    public ByteBuffer name() { return nname(address()); }
    /** human readable keyboard identifier. */
    @NativeType("char[XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB]")
    public String nameString() { return nnameString(address()); }

    // -----------------------------------

    /** Returns a new {@code XrKeyboardTrackingDescriptionFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrKeyboardTrackingDescriptionFB malloc() {
        return wrap(XrKeyboardTrackingDescriptionFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrKeyboardTrackingDescriptionFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrKeyboardTrackingDescriptionFB calloc() {
        return wrap(XrKeyboardTrackingDescriptionFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrKeyboardTrackingDescriptionFB} instance allocated with {@link BufferUtils}. */
    public static XrKeyboardTrackingDescriptionFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrKeyboardTrackingDescriptionFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrKeyboardTrackingDescriptionFB} instance for the specified memory address. */
    public static XrKeyboardTrackingDescriptionFB create(long address) {
        return wrap(XrKeyboardTrackingDescriptionFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrKeyboardTrackingDescriptionFB createSafe(long address) {
        return address == NULL ? null : wrap(XrKeyboardTrackingDescriptionFB.class, address);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingDescriptionFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingDescriptionFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingDescriptionFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingDescriptionFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingDescriptionFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingDescriptionFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrKeyboardTrackingDescriptionFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingDescriptionFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrKeyboardTrackingDescriptionFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrKeyboardTrackingDescriptionFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrKeyboardTrackingDescriptionFB malloc(MemoryStack stack) {
        return wrap(XrKeyboardTrackingDescriptionFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrKeyboardTrackingDescriptionFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrKeyboardTrackingDescriptionFB calloc(MemoryStack stack) {
        return wrap(XrKeyboardTrackingDescriptionFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrKeyboardTrackingDescriptionFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingDescriptionFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingDescriptionFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingDescriptionFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #trackedKeyboardId}. */
    public static long ntrackedKeyboardId(long struct) { return UNSAFE.getLong(null, struct + XrKeyboardTrackingDescriptionFB.TRACKEDKEYBOARDID); }
    /** Unsafe version of {@link #size}. */
    public static XrVector3f nsize(long struct) { return XrVector3f.create(struct + XrKeyboardTrackingDescriptionFB.SIZE); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrKeyboardTrackingDescriptionFB.FLAGS); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + XrKeyboardTrackingDescriptionFB.NAME, XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + XrKeyboardTrackingDescriptionFB.NAME); }

    // -----------------------------------

    /** An array of {@link XrKeyboardTrackingDescriptionFB} structs. */
    public static class Buffer extends StructBuffer<XrKeyboardTrackingDescriptionFB, Buffer> implements NativeResource {

        private static final XrKeyboardTrackingDescriptionFB ELEMENT_FACTORY = XrKeyboardTrackingDescriptionFB.create(-1L);

        /**
         * Creates a new {@code XrKeyboardTrackingDescriptionFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrKeyboardTrackingDescriptionFB#SIZEOF}, and its mark will be undefined.
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
        protected XrKeyboardTrackingDescriptionFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrKeyboardTrackingDescriptionFB#trackedKeyboardId} field. */
        @NativeType("uint64_t")
        public long trackedKeyboardId() { return XrKeyboardTrackingDescriptionFB.ntrackedKeyboardId(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrKeyboardTrackingDescriptionFB#size} field. */
        public XrVector3f size() { return XrKeyboardTrackingDescriptionFB.nsize(address()); }
        /** @return the value of the {@link XrKeyboardTrackingDescriptionFB#flags} field. */
        @NativeType("XrKeyboardTrackingFlagsFB")
        public long flags() { return XrKeyboardTrackingDescriptionFB.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrKeyboardTrackingDescriptionFB#name} field. */
        @NativeType("char[XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB]")
        public ByteBuffer name() { return XrKeyboardTrackingDescriptionFB.nname(address()); }
        /** @return the null-terminated string stored in the {@link XrKeyboardTrackingDescriptionFB#name} field. */
        @NativeType("char[XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB]")
        public String nameString() { return XrKeyboardTrackingDescriptionFB.nnameString(address()); }

    }

}