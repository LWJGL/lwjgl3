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
 * struct XrHandMeshSpaceCreateInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     XrHandPoseTypeMSFT handPoseType;
 *     {@link XrPosef XrPosef} poseInHandMeshSpace;
 * }</code></pre>
 */
public class XrHandMeshSpaceCreateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HANDPOSETYPE,
        POSEINHANDMESHSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        HANDPOSETYPE = layout.offsetof(2);
        POSEINHANDMESHSPACE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandMeshSpaceCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshSpaceCreateInfoMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code handPoseType} field. */
    @NativeType("XrHandPoseTypeMSFT")
    public int handPoseType() { return nhandPoseType(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInHandMeshSpace} field. */
    public XrPosef poseInHandMeshSpace() { return nposeInHandMeshSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandMeshSpaceCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHandMeshSpaceCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code handPoseType} field. */
    public XrHandMeshSpaceCreateInfoMSFT handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { nhandPoseType(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInHandMeshSpace} field. */
    public XrHandMeshSpaceCreateInfoMSFT poseInHandMeshSpace(XrPosef value) { nposeInHandMeshSpace(address(), value); return this; }
    /** Passes the {@code poseInHandMeshSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshSpaceCreateInfoMSFT poseInHandMeshSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInHandMeshSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshSpaceCreateInfoMSFT set(
        int type,
        long next,
        int handPoseType,
        XrPosef poseInHandMeshSpace
    ) {
        type(type);
        next(next);
        handPoseType(handPoseType);
        poseInHandMeshSpace(poseInHandMeshSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshSpaceCreateInfoMSFT set(XrHandMeshSpaceCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshSpaceCreateInfoMSFT malloc() {
        return wrap(XrHandMeshSpaceCreateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshSpaceCreateInfoMSFT calloc() {
        return wrap(XrHandMeshSpaceCreateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshSpaceCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshSpaceCreateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance for the specified memory address. */
    public static XrHandMeshSpaceCreateInfoMSFT create(long address) {
        return wrap(XrHandMeshSpaceCreateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshSpaceCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshSpaceCreateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHandMeshSpaceCreateInfoMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHandMeshSpaceCreateInfoMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshSpaceCreateInfoMSFT mallocStack(MemoryStack stack) {
        return wrap(XrHandMeshSpaceCreateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshSpaceCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshSpaceCreateInfoMSFT callocStack(MemoryStack stack) {
        return wrap(XrHandMeshSpaceCreateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshSpaceCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshSpaceCreateInfoMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshSpaceCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandMeshSpaceCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #handPoseType}. */
    public static int nhandPoseType(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshSpaceCreateInfoMSFT.HANDPOSETYPE); }
    /** Unsafe version of {@link #poseInHandMeshSpace}. */
    public static XrPosef nposeInHandMeshSpace(long struct) { return XrPosef.create(struct + XrHandMeshSpaceCreateInfoMSFT.POSEINHANDMESHSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshSpaceCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandMeshSpaceCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #handPoseType(int) handPoseType}. */
    public static void nhandPoseType(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshSpaceCreateInfoMSFT.HANDPOSETYPE, value); }
    /** Unsafe version of {@link #poseInHandMeshSpace(XrPosef) poseInHandMeshSpace}. */
    public static void nposeInHandMeshSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrHandMeshSpaceCreateInfoMSFT.POSEINHANDMESHSPACE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrHandMeshSpaceCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshSpaceCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshSpaceCreateInfoMSFT ELEMENT_FACTORY = XrHandMeshSpaceCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshSpaceCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshSpaceCreateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshSpaceCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandMeshSpaceCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHandMeshSpaceCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@code handPoseType} field. */
        @NativeType("XrHandPoseTypeMSFT")
        public int handPoseType() { return XrHandMeshSpaceCreateInfoMSFT.nhandPoseType(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInHandMeshSpace} field. */
        public XrPosef poseInHandMeshSpace() { return XrHandMeshSpaceCreateInfoMSFT.nposeInHandMeshSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandMeshSpaceCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHandMeshSpaceCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHandMeshSpaceCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrHandMeshSpaceCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code handPoseType} field. */
        public XrHandMeshSpaceCreateInfoMSFT.Buffer handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { XrHandMeshSpaceCreateInfoMSFT.nhandPoseType(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInHandMeshSpace} field. */
        public XrHandMeshSpaceCreateInfoMSFT.Buffer poseInHandMeshSpace(XrPosef value) { XrHandMeshSpaceCreateInfoMSFT.nposeInHandMeshSpace(address(), value); return this; }
        /** Passes the {@code poseInHandMeshSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshSpaceCreateInfoMSFT.Buffer poseInHandMeshSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInHandMeshSpace()); return this; }

    }

}