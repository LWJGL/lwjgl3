/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSRTDataNV {
 *     float sx;
 *     float a;
 *     float b;
 *     float pvx;
 *     float sy;
 *     float c;
 *     float pvy;
 *     float sz;
 *     float pvz;
 *     float qx;
 *     float qy;
 *     float qz;
 *     float qw;
 *     float tx;
 *     float ty;
 *     float tz;
 * }}</pre>
 */
public class VkSRTDataNV extends Struct<VkSRTDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SX,
        A,
        B,
        PVX,
        SY,
        C,
        PVY,
        SZ,
        PVZ,
        QX,
        QY,
        QZ,
        QW,
        TX,
        TY,
        TZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SX = layout.offsetof(0);
        A = layout.offsetof(1);
        B = layout.offsetof(2);
        PVX = layout.offsetof(3);
        SY = layout.offsetof(4);
        C = layout.offsetof(5);
        PVY = layout.offsetof(6);
        SZ = layout.offsetof(7);
        PVZ = layout.offsetof(8);
        QX = layout.offsetof(9);
        QY = layout.offsetof(10);
        QZ = layout.offsetof(11);
        QW = layout.offsetof(12);
        TX = layout.offsetof(13);
        TY = layout.offsetof(14);
        TZ = layout.offsetof(15);
    }

    protected VkSRTDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSRTDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkSRTDataNV(address, container);
    }

    /**
     * Creates a {@code VkSRTDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSRTDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sx} field. */
    public float sx() { return nsx(address()); }
    /** @return the value of the {@code a} field. */
    public float a() { return na(address()); }
    /** @return the value of the {@code b} field. */
    public float b() { return nb(address()); }
    /** @return the value of the {@code pvx} field. */
    public float pvx() { return npvx(address()); }
    /** @return the value of the {@code sy} field. */
    public float sy() { return nsy(address()); }
    /** @return the value of the {@code c} field. */
    public float c() { return nc(address()); }
    /** @return the value of the {@code pvy} field. */
    public float pvy() { return npvy(address()); }
    /** @return the value of the {@code sz} field. */
    public float sz() { return nsz(address()); }
    /** @return the value of the {@code pvz} field. */
    public float pvz() { return npvz(address()); }
    /** @return the value of the {@code qx} field. */
    public float qx() { return nqx(address()); }
    /** @return the value of the {@code qy} field. */
    public float qy() { return nqy(address()); }
    /** @return the value of the {@code qz} field. */
    public float qz() { return nqz(address()); }
    /** @return the value of the {@code qw} field. */
    public float qw() { return nqw(address()); }
    /** @return the value of the {@code tx} field. */
    public float tx() { return ntx(address()); }
    /** @return the value of the {@code ty} field. */
    public float ty() { return nty(address()); }
    /** @return the value of the {@code tz} field. */
    public float tz() { return ntz(address()); }

    /** Sets the specified value to the {@code sx} field. */
    public VkSRTDataNV sx(float value) { nsx(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public VkSRTDataNV a(float value) { na(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public VkSRTDataNV b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code pvx} field. */
    public VkSRTDataNV pvx(float value) { npvx(address(), value); return this; }
    /** Sets the specified value to the {@code sy} field. */
    public VkSRTDataNV sy(float value) { nsy(address(), value); return this; }
    /** Sets the specified value to the {@code c} field. */
    public VkSRTDataNV c(float value) { nc(address(), value); return this; }
    /** Sets the specified value to the {@code pvy} field. */
    public VkSRTDataNV pvy(float value) { npvy(address(), value); return this; }
    /** Sets the specified value to the {@code sz} field. */
    public VkSRTDataNV sz(float value) { nsz(address(), value); return this; }
    /** Sets the specified value to the {@code pvz} field. */
    public VkSRTDataNV pvz(float value) { npvz(address(), value); return this; }
    /** Sets the specified value to the {@code qx} field. */
    public VkSRTDataNV qx(float value) { nqx(address(), value); return this; }
    /** Sets the specified value to the {@code qy} field. */
    public VkSRTDataNV qy(float value) { nqy(address(), value); return this; }
    /** Sets the specified value to the {@code qz} field. */
    public VkSRTDataNV qz(float value) { nqz(address(), value); return this; }
    /** Sets the specified value to the {@code qw} field. */
    public VkSRTDataNV qw(float value) { nqw(address(), value); return this; }
    /** Sets the specified value to the {@code tx} field. */
    public VkSRTDataNV tx(float value) { ntx(address(), value); return this; }
    /** Sets the specified value to the {@code ty} field. */
    public VkSRTDataNV ty(float value) { nty(address(), value); return this; }
    /** Sets the specified value to the {@code tz} field. */
    public VkSRTDataNV tz(float value) { ntz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSRTDataNV set(
        float sx,
        float a,
        float b,
        float pvx,
        float sy,
        float c,
        float pvy,
        float sz,
        float pvz,
        float qx,
        float qy,
        float qz,
        float qw,
        float tx,
        float ty,
        float tz
    ) {
        sx(sx);
        a(a);
        b(b);
        pvx(pvx);
        sy(sy);
        c(c);
        pvy(pvy);
        sz(sz);
        pvz(pvz);
        qx(qx);
        qy(qy);
        qz(qz);
        qw(qw);
        tx(tx);
        ty(ty);
        tz(tz);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSRTDataNV set(VkSRTDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSRTDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSRTDataNV malloc() {
        return new VkSRTDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSRTDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSRTDataNV calloc() {
        return new VkSRTDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSRTDataNV} instance allocated with {@link BufferUtils}. */
    public static VkSRTDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSRTDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkSRTDataNV} instance for the specified memory address. */
    public static VkSRTDataNV create(long address) {
        return new VkSRTDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSRTDataNV createSafe(long address) {
        return address == NULL ? null : new VkSRTDataNV(address, null);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSRTDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSRTDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSRTDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSRTDataNV malloc(MemoryStack stack) {
        return new VkSRTDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSRTDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSRTDataNV calloc(MemoryStack stack) {
        return new VkSRTDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sx}. */
    public static float nsx(long struct) { return memGetFloat(struct + VkSRTDataNV.SX); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return memGetFloat(struct + VkSRTDataNV.A); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + VkSRTDataNV.B); }
    /** Unsafe version of {@link #pvx}. */
    public static float npvx(long struct) { return memGetFloat(struct + VkSRTDataNV.PVX); }
    /** Unsafe version of {@link #sy}. */
    public static float nsy(long struct) { return memGetFloat(struct + VkSRTDataNV.SY); }
    /** Unsafe version of {@link #c}. */
    public static float nc(long struct) { return memGetFloat(struct + VkSRTDataNV.C); }
    /** Unsafe version of {@link #pvy}. */
    public static float npvy(long struct) { return memGetFloat(struct + VkSRTDataNV.PVY); }
    /** Unsafe version of {@link #sz}. */
    public static float nsz(long struct) { return memGetFloat(struct + VkSRTDataNV.SZ); }
    /** Unsafe version of {@link #pvz}. */
    public static float npvz(long struct) { return memGetFloat(struct + VkSRTDataNV.PVZ); }
    /** Unsafe version of {@link #qx}. */
    public static float nqx(long struct) { return memGetFloat(struct + VkSRTDataNV.QX); }
    /** Unsafe version of {@link #qy}. */
    public static float nqy(long struct) { return memGetFloat(struct + VkSRTDataNV.QY); }
    /** Unsafe version of {@link #qz}. */
    public static float nqz(long struct) { return memGetFloat(struct + VkSRTDataNV.QZ); }
    /** Unsafe version of {@link #qw}. */
    public static float nqw(long struct) { return memGetFloat(struct + VkSRTDataNV.QW); }
    /** Unsafe version of {@link #tx}. */
    public static float ntx(long struct) { return memGetFloat(struct + VkSRTDataNV.TX); }
    /** Unsafe version of {@link #ty}. */
    public static float nty(long struct) { return memGetFloat(struct + VkSRTDataNV.TY); }
    /** Unsafe version of {@link #tz}. */
    public static float ntz(long struct) { return memGetFloat(struct + VkSRTDataNV.TZ); }

    /** Unsafe version of {@link #sx(float) sx}. */
    public static void nsx(long struct, float value) { memPutFloat(struct + VkSRTDataNV.SX, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { memPutFloat(struct + VkSRTDataNV.A, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + VkSRTDataNV.B, value); }
    /** Unsafe version of {@link #pvx(float) pvx}. */
    public static void npvx(long struct, float value) { memPutFloat(struct + VkSRTDataNV.PVX, value); }
    /** Unsafe version of {@link #sy(float) sy}. */
    public static void nsy(long struct, float value) { memPutFloat(struct + VkSRTDataNV.SY, value); }
    /** Unsafe version of {@link #c(float) c}. */
    public static void nc(long struct, float value) { memPutFloat(struct + VkSRTDataNV.C, value); }
    /** Unsafe version of {@link #pvy(float) pvy}. */
    public static void npvy(long struct, float value) { memPutFloat(struct + VkSRTDataNV.PVY, value); }
    /** Unsafe version of {@link #sz(float) sz}. */
    public static void nsz(long struct, float value) { memPutFloat(struct + VkSRTDataNV.SZ, value); }
    /** Unsafe version of {@link #pvz(float) pvz}. */
    public static void npvz(long struct, float value) { memPutFloat(struct + VkSRTDataNV.PVZ, value); }
    /** Unsafe version of {@link #qx(float) qx}. */
    public static void nqx(long struct, float value) { memPutFloat(struct + VkSRTDataNV.QX, value); }
    /** Unsafe version of {@link #qy(float) qy}. */
    public static void nqy(long struct, float value) { memPutFloat(struct + VkSRTDataNV.QY, value); }
    /** Unsafe version of {@link #qz(float) qz}. */
    public static void nqz(long struct, float value) { memPutFloat(struct + VkSRTDataNV.QZ, value); }
    /** Unsafe version of {@link #qw(float) qw}. */
    public static void nqw(long struct, float value) { memPutFloat(struct + VkSRTDataNV.QW, value); }
    /** Unsafe version of {@link #tx(float) tx}. */
    public static void ntx(long struct, float value) { memPutFloat(struct + VkSRTDataNV.TX, value); }
    /** Unsafe version of {@link #ty(float) ty}. */
    public static void nty(long struct, float value) { memPutFloat(struct + VkSRTDataNV.TY, value); }
    /** Unsafe version of {@link #tz(float) tz}. */
    public static void ntz(long struct, float value) { memPutFloat(struct + VkSRTDataNV.TZ, value); }

    // -----------------------------------

    /** An array of {@link VkSRTDataNV} structs. */
    public static class Buffer extends StructBuffer<VkSRTDataNV, Buffer> implements NativeResource {

        private static final VkSRTDataNV ELEMENT_FACTORY = VkSRTDataNV.create(-1L);

        /**
         * Creates a new {@code VkSRTDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSRTDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSRTDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sx} field. */
        public float sx() { return VkSRTDataNV.nsx(address()); }
        /** @return the value of the {@code a} field. */
        public float a() { return VkSRTDataNV.na(address()); }
        /** @return the value of the {@code b} field. */
        public float b() { return VkSRTDataNV.nb(address()); }
        /** @return the value of the {@code pvx} field. */
        public float pvx() { return VkSRTDataNV.npvx(address()); }
        /** @return the value of the {@code sy} field. */
        public float sy() { return VkSRTDataNV.nsy(address()); }
        /** @return the value of the {@code c} field. */
        public float c() { return VkSRTDataNV.nc(address()); }
        /** @return the value of the {@code pvy} field. */
        public float pvy() { return VkSRTDataNV.npvy(address()); }
        /** @return the value of the {@code sz} field. */
        public float sz() { return VkSRTDataNV.nsz(address()); }
        /** @return the value of the {@code pvz} field. */
        public float pvz() { return VkSRTDataNV.npvz(address()); }
        /** @return the value of the {@code qx} field. */
        public float qx() { return VkSRTDataNV.nqx(address()); }
        /** @return the value of the {@code qy} field. */
        public float qy() { return VkSRTDataNV.nqy(address()); }
        /** @return the value of the {@code qz} field. */
        public float qz() { return VkSRTDataNV.nqz(address()); }
        /** @return the value of the {@code qw} field. */
        public float qw() { return VkSRTDataNV.nqw(address()); }
        /** @return the value of the {@code tx} field. */
        public float tx() { return VkSRTDataNV.ntx(address()); }
        /** @return the value of the {@code ty} field. */
        public float ty() { return VkSRTDataNV.nty(address()); }
        /** @return the value of the {@code tz} field. */
        public float tz() { return VkSRTDataNV.ntz(address()); }

        /** Sets the specified value to the {@code sx} field. */
        public VkSRTDataNV.Buffer sx(float value) { VkSRTDataNV.nsx(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public VkSRTDataNV.Buffer a(float value) { VkSRTDataNV.na(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public VkSRTDataNV.Buffer b(float value) { VkSRTDataNV.nb(address(), value); return this; }
        /** Sets the specified value to the {@code pvx} field. */
        public VkSRTDataNV.Buffer pvx(float value) { VkSRTDataNV.npvx(address(), value); return this; }
        /** Sets the specified value to the {@code sy} field. */
        public VkSRTDataNV.Buffer sy(float value) { VkSRTDataNV.nsy(address(), value); return this; }
        /** Sets the specified value to the {@code c} field. */
        public VkSRTDataNV.Buffer c(float value) { VkSRTDataNV.nc(address(), value); return this; }
        /** Sets the specified value to the {@code pvy} field. */
        public VkSRTDataNV.Buffer pvy(float value) { VkSRTDataNV.npvy(address(), value); return this; }
        /** Sets the specified value to the {@code sz} field. */
        public VkSRTDataNV.Buffer sz(float value) { VkSRTDataNV.nsz(address(), value); return this; }
        /** Sets the specified value to the {@code pvz} field. */
        public VkSRTDataNV.Buffer pvz(float value) { VkSRTDataNV.npvz(address(), value); return this; }
        /** Sets the specified value to the {@code qx} field. */
        public VkSRTDataNV.Buffer qx(float value) { VkSRTDataNV.nqx(address(), value); return this; }
        /** Sets the specified value to the {@code qy} field. */
        public VkSRTDataNV.Buffer qy(float value) { VkSRTDataNV.nqy(address(), value); return this; }
        /** Sets the specified value to the {@code qz} field. */
        public VkSRTDataNV.Buffer qz(float value) { VkSRTDataNV.nqz(address(), value); return this; }
        /** Sets the specified value to the {@code qw} field. */
        public VkSRTDataNV.Buffer qw(float value) { VkSRTDataNV.nqw(address(), value); return this; }
        /** Sets the specified value to the {@code tx} field. */
        public VkSRTDataNV.Buffer tx(float value) { VkSRTDataNV.ntx(address(), value); return this; }
        /** Sets the specified value to the {@code ty} field. */
        public VkSRTDataNV.Buffer ty(float value) { VkSRTDataNV.nty(address(), value); return this; }
        /** Sets the specified value to the {@code tz} field. */
        public VkSRTDataNV.Buffer tz(float value) { VkSRTDataNV.ntz(address(), value); return this; }

    }

}