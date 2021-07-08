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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSessionCreateInfoOverlayEXTX {
 *     XrStructureType type;
 *     void const * next;
 *     XrOverlaySessionCreateFlagsEXTX createFlags;
 *     uint32_t sessionLayersPlacement;
 * }</code></pre>
 */
public class XrSessionCreateInfoOverlayEXTX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS,
        SESSIONLAYERSPLACEMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        SESSIONLAYERSPLACEMENT = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSessionCreateInfoOverlayEXTX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSessionCreateInfoOverlayEXTX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code createFlags} field. */
    @NativeType("XrOverlaySessionCreateFlagsEXTX")
    public long createFlags() { return ncreateFlags(address()); }
    /** @return the value of the {@code sessionLayersPlacement} field. */
    @NativeType("uint32_t")
    public int sessionLayersPlacement() { return nsessionLayersPlacement(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSessionCreateInfoOverlayEXTX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSessionCreateInfoOverlayEXTX next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrSessionCreateInfoOverlayEXTX createFlags(@NativeType("XrOverlaySessionCreateFlagsEXTX") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code sessionLayersPlacement} field. */
    public XrSessionCreateInfoOverlayEXTX sessionLayersPlacement(@NativeType("uint32_t") int value) { nsessionLayersPlacement(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSessionCreateInfoOverlayEXTX set(
        int type,
        long next,
        long createFlags,
        int sessionLayersPlacement
    ) {
        type(type);
        next(next);
        createFlags(createFlags);
        sessionLayersPlacement(sessionLayersPlacement);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSessionCreateInfoOverlayEXTX set(XrSessionCreateInfoOverlayEXTX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfoOverlayEXTX malloc() {
        return wrap(XrSessionCreateInfoOverlayEXTX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSessionCreateInfoOverlayEXTX calloc() {
        return wrap(XrSessionCreateInfoOverlayEXTX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated with {@link BufferUtils}. */
    public static XrSessionCreateInfoOverlayEXTX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSessionCreateInfoOverlayEXTX.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance for the specified memory address. */
    public static XrSessionCreateInfoOverlayEXTX create(long address) {
        return wrap(XrSessionCreateInfoOverlayEXTX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionCreateInfoOverlayEXTX createSafe(long address) {
        return address == NULL ? null : wrap(XrSessionCreateInfoOverlayEXTX.class, address);
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionCreateInfoOverlayEXTX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSessionCreateInfoOverlayEXTX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSessionCreateInfoOverlayEXTX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfoOverlayEXTX mallocStack(MemoryStack stack) {
        return wrap(XrSessionCreateInfoOverlayEXTX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSessionCreateInfoOverlayEXTX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionCreateInfoOverlayEXTX callocStack(MemoryStack stack) {
        return wrap(XrSessionCreateInfoOverlayEXTX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionCreateInfoOverlayEXTX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionCreateInfoOverlayEXTX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSessionCreateInfoOverlayEXTX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSessionCreateInfoOverlayEXTX.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrSessionCreateInfoOverlayEXTX.CREATEFLAGS); }
    /** Unsafe version of {@link #sessionLayersPlacement}. */
    public static int nsessionLayersPlacement(long struct) { return UNSAFE.getInt(null, struct + XrSessionCreateInfoOverlayEXTX.SESSIONLAYERSPLACEMENT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionCreateInfoOverlayEXTX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSessionCreateInfoOverlayEXTX.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSessionCreateInfoOverlayEXTX.CREATEFLAGS, value); }
    /** Unsafe version of {@link #sessionLayersPlacement(int) sessionLayersPlacement}. */
    public static void nsessionLayersPlacement(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionCreateInfoOverlayEXTX.SESSIONLAYERSPLACEMENT, value); }

    // -----------------------------------

    /** An array of {@link XrSessionCreateInfoOverlayEXTX} structs. */
    public static class Buffer extends StructBuffer<XrSessionCreateInfoOverlayEXTX, Buffer> implements NativeResource {

        private static final XrSessionCreateInfoOverlayEXTX ELEMENT_FACTORY = XrSessionCreateInfoOverlayEXTX.create(-1L);

        /**
         * Creates a new {@code XrSessionCreateInfoOverlayEXTX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSessionCreateInfoOverlayEXTX#SIZEOF}, and its mark will be undefined.
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
        protected XrSessionCreateInfoOverlayEXTX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSessionCreateInfoOverlayEXTX.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSessionCreateInfoOverlayEXTX.nnext(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("XrOverlaySessionCreateFlagsEXTX")
        public long createFlags() { return XrSessionCreateInfoOverlayEXTX.ncreateFlags(address()); }
        /** @return the value of the {@code sessionLayersPlacement} field. */
        @NativeType("uint32_t")
        public int sessionLayersPlacement() { return XrSessionCreateInfoOverlayEXTX.nsessionLayersPlacement(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSessionCreateInfoOverlayEXTX.Buffer type(@NativeType("XrStructureType") int value) { XrSessionCreateInfoOverlayEXTX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSessionCreateInfoOverlayEXTX.Buffer next(@NativeType("void const *") long value) { XrSessionCreateInfoOverlayEXTX.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrSessionCreateInfoOverlayEXTX.Buffer createFlags(@NativeType("XrOverlaySessionCreateFlagsEXTX") long value) { XrSessionCreateInfoOverlayEXTX.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code sessionLayersPlacement} field. */
        public XrSessionCreateInfoOverlayEXTX.Buffer sessionLayersPlacement(@NativeType("uint32_t") int value) { XrSessionCreateInfoOverlayEXTX.nsessionLayersPlacement(address(), value); return this; }

    }

}