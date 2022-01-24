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
 * Creates a session.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code systemId} <b>must</b> be a valid {@code XrSystemId} or {@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID} <b>must</b> be returned.</li>
 * <li>{@code next}, unless otherwise specified via an extension, <b>must</b> contain exactly one graphics API binding structure (a structure whose name begins with “XrGraphicsBinding”) or {@link XR10#XR_ERROR_GRAPHICS_DEVICE_INVALID ERROR_GRAPHICS_DEVICE_INVALID} <b>must</b> be returned.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SESSION_CREATE_INFO TYPE_SESSION_CREATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrGraphicsBindingEGLMNDX}, {@link XrGraphicsBindingOpenGLWaylandKHR}, {@link XrGraphicsBindingOpenGLWin32KHR}, {@link XrGraphicsBindingOpenGLXcbKHR}, {@link XrGraphicsBindingOpenGLXlibKHR}, {@link XrGraphicsBindingVulkanKHR}, {@link XrHolographicWindowAttachmentMSFT}, {@link XrSessionCreateInfoOverlayEXTX}</li>
 * <li>{@code createFlags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSessionCreateInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSessionCreateFlags {@link #createFlags};
 *     XrSystemId {@link #systemId};
 * }</code></pre>
 */
public class XrSessionCreateInfo extends Struct implements NativeResource {

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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. Note that in most cases one graphics API extension specific struct needs to be in this next chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** identifies {@code XrSessionCreateFlags} that apply to the creation. */
    @NativeType("XrSessionCreateFlags")
    public long createFlags() { return ncreateFlags(address()); }
    /** the {@code XrSystemId} representing the system of devices to be used by this session. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSessionCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SESSION_CREATE_INFO TYPE_SESSION_CREATE_INFO} value to the {@link #type} field. */
    public XrSessionCreateInfo type$Default() { return type(XR10.XR_TYPE_SESSION_CREATE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
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
    /** Sets the specified value to the {@link #createFlags} field. */
    public XrSessionCreateInfo createFlags(@NativeType("XrSessionCreateFlags") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #systemId} field. */
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
        return wrap(XrSessionCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfo calloc() {
        return wrap(XrSessionCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSessionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrSessionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSessionCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSessionCreateInfo} instance for the specified memory address. */
    public static XrSessionCreateInfo create(long address) {
        return wrap(XrSessionCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrSessionCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSessionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSessionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfo malloc(MemoryStack stack) {
        return wrap(XrSessionCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSessionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfo calloc(MemoryStack stack) {
        return wrap(XrSessionCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSessionCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSessionCreateInfo.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrSessionCreateInfo.CREATEFLAGS); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return UNSAFE.getLong(null, struct + XrSessionCreateInfo.SYSTEMID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSessionCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSessionCreateInfo.CREATEFLAGS, value); }
    /** Unsafe version of {@link #systemId(long) systemId}. */
    public static void nsystemId(long struct, long value) { UNSAFE.putLong(null, struct + XrSessionCreateInfo.SYSTEMID, value); }

    // -----------------------------------

    /** An array of {@link XrSessionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrSessionCreateInfo, Buffer> implements NativeResource {

        private static final XrSessionCreateInfo ELEMENT_FACTORY = XrSessionCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrSessionCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSessionCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrSessionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSessionCreateInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSessionCreateInfo.ntype(address()); }
        /** @return the value of the {@link XrSessionCreateInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrSessionCreateInfo.nnext(address()); }
        /** @return the value of the {@link XrSessionCreateInfo#createFlags} field. */
        @NativeType("XrSessionCreateFlags")
        public long createFlags() { return XrSessionCreateInfo.ncreateFlags(address()); }
        /** @return the value of the {@link XrSessionCreateInfo#systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrSessionCreateInfo.nsystemId(address()); }

        /** Sets the specified value to the {@link XrSessionCreateInfo#type} field. */
        public XrSessionCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSessionCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SESSION_CREATE_INFO TYPE_SESSION_CREATE_INFO} value to the {@link XrSessionCreateInfo#type} field. */
        public XrSessionCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SESSION_CREATE_INFO); }
        /** Sets the specified value to the {@link XrSessionCreateInfo#next} field. */
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
        /** Sets the specified value to the {@link XrSessionCreateInfo#createFlags} field. */
        public XrSessionCreateInfo.Buffer createFlags(@NativeType("XrSessionCreateFlags") long value) { XrSessionCreateInfo.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrSessionCreateInfo#systemId} field. */
        public XrSessionCreateInfo.Buffer systemId(@NativeType("XrSystemId") long value) { XrSessionCreateInfo.nsystemId(address(), value); return this; }

    }

}