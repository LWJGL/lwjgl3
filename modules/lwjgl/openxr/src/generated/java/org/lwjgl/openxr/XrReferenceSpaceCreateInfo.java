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
 * struct XrReferenceSpaceCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrReferenceSpaceType referenceSpaceType;
 *     {@link XrPosef XrPosef} poseInReferenceSpace;
 * }</code></pre>
 */
public class XrReferenceSpaceCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REFERENCESPACETYPE,
        POSEINREFERENCESPACE;

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
        REFERENCESPACETYPE = layout.offsetof(2);
        POSEINREFERENCESPACE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrReferenceSpaceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrReferenceSpaceCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code referenceSpaceType} field. */
    @NativeType("XrReferenceSpaceType")
    public int referenceSpaceType() { return nreferenceSpaceType(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInReferenceSpace} field. */
    public XrPosef poseInReferenceSpace() { return nposeInReferenceSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrReferenceSpaceCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrReferenceSpaceCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code referenceSpaceType} field. */
    public XrReferenceSpaceCreateInfo referenceSpaceType(@NativeType("XrReferenceSpaceType") int value) { nreferenceSpaceType(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInReferenceSpace} field. */
    public XrReferenceSpaceCreateInfo poseInReferenceSpace(XrPosef value) { nposeInReferenceSpace(address(), value); return this; }
    /** Passes the {@code poseInReferenceSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrReferenceSpaceCreateInfo poseInReferenceSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInReferenceSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrReferenceSpaceCreateInfo set(
        int type,
        long next,
        int referenceSpaceType,
        XrPosef poseInReferenceSpace
    ) {
        type(type);
        next(next);
        referenceSpaceType(referenceSpaceType);
        poseInReferenceSpace(poseInReferenceSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrReferenceSpaceCreateInfo set(XrReferenceSpaceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrReferenceSpaceCreateInfo malloc() {
        return wrap(XrReferenceSpaceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrReferenceSpaceCreateInfo calloc() {
        return wrap(XrReferenceSpaceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrReferenceSpaceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrReferenceSpaceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrReferenceSpaceCreateInfo} instance for the specified memory address. */
    public static XrReferenceSpaceCreateInfo create(long address) {
        return wrap(XrReferenceSpaceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrReferenceSpaceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrReferenceSpaceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrReferenceSpaceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrReferenceSpaceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrReferenceSpaceCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrReferenceSpaceCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrReferenceSpaceCreateInfo mallocStack(MemoryStack stack) {
        return wrap(XrReferenceSpaceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrReferenceSpaceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrReferenceSpaceCreateInfo callocStack(MemoryStack stack) {
        return wrap(XrReferenceSpaceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrReferenceSpaceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrReferenceSpaceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrReferenceSpaceCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrReferenceSpaceCreateInfo.NEXT); }
    /** Unsafe version of {@link #referenceSpaceType}. */
    public static int nreferenceSpaceType(long struct) { return UNSAFE.getInt(null, struct + XrReferenceSpaceCreateInfo.REFERENCESPACETYPE); }
    /** Unsafe version of {@link #poseInReferenceSpace}. */
    public static XrPosef nposeInReferenceSpace(long struct) { return XrPosef.create(struct + XrReferenceSpaceCreateInfo.POSEINREFERENCESPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrReferenceSpaceCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrReferenceSpaceCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #referenceSpaceType(int) referenceSpaceType}. */
    public static void nreferenceSpaceType(long struct, int value) { UNSAFE.putInt(null, struct + XrReferenceSpaceCreateInfo.REFERENCESPACETYPE, value); }
    /** Unsafe version of {@link #poseInReferenceSpace(XrPosef) poseInReferenceSpace}. */
    public static void nposeInReferenceSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrReferenceSpaceCreateInfo.POSEINREFERENCESPACE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrReferenceSpaceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrReferenceSpaceCreateInfo, Buffer> implements NativeResource {

        private static final XrReferenceSpaceCreateInfo ELEMENT_FACTORY = XrReferenceSpaceCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrReferenceSpaceCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrReferenceSpaceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrReferenceSpaceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrReferenceSpaceCreateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrReferenceSpaceCreateInfo.nnext(address()); }
        /** @return the value of the {@code referenceSpaceType} field. */
        @NativeType("XrReferenceSpaceType")
        public int referenceSpaceType() { return XrReferenceSpaceCreateInfo.nreferenceSpaceType(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInReferenceSpace} field. */
        public XrPosef poseInReferenceSpace() { return XrReferenceSpaceCreateInfo.nposeInReferenceSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrReferenceSpaceCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrReferenceSpaceCreateInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrReferenceSpaceCreateInfo.Buffer next(@NativeType("void const *") long value) { XrReferenceSpaceCreateInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code referenceSpaceType} field. */
        public XrReferenceSpaceCreateInfo.Buffer referenceSpaceType(@NativeType("XrReferenceSpaceType") int value) { XrReferenceSpaceCreateInfo.nreferenceSpaceType(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInReferenceSpace} field. */
        public XrReferenceSpaceCreateInfo.Buffer poseInReferenceSpace(XrPosef value) { XrReferenceSpaceCreateInfo.nposeInReferenceSpace(address(), value); return this; }
        /** Passes the {@code poseInReferenceSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrReferenceSpaceCreateInfo.Buffer poseInReferenceSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInReferenceSpace()); return this; }

    }

}