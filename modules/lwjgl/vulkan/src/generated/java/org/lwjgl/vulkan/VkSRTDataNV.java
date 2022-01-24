/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a transform in SRT decomposition.
 * 
 * <h5>Description</h5>
 * 
 * <p>This transform decomposition consists of three elements. The first is a matrix S, consisting of a scale, shear, and translation, usually used to define the pivot point of the following rotation. This matrix is constructed from the parameters above by:</p>
 * 
 * <p>S =</p>
 * 
 * <table>
 * <tr><td>sx</td><td>a</td><td>b</td><td>pvx</td></tr>
 * <tr><td>0</td><td>sy</td><td>c</td><td>pvy</td></tr>
 * <tr><td>0</td><td>0</td><td>sz</td><td>pvz</td></tr>
 * </table>
 * 
 * <p>The rotation quaternion is defined as:</p>
 * 
 * <dl>
 * <dd><code>R = [ qx, qy, qz, qw ]</code></dd>
 * </dl>
 * 
 * <p>This is a rotation around a conceptual normalized axis <code>[ ax, ay, az ]</code> of amount {@code theta} such that:</p>
 * 
 * <dl>
 * <dd><code>[ qx, qy, qz ] = sin(theta/2) × [ ax, ay, az ]</code></dd>
 * </dl>
 * 
 * <p>and</p>
 * 
 * <dl>
 * <dd><code>qw = cos(theta/2)</code></dd>
 * </dl>
 * 
 * <p>Finally, the transform has a translation T constructed from the parameters above by:</p>
 * 
 * <p>T =</p>
 * 
 * <table>
 * <tr><td>1</td><td>0</td><td>0</td><td>tx</td></tr>
 * <tr><td>0</td><td>1</td><td>0</td><td>ty</td></tr>
 * <tr><td>0</td><td>0</td><td>1</td><td>tz</td></tr>
 * </table>
 * 
 * <p>The effective derived transform is then given by</p>
 * 
 * <dl>
 * <dd><code>T × R × S</code></dd>
 * </dl>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureSRTMotionInstanceNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSRTDataNV {
 *     float {@link #sx};
 *     float {@link #a};
 *     float {@link #b};
 *     float {@link #pvx};
 *     float {@link #sy};
 *     float {@link #c};
 *     float {@link #pvy};
 *     float {@link #sz};
 *     float {@link #pvz};
 *     float {@link #qx};
 *     float {@link #qy};
 *     float {@link #qz};
 *     float {@link #qw};
 *     float {@link #tx};
 *     float {@link #ty};
 *     float {@link #tz};
 * }</code></pre>
 */
public class VkSRTDataNV extends Struct implements NativeResource {

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

    /** the x component of the scale of the transform */
    public float sx() { return nsx(address()); }
    /** one component of the shear for the transform */
    public float a() { return na(address()); }
    /** one component of the shear for the transform */
    public float b() { return nb(address()); }
    /** the x component of the pivot point of the transform */
    public float pvx() { return npvx(address()); }
    /** the y component of the scale of the transform */
    public float sy() { return nsy(address()); }
    /** one component of the shear for the transform */
    public float c() { return nc(address()); }
    /** the y component of the pivot point of the transform */
    public float pvy() { return npvy(address()); }
    /** the z component of the scale of the transform */
    public float sz() { return nsz(address()); }
    /** the z component of the pivot point of the transform */
    public float pvz() { return npvz(address()); }
    /** the x component of the rotation quaternion */
    public float qx() { return nqx(address()); }
    /** the y component of the rotation quaternion */
    public float qy() { return nqy(address()); }
    /** the z component of the rotation quaternion */
    public float qz() { return nqz(address()); }
    /** the w component of the rotation quaternion */
    public float qw() { return nqw(address()); }
    /** the x component of the post-rotation translation */
    public float tx() { return ntx(address()); }
    /** the y component of the post-rotation translation */
    public float ty() { return nty(address()); }
    /** the z component of the post-rotation translation */
    public float tz() { return ntz(address()); }

    /** Sets the specified value to the {@link #sx} field. */
    public VkSRTDataNV sx(float value) { nsx(address(), value); return this; }
    /** Sets the specified value to the {@link #a} field. */
    public VkSRTDataNV a(float value) { na(address(), value); return this; }
    /** Sets the specified value to the {@link #b} field. */
    public VkSRTDataNV b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@link #pvx} field. */
    public VkSRTDataNV pvx(float value) { npvx(address(), value); return this; }
    /** Sets the specified value to the {@link #sy} field. */
    public VkSRTDataNV sy(float value) { nsy(address(), value); return this; }
    /** Sets the specified value to the {@link #c} field. */
    public VkSRTDataNV c(float value) { nc(address(), value); return this; }
    /** Sets the specified value to the {@link #pvy} field. */
    public VkSRTDataNV pvy(float value) { npvy(address(), value); return this; }
    /** Sets the specified value to the {@link #sz} field. */
    public VkSRTDataNV sz(float value) { nsz(address(), value); return this; }
    /** Sets the specified value to the {@link #pvz} field. */
    public VkSRTDataNV pvz(float value) { npvz(address(), value); return this; }
    /** Sets the specified value to the {@link #qx} field. */
    public VkSRTDataNV qx(float value) { nqx(address(), value); return this; }
    /** Sets the specified value to the {@link #qy} field. */
    public VkSRTDataNV qy(float value) { nqy(address(), value); return this; }
    /** Sets the specified value to the {@link #qz} field. */
    public VkSRTDataNV qz(float value) { nqz(address(), value); return this; }
    /** Sets the specified value to the {@link #qw} field. */
    public VkSRTDataNV qw(float value) { nqw(address(), value); return this; }
    /** Sets the specified value to the {@link #tx} field. */
    public VkSRTDataNV tx(float value) { ntx(address(), value); return this; }
    /** Sets the specified value to the {@link #ty} field. */
    public VkSRTDataNV ty(float value) { nty(address(), value); return this; }
    /** Sets the specified value to the {@link #tz} field. */
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
        return wrap(VkSRTDataNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSRTDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSRTDataNV calloc() {
        return wrap(VkSRTDataNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSRTDataNV} instance allocated with {@link BufferUtils}. */
    public static VkSRTDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSRTDataNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSRTDataNV} instance for the specified memory address. */
    public static VkSRTDataNV create(long address) {
        return wrap(VkSRTDataNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSRTDataNV createSafe(long address) {
        return address == NULL ? null : wrap(VkSRTDataNV.class, address);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSRTDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSRTDataNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSRTDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSRTDataNV malloc(MemoryStack stack) {
        return wrap(VkSRTDataNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSRTDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSRTDataNV calloc(MemoryStack stack) {
        return wrap(VkSRTDataNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSRTDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSRTDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sx}. */
    public static float nsx(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.SX); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.A); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.B); }
    /** Unsafe version of {@link #pvx}. */
    public static float npvx(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.PVX); }
    /** Unsafe version of {@link #sy}. */
    public static float nsy(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.SY); }
    /** Unsafe version of {@link #c}. */
    public static float nc(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.C); }
    /** Unsafe version of {@link #pvy}. */
    public static float npvy(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.PVY); }
    /** Unsafe version of {@link #sz}. */
    public static float nsz(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.SZ); }
    /** Unsafe version of {@link #pvz}. */
    public static float npvz(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.PVZ); }
    /** Unsafe version of {@link #qx}. */
    public static float nqx(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.QX); }
    /** Unsafe version of {@link #qy}. */
    public static float nqy(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.QY); }
    /** Unsafe version of {@link #qz}. */
    public static float nqz(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.QZ); }
    /** Unsafe version of {@link #qw}. */
    public static float nqw(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.QW); }
    /** Unsafe version of {@link #tx}. */
    public static float ntx(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.TX); }
    /** Unsafe version of {@link #ty}. */
    public static float nty(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.TY); }
    /** Unsafe version of {@link #tz}. */
    public static float ntz(long struct) { return UNSAFE.getFloat(null, struct + VkSRTDataNV.TZ); }

    /** Unsafe version of {@link #sx(float) sx}. */
    public static void nsx(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.SX, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.A, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.B, value); }
    /** Unsafe version of {@link #pvx(float) pvx}. */
    public static void npvx(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.PVX, value); }
    /** Unsafe version of {@link #sy(float) sy}. */
    public static void nsy(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.SY, value); }
    /** Unsafe version of {@link #c(float) c}. */
    public static void nc(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.C, value); }
    /** Unsafe version of {@link #pvy(float) pvy}. */
    public static void npvy(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.PVY, value); }
    /** Unsafe version of {@link #sz(float) sz}. */
    public static void nsz(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.SZ, value); }
    /** Unsafe version of {@link #pvz(float) pvz}. */
    public static void npvz(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.PVZ, value); }
    /** Unsafe version of {@link #qx(float) qx}. */
    public static void nqx(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.QX, value); }
    /** Unsafe version of {@link #qy(float) qy}. */
    public static void nqy(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.QY, value); }
    /** Unsafe version of {@link #qz(float) qz}. */
    public static void nqz(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.QZ, value); }
    /** Unsafe version of {@link #qw(float) qw}. */
    public static void nqw(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.QW, value); }
    /** Unsafe version of {@link #tx(float) tx}. */
    public static void ntx(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.TX, value); }
    /** Unsafe version of {@link #ty(float) ty}. */
    public static void nty(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.TY, value); }
    /** Unsafe version of {@link #tz(float) tz}. */
    public static void ntz(long struct, float value) { UNSAFE.putFloat(null, struct + VkSRTDataNV.TZ, value); }

    // -----------------------------------

    /** An array of {@link VkSRTDataNV} structs. */
    public static class Buffer extends StructBuffer<VkSRTDataNV, Buffer> implements NativeResource {

        private static final VkSRTDataNV ELEMENT_FACTORY = VkSRTDataNV.create(-1L);

        /**
         * Creates a new {@code VkSRTDataNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSRTDataNV#SIZEOF}, and its mark will be undefined.
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
        protected VkSRTDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSRTDataNV#sx} field. */
        public float sx() { return VkSRTDataNV.nsx(address()); }
        /** @return the value of the {@link VkSRTDataNV#a} field. */
        public float a() { return VkSRTDataNV.na(address()); }
        /** @return the value of the {@link VkSRTDataNV#b} field. */
        public float b() { return VkSRTDataNV.nb(address()); }
        /** @return the value of the {@link VkSRTDataNV#pvx} field. */
        public float pvx() { return VkSRTDataNV.npvx(address()); }
        /** @return the value of the {@link VkSRTDataNV#sy} field. */
        public float sy() { return VkSRTDataNV.nsy(address()); }
        /** @return the value of the {@link VkSRTDataNV#c} field. */
        public float c() { return VkSRTDataNV.nc(address()); }
        /** @return the value of the {@link VkSRTDataNV#pvy} field. */
        public float pvy() { return VkSRTDataNV.npvy(address()); }
        /** @return the value of the {@link VkSRTDataNV#sz} field. */
        public float sz() { return VkSRTDataNV.nsz(address()); }
        /** @return the value of the {@link VkSRTDataNV#pvz} field. */
        public float pvz() { return VkSRTDataNV.npvz(address()); }
        /** @return the value of the {@link VkSRTDataNV#qx} field. */
        public float qx() { return VkSRTDataNV.nqx(address()); }
        /** @return the value of the {@link VkSRTDataNV#qy} field. */
        public float qy() { return VkSRTDataNV.nqy(address()); }
        /** @return the value of the {@link VkSRTDataNV#qz} field. */
        public float qz() { return VkSRTDataNV.nqz(address()); }
        /** @return the value of the {@link VkSRTDataNV#qw} field. */
        public float qw() { return VkSRTDataNV.nqw(address()); }
        /** @return the value of the {@link VkSRTDataNV#tx} field. */
        public float tx() { return VkSRTDataNV.ntx(address()); }
        /** @return the value of the {@link VkSRTDataNV#ty} field. */
        public float ty() { return VkSRTDataNV.nty(address()); }
        /** @return the value of the {@link VkSRTDataNV#tz} field. */
        public float tz() { return VkSRTDataNV.ntz(address()); }

        /** Sets the specified value to the {@link VkSRTDataNV#sx} field. */
        public VkSRTDataNV.Buffer sx(float value) { VkSRTDataNV.nsx(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#a} field. */
        public VkSRTDataNV.Buffer a(float value) { VkSRTDataNV.na(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#b} field. */
        public VkSRTDataNV.Buffer b(float value) { VkSRTDataNV.nb(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#pvx} field. */
        public VkSRTDataNV.Buffer pvx(float value) { VkSRTDataNV.npvx(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#sy} field. */
        public VkSRTDataNV.Buffer sy(float value) { VkSRTDataNV.nsy(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#c} field. */
        public VkSRTDataNV.Buffer c(float value) { VkSRTDataNV.nc(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#pvy} field. */
        public VkSRTDataNV.Buffer pvy(float value) { VkSRTDataNV.npvy(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#sz} field. */
        public VkSRTDataNV.Buffer sz(float value) { VkSRTDataNV.nsz(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#pvz} field. */
        public VkSRTDataNV.Buffer pvz(float value) { VkSRTDataNV.npvz(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#qx} field. */
        public VkSRTDataNV.Buffer qx(float value) { VkSRTDataNV.nqx(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#qy} field. */
        public VkSRTDataNV.Buffer qy(float value) { VkSRTDataNV.nqy(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#qz} field. */
        public VkSRTDataNV.Buffer qz(float value) { VkSRTDataNV.nqz(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#qw} field. */
        public VkSRTDataNV.Buffer qw(float value) { VkSRTDataNV.nqw(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#tx} field. */
        public VkSRTDataNV.Buffer tx(float value) { VkSRTDataNV.ntx(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#ty} field. */
        public VkSRTDataNV.Buffer ty(float value) { VkSRTDataNV.nty(address(), value); return this; }
        /** Sets the specified value to the {@link VkSRTDataNV#tz} field. */
        public VkSRTDataNV.Buffer tz(float value) { VkSRTDataNV.ntz(address(), value); return this; }

    }

}