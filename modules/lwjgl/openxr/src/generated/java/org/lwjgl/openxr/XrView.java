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
 * Struct containing view projection state.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrView} structure contains view pose and projection state necessary to render a single projection view in the view configuration.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_VIEW TYPE_VIEW}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFovf}, {@link XrPosef}, {@link XrViewLocateInfo}, {@link XrViewState}, {@link XR10#xrLocateViews LocateViews}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrView {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrFovf XrFovf} {@link #fov};
 * }</code></pre>
 */
public class XrView extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        POSE,
        FOV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        POSE = layout.offsetof(2);
        FOV = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrView} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrView(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@link XrPosef} defining the location and orientation of the view in the {@code space} specified by the {@link XR10#xrLocateViews LocateViews} function. */
    public XrPosef pose() { return npose(address()); }
    /** the {@link XrFovf} for the four sides of the projection. */
    public XrFovf fov() { return nfov(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrView type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_VIEW TYPE_VIEW} value to the {@link #type} field. */
    public XrView type$Default() { return type(XR10.XR_TYPE_VIEW); }
    /** Sets the specified value to the {@link #next} field. */
    public XrView next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrView pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrView pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrFovf} to the {@link #fov} field. */
    public XrView fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@link #fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrView fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }

    /** Initializes this struct with the specified values. */
    public XrView set(
        int type,
        long next,
        XrPosef pose,
        XrFovf fov
    ) {
        type(type);
        next(next);
        pose(pose);
        fov(fov);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrView set(XrView src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrView} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrView malloc() {
        return wrap(XrView.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrView} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrView calloc() {
        return wrap(XrView.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrView} instance allocated with {@link BufferUtils}. */
    public static XrView create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrView.class, memAddress(container), container);
    }

    /** Returns a new {@code XrView} instance for the specified memory address. */
    public static XrView create(long address) {
        return wrap(XrView.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrView createSafe(long address) {
        return address == NULL ? null : wrap(XrView.class, address);
    }

    /**
     * Returns a new {@link XrView.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrView.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrView.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrView.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrView.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrView.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrView.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrView.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrView.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrView} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrView malloc(MemoryStack stack) {
        return wrap(XrView.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrView} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrView calloc(MemoryStack stack) {
        return wrap(XrView.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrView.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrView.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrView.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrView.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrView.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrView.NEXT); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrView.POSE); }
    /** Unsafe version of {@link #fov}. */
    public static XrFovf nfov(long struct) { return XrFovf.create(struct + XrView.FOV); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrView.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrView.NEXT, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrView.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #fov(XrFovf) fov}. */
    public static void nfov(long struct, XrFovf value) { memCopy(value.address(), struct + XrView.FOV, XrFovf.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrView} structs. */
    public static class Buffer extends StructBuffer<XrView, Buffer> implements NativeResource {

        private static final XrView ELEMENT_FACTORY = XrView.create(-1L);

        /**
         * Creates a new {@code XrView.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrView#SIZEOF}, and its mark will be undefined.
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
        protected XrView getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrView#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrView.ntype(address()); }
        /** @return the value of the {@link XrView#next} field. */
        @NativeType("void *")
        public long next() { return XrView.nnext(address()); }
        /** @return a {@link XrPosef} view of the {@link XrView#pose} field. */
        public XrPosef pose() { return XrView.npose(address()); }
        /** @return a {@link XrFovf} view of the {@link XrView#fov} field. */
        public XrFovf fov() { return XrView.nfov(address()); }

        /** Sets the specified value to the {@link XrView#type} field. */
        public XrView.Buffer type(@NativeType("XrStructureType") int value) { XrView.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_VIEW TYPE_VIEW} value to the {@link XrView#type} field. */
        public XrView.Buffer type$Default() { return type(XR10.XR_TYPE_VIEW); }
        /** Sets the specified value to the {@link XrView#next} field. */
        public XrView.Buffer next(@NativeType("void *") long value) { XrView.nnext(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrView#pose} field. */
        public XrView.Buffer pose(XrPosef value) { XrView.npose(address(), value); return this; }
        /** Passes the {@link XrView#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrView.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrFovf} to the {@link XrView#fov} field. */
        public XrView.Buffer fov(XrFovf value) { XrView.nfov(address(), value); return this; }
        /** Passes the {@link XrView#fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrView.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }

    }

}