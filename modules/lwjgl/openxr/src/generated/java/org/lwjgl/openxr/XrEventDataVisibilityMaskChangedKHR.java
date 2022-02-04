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
 * Visibility Mask.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to using {@link XrEventDataVisibilityMaskChangedKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRVisibilityMask#XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
 * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataVisibilityMaskChangedKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSession {@link #session};
 *     XrViewConfigurationType {@link #viewConfigurationType};
 *     uint32_t {@link #viewIndex};
 * }</code></pre>
 */
public class XrEventDataVisibilityMaskChangedKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        VIEWCONFIGURATIONTYPE,
        VIEWINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        VIEWCONFIGURATIONTYPE = layout.offsetof(3);
        VIEWINDEX = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrEventDataVisibilityMaskChangedKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataVisibilityMaskChangedKHR(ByteBuffer container) {
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
    /** the {@code XrSession} for which the view mask has changed. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** the view configuration whose mask has changed. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** the individual view within the view configuration to which the change refers. */
    @NativeType("uint32_t")
    public int viewIndex() { return nviewIndex(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataVisibilityMaskChangedKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVisibilityMask#XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR} value to the {@link #type} field. */
    public XrEventDataVisibilityMaskChangedKHR type$Default() { return type(KHRVisibilityMask.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataVisibilityMaskChangedKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #session} field. */
    public XrEventDataVisibilityMaskChangedKHR session(XrSession value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@link #viewConfigurationType} field. */
    public XrEventDataVisibilityMaskChangedKHR viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }
    /** Sets the specified value to the {@link #viewIndex} field. */
    public XrEventDataVisibilityMaskChangedKHR viewIndex(@NativeType("uint32_t") int value) { nviewIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVisibilityMaskChangedKHR set(
        int type,
        long next,
        XrSession session,
        int viewConfigurationType,
        int viewIndex
    ) {
        type(type);
        next(next);
        session(session);
        viewConfigurationType(viewConfigurationType);
        viewIndex(viewIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataVisibilityMaskChangedKHR set(XrEventDataVisibilityMaskChangedKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataVisibilityMaskChangedKHR malloc() {
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataVisibilityMaskChangedKHR calloc() {
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated with {@link BufferUtils}. */
    public static XrEventDataVisibilityMaskChangedKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance for the specified memory address. */
    public static XrEventDataVisibilityMaskChangedKHR create(long address) {
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataVisibilityMaskChangedKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataVisibilityMaskChangedKHR.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataVisibilityMaskChangedKHR}. */
    public static XrEventDataVisibilityMaskChangedKHR create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, value);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataVisibilityMaskChangedKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataVisibilityMaskChangedKHR.Buffer}. */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVisibilityMaskChangedKHR malloc(MemoryStack stack) {
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataVisibilityMaskChangedKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVisibilityMaskChangedKHR calloc(MemoryStack stack) {
        return wrap(XrEventDataVisibilityMaskChangedKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVisibilityMaskChangedKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVisibilityMaskChangedKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataVisibilityMaskChangedKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVisibilityMaskChangedKHR.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataVisibilityMaskChangedKHR.SESSION); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrEventDataVisibilityMaskChangedKHR.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #viewIndex}. */
    public static int nviewIndex(long struct) { return UNSAFE.getInt(null, struct + XrEventDataVisibilityMaskChangedKHR.VIEWINDEX); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataVisibilityMaskChangedKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVisibilityMaskChangedKHR.NEXT, value); }
    /** Unsafe version of {@link #session(XrSession) session}. */
    public static void nsession(long struct, XrSession value) { memPutAddress(struct + XrEventDataVisibilityMaskChangedKHR.SESSION, value.address()); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataVisibilityMaskChangedKHR.VIEWCONFIGURATIONTYPE, value); }
    /** Unsafe version of {@link #viewIndex(int) viewIndex}. */
    public static void nviewIndex(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataVisibilityMaskChangedKHR.VIEWINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataVisibilityMaskChangedKHR.SESSION));
    }

    // -----------------------------------

    /** An array of {@link XrEventDataVisibilityMaskChangedKHR} structs. */
    public static class Buffer extends StructBuffer<XrEventDataVisibilityMaskChangedKHR, Buffer> implements NativeResource {

        private static final XrEventDataVisibilityMaskChangedKHR ELEMENT_FACTORY = XrEventDataVisibilityMaskChangedKHR.create(-1L);

        /**
         * Creates a new {@code XrEventDataVisibilityMaskChangedKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataVisibilityMaskChangedKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataVisibilityMaskChangedKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataVisibilityMaskChangedKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVisibilityMaskChangedKHR.ntype(address()); }
        /** @return the value of the {@link XrEventDataVisibilityMaskChangedKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVisibilityMaskChangedKHR.nnext(address()); }
        /** @return the value of the {@link XrEventDataVisibilityMaskChangedKHR#session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataVisibilityMaskChangedKHR.nsession(address()); }
        /** @return the value of the {@link XrEventDataVisibilityMaskChangedKHR#viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrEventDataVisibilityMaskChangedKHR.nviewConfigurationType(address()); }
        /** @return the value of the {@link XrEventDataVisibilityMaskChangedKHR#viewIndex} field. */
        @NativeType("uint32_t")
        public int viewIndex() { return XrEventDataVisibilityMaskChangedKHR.nviewIndex(address()); }

        /** Sets the specified value to the {@link XrEventDataVisibilityMaskChangedKHR#type} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVisibilityMaskChangedKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVisibilityMask#XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR} value to the {@link XrEventDataVisibilityMaskChangedKHR#type} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer type$Default() { return type(KHRVisibilityMask.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR); }
        /** Sets the specified value to the {@link XrEventDataVisibilityMaskChangedKHR#next} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer next(@NativeType("void const *") long value) { XrEventDataVisibilityMaskChangedKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataVisibilityMaskChangedKHR#session} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer session(XrSession value) { XrEventDataVisibilityMaskChangedKHR.nsession(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataVisibilityMaskChangedKHR#viewConfigurationType} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrEventDataVisibilityMaskChangedKHR.nviewConfigurationType(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataVisibilityMaskChangedKHR#viewIndex} field. */
        public XrEventDataVisibilityMaskChangedKHR.Buffer viewIndex(@NativeType("uint32_t") int value) { XrEventDataVisibilityMaskChangedKHR.nviewIndex(address(), value); return this; }

    }

}