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
 * Scene mesh.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneMeshMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneMeshesMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMeshMSFT {
 *     uint64_t {@link #meshBufferId};
 *     XrBool32 {@link #supportsIndicesUint16};
 * }</code></pre>
 */
public class XrSceneMeshMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MESHBUFFERID,
        SUPPORTSINDICESUINT16;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MESHBUFFERID = layout.offsetof(0);
        SUPPORTSINDICESUINT16 = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSceneMeshMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code uint64_t} identifier that specifies the scene mesh buffer. If {@code meshBufferId} is zero then this scene component does not have mesh data of corresponding {@code XrSceneComponentTypeMSFT} in {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}{@code ::getInfo}. */
    @NativeType("uint64_t")
    public long meshBufferId() { return nmeshBufferId(address()); }
    /** {@link XR10#XR_TRUE TRUE} if the mesh supports reading 16-bit unsigned indices. */
    @NativeType("XrBool32")
    public boolean supportsIndicesUint16() { return nsupportsIndicesUint16(address()) != 0; }

    /** Sets the specified value to the {@link #meshBufferId} field. */
    public XrSceneMeshMSFT meshBufferId(@NativeType("uint64_t") long value) { nmeshBufferId(address(), value); return this; }
    /** Sets the specified value to the {@link #supportsIndicesUint16} field. */
    public XrSceneMeshMSFT supportsIndicesUint16(@NativeType("XrBool32") boolean value) { nsupportsIndicesUint16(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshMSFT set(
        long meshBufferId,
        boolean supportsIndicesUint16
    ) {
        meshBufferId(meshBufferId);
        supportsIndicesUint16(supportsIndicesUint16);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMeshMSFT set(XrSceneMeshMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshMSFT malloc() {
        return wrap(XrSceneMeshMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshMSFT calloc() {
        return wrap(XrSceneMeshMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneMeshMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshMSFT} instance for the specified memory address. */
    public static XrSceneMeshMSFT create(long address) {
        return wrap(XrSceneMeshMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneMeshMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneMeshMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneMeshMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneMeshMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneMeshMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneMeshMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneMeshMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #meshBufferId}. */
    public static long nmeshBufferId(long struct) { return UNSAFE.getLong(null, struct + XrSceneMeshMSFT.MESHBUFFERID); }
    /** Unsafe version of {@link #supportsIndicesUint16}. */
    public static int nsupportsIndicesUint16(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshMSFT.SUPPORTSINDICESUINT16); }

    /** Unsafe version of {@link #meshBufferId(long) meshBufferId}. */
    public static void nmeshBufferId(long struct, long value) { UNSAFE.putLong(null, struct + XrSceneMeshMSFT.MESHBUFFERID, value); }
    /** Unsafe version of {@link #supportsIndicesUint16(boolean) supportsIndicesUint16}. */
    public static void nsupportsIndicesUint16(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshMSFT.SUPPORTSINDICESUINT16, value); }

    // -----------------------------------

    /** An array of {@link XrSceneMeshMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshMSFT, Buffer> implements NativeResource {

        private static final XrSceneMeshMSFT ELEMENT_FACTORY = XrSceneMeshMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneMeshMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMeshMSFT#meshBufferId} field. */
        @NativeType("uint64_t")
        public long meshBufferId() { return XrSceneMeshMSFT.nmeshBufferId(address()); }
        /** @return the value of the {@link XrSceneMeshMSFT#supportsIndicesUint16} field. */
        @NativeType("XrBool32")
        public boolean supportsIndicesUint16() { return XrSceneMeshMSFT.nsupportsIndicesUint16(address()) != 0; }

        /** Sets the specified value to the {@link XrSceneMeshMSFT#meshBufferId} field. */
        public XrSceneMeshMSFT.Buffer meshBufferId(@NativeType("uint64_t") long value) { XrSceneMeshMSFT.nmeshBufferId(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMeshMSFT#supportsIndicesUint16} field. */
        public XrSceneMeshMSFT.Buffer supportsIndicesUint16(@NativeType("XrBool32") boolean value) { XrSceneMeshMSFT.nsupportsIndicesUint16(address(), value ? 1 : 0); return this; }

    }

}