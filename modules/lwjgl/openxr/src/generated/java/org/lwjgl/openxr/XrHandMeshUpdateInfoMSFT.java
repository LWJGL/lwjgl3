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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshUpdateInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime time;
 *     XrHandPoseTypeMSFT handPoseType;
 * }</code></pre>
 */
public class XrHandMeshUpdateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME,
        HANDPOSETYPE;

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
        TIME = layout.offsetof(2);
        HANDPOSETYPE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandMeshUpdateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshUpdateInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** Returns the value of the {@code handPoseType} field. */
    @NativeType("XrHandPoseTypeMSFT")
    public int handPoseType() { return nhandPoseType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandMeshUpdateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrHandMeshUpdateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrHandMeshUpdateInfoMSFT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code handPoseType} field. */
    public XrHandMeshUpdateInfoMSFT handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { nhandPoseType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshUpdateInfoMSFT set(
        int type,
        long next,
        long time,
        int handPoseType
    ) {
        type(type);
        next(next);
        time(time);
        handPoseType(handPoseType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshUpdateInfoMSFT set(XrHandMeshUpdateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshUpdateInfoMSFT malloc() {
        return wrap(XrHandMeshUpdateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshUpdateInfoMSFT calloc() {
        return wrap(XrHandMeshUpdateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshUpdateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshUpdateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance for the specified memory address. */
    public static XrHandMeshUpdateInfoMSFT create(long address) {
        return wrap(XrHandMeshUpdateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshUpdateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshUpdateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshUpdateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshUpdateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHandMeshUpdateInfoMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHandMeshUpdateInfoMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshUpdateInfoMSFT mallocStack(MemoryStack stack) {
        return wrap(XrHandMeshUpdateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshUpdateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshUpdateInfoMSFT callocStack(MemoryStack stack) {
        return wrap(XrHandMeshUpdateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshUpdateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshUpdateInfoMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshUpdateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandMeshUpdateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrHandMeshUpdateInfoMSFT.TIME); }
    /** Unsafe version of {@link #handPoseType}. */
    public static int nhandPoseType(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshUpdateInfoMSFT.HANDPOSETYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshUpdateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandMeshUpdateInfoMSFT.NEXT, check(value)); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrHandMeshUpdateInfoMSFT.TIME, value); }
    /** Unsafe version of {@link #handPoseType(int) handPoseType}. */
    public static void nhandPoseType(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshUpdateInfoMSFT.HANDPOSETYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandMeshUpdateInfoMSFT.NEXT));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrHandMeshUpdateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshUpdateInfoMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshUpdateInfoMSFT ELEMENT_FACTORY = XrHandMeshUpdateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshUpdateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshUpdateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshUpdateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandMeshUpdateInfoMSFT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHandMeshUpdateInfoMSFT.nnext(address()); }
        /** Returns the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrHandMeshUpdateInfoMSFT.ntime(address()); }
        /** Returns the value of the {@code handPoseType} field. */
        @NativeType("XrHandPoseTypeMSFT")
        public int handPoseType() { return XrHandMeshUpdateInfoMSFT.nhandPoseType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHandMeshUpdateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrHandMeshUpdateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer time(@NativeType("XrTime") long value) { XrHandMeshUpdateInfoMSFT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code handPoseType} field. */
        public XrHandMeshUpdateInfoMSFT.Buffer handPoseType(@NativeType("XrHandPoseTypeMSFT") int value) { XrHandMeshUpdateInfoMSFT.nhandPoseType(address(), value); return this; }

    }

}