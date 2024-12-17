/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSessionCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrSessionCreateFlags createFlags;
 *     XrSystemId systemId;
 * }}</pre>
 */
public class XrSessionCreateInfo extends Struct<XrSessionCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS,
        SYSTEMID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        SYSTEMID = layout.offsetof(3);
    }

    protected XrSessionCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSessionCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new XrSessionCreateInfo(address, container);
    }

    /**
     * Creates a {@code XrSessionCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSessionCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code createFlags} field. */
    @NativeType("XrSessionCreateFlags")
    public long createFlags() { return ncreateFlags(address()); }
    /** @return the value of the {@code systemId} field. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSessionCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SESSION_CREATE_INFO TYPE_SESSION_CREATE_INFO} value to the {@code type} field. */
    public XrSessionCreateInfo type$Default() { return type(XR10.XR_TYPE_SESSION_CREATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrSessionCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrGraphicsBindingEGLMNDX} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingEGLMNDX value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGraphicsBindingOpenGLWaylandKHR} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingOpenGLWaylandKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGraphicsBindingOpenGLWin32KHR} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingOpenGLWin32KHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGraphicsBindingOpenGLXcbKHR} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingOpenGLXcbKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGraphicsBindingOpenGLXlibKHR} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingOpenGLXlibKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGraphicsBindingVulkan2KHR} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingVulkan2KHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrGraphicsBindingVulkanKHR} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrGraphicsBindingVulkanKHR value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrHolographicWindowAttachmentMSFT} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrHolographicWindowAttachmentMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSessionCreateInfoOverlayEXTX} value to the {@code next} chain. */
    public XrSessionCreateInfo next(XrSessionCreateInfoOverlayEXTX value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrSessionCreateInfo createFlags(@NativeType("XrSessionCreateFlags") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code systemId} field. */
    public XrSessionCreateInfo systemId(@NativeType("XrSystemId") long value) { nsystemId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSessionCreateInfo set(
        int type,
        long next,
        long createFlags,
        long systemId
    ) {
        type(type);
        next(next);
        createFlags(createFlags);
        systemId(systemId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSessionCreateInfo set(XrSessionCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfo malloc() {
        return new XrSessionCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfo calloc() {
        return new XrSessionCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrSessionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSessionCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrSessionCreateInfo} instance for the specified memory address. */
    public static XrSessionCreateInfo create(long address) {
        return new XrSessionCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSessionCreateInfo createSafe(long address) {
        return address == NULL ? null : new XrSessionCreateInfo(address, null);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSessionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSessionCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSessionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfo malloc(MemoryStack stack) {
        return new XrSessionCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSessionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfo calloc(MemoryStack stack) {
        return new XrSessionCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSessionCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSessionCreateInfo.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return memGetLong(struct + XrSessionCreateInfo.CREATEFLAGS); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return memGetLong(struct + XrSessionCreateInfo.SYSTEMID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSessionCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSessionCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { memPutLong(struct + XrSessionCreateInfo.CREATEFLAGS, value); }
    /** Unsafe version of {@link #systemId(long) systemId}. */
    public static void nsystemId(long struct, long value) { memPutLong(struct + XrSessionCreateInfo.SYSTEMID, value); }

    // -----------------------------------

    /** An array of {@link XrSessionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrSessionCreateInfo, Buffer> implements NativeResource {

        private static final XrSessionCreateInfo ELEMENT_FACTORY = XrSessionCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrSessionCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSessionCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSessionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSessionCreateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSessionCreateInfo.nnext(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("XrSessionCreateFlags")
        public long createFlags() { return XrSessionCreateInfo.ncreateFlags(address()); }
        /** @return the value of the {@code systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrSessionCreateInfo.nsystemId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSessionCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSessionCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SESSION_CREATE_INFO TYPE_SESSION_CREATE_INFO} value to the {@code type} field. */
        public XrSessionCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SESSION_CREATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrSessionCreateInfo.Buffer next(@NativeType("void const *") long value) { XrSessionCreateInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrGraphicsBindingEGLMNDX} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingEGLMNDX value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGraphicsBindingOpenGLWaylandKHR} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingOpenGLWaylandKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGraphicsBindingOpenGLWin32KHR} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingOpenGLWin32KHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGraphicsBindingOpenGLXcbKHR} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingOpenGLXcbKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGraphicsBindingOpenGLXlibKHR} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingOpenGLXlibKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGraphicsBindingVulkan2KHR} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingVulkan2KHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrGraphicsBindingVulkanKHR} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrGraphicsBindingVulkanKHR value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrHolographicWindowAttachmentMSFT} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrHolographicWindowAttachmentMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSessionCreateInfoOverlayEXTX} value to the {@code next} chain. */
        public XrSessionCreateInfo.Buffer next(XrSessionCreateInfoOverlayEXTX value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrSessionCreateInfo.Buffer createFlags(@NativeType("XrSessionCreateFlags") long value) { XrSessionCreateInfo.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code systemId} field. */
        public XrSessionCreateInfo.Buffer systemId(@NativeType("XrSystemId") long value) { XrSessionCreateInfo.nsystemId(address(), value); return this; }

    }

}