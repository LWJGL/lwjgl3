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
 * System property for color space.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBColorSpace XR_FB_color_space} extension <b>must</b> be enabled prior to using {@link XrSystemColorSpacePropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBColorSpace#XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code colorSpace} <b>must</b> be a valid {@code XrColorSpaceFB} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemColorSpacePropertiesFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrColorSpaceFB {@link #colorSpace};
 * }</code></pre>
 */
public class XrSystemColorSpacePropertiesFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COLORSPACE;

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
        COLORSPACE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemColorSpacePropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemColorSpacePropertiesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the native color space of the XR device. */
    @NativeType("XrColorSpaceFB")
    public int colorSpace() { return ncolorSpace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemColorSpacePropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBColorSpace#XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB} value to the {@link #type} field. */
    public XrSystemColorSpacePropertiesFB type$Default() { return type(FBColorSpace.XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemColorSpacePropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #colorSpace} field. */
    public XrSystemColorSpacePropertiesFB colorSpace(@NativeType("XrColorSpaceFB") int value) { ncolorSpace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemColorSpacePropertiesFB set(
        int type,
        long next,
        int colorSpace
    ) {
        type(type);
        next(next);
        colorSpace(colorSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemColorSpacePropertiesFB set(XrSystemColorSpacePropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemColorSpacePropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemColorSpacePropertiesFB malloc() {
        return wrap(XrSystemColorSpacePropertiesFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemColorSpacePropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemColorSpacePropertiesFB calloc() {
        return wrap(XrSystemColorSpacePropertiesFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemColorSpacePropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemColorSpacePropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemColorSpacePropertiesFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemColorSpacePropertiesFB} instance for the specified memory address. */
    public static XrSystemColorSpacePropertiesFB create(long address) {
        return wrap(XrSystemColorSpacePropertiesFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemColorSpacePropertiesFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemColorSpacePropertiesFB.class, address);
    }

    /**
     * Returns a new {@link XrSystemColorSpacePropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemColorSpacePropertiesFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemColorSpacePropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemColorSpacePropertiesFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemColorSpacePropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemColorSpacePropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemColorSpacePropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemColorSpacePropertiesFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemColorSpacePropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemColorSpacePropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemColorSpacePropertiesFB malloc(MemoryStack stack) {
        return wrap(XrSystemColorSpacePropertiesFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemColorSpacePropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemColorSpacePropertiesFB calloc(MemoryStack stack) {
        return wrap(XrSystemColorSpacePropertiesFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemColorSpacePropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemColorSpacePropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemColorSpacePropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemColorSpacePropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemColorSpacePropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemColorSpacePropertiesFB.NEXT); }
    /** Unsafe version of {@link #colorSpace}. */
    public static int ncolorSpace(long struct) { return UNSAFE.getInt(null, struct + XrSystemColorSpacePropertiesFB.COLORSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemColorSpacePropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemColorSpacePropertiesFB.NEXT, value); }
    /** Unsafe version of {@link #colorSpace(int) colorSpace}. */
    public static void ncolorSpace(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemColorSpacePropertiesFB.COLORSPACE, value); }

    // -----------------------------------

    /** An array of {@link XrSystemColorSpacePropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemColorSpacePropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemColorSpacePropertiesFB ELEMENT_FACTORY = XrSystemColorSpacePropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemColorSpacePropertiesFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemColorSpacePropertiesFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemColorSpacePropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemColorSpacePropertiesFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemColorSpacePropertiesFB.ntype(address()); }
        /** @return the value of the {@link XrSystemColorSpacePropertiesFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemColorSpacePropertiesFB.nnext(address()); }
        /** @return the value of the {@link XrSystemColorSpacePropertiesFB#colorSpace} field. */
        @NativeType("XrColorSpaceFB")
        public int colorSpace() { return XrSystemColorSpacePropertiesFB.ncolorSpace(address()); }

        /** Sets the specified value to the {@link XrSystemColorSpacePropertiesFB#type} field. */
        public XrSystemColorSpacePropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemColorSpacePropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBColorSpace#XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB} value to the {@link XrSystemColorSpacePropertiesFB#type} field. */
        public XrSystemColorSpacePropertiesFB.Buffer type$Default() { return type(FBColorSpace.XR_TYPE_SYSTEM_COLOR_SPACE_PROPERTIES_FB); }
        /** Sets the specified value to the {@link XrSystemColorSpacePropertiesFB#next} field. */
        public XrSystemColorSpacePropertiesFB.Buffer next(@NativeType("void *") long value) { XrSystemColorSpacePropertiesFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSystemColorSpacePropertiesFB#colorSpace} field. */
        public XrSystemColorSpacePropertiesFB.Buffer colorSpace(@NativeType("XrColorSpaceFB") int value) { XrSystemColorSpacePropertiesFB.ncolorSpace(address(), value); return this; }

    }

}