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
 * Information from the system about tracked keyboard support.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrSystemKeyboardTrackingPropertiesFB} is populated with information from the system about tracked keyboard support.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using {@link XrSystemKeyboardTrackingPropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBKeyboardTracking#XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemKeyboardTrackingPropertiesFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsKeyboardTracking};
 * }</code></pre>
 */
public class XrSystemKeyboardTrackingPropertiesFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSKEYBOARDTRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSKEYBOARDTRACKING = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemKeyboardTrackingPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemKeyboardTrackingPropertiesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** defines whether the system supports the tracked keyboard feature. */
    @NativeType("XrBool32")
    public boolean supportsKeyboardTracking() { return nsupportsKeyboardTracking(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemKeyboardTrackingPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBKeyboardTracking#XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB} value to the {@link #type} field. */
    public XrSystemKeyboardTrackingPropertiesFB type$Default() { return type(FBKeyboardTracking.XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemKeyboardTrackingPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #supportsKeyboardTracking} field. */
    public XrSystemKeyboardTrackingPropertiesFB supportsKeyboardTracking(@NativeType("XrBool32") boolean value) { nsupportsKeyboardTracking(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemKeyboardTrackingPropertiesFB set(
        int type,
        long next,
        boolean supportsKeyboardTracking
    ) {
        type(type);
        next(next);
        supportsKeyboardTracking(supportsKeyboardTracking);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemKeyboardTrackingPropertiesFB set(XrSystemKeyboardTrackingPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemKeyboardTrackingPropertiesFB malloc() {
        return wrap(XrSystemKeyboardTrackingPropertiesFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemKeyboardTrackingPropertiesFB calloc() {
        return wrap(XrSystemKeyboardTrackingPropertiesFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemKeyboardTrackingPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemKeyboardTrackingPropertiesFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance for the specified memory address. */
    public static XrSystemKeyboardTrackingPropertiesFB create(long address) {
        return wrap(XrSystemKeyboardTrackingPropertiesFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemKeyboardTrackingPropertiesFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemKeyboardTrackingPropertiesFB.class, address);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemKeyboardTrackingPropertiesFB malloc(MemoryStack stack) {
        return wrap(XrSystemKeyboardTrackingPropertiesFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemKeyboardTrackingPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemKeyboardTrackingPropertiesFB calloc(MemoryStack stack) {
        return wrap(XrSystemKeyboardTrackingPropertiesFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemKeyboardTrackingPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemKeyboardTrackingPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemKeyboardTrackingPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemKeyboardTrackingPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsKeyboardTracking}. */
    public static int nsupportsKeyboardTracking(long struct) { return UNSAFE.getInt(null, struct + XrSystemKeyboardTrackingPropertiesFB.SUPPORTSKEYBOARDTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemKeyboardTrackingPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemKeyboardTrackingPropertiesFB.NEXT, value); }
    /** Unsafe version of {@link #supportsKeyboardTracking(boolean) supportsKeyboardTracking}. */
    public static void nsupportsKeyboardTracking(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemKeyboardTrackingPropertiesFB.SUPPORTSKEYBOARDTRACKING, value); }

    // -----------------------------------

    /** An array of {@link XrSystemKeyboardTrackingPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemKeyboardTrackingPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemKeyboardTrackingPropertiesFB ELEMENT_FACTORY = XrSystemKeyboardTrackingPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemKeyboardTrackingPropertiesFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemKeyboardTrackingPropertiesFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemKeyboardTrackingPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemKeyboardTrackingPropertiesFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemKeyboardTrackingPropertiesFB.ntype(address()); }
        /** @return the value of the {@link XrSystemKeyboardTrackingPropertiesFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemKeyboardTrackingPropertiesFB.nnext(address()); }
        /** @return the value of the {@link XrSystemKeyboardTrackingPropertiesFB#supportsKeyboardTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsKeyboardTracking() { return XrSystemKeyboardTrackingPropertiesFB.nsupportsKeyboardTracking(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemKeyboardTrackingPropertiesFB#type} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemKeyboardTrackingPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBKeyboardTracking#XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB} value to the {@link XrSystemKeyboardTrackingPropertiesFB#type} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer type$Default() { return type(FBKeyboardTracking.XR_TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB); }
        /** Sets the specified value to the {@link XrSystemKeyboardTrackingPropertiesFB#next} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer next(@NativeType("void *") long value) { XrSystemKeyboardTrackingPropertiesFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSystemKeyboardTrackingPropertiesFB#supportsKeyboardTracking} field. */
        public XrSystemKeyboardTrackingPropertiesFB.Buffer supportsKeyboardTracking(@NativeType("XrBool32") boolean value) { XrSystemKeyboardTrackingPropertiesFB.nsupportsKeyboardTracking(address(), value ? 1 : 0); return this; }

    }

}