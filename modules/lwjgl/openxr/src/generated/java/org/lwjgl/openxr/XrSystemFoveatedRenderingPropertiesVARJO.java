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
 * System property for foveated rendering.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>should</b> return {@link XR10#XR_TRUE TRUE} for {@code supportsFoveatedRendering} when rendering gaze is available in the system. An application <b>should</b> avoid using foveated rendering functionality when {@code supportsFoveatedRendering} is {@link XR10#XR_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extension <b>must</b> be enabled prior to using {@link XrSystemFoveatedRenderingPropertiesVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOFoveatedRendering#XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemFoveatedRenderingPropertiesVARJO {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsFoveatedRendering};
 * }</code></pre>
 */
public class XrSystemFoveatedRenderingPropertiesVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSFOVEATEDRENDERING;

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
        SUPPORTSFOVEATEDRENDERING = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemFoveatedRenderingPropertiesVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemFoveatedRenderingPropertiesVARJO(ByteBuffer container) {
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
    /** an {@code XrBool32}, indicating if current system is capable of performoning foveated rendering. */
    @NativeType("XrBool32")
    public boolean supportsFoveatedRendering() { return nsupportsFoveatedRendering(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemFoveatedRenderingPropertiesVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOFoveatedRendering#XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO} value to the {@link #type} field. */
    public XrSystemFoveatedRenderingPropertiesVARJO type$Default() { return type(VARJOFoveatedRendering.XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemFoveatedRenderingPropertiesVARJO next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #supportsFoveatedRendering} field. */
    public XrSystemFoveatedRenderingPropertiesVARJO supportsFoveatedRendering(@NativeType("XrBool32") boolean value) { nsupportsFoveatedRendering(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemFoveatedRenderingPropertiesVARJO set(
        int type,
        long next,
        boolean supportsFoveatedRendering
    ) {
        type(type);
        next(next);
        supportsFoveatedRendering(supportsFoveatedRendering);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemFoveatedRenderingPropertiesVARJO set(XrSystemFoveatedRenderingPropertiesVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemFoveatedRenderingPropertiesVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemFoveatedRenderingPropertiesVARJO malloc() {
        return wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemFoveatedRenderingPropertiesVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemFoveatedRenderingPropertiesVARJO calloc() {
        return wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemFoveatedRenderingPropertiesVARJO} instance allocated with {@link BufferUtils}. */
    public static XrSystemFoveatedRenderingPropertiesVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemFoveatedRenderingPropertiesVARJO} instance for the specified memory address. */
    public static XrSystemFoveatedRenderingPropertiesVARJO create(long address) {
        return wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemFoveatedRenderingPropertiesVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, address);
    }

    /**
     * Returns a new {@link XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemFoveatedRenderingPropertiesVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO malloc(MemoryStack stack) {
        return wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemFoveatedRenderingPropertiesVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO calloc(MemoryStack stack) {
        return wrap(XrSystemFoveatedRenderingPropertiesVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveatedRenderingPropertiesVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemFoveatedRenderingPropertiesVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemFoveatedRenderingPropertiesVARJO.NEXT); }
    /** Unsafe version of {@link #supportsFoveatedRendering}. */
    public static int nsupportsFoveatedRendering(long struct) { return UNSAFE.getInt(null, struct + XrSystemFoveatedRenderingPropertiesVARJO.SUPPORTSFOVEATEDRENDERING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemFoveatedRenderingPropertiesVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemFoveatedRenderingPropertiesVARJO.NEXT, value); }
    /** Unsafe version of {@link #supportsFoveatedRendering(boolean) supportsFoveatedRendering}. */
    public static void nsupportsFoveatedRendering(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemFoveatedRenderingPropertiesVARJO.SUPPORTSFOVEATEDRENDERING, value); }

    // -----------------------------------

    /** An array of {@link XrSystemFoveatedRenderingPropertiesVARJO} structs. */
    public static class Buffer extends StructBuffer<XrSystemFoveatedRenderingPropertiesVARJO, Buffer> implements NativeResource {

        private static final XrSystemFoveatedRenderingPropertiesVARJO ELEMENT_FACTORY = XrSystemFoveatedRenderingPropertiesVARJO.create(-1L);

        /**
         * Creates a new {@code XrSystemFoveatedRenderingPropertiesVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemFoveatedRenderingPropertiesVARJO#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemFoveatedRenderingPropertiesVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemFoveatedRenderingPropertiesVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemFoveatedRenderingPropertiesVARJO.ntype(address()); }
        /** @return the value of the {@link XrSystemFoveatedRenderingPropertiesVARJO#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemFoveatedRenderingPropertiesVARJO.nnext(address()); }
        /** @return the value of the {@link XrSystemFoveatedRenderingPropertiesVARJO#supportsFoveatedRendering} field. */
        @NativeType("XrBool32")
        public boolean supportsFoveatedRendering() { return XrSystemFoveatedRenderingPropertiesVARJO.nsupportsFoveatedRendering(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemFoveatedRenderingPropertiesVARJO#type} field. */
        public XrSystemFoveatedRenderingPropertiesVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrSystemFoveatedRenderingPropertiesVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOFoveatedRendering#XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO} value to the {@link XrSystemFoveatedRenderingPropertiesVARJO#type} field. */
        public XrSystemFoveatedRenderingPropertiesVARJO.Buffer type$Default() { return type(VARJOFoveatedRendering.XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO); }
        /** Sets the specified value to the {@link XrSystemFoveatedRenderingPropertiesVARJO#next} field. */
        public XrSystemFoveatedRenderingPropertiesVARJO.Buffer next(@NativeType("void *") long value) { XrSystemFoveatedRenderingPropertiesVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSystemFoveatedRenderingPropertiesVARJO#supportsFoveatedRendering} field. */
        public XrSystemFoveatedRenderingPropertiesVARJO.Buffer supportsFoveatedRendering(@NativeType("XrBool32") boolean value) { XrSystemFoveatedRenderingPropertiesVARJO.nsupportsFoveatedRendering(address(), value ? 1 : 0); return this; }

    }

}