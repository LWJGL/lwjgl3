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
 * Describes a swapchain image acquisition.
 * 
 * <h5>Description</h5>
 * 
 * <p>Because this structure only exists to support extension-specific structures, {@link XR10#xrAcquireSwapchainImage AcquireSwapchainImage} will accept a {@code NULL} argument for {@code acquireInfo} for applications that are not using any relevant extensions.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrAcquireSwapchainImage AcquireSwapchainImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainImageAcquireInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrSwapchainImageAcquireInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSwapchainImageAcquireInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageAcquireInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainImageAcquireInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO} value to the {@link #type} field. */
    public XrSwapchainImageAcquireInfo type$Default() { return type(XR10.XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainImageAcquireInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageAcquireInfo set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageAcquireInfo set(XrSwapchainImageAcquireInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageAcquireInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageAcquireInfo malloc() {
        return wrap(XrSwapchainImageAcquireInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageAcquireInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageAcquireInfo calloc() {
        return wrap(XrSwapchainImageAcquireInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageAcquireInfo} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageAcquireInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainImageAcquireInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageAcquireInfo} instance for the specified memory address. */
    public static XrSwapchainImageAcquireInfo create(long address) {
        return wrap(XrSwapchainImageAcquireInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageAcquireInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainImageAcquireInfo.class, address);
    }

    /**
     * Returns a new {@link XrSwapchainImageAcquireInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageAcquireInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageAcquireInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageAcquireInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageAcquireInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageAcquireInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainImageAcquireInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageAcquireInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageAcquireInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainImageAcquireInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageAcquireInfo malloc(MemoryStack stack) {
        return wrap(XrSwapchainImageAcquireInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainImageAcquireInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageAcquireInfo calloc(MemoryStack stack) {
        return wrap(XrSwapchainImageAcquireInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainImageAcquireInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageAcquireInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageAcquireInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageAcquireInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageAcquireInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageAcquireInfo.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageAcquireInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageAcquireInfo.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageAcquireInfo} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageAcquireInfo, Buffer> implements NativeResource {

        private static final XrSwapchainImageAcquireInfo ELEMENT_FACTORY = XrSwapchainImageAcquireInfo.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageAcquireInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageAcquireInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainImageAcquireInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainImageAcquireInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageAcquireInfo.ntype(address()); }
        /** @return the value of the {@link XrSwapchainImageAcquireInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrSwapchainImageAcquireInfo.nnext(address()); }

        /** Sets the specified value to the {@link XrSwapchainImageAcquireInfo#type} field. */
        public XrSwapchainImageAcquireInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageAcquireInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO} value to the {@link XrSwapchainImageAcquireInfo#type} field. */
        public XrSwapchainImageAcquireInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SWAPCHAIN_IMAGE_ACQUIRE_INFO); }
        /** Sets the specified value to the {@link XrSwapchainImageAcquireInfo#next} field. */
        public XrSwapchainImageAcquireInfo.Buffer next(@NativeType("void const *") long value) { XrSwapchainImageAcquireInfo.nnext(address(), value); return this; }

    }

}