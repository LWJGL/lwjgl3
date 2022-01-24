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
 * The holographic window binding structure which can be passed at session creation.
 * 
 * <h5>Description</h5>
 * 
 * <p>When creating a holographic window-backed {@code XrSession}, the application provides a pointer to an {@link XrHolographicWindowAttachmentMSFT} in the {@code next} chain of the {@link XrSessionCreateInfo}.</p>
 * 
 * <p>The session state of a holographic window-backed {@code XrSession} will only reach {@link XR10#XR_SESSION_STATE_VISIBLE SESSION_STATE_VISIBLE} when the provided CoreWindow is made visible. If the CoreWindow is for a secondary app view, the application must programmatically request to make the CoreWindow visible (e.g. with {@code ApplicationViewSwitcher.TryShowAsStandaloneAsync} or {@code ApplicationViewSwitcher.SwitchAsync}).</p>
 * 
 * <p>The app <b>must</b> not call {@link XR10#xrCreateSession CreateSession} while the specified CoreWindow thread is blocked, otherwise the call <b>may</b> deadlock.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHolographicWindowAttachment XR_MSFT_holographic_window_attachment} extension <b>must</b> be enabled prior to using {@link XrHolographicWindowAttachmentMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTHolographicWindowAttachment#XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code holographicSpace} <b>must</b> be a pointer to an {@code IUnknown} value</li>
 * <li>{@code coreWindow} <b>must</b> be a pointer to an {@code IUnknown} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHolographicWindowAttachmentMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     IUnknown * {@link #holographicSpace};
 *     IUnknown * {@link #coreWindow};
 * }</code></pre>
 */
public class XrHolographicWindowAttachmentMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HOLOGRAPHICSPACE,
        COREWINDOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        HOLOGRAPHICSPACE = layout.offsetof(2);
        COREWINDOW = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHolographicWindowAttachmentMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHolographicWindowAttachmentMSFT(ByteBuffer container) {
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
    /** a pointer to a valid {@code Windows}.Graphics.Holographic.HolographicSpace. */
    @NativeType("IUnknown *")
    public long holographicSpace() { return nholographicSpace(address()); }
    /** a pointer to a valid {@code Windows}.UI.Core.CoreWindow. */
    @NativeType("IUnknown *")
    public long coreWindow() { return ncoreWindow(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHolographicWindowAttachmentMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHolographicWindowAttachment#XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT} value to the {@link #type} field. */
    public XrHolographicWindowAttachmentMSFT type$Default() { return type(MSFTHolographicWindowAttachment.XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHolographicWindowAttachmentMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #holographicSpace} field. */
    public XrHolographicWindowAttachmentMSFT holographicSpace(@NativeType("IUnknown *") long value) { nholographicSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #coreWindow} field. */
    public XrHolographicWindowAttachmentMSFT coreWindow(@NativeType("IUnknown *") long value) { ncoreWindow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHolographicWindowAttachmentMSFT set(
        int type,
        long next,
        long holographicSpace,
        long coreWindow
    ) {
        type(type);
        next(next);
        holographicSpace(holographicSpace);
        coreWindow(coreWindow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHolographicWindowAttachmentMSFT set(XrHolographicWindowAttachmentMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHolographicWindowAttachmentMSFT malloc() {
        return wrap(XrHolographicWindowAttachmentMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHolographicWindowAttachmentMSFT calloc() {
        return wrap(XrHolographicWindowAttachmentMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHolographicWindowAttachmentMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHolographicWindowAttachmentMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance for the specified memory address. */
    public static XrHolographicWindowAttachmentMSFT create(long address) {
        return wrap(XrHolographicWindowAttachmentMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHolographicWindowAttachmentMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHolographicWindowAttachmentMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHolographicWindowAttachmentMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHolographicWindowAttachmentMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHolographicWindowAttachmentMSFT malloc(MemoryStack stack) {
        return wrap(XrHolographicWindowAttachmentMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHolographicWindowAttachmentMSFT calloc(MemoryStack stack) {
        return wrap(XrHolographicWindowAttachmentMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHolographicWindowAttachmentMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHolographicWindowAttachmentMSFT.NEXT); }
    /** Unsafe version of {@link #holographicSpace}. */
    public static long nholographicSpace(long struct) { return memGetAddress(struct + XrHolographicWindowAttachmentMSFT.HOLOGRAPHICSPACE); }
    /** Unsafe version of {@link #coreWindow}. */
    public static long ncoreWindow(long struct) { return memGetAddress(struct + XrHolographicWindowAttachmentMSFT.COREWINDOW); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHolographicWindowAttachmentMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHolographicWindowAttachmentMSFT.NEXT, value); }
    /** Unsafe version of {@link #holographicSpace(long) holographicSpace}. */
    public static void nholographicSpace(long struct, long value) { memPutAddress(struct + XrHolographicWindowAttachmentMSFT.HOLOGRAPHICSPACE, check(value)); }
    /** Unsafe version of {@link #coreWindow(long) coreWindow}. */
    public static void ncoreWindow(long struct, long value) { memPutAddress(struct + XrHolographicWindowAttachmentMSFT.COREWINDOW, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHolographicWindowAttachmentMSFT.HOLOGRAPHICSPACE));
        check(memGetAddress(struct + XrHolographicWindowAttachmentMSFT.COREWINDOW));
    }

    // -----------------------------------

    /** An array of {@link XrHolographicWindowAttachmentMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHolographicWindowAttachmentMSFT, Buffer> implements NativeResource {

        private static final XrHolographicWindowAttachmentMSFT ELEMENT_FACTORY = XrHolographicWindowAttachmentMSFT.create(-1L);

        /**
         * Creates a new {@code XrHolographicWindowAttachmentMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHolographicWindowAttachmentMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHolographicWindowAttachmentMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHolographicWindowAttachmentMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHolographicWindowAttachmentMSFT.ntype(address()); }
        /** @return the value of the {@link XrHolographicWindowAttachmentMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrHolographicWindowAttachmentMSFT.nnext(address()); }
        /** @return the value of the {@link XrHolographicWindowAttachmentMSFT#holographicSpace} field. */
        @NativeType("IUnknown *")
        public long holographicSpace() { return XrHolographicWindowAttachmentMSFT.nholographicSpace(address()); }
        /** @return the value of the {@link XrHolographicWindowAttachmentMSFT#coreWindow} field. */
        @NativeType("IUnknown *")
        public long coreWindow() { return XrHolographicWindowAttachmentMSFT.ncoreWindow(address()); }

        /** Sets the specified value to the {@link XrHolographicWindowAttachmentMSFT#type} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHolographicWindowAttachmentMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHolographicWindowAttachment#XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT} value to the {@link XrHolographicWindowAttachmentMSFT#type} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer type$Default() { return type(MSFTHolographicWindowAttachment.XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT); }
        /** Sets the specified value to the {@link XrHolographicWindowAttachmentMSFT#next} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer next(@NativeType("void const *") long value) { XrHolographicWindowAttachmentMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHolographicWindowAttachmentMSFT#holographicSpace} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer holographicSpace(@NativeType("IUnknown *") long value) { XrHolographicWindowAttachmentMSFT.nholographicSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrHolographicWindowAttachmentMSFT#coreWindow} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer coreWindow(@NativeType("IUnknown *") long value) { XrHolographicWindowAttachmentMSFT.ncoreWindow(address(), value); return this; }

    }

}