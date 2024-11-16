/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Allows specifying pose used to render provided scene texture (if different from value returned by {@link VRCompositor#VRCompositor_WaitGetPoses WaitGetPoses}).
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRTextureWithPose_t {
 *     void * handle;
 *     ETextureType eType;
 *     EColorSpace eColorSpace;
 *     {@link HmdMatrix34 HmdMatrix34_t} {@link #mDeviceToAbsoluteTracking};
 * }</code></pre>
 */
@NativeType("struct VRTextureWithPose_t")
public class VRTextureWithPose extends Struct<VRTextureWithPose> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        ETYPE,
        ECOLORSPACE,
        MDEVICETOABSOLUTETRACKING;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        ETYPE = layout.offsetof(1);
        ECOLORSPACE = layout.offsetof(2);
        MDEVICETOABSOLUTETRACKING = layout.offsetof(3);
    }

    protected VRTextureWithPose(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VRTextureWithPose create(long address, @Nullable ByteBuffer container) {
        return new VRTextureWithPose(address, container);
    }

    /**
     * Creates a {@code VRTextureWithPose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureWithPose(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** @return the value of the {@code eType} field. */
    @NativeType("ETextureType")
    public int eType() { return neType(address()); }
    /** @return the value of the {@code eColorSpace} field. */
    @NativeType("EColorSpace")
    public int eColorSpace() { return neColorSpace(address()); }
    /** actual pose used to render scene textures */
    @NativeType("HmdMatrix34_t")
    public HmdMatrix34 mDeviceToAbsoluteTracking() { return nmDeviceToAbsoluteTracking(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public VRTextureWithPose handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code eType} field. */
    public VRTextureWithPose eType(@NativeType("ETextureType") int value) { neType(address(), value); return this; }
    /** Sets the specified value to the {@code eColorSpace} field. */
    public VRTextureWithPose eColorSpace(@NativeType("EColorSpace") int value) { neColorSpace(address(), value); return this; }
    /** Copies the specified {@link HmdMatrix34} to the {@link #mDeviceToAbsoluteTracking} field. */
    public VRTextureWithPose mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { nmDeviceToAbsoluteTracking(address(), value); return this; }
    /** Passes the {@link #mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRTextureWithPose mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }

    /** Initializes this struct with the specified values. */
    public VRTextureWithPose set(
        long handle,
        int eType,
        int eColorSpace,
        HmdMatrix34 mDeviceToAbsoluteTracking
    ) {
        handle(handle);
        eType(eType);
        eColorSpace(eColorSpace);
        mDeviceToAbsoluteTracking(mDeviceToAbsoluteTracking);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureWithPose set(VRTextureWithPose src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureWithPose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureWithPose malloc() {
        return new VRTextureWithPose(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VRTextureWithPose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureWithPose calloc() {
        return new VRTextureWithPose(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VRTextureWithPose} instance allocated with {@link BufferUtils}. */
    public static VRTextureWithPose create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VRTextureWithPose(memAddress(container), container);
    }

    /** Returns a new {@code VRTextureWithPose} instance for the specified memory address. */
    public static VRTextureWithPose create(long address) {
        return new VRTextureWithPose(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VRTextureWithPose createSafe(long address) {
        return address == NULL ? null : new VRTextureWithPose(address, null);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VRTextureWithPose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VRTextureWithPose.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureWithPose.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRTextureWithPose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPose malloc(MemoryStack stack) {
        return new VRTextureWithPose(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VRTextureWithPose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureWithPose calloc(MemoryStack stack) {
        return new VRTextureWithPose(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureWithPose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureWithPose.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VRTextureWithPose.HANDLE); }
    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return memGetInt(struct + VRTextureWithPose.ETYPE); }
    /** Unsafe version of {@link #eColorSpace}. */
    public static int neColorSpace(long struct) { return memGetInt(struct + VRTextureWithPose.ECOLORSPACE); }
    /** Unsafe version of {@link #mDeviceToAbsoluteTracking}. */
    public static HmdMatrix34 nmDeviceToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + VRTextureWithPose.MDEVICETOABSOLUTETRACKING); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VRTextureWithPose.HANDLE, check(value)); }
    /** Unsafe version of {@link #eType(int) eType}. */
    public static void neType(long struct, int value) { memPutInt(struct + VRTextureWithPose.ETYPE, value); }
    /** Unsafe version of {@link #eColorSpace(int) eColorSpace}. */
    public static void neColorSpace(long struct, int value) { memPutInt(struct + VRTextureWithPose.ECOLORSPACE, value); }
    /** Unsafe version of {@link #mDeviceToAbsoluteTracking(HmdMatrix34) mDeviceToAbsoluteTracking}. */
    public static void nmDeviceToAbsoluteTracking(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + VRTextureWithPose.MDEVICETOABSOLUTETRACKING, HmdMatrix34.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRTextureWithPose.HANDLE));
    }

    // -----------------------------------

    /** An array of {@link VRTextureWithPose} structs. */
    public static class Buffer extends StructBuffer<VRTextureWithPose, Buffer> implements NativeResource {

        private static final VRTextureWithPose ELEMENT_FACTORY = VRTextureWithPose.create(-1L);

        /**
         * Creates a new {@code VRTextureWithPose.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureWithPose#SIZEOF}, and its mark will be undefined.</p>
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
        protected VRTextureWithPose getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return VRTextureWithPose.nhandle(address()); }
        /** @return the value of the {@code eType} field. */
        @NativeType("ETextureType")
        public int eType() { return VRTextureWithPose.neType(address()); }
        /** @return the value of the {@code eColorSpace} field. */
        @NativeType("EColorSpace")
        public int eColorSpace() { return VRTextureWithPose.neColorSpace(address()); }
        /** @return a {@link HmdMatrix34} view of the {@link VRTextureWithPose#mDeviceToAbsoluteTracking} field. */
        @NativeType("HmdMatrix34_t")
        public HmdMatrix34 mDeviceToAbsoluteTracking() { return VRTextureWithPose.nmDeviceToAbsoluteTracking(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public VRTextureWithPose.Buffer handle(@NativeType("void *") long value) { VRTextureWithPose.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code eType} field. */
        public VRTextureWithPose.Buffer eType(@NativeType("ETextureType") int value) { VRTextureWithPose.neType(address(), value); return this; }
        /** Sets the specified value to the {@code eColorSpace} field. */
        public VRTextureWithPose.Buffer eColorSpace(@NativeType("EColorSpace") int value) { VRTextureWithPose.neColorSpace(address(), value); return this; }
        /** Copies the specified {@link HmdMatrix34} to the {@link VRTextureWithPose#mDeviceToAbsoluteTracking} field. */
        public VRTextureWithPose.Buffer mDeviceToAbsoluteTracking(@NativeType("HmdMatrix34_t") HmdMatrix34 value) { VRTextureWithPose.nmDeviceToAbsoluteTracking(address(), value); return this; }
        /** Passes the {@link VRTextureWithPose#mDeviceToAbsoluteTracking} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRTextureWithPose.Buffer mDeviceToAbsoluteTracking(java.util.function.Consumer<HmdMatrix34> consumer) { consumer.accept(mDeviceToAbsoluteTracking()); return this; }

    }

}