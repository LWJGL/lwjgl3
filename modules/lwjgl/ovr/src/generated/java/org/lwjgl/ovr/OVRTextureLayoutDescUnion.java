/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrEye_Count;

/**
 * Combines texture layout descriptors.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * union ovrTextureLayoutDesc_Union {
 *     {@link OVRTextureLayoutOctilinear ovrTextureLayoutOctilinear} Octilinear[ovrEye_Count];
 * }</pre></code>
 */
@NativeType("union ovrTextureLayoutDesc_Union")
public class OVRTextureLayoutDescUnion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OCTILINEAR;

    static {
        Layout layout = __union(
            __array(OVRTextureLayoutOctilinear.SIZEOF, OVRTextureLayoutOctilinear.ALIGNOF, ovrEye_Count)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OCTILINEAR = layout.offsetof(0);
    }

    OVRTextureLayoutDescUnion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRTextureLayoutDescUnion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTextureLayoutDescUnion(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRTextureLayoutOctilinear}.Buffer view of the {@code Octilinear} field. */
    @NativeType("ovrTextureLayoutOctilinear[ovrEye_Count]")
    public OVRTextureLayoutOctilinear.Buffer Octilinear() { return nOctilinear(address()); }
    /** Returns a {@link OVRTextureLayoutOctilinear} view of the struct at the specified index of the {@code Octilinear} field. */
    @NativeType("ovrTextureLayoutOctilinear")
    public OVRTextureLayoutOctilinear Octilinear(int index) { return nOctilinear(address(), index); }

    /** Copies the specified {@link OVRTextureLayoutOctilinear.Buffer} to the {@code Octilinear} field. */
    public OVRTextureLayoutDescUnion Octilinear(@NativeType("ovrTextureLayoutOctilinear[ovrEye_Count]") OVRTextureLayoutOctilinear.Buffer value) { nOctilinear(address(), value); return this; }
    /** Copies the specified {@link OVRTextureLayoutOctilinear} at the specified index of the {@code Octilinear} field. */
    public OVRTextureLayoutDescUnion Octilinear(int index, @NativeType("ovrTextureLayoutOctilinear") OVRTextureLayoutOctilinear value) { nOctilinear(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRTextureLayoutDescUnion set(OVRTextureLayoutDescUnion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRTextureLayoutDescUnion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTextureLayoutDescUnion malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRTextureLayoutDescUnion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTextureLayoutDescUnion calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRTextureLayoutDescUnion} instance allocated with {@link BufferUtils}. */
    public static OVRTextureLayoutDescUnion create() {
        return new OVRTextureLayoutDescUnion(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRTextureLayoutDescUnion} instance for the specified memory address. */
    public static OVRTextureLayoutDescUnion create(long address) {
        return new OVRTextureLayoutDescUnion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTextureLayoutDescUnion createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRTextureLayoutDescUnion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTextureLayoutDescUnion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRTextureLayoutDescUnion} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRTextureLayoutDescUnion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRTextureLayoutDescUnion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRTextureLayoutDescUnion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTextureLayoutDescUnion mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTextureLayoutDescUnion callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureLayoutDescUnion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutDescUnion.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Octilinear}. */
    public static OVRTextureLayoutOctilinear.Buffer nOctilinear(long struct) { return OVRTextureLayoutOctilinear.create(struct + OVRTextureLayoutDescUnion.OCTILINEAR, ovrEye_Count); }
    /** Unsafe version of {@link #Octilinear(int) Octilinear}. */
    public static OVRTextureLayoutOctilinear nOctilinear(long struct, int index) {
        return OVRTextureLayoutOctilinear.create(struct + OVRTextureLayoutDescUnion.OCTILINEAR + check(index, ovrEye_Count) * OVRTextureLayoutOctilinear.SIZEOF);
    }

    /** Unsafe version of {@link #Octilinear(OVRTextureLayoutOctilinear.Buffer) Octilinear}. */
    public static void nOctilinear(long struct, OVRTextureLayoutOctilinear.Buffer value) {
        if (CHECKS) { checkGT(value, ovrEye_Count); }
        memCopy(value.address(), struct + OVRTextureLayoutDescUnion.OCTILINEAR, value.remaining() * OVRTextureLayoutOctilinear.SIZEOF);
    }
    /** Unsafe version of {@link #Octilinear(int, OVRTextureLayoutOctilinear) Octilinear}. */
    public static void nOctilinear(long struct, int index, OVRTextureLayoutOctilinear value) {
        memCopy(value.address(), struct + OVRTextureLayoutDescUnion.OCTILINEAR + check(index, ovrEye_Count) * OVRTextureLayoutOctilinear.SIZEOF, OVRTextureLayoutOctilinear.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link OVRTextureLayoutDescUnion} structs. */
    public static class Buffer extends StructBuffer<OVRTextureLayoutDescUnion, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRTextureLayoutDescUnion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTextureLayoutDescUnion#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRTextureLayoutDescUnion newInstance(long address) {
            return new OVRTextureLayoutDescUnion(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRTextureLayoutOctilinear}.Buffer view of the {@code Octilinear} field. */
        @NativeType("ovrTextureLayoutOctilinear[ovrEye_Count]")
        public OVRTextureLayoutOctilinear.Buffer Octilinear() { return OVRTextureLayoutDescUnion.nOctilinear(address()); }
        /** Returns a {@link OVRTextureLayoutOctilinear} view of the struct at the specified index of the {@code Octilinear} field. */
        @NativeType("ovrTextureLayoutOctilinear")
        public OVRTextureLayoutOctilinear Octilinear(int index) { return OVRTextureLayoutDescUnion.nOctilinear(address(), index); }

        /** Copies the specified {@link OVRTextureLayoutOctilinear.Buffer} to the {@code Octilinear} field. */
        public OVRTextureLayoutDescUnion.Buffer Octilinear(@NativeType("ovrTextureLayoutOctilinear[ovrEye_Count]") OVRTextureLayoutOctilinear.Buffer value) { OVRTextureLayoutDescUnion.nOctilinear(address(), value); return this; }
        /** Copies the specified {@link OVRTextureLayoutOctilinear} at the specified index of the {@code Octilinear} field. */
        public OVRTextureLayoutDescUnion.Buffer Octilinear(int index, @NativeType("ovrTextureLayoutOctilinear") OVRTextureLayoutOctilinear value) { OVRTextureLayoutDescUnion.nOctilinear(address(), index, value); return this; }

    }

}