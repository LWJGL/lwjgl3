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
 * Specifies status information for the current session.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code IsVisible} &ndash; True if the process has VR focus and thus is visible in the HMD.</li>
 * <li>{@code HmdPresent} &ndash; True if an HMD is present.</li>
 * <li>{@code HmdMounted} &ndash; True if the HMD is on the user's head.</li>
 * <li>{@code DisplayLost} &ndash; True if the session is in a display-lost state. See {@link OVR#ovr_SubmitFrame SubmitFrame}.</li>
 * <li>{@code ShouldQuit} &ndash; True if the application should initiate shutdown.</li>
 * <li>{@code ShouldRecenter} &ndash; True if UX has requested re-centering. Must call {@link OVR#ovr_ClearShouldRecenterFlag ClearShouldRecenterFlag}, {@link OVR#ovr_RecenterTrackingOrigin RecenterTrackingOrigin} or {@link OVR#ovr_SpecifyTrackingOrigin SpecifyTrackingOrigin}.</li>
 * <li>{@code HasInputFocus} &ndash; 
 * True if the application is the foreground application and receives input (e.g. Touch controller state). If this is false then the application is in the
 * background (but possibly still visible) should hide any input representations such as hands.</li>
 * <li>{@code OverlayPresent} &ndash; 
 * True if a system overlay is present, such as a dashboard. In this case the application (if visible) should pause while still drawing, avoid drawing
 * near-field graphics so they don't visually fight with the system overlay, and consume fewer CPU and GPU resources.
 * 
 * <p>Deprecated, do not use.</p></li>
 * <li>{@code DepthRequested} &ndash; True if runtime is requesting that the application provide depth buffers with projection layers.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrSessionStatus {
 *     ovrBool IsVisible;
 *     ovrBool HmdPresent;
 *     ovrBool HmdMounted;
 *     ovrBool DisplayLost;
 *     ovrBool ShouldQuit;
 *     ovrBool ShouldRecenter;
 *     ovrBool HasInputFocus;
 *     ovrBool OverlayPresent;
 *     ovrBool DepthRequested;
 * }</code></pre>
 */
@NativeType("struct ovrSessionStatus")
public class OVRSessionStatus extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISVISIBLE,
        HMDPRESENT,
        HMDMOUNTED,
        DISPLAYLOST,
        SHOULDQUIT,
        SHOULDRECENTER,
        HASINPUTFOCUS,
        OVERLAYPRESENT,
        DEPTHREQUESTED;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISVISIBLE = layout.offsetof(0);
        HMDPRESENT = layout.offsetof(1);
        HMDMOUNTED = layout.offsetof(2);
        DISPLAYLOST = layout.offsetof(3);
        SHOULDQUIT = layout.offsetof(4);
        SHOULDRECENTER = layout.offsetof(5);
        HASINPUTFOCUS = layout.offsetof(6);
        OVERLAYPRESENT = layout.offsetof(7);
        DEPTHREQUESTED = layout.offsetof(8);
    }

    /**
     * Creates a {@code OVRSessionStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRSessionStatus(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code IsVisible} field. */
    @NativeType("ovrBool")
    public boolean IsVisible() { return nIsVisible(address()); }
    /** Returns the value of the {@code HmdPresent} field. */
    @NativeType("ovrBool")
    public boolean HmdPresent() { return nHmdPresent(address()); }
    /** Returns the value of the {@code HmdMounted} field. */
    @NativeType("ovrBool")
    public boolean HmdMounted() { return nHmdMounted(address()); }
    /** Returns the value of the {@code DisplayLost} field. */
    @NativeType("ovrBool")
    public boolean DisplayLost() { return nDisplayLost(address()); }
    /** Returns the value of the {@code ShouldQuit} field. */
    @NativeType("ovrBool")
    public boolean ShouldQuit() { return nShouldQuit(address()); }
    /** Returns the value of the {@code ShouldRecenter} field. */
    @NativeType("ovrBool")
    public boolean ShouldRecenter() { return nShouldRecenter(address()); }
    /** Returns the value of the {@code HasInputFocus} field. */
    @NativeType("ovrBool")
    public boolean HasInputFocus() { return nHasInputFocus(address()); }
    /** Returns the value of the {@code OverlayPresent} field. */
    @NativeType("ovrBool")
    public boolean OverlayPresent() { return nOverlayPresent(address()); }
    /** Returns the value of the {@code DepthRequested} field. */
    @NativeType("ovrBool")
    public boolean DepthRequested() { return nDepthRequested(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRSessionStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRSessionStatus malloc() {
        return wrap(OVRSessionStatus.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRSessionStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRSessionStatus calloc() {
        return wrap(OVRSessionStatus.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRSessionStatus} instance allocated with {@link BufferUtils}. */
    public static OVRSessionStatus create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRSessionStatus.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRSessionStatus} instance for the specified memory address. */
    public static OVRSessionStatus create(long address) {
        return wrap(OVRSessionStatus.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRSessionStatus createSafe(long address) {
        return address == NULL ? null : wrap(OVRSessionStatus.class, address);
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRSessionStatus.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRSessionStatus.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRSessionStatus} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRSessionStatus mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRSessionStatus} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRSessionStatus callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRSessionStatus} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRSessionStatus mallocStack(MemoryStack stack) {
        return wrap(OVRSessionStatus.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRSessionStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRSessionStatus callocStack(MemoryStack stack) {
        return wrap(OVRSessionStatus.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRSessionStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRSessionStatus.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #IsVisible}. */
    public static boolean nIsVisible(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.ISVISIBLE) != 0; }
    /** Unsafe version of {@link #HmdPresent}. */
    public static boolean nHmdPresent(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.HMDPRESENT) != 0; }
    /** Unsafe version of {@link #HmdMounted}. */
    public static boolean nHmdMounted(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.HMDMOUNTED) != 0; }
    /** Unsafe version of {@link #DisplayLost}. */
    public static boolean nDisplayLost(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.DISPLAYLOST) != 0; }
    /** Unsafe version of {@link #ShouldQuit}. */
    public static boolean nShouldQuit(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.SHOULDQUIT) != 0; }
    /** Unsafe version of {@link #ShouldRecenter}. */
    public static boolean nShouldRecenter(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.SHOULDRECENTER) != 0; }
    /** Unsafe version of {@link #HasInputFocus}. */
    public static boolean nHasInputFocus(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.HASINPUTFOCUS) != 0; }
    /** Unsafe version of {@link #OverlayPresent}. */
    public static boolean nOverlayPresent(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.OVERLAYPRESENT) != 0; }
    /** Unsafe version of {@link #DepthRequested}. */
    public static boolean nDepthRequested(long struct) { return UNSAFE.getByte(null, struct + OVRSessionStatus.DEPTHREQUESTED) != 0; }

    // -----------------------------------

    /** An array of {@link OVRSessionStatus} structs. */
    public static class Buffer extends StructBuffer<OVRSessionStatus, Buffer> implements NativeResource {

        private static final OVRSessionStatus ELEMENT_FACTORY = OVRSessionStatus.create(-1L);

        /**
         * Creates a new {@code OVRSessionStatus.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRSessionStatus#SIZEOF}, and its mark will be undefined.
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
        protected OVRSessionStatus getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code IsVisible} field. */
        @NativeType("ovrBool")
        public boolean IsVisible() { return OVRSessionStatus.nIsVisible(address()); }
        /** Returns the value of the {@code HmdPresent} field. */
        @NativeType("ovrBool")
        public boolean HmdPresent() { return OVRSessionStatus.nHmdPresent(address()); }
        /** Returns the value of the {@code HmdMounted} field. */
        @NativeType("ovrBool")
        public boolean HmdMounted() { return OVRSessionStatus.nHmdMounted(address()); }
        /** Returns the value of the {@code DisplayLost} field. */
        @NativeType("ovrBool")
        public boolean DisplayLost() { return OVRSessionStatus.nDisplayLost(address()); }
        /** Returns the value of the {@code ShouldQuit} field. */
        @NativeType("ovrBool")
        public boolean ShouldQuit() { return OVRSessionStatus.nShouldQuit(address()); }
        /** Returns the value of the {@code ShouldRecenter} field. */
        @NativeType("ovrBool")
        public boolean ShouldRecenter() { return OVRSessionStatus.nShouldRecenter(address()); }
        /** Returns the value of the {@code HasInputFocus} field. */
        @NativeType("ovrBool")
        public boolean HasInputFocus() { return OVRSessionStatus.nHasInputFocus(address()); }
        /** Returns the value of the {@code OverlayPresent} field. */
        @NativeType("ovrBool")
        public boolean OverlayPresent() { return OVRSessionStatus.nOverlayPresent(address()); }
        /** Returns the value of the {@code DepthRequested} field. */
        @NativeType("ovrBool")
        public boolean DepthRequested() { return OVRSessionStatus.nDepthRequested(address()); }

    }

}