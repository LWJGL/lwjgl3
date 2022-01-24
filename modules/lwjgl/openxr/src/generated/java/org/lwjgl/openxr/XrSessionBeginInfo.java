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
 * Struct containing session begin info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SESSION_BEGIN_INFO TYPE_SESSION_BEGIN_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT}</li>
 * <li>{@code primaryViewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrBeginSession BeginSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSessionBeginInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrViewConfigurationType {@link #primaryViewConfigurationType};
 * }</code></pre>
 */
public class XrSessionBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PRIMARYVIEWCONFIGURATIONTYPE;

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
        PRIMARYVIEWCONFIGURATIONTYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSessionBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSessionBeginInfo(ByteBuffer container) {
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
    /** the {@code XrViewConfigurationType} to use during this session to provide images for the form factor’s primary displays. */
    @NativeType("XrViewConfigurationType")
    public int primaryViewConfigurationType() { return nprimaryViewConfigurationType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSessionBeginInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SESSION_BEGIN_INFO TYPE_SESSION_BEGIN_INFO} value to the {@link #type} field. */
    public XrSessionBeginInfo type$Default() { return type(XR10.XR_TYPE_SESSION_BEGIN_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSessionBeginInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT} value to the {@code next} chain. */
    public XrSessionBeginInfo next(XrSecondaryViewConfigurationSessionBeginInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #primaryViewConfigurationType} field. */
    public XrSessionBeginInfo primaryViewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nprimaryViewConfigurationType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSessionBeginInfo set(
        int type,
        long next,
        int primaryViewConfigurationType
    ) {
        type(type);
        next(next);
        primaryViewConfigurationType(primaryViewConfigurationType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSessionBeginInfo set(XrSessionBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSessionBeginInfo malloc() {
        return wrap(XrSessionBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSessionBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSessionBeginInfo calloc() {
        return wrap(XrSessionBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSessionBeginInfo} instance allocated with {@link BufferUtils}. */
    public static XrSessionBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSessionBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSessionBeginInfo} instance for the specified memory address. */
    public static XrSessionBeginInfo create(long address) {
        return wrap(XrSessionBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrSessionBeginInfo.class, address);
    }

    /**
     * Returns a new {@link XrSessionBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSessionBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSessionBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSessionBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSessionBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionBeginInfo malloc(MemoryStack stack) {
        return wrap(XrSessionBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSessionBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionBeginInfo calloc(MemoryStack stack) {
        return wrap(XrSessionBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSessionBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSessionBeginInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSessionBeginInfo.NEXT); }
    /** Unsafe version of {@link #primaryViewConfigurationType}. */
    public static int nprimaryViewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrSessionBeginInfo.PRIMARYVIEWCONFIGURATIONTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionBeginInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSessionBeginInfo.NEXT, value); }
    /** Unsafe version of {@link #primaryViewConfigurationType(int) primaryViewConfigurationType}. */
    public static void nprimaryViewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionBeginInfo.PRIMARYVIEWCONFIGURATIONTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSessionBeginInfo} structs. */
    public static class Buffer extends StructBuffer<XrSessionBeginInfo, Buffer> implements NativeResource {

        private static final XrSessionBeginInfo ELEMENT_FACTORY = XrSessionBeginInfo.create(-1L);

        /**
         * Creates a new {@code XrSessionBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSessionBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrSessionBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSessionBeginInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSessionBeginInfo.ntype(address()); }
        /** @return the value of the {@link XrSessionBeginInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrSessionBeginInfo.nnext(address()); }
        /** @return the value of the {@link XrSessionBeginInfo#primaryViewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int primaryViewConfigurationType() { return XrSessionBeginInfo.nprimaryViewConfigurationType(address()); }

        /** Sets the specified value to the {@link XrSessionBeginInfo#type} field. */
        public XrSessionBeginInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSessionBeginInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SESSION_BEGIN_INFO TYPE_SESSION_BEGIN_INFO} value to the {@link XrSessionBeginInfo#type} field. */
        public XrSessionBeginInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SESSION_BEGIN_INFO); }
        /** Sets the specified value to the {@link XrSessionBeginInfo#next} field. */
        public XrSessionBeginInfo.Buffer next(@NativeType("void const *") long value) { XrSessionBeginInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT} value to the {@code next} chain. */
        public XrSessionBeginInfo.Buffer next(XrSecondaryViewConfigurationSessionBeginInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrSessionBeginInfo#primaryViewConfigurationType} field. */
        public XrSessionBeginInfo.Buffer primaryViewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrSessionBeginInfo.nprimaryViewConfigurationType(address(), value); return this; }

    }

}