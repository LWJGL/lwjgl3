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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event representing a new VIVE tracker connected.
 * 
 * <h5>Description</h5>
 * 
 * <p>Receiving the {@link XrEventDataViveTrackerConnectedHTCX} event structure indicates that a new VIVE tracker was connected or its role changed. It is received via {@link XR10#xrPollEvent PollEvent}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCXViveTrackerInteraction XR_HTCX_vive_tracker_interaction} extension <b>must</b> be enabled prior to using {@link XrEventDataViveTrackerConnectedHTCX}</li>
 * <li>{@code type} <b>must</b> be {@link HTCXViveTrackerInteraction#XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code paths} <b>must</b> be a pointer to an {@link XrViveTrackerPathsHTCX} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrViveTrackerPathsHTCX}, {@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataViveTrackerConnectedHTCX {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrViveTrackerPathsHTCX XrViveTrackerPathsHTCX} * {@link #paths};
 * }</code></pre>
 */
public class XrEventDataViveTrackerConnectedHTCX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PATHS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PATHS = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrEventDataViveTrackerConnectedHTCX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataViveTrackerConnectedHTCX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** contains two paths of the connected VIVE tracker. */
    @NativeType("XrViveTrackerPathsHTCX *")
    public XrViveTrackerPathsHTCX paths() { return npaths(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataViveTrackerConnectedHTCX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCXViveTrackerInteraction#XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX} value to the {@link #type} field. */
    public XrEventDataViveTrackerConnectedHTCX type$Default() { return type(HTCXViveTrackerInteraction.XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataViveTrackerConnectedHTCX next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrViveTrackerPathsHTCX} to the {@link #paths} field. */
    public XrEventDataViveTrackerConnectedHTCX paths(@NativeType("XrViveTrackerPathsHTCX *") XrViveTrackerPathsHTCX value) { npaths(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataViveTrackerConnectedHTCX set(
        int type,
        long next,
        XrViveTrackerPathsHTCX paths
    ) {
        type(type);
        next(next);
        paths(paths);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataViveTrackerConnectedHTCX set(XrEventDataViveTrackerConnectedHTCX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataViveTrackerConnectedHTCX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataViveTrackerConnectedHTCX malloc() {
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataViveTrackerConnectedHTCX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataViveTrackerConnectedHTCX calloc() {
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataViveTrackerConnectedHTCX} instance allocated with {@link BufferUtils}. */
    public static XrEventDataViveTrackerConnectedHTCX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataViveTrackerConnectedHTCX} instance for the specified memory address. */
    public static XrEventDataViveTrackerConnectedHTCX create(long address) {
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataViveTrackerConnectedHTCX createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataViveTrackerConnectedHTCX.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataViveTrackerConnectedHTCX}. */
    public static XrEventDataViveTrackerConnectedHTCX create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, value);
    }

    /**
     * Returns a new {@link XrEventDataViveTrackerConnectedHTCX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataViveTrackerConnectedHTCX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataViveTrackerConnectedHTCX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataViveTrackerConnectedHTCX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataViveTrackerConnectedHTCX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataViveTrackerConnectedHTCX.Buffer}. */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataViveTrackerConnectedHTCX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataViveTrackerConnectedHTCX malloc(MemoryStack stack) {
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataViveTrackerConnectedHTCX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataViveTrackerConnectedHTCX calloc(MemoryStack stack) {
        return wrap(XrEventDataViveTrackerConnectedHTCX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataViveTrackerConnectedHTCX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataViveTrackerConnectedHTCX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataViveTrackerConnectedHTCX.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataViveTrackerConnectedHTCX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataViveTrackerConnectedHTCX.NEXT); }
    /** Unsafe version of {@link #paths}. */
    public static XrViveTrackerPathsHTCX npaths(long struct) { return XrViveTrackerPathsHTCX.create(memGetAddress(struct + XrEventDataViveTrackerConnectedHTCX.PATHS)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataViveTrackerConnectedHTCX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataViveTrackerConnectedHTCX.NEXT, value); }
    /** Unsafe version of {@link #paths(XrViveTrackerPathsHTCX) paths}. */
    public static void npaths(long struct, XrViveTrackerPathsHTCX value) { memPutAddress(struct + XrEventDataViveTrackerConnectedHTCX.PATHS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataViveTrackerConnectedHTCX.PATHS));
    }

    // -----------------------------------

    /** An array of {@link XrEventDataViveTrackerConnectedHTCX} structs. */
    public static class Buffer extends StructBuffer<XrEventDataViveTrackerConnectedHTCX, Buffer> implements NativeResource {

        private static final XrEventDataViveTrackerConnectedHTCX ELEMENT_FACTORY = XrEventDataViveTrackerConnectedHTCX.create(-1L);

        /**
         * Creates a new {@code XrEventDataViveTrackerConnectedHTCX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataViveTrackerConnectedHTCX#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataViveTrackerConnectedHTCX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataViveTrackerConnectedHTCX#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataViveTrackerConnectedHTCX.ntype(address()); }
        /** @return the value of the {@link XrEventDataViveTrackerConnectedHTCX#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataViveTrackerConnectedHTCX.nnext(address()); }
        /** @return a {@link XrViveTrackerPathsHTCX} view of the struct pointed to by the {@link XrEventDataViveTrackerConnectedHTCX#paths} field. */
        @NativeType("XrViveTrackerPathsHTCX *")
        public XrViveTrackerPathsHTCX paths() { return XrEventDataViveTrackerConnectedHTCX.npaths(address()); }

        /** Sets the specified value to the {@link XrEventDataViveTrackerConnectedHTCX#type} field. */
        public XrEventDataViveTrackerConnectedHTCX.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataViveTrackerConnectedHTCX.ntype(address(), value); return this; }
        /** Sets the {@link HTCXViveTrackerInteraction#XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX} value to the {@link XrEventDataViveTrackerConnectedHTCX#type} field. */
        public XrEventDataViveTrackerConnectedHTCX.Buffer type$Default() { return type(HTCXViveTrackerInteraction.XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX); }
        /** Sets the specified value to the {@link XrEventDataViveTrackerConnectedHTCX#next} field. */
        public XrEventDataViveTrackerConnectedHTCX.Buffer next(@NativeType("void const *") long value) { XrEventDataViveTrackerConnectedHTCX.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrViveTrackerPathsHTCX} to the {@link XrEventDataViveTrackerConnectedHTCX#paths} field. */
        public XrEventDataViveTrackerConnectedHTCX.Buffer paths(@NativeType("XrViveTrackerPathsHTCX *") XrViveTrackerPathsHTCX value) { XrEventDataViveTrackerConnectedHTCX.npaths(address(), value); return this; }

    }

}