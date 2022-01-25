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
 * A render model system property.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code supportsRenderModelLoading} defines whether the system supports loading render models.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using {@link XrSystemRenderModelPropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBRenderModel#XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemRenderModelPropertiesFB {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsRenderModelLoading;
 * }</code></pre>
 */
public class XrSystemRenderModelPropertiesFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSRENDERMODELLOADING;

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
        SUPPORTSRENDERMODELLOADING = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemRenderModelPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemRenderModelPropertiesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsRenderModelLoading} field. */
    @NativeType("XrBool32")
    public boolean supportsRenderModelLoading() { return nsupportsRenderModelLoading(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemRenderModelPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB} value to the {@code type} field. */
    public XrSystemRenderModelPropertiesFB type$Default() { return type(FBRenderModel.XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemRenderModelPropertiesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code supportsRenderModelLoading} field. */
    public XrSystemRenderModelPropertiesFB supportsRenderModelLoading(@NativeType("XrBool32") boolean value) { nsupportsRenderModelLoading(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemRenderModelPropertiesFB set(
        int type,
        long next,
        boolean supportsRenderModelLoading
    ) {
        type(type);
        next(next);
        supportsRenderModelLoading(supportsRenderModelLoading);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemRenderModelPropertiesFB set(XrSystemRenderModelPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemRenderModelPropertiesFB malloc() {
        return wrap(XrSystemRenderModelPropertiesFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemRenderModelPropertiesFB calloc() {
        return wrap(XrSystemRenderModelPropertiesFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemRenderModelPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemRenderModelPropertiesFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance for the specified memory address. */
    public static XrSystemRenderModelPropertiesFB create(long address) {
        return wrap(XrSystemRenderModelPropertiesFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemRenderModelPropertiesFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemRenderModelPropertiesFB.class, address);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemRenderModelPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemRenderModelPropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemRenderModelPropertiesFB malloc(MemoryStack stack) {
        return wrap(XrSystemRenderModelPropertiesFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemRenderModelPropertiesFB calloc(MemoryStack stack) {
        return wrap(XrSystemRenderModelPropertiesFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemRenderModelPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemRenderModelPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsRenderModelLoading}. */
    public static int nsupportsRenderModelLoading(long struct) { return UNSAFE.getInt(null, struct + XrSystemRenderModelPropertiesFB.SUPPORTSRENDERMODELLOADING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemRenderModelPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemRenderModelPropertiesFB.NEXT, value); }
    /** Unsafe version of {@link #supportsRenderModelLoading(boolean) supportsRenderModelLoading}. */
    public static void nsupportsRenderModelLoading(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemRenderModelPropertiesFB.SUPPORTSRENDERMODELLOADING, value); }

    // -----------------------------------

    /** An array of {@link XrSystemRenderModelPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemRenderModelPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemRenderModelPropertiesFB ELEMENT_FACTORY = XrSystemRenderModelPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemRenderModelPropertiesFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemRenderModelPropertiesFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemRenderModelPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemRenderModelPropertiesFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemRenderModelPropertiesFB.nnext(address()); }
        /** @return the value of the {@code supportsRenderModelLoading} field. */
        @NativeType("XrBool32")
        public boolean supportsRenderModelLoading() { return XrSystemRenderModelPropertiesFB.nsupportsRenderModelLoading(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemRenderModelPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemRenderModelPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB} value to the {@code type} field. */
        public XrSystemRenderModelPropertiesFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemRenderModelPropertiesFB.Buffer next(@NativeType("void *") long value) { XrSystemRenderModelPropertiesFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code supportsRenderModelLoading} field. */
        public XrSystemRenderModelPropertiesFB.Buffer supportsRenderModelLoading(@NativeType("XrBool32") boolean value) { XrSystemRenderModelPropertiesFB.nsupportsRenderModelLoading(address(), value ? 1 : 0); return this; }

    }

}