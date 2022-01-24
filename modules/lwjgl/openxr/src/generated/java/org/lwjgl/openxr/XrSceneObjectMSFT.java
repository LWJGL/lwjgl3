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
 * Scene object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneObjectMSFT}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code XrSceneObjectTypeMSFT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneObjectsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneObjectMSFT {
 *     XrSceneObjectTypeMSFT {@link #objectType};
 * }</code></pre>
 */
public class XrSceneObjectMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OBJECTTYPE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OBJECTTYPE = layout.offsetof(0);
    }

    /**
     * Creates a {@code XrSceneObjectMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneObjectMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of the object specified by {@code XrSceneObjectTypeMSFT}. */
    @NativeType("XrSceneObjectTypeMSFT")
    public int objectType() { return nobjectType(address()); }

    /** Sets the specified value to the {@link #objectType} field. */
    public XrSceneObjectMSFT objectType(@NativeType("XrSceneObjectTypeMSFT") int value) { nobjectType(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneObjectMSFT set(XrSceneObjectMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneObjectMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneObjectMSFT malloc() {
        return wrap(XrSceneObjectMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneObjectMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneObjectMSFT calloc() {
        return wrap(XrSceneObjectMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneObjectMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneObjectMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneObjectMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneObjectMSFT} instance for the specified memory address. */
    public static XrSceneObjectMSFT create(long address) {
        return wrap(XrSceneObjectMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneObjectMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneObjectMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneObjectMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneObjectMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneObjectMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneObjectMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneObjectMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneObjectMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneObjectMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneObjectMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneObjectMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneObjectMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneObjectMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneObjectMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneObjectMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneObjectMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneObjectMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneObjectMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneObjectMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneObjectMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneObjectMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + XrSceneObjectMSFT.OBJECTTYPE); }

    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneObjectMSFT.OBJECTTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSceneObjectMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneObjectMSFT, Buffer> implements NativeResource {

        private static final XrSceneObjectMSFT ELEMENT_FACTORY = XrSceneObjectMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneObjectMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneObjectMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneObjectMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneObjectMSFT#objectType} field. */
        @NativeType("XrSceneObjectTypeMSFT")
        public int objectType() { return XrSceneObjectMSFT.nobjectType(address()); }

        /** Sets the specified value to the {@link XrSceneObjectMSFT#objectType} field. */
        public XrSceneObjectMSFT.Buffer objectType(@NativeType("XrSceneObjectTypeMSFT") int value) { XrSceneObjectMSFT.nobjectType(address(), value); return this; }

    }

}