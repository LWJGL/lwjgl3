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
 * The information for which render model to load.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrRenderModelLoadInfoFB} is used to provide information about which render model to load. {@link XrRenderModelLoadInfoFB} <b>must</b> be provided when calling {@link FBRenderModel#xrLoadRenderModelFB LoadRenderModelFB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to using {@link XrRenderModelLoadInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBRenderModel#XR_TYPE_RENDER_MODEL_LOAD_INFO_FB TYPE_RENDER_MODEL_LOAD_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBRenderModel#xrLoadRenderModelFB LoadRenderModelFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRenderModelLoadInfoFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrRenderModelKeyFB {@link #modelKey};
 * }</code></pre>
 */
public class XrRenderModelLoadInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MODELKEY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MODELKEY = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrRenderModelLoadInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelLoadInfoFB(ByteBuffer container) {
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
    /** the unique model key for a connected device. */
    @NativeType("XrRenderModelKeyFB")
    public long modelKey() { return nmodelKey(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRenderModelLoadInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_LOAD_INFO_FB TYPE_RENDER_MODEL_LOAD_INFO_FB} value to the {@link #type} field. */
    public XrRenderModelLoadInfoFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_LOAD_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRenderModelLoadInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #modelKey} field. */
    public XrRenderModelLoadInfoFB modelKey(@NativeType("XrRenderModelKeyFB") long value) { nmodelKey(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelLoadInfoFB set(
        int type,
        long next,
        long modelKey
    ) {
        type(type);
        next(next);
        modelKey(modelKey);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelLoadInfoFB set(XrRenderModelLoadInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelLoadInfoFB malloc() {
        return wrap(XrRenderModelLoadInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelLoadInfoFB calloc() {
        return wrap(XrRenderModelLoadInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelLoadInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrRenderModelLoadInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelLoadInfoFB} instance for the specified memory address. */
    public static XrRenderModelLoadInfoFB create(long address) {
        return wrap(XrRenderModelLoadInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelLoadInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrRenderModelLoadInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrRenderModelLoadInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRenderModelLoadInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelLoadInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelLoadInfoFB malloc(MemoryStack stack) {
        return wrap(XrRenderModelLoadInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrRenderModelLoadInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelLoadInfoFB calloc(MemoryStack stack) {
        return wrap(XrRenderModelLoadInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelLoadInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelLoadInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRenderModelLoadInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelLoadInfoFB.NEXT); }
    /** Unsafe version of {@link #modelKey}. */
    public static long nmodelKey(long struct) { return UNSAFE.getLong(null, struct + XrRenderModelLoadInfoFB.MODELKEY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRenderModelLoadInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelLoadInfoFB.NEXT, value); }
    /** Unsafe version of {@link #modelKey(long) modelKey}. */
    public static void nmodelKey(long struct, long value) { UNSAFE.putLong(null, struct + XrRenderModelLoadInfoFB.MODELKEY, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelLoadInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelLoadInfoFB, Buffer> implements NativeResource {

        private static final XrRenderModelLoadInfoFB ELEMENT_FACTORY = XrRenderModelLoadInfoFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelLoadInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelLoadInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrRenderModelLoadInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRenderModelLoadInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelLoadInfoFB.ntype(address()); }
        /** @return the value of the {@link XrRenderModelLoadInfoFB#next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelLoadInfoFB.nnext(address()); }
        /** @return the value of the {@link XrRenderModelLoadInfoFB#modelKey} field. */
        @NativeType("XrRenderModelKeyFB")
        public long modelKey() { return XrRenderModelLoadInfoFB.nmodelKey(address()); }

        /** Sets the specified value to the {@link XrRenderModelLoadInfoFB#type} field. */
        public XrRenderModelLoadInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelLoadInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_LOAD_INFO_FB TYPE_RENDER_MODEL_LOAD_INFO_FB} value to the {@link XrRenderModelLoadInfoFB#type} field. */
        public XrRenderModelLoadInfoFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_LOAD_INFO_FB); }
        /** Sets the specified value to the {@link XrRenderModelLoadInfoFB#next} field. */
        public XrRenderModelLoadInfoFB.Buffer next(@NativeType("void *") long value) { XrRenderModelLoadInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrRenderModelLoadInfoFB#modelKey} field. */
        public XrRenderModelLoadInfoFB.Buffer modelKey(@NativeType("XrRenderModelKeyFB") long value) { XrRenderModelLoadInfoFB.nmodelKey(address(), value); return this; }

    }

}