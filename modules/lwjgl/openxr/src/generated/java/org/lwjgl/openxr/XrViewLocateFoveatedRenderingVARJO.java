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
 * Request foveated FoV.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return foveated field of view when {@code foveatedRenderingActive} is {@link XR10#XR_TRUE TRUE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using {@link XrViewLocateFoveatedRenderingVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOFoveatedRendering#XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrViewLocateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrViewLocateFoveatedRenderingVARJO {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #foveatedRenderingActive};
 * }</code></pre>
 */
public class XrViewLocateFoveatedRenderingVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FOVEATEDRENDERINGACTIVE;

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
        FOVEATEDRENDERINGACTIVE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrViewLocateFoveatedRenderingVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewLocateFoveatedRenderingVARJO(ByteBuffer container) {
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
    /** an {@code XrBool32}, indicating if runtime should return foveated FoV. */
    @NativeType("XrBool32")
    public boolean foveatedRenderingActive() { return nfoveatedRenderingActive(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrViewLocateFoveatedRenderingVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOFoveatedRendering#XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO} value to the {@link #type} field. */
    public XrViewLocateFoveatedRenderingVARJO type$Default() { return type(VARJOFoveatedRendering.XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrViewLocateFoveatedRenderingVARJO next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #foveatedRenderingActive} field. */
    public XrViewLocateFoveatedRenderingVARJO foveatedRenderingActive(@NativeType("XrBool32") boolean value) { nfoveatedRenderingActive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewLocateFoveatedRenderingVARJO set(
        int type,
        long next,
        boolean foveatedRenderingActive
    ) {
        type(type);
        next(next);
        foveatedRenderingActive(foveatedRenderingActive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewLocateFoveatedRenderingVARJO set(XrViewLocateFoveatedRenderingVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewLocateFoveatedRenderingVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewLocateFoveatedRenderingVARJO malloc() {
        return wrap(XrViewLocateFoveatedRenderingVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrViewLocateFoveatedRenderingVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewLocateFoveatedRenderingVARJO calloc() {
        return wrap(XrViewLocateFoveatedRenderingVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrViewLocateFoveatedRenderingVARJO} instance allocated with {@link BufferUtils}. */
    public static XrViewLocateFoveatedRenderingVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrViewLocateFoveatedRenderingVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrViewLocateFoveatedRenderingVARJO} instance for the specified memory address. */
    public static XrViewLocateFoveatedRenderingVARJO create(long address) {
        return wrap(XrViewLocateFoveatedRenderingVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewLocateFoveatedRenderingVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrViewLocateFoveatedRenderingVARJO.class, address);
    }

    /**
     * Returns a new {@link XrViewLocateFoveatedRenderingVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewLocateFoveatedRenderingVARJO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewLocateFoveatedRenderingVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewLocateFoveatedRenderingVARJO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewLocateFoveatedRenderingVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewLocateFoveatedRenderingVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrViewLocateFoveatedRenderingVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewLocateFoveatedRenderingVARJO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewLocateFoveatedRenderingVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrViewLocateFoveatedRenderingVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewLocateFoveatedRenderingVARJO malloc(MemoryStack stack) {
        return wrap(XrViewLocateFoveatedRenderingVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrViewLocateFoveatedRenderingVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewLocateFoveatedRenderingVARJO calloc(MemoryStack stack) {
        return wrap(XrViewLocateFoveatedRenderingVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrViewLocateFoveatedRenderingVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewLocateFoveatedRenderingVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewLocateFoveatedRenderingVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewLocateFoveatedRenderingVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrViewLocateFoveatedRenderingVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewLocateFoveatedRenderingVARJO.NEXT); }
    /** Unsafe version of {@link #foveatedRenderingActive}. */
    public static int nfoveatedRenderingActive(long struct) { return UNSAFE.getInt(null, struct + XrViewLocateFoveatedRenderingVARJO.FOVEATEDRENDERINGACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrViewLocateFoveatedRenderingVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewLocateFoveatedRenderingVARJO.NEXT, value); }
    /** Unsafe version of {@link #foveatedRenderingActive(boolean) foveatedRenderingActive}. */
    public static void nfoveatedRenderingActive(long struct, int value) { UNSAFE.putInt(null, struct + XrViewLocateFoveatedRenderingVARJO.FOVEATEDRENDERINGACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrViewLocateFoveatedRenderingVARJO} structs. */
    public static class Buffer extends StructBuffer<XrViewLocateFoveatedRenderingVARJO, Buffer> implements NativeResource {

        private static final XrViewLocateFoveatedRenderingVARJO ELEMENT_FACTORY = XrViewLocateFoveatedRenderingVARJO.create(-1L);

        /**
         * Creates a new {@code XrViewLocateFoveatedRenderingVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewLocateFoveatedRenderingVARJO#SIZEOF}, and its mark will be undefined.
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
        protected XrViewLocateFoveatedRenderingVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrViewLocateFoveatedRenderingVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewLocateFoveatedRenderingVARJO.ntype(address()); }
        /** @return the value of the {@link XrViewLocateFoveatedRenderingVARJO#next} field. */
        @NativeType("void const *")
        public long next() { return XrViewLocateFoveatedRenderingVARJO.nnext(address()); }
        /** @return the value of the {@link XrViewLocateFoveatedRenderingVARJO#foveatedRenderingActive} field. */
        @NativeType("XrBool32")
        public boolean foveatedRenderingActive() { return XrViewLocateFoveatedRenderingVARJO.nfoveatedRenderingActive(address()) != 0; }

        /** Sets the specified value to the {@link XrViewLocateFoveatedRenderingVARJO#type} field. */
        public XrViewLocateFoveatedRenderingVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrViewLocateFoveatedRenderingVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOFoveatedRendering#XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO} value to the {@link XrViewLocateFoveatedRenderingVARJO#type} field. */
        public XrViewLocateFoveatedRenderingVARJO.Buffer type$Default() { return type(VARJOFoveatedRendering.XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO); }
        /** Sets the specified value to the {@link XrViewLocateFoveatedRenderingVARJO#next} field. */
        public XrViewLocateFoveatedRenderingVARJO.Buffer next(@NativeType("void const *") long value) { XrViewLocateFoveatedRenderingVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewLocateFoveatedRenderingVARJO#foveatedRenderingActive} field. */
        public XrViewLocateFoveatedRenderingVARJO.Buffer foveatedRenderingActive(@NativeType("XrBool32") boolean value) { XrViewLocateFoveatedRenderingVARJO.nfoveatedRenderingActive(address(), value ? 1 : 0); return this; }

    }

}