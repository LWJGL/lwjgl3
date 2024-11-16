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
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
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
public class XrSystemRenderModelPropertiesFB extends Struct<XrSystemRenderModelPropertiesFB> implements NativeResource {

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

    protected XrSystemRenderModelPropertiesFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemRenderModelPropertiesFB create(long address, @Nullable ByteBuffer container) {
        return new XrSystemRenderModelPropertiesFB(address, container);
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

    /** Initializes this struct with the specified values. */
    public XrSystemRenderModelPropertiesFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

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
        return new XrSystemRenderModelPropertiesFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemRenderModelPropertiesFB calloc() {
        return new XrSystemRenderModelPropertiesFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemRenderModelPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemRenderModelPropertiesFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemRenderModelPropertiesFB} instance for the specified memory address. */
    public static XrSystemRenderModelPropertiesFB create(long address) {
        return new XrSystemRenderModelPropertiesFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemRenderModelPropertiesFB createSafe(long address) {
        return address == NULL ? null : new XrSystemRenderModelPropertiesFB(address, null);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemRenderModelPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemRenderModelPropertiesFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemRenderModelPropertiesFB malloc(MemoryStack stack) {
        return new XrSystemRenderModelPropertiesFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemRenderModelPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemRenderModelPropertiesFB calloc(MemoryStack stack) {
        return new XrSystemRenderModelPropertiesFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemRenderModelPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemRenderModelPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemRenderModelPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemRenderModelPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsRenderModelLoading}. */
    public static int nsupportsRenderModelLoading(long struct) { return memGetInt(struct + XrSystemRenderModelPropertiesFB.SUPPORTSRENDERMODELLOADING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemRenderModelPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemRenderModelPropertiesFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemRenderModelPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemRenderModelPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemRenderModelPropertiesFB ELEMENT_FACTORY = XrSystemRenderModelPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemRenderModelPropertiesFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemRenderModelPropertiesFB#SIZEOF}, and its mark will be undefined.</p>
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

    }

}